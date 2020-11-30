import java.lang.Math;

public class Player extends Entity {

  private final String name; // Player name
  private int exp; // experience points for leveling up

  public Player(String name) {
    level = 0;
    maxHealth = 10;
    currentHealth = maxHealth;
    defense = 1;
    attack = 1;
    gold = 0;

    this.name = name;
    exp = 0;
  }

  // Getters/setters

  // ^w^ //

  public String toString() {
    return ""+
    "Current Player Statistics:\n"+
    "  Name: "+name+"\n"+
    "  Health: "+currentHealth+"/"+maxHealth+"\n"+
    "  Attack: "+attack+"\n"+
    "  Defense: "+defense+"\n"+
    "  Level: "+level+"\n"+
    "  Experience: "+exp+"/"+levelFunc(level)+"\n"+
    "  Gold: "+gold;
  }

  public int levelFunc(int level) {
    // returns the experience required to level up to the next level
    int expReq = (int) Math.floor(Math.pow(1.1, level)+(8*level*level)+19);
    return expReq;
  }

  public void expGain(int exp) {
    this.exp += exp;
  }

  public int levelUp() {
    int levelBonus = 0;
      for(int i = 0; exp >= 0; i++) {
        if(exp < levelFunc(i+1)) {
          break;
        }
        exp = exp - levelFunc(i);
        levelBonus++;
      }
      level += levelBonus;
    return level;
  }

}
