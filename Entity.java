
public class Entity {
  private string name; // Entity name
  private string sex; // Entity sex
	private int level; // Entity level
	private int maxHealth; // Max possible health for any given state
	private int currentHealth; // current health of entity
	private int defense; // Entity defnese
	private int attack; // Entity attack
	private int gold; // Entity gold

	private boolean isAlive;  // Is alive? no? then dead.

  // Constructor
	public Monster(string name, string sex, int level, int maxHealth,
  int health, int defense, int attack, int gold) {
    this.name = name;
    this.sex = sex;
		this.level = level;
		this.maxHealth = maxHealth;
		this.health = health;
		this.defense = defense;
		this.attack = attack;
		this.gold = gold;
		isAlive = true;
	}


  // Getter methods
	public int getLevel() {
		return level;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getHealth() {
		return health;
	}

	public int getDefense() {
		return defense;
	}

	public int getAttack() {
		return attack;
	}

	public int getGold() {
		return gold;
	}

	public boolean getAlive() {
		return isAlive;
	}

  // ^w^ //

  // Entity takes damage
	public boolean takeDamage(int damage) {
		health -= damage;

    // returns true if entity dies
		if(health < 0)
			return true;
		else
			return false;
	}


}
