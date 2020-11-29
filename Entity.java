
public class Entity {

	protected int level; // Entity level
	protected int maxHealth; // Max possible health for any given state
	protected int currentHealth; // Current health of entity
	protected int defense; // Entity defense stat (determines damage taken)
	protected int attack; // Entity attack stat (determines damage given)
	protected int gold; // Entity gold (used to buy/sell)

	protected boolean isAlive;  // Is alive? no? then dead.

  // Constructor
	public Entity(int level, int maxHealth,
  int currentHealth, int defense, int attack, int gold)  {
		this.level = level;
		this.maxHealth = maxHealth;
		this.currentHealth = currentHealth;
		this.defense = defense;
		this.attack = attack;
		this.gold = gold;
		isAlive = true;
	}


  // Getter/setter methods
	public int getLevel() {
		return level;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
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
		currentHealth -= damage;

    // returns true if entity dies
		if(currentHealth < 0) {
      isAlive = false;
			return true;
    }
		else
			return false;
	}


}
