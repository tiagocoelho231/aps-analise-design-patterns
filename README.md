# Design Patterns - Game genérico

Projeto implementado em Java para demonstrar o conhecimento sobre os Design Patterns mais usados.

A ideia do software é representar um pseudojogo RPG, utilizando mensagens diretamente na classe main para efetuar as interações entre os objetos.

Foram usados os patterns Strategy, Template, State e Factory.

## 

Entity é a classe abstrata da qual herdam todos os personagens (Player's e Enemy's, a princípio) que podem atacar e ser atacados.

Equipment é a classe abstrata da qual herdam os tipos de equipamento (Weapon e Armor). Todos são identificados por um nome.

Weapon é a classe abstrata que representa uma arma genérica que pode ser equipada por uma Entity, possuindo um valor de attack.
As implementações de Weapon devem implementar um modificador de dano relacionado a seu tipo (Knife, Sword, etc.).

Armor é a classe abstrata que representa uma armadura genérica que pode ser equipada por uma Entity, possuindo um valor de defense.
As implementações de Armor devem implementar um modificador de dano relacionado a seu tipo (Leather, Chainmail, etc.).

## Strategy
Usado para Weapon e Armor. Uma Entity pode equipar ou não uma arma e uma armadura, mas deve ser capaz de alterá-las em tempo de execução, sem ser necessária uma nova instância de Entity. Por isso foram usados os atributos weapon e armor, que guardam instâncias da arma e armadura equipada, respectivamente, por composição.

## Template
Usado para Player e Enemy. O cálculo de ataque e de defesa de uma Entity depende de seu tipo, e, pelo menos no atual estado do projeto, esse tipo é imutável e definido no momento da instanciação da Entity. Tanto Player quanto Enemy estendem Entity, e, portanto, podem (devem) implementar os métodos abstratos de obtenção da defesa e do ataque básicos, que dependem do tipo da Entity. Esse valor, por si só, não é o bastante para se ter o dano resultante, então os métodos são apenas um dos passos de cada um dos cálculos de ataque/defesa.

## State
Usado na interface EntityState para aplicar um modificador de ataque na Entity. Sempre que uma Entity recebe um ataque, é feita uma verificação. Dependendo do valor atual de seu HP, o EntityState é alterado. Se o HP atual for abaixo de 20% do HP máximo, a Entity passa para o estado Dying, cujo método aplica uma redução de 25% no dano dos ataques feitos pela Entity. Da mesma forma, se o valor não estiver abaixo de 20%, a entidade passa para o estado Stable. O state foi usado porque a mudança de comportamento não é definida explicitamente. A mudança é uma decorrência da alteração do valor de HP da entidade (Atualmente, por receber um ataque).

## Factory
Usado para gerar instâncias de Entity, Equipment e EntityState. O Factory foi usado para facilitar a criação das instâncias e reduzir o acoplamento do código. As factories são EntityFactory, WeaponFactory, ArmorFactory e EntityStateFactory (que tenho dúvidas se é realmente necessária). A classe cliente informa o tipo da instância que será criada pela factory (ex.: "Player"), o nome da entidade (ex.: "Goblin") e um terceiro valor, cujo significado varia dependendo do tipo de objeto. No caso da EntityFactory, é o HP da Entity (que é automaticamente assumido como o valor máximo de HP da Entity), no caso da WeaponFactory é o attack do Weapon, no caso da ArmorFactory é o defense da Armor e no caso da EntityState, é a razão entre o HP atual e o HP total da Entity.
