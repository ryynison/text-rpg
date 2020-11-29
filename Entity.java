
public class Entity {

	protected int level; // Entity level
	protected int maxHealth; // Max possible health for any given state
	protected int currentHealth; // Current health of entity
	protected int defense; // Entity defense stat (determines damage taken)
	protected int attack; // Entity attack stat (determines damage given)
	protected int gold; // Entity gold (used to buy/sell)
	protected boolean isAlive;  // Living status of entity

  // Constructor
	public Entity()  {
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
