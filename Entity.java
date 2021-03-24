
public class Entity {

	protected String type; // Type of entity
	protected int level; // Entity level
	protected int maxHealth; // Max possible health for any given state
	protected int currentHealth; // Current health of entity
	protected int attack; // Entity attack stat (determines damage given)
	protected int gold; // Entity gold (used to buy/sell)
	protected boolean isAlive;  // Living status of entity
	protected int expDrop; // Experience points dropped on kill

  // Constructor
	public Entity()  {
		isAlive = true;
	}


  // Getter/setter methods
	public String getType() {
		return type;
	}

	public int getLevel() {
		return level;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
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

	public int getExpDrop() {
		return expDrop;
	}

  // ^w^ //

  // Entity takes damage
	public boolean takeDamage(int damage) {
		currentHealth -= damage;

    // returns true if entity dies
		if(currentHealth <= 0) {
      isAlive = false;
			return true;
    }
		else
			return false;
	}


}
