
public class Monster {
	private int level;
	private int maxHealth;
	private int health;
	private int defense;
	private int attack;
	private int gold;
	
	private boolean isAlive;
	
	public Monster(int level, int maxHealth, int health, int defense, int attack, int gold) {
		this.level = level;
		this.maxHealth = maxHealth;
		this.health = health;
		this.defense = defense;
		this.attack = attack;
		this.gold = gold;
		isAlive = true;
	}
	
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
	
	public boolean dealDamage(int damage) {
		health -= damage;
		
		if(health < 0)
			return true;
		else
			return false;
	}
}
