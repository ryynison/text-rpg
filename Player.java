
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
    "Current Player Stats:\n"+
    "  Name: "+name+"\n"+
    "  Health: "+currentHealth+"/"+maxHealth+"\n"+
    "  Attack: "+attack+"\n"+
    "  Defense: "+defense+"\n"+
    "  Level: "+level+"\n"+
    "  Experience: to be implememnted\n"+
    "  Gold: "+gold;
  }

  public int levelUp() {
    @TODO implement a level function so that after exp
    passes treshhold, level up occurs
    if() {
      null;
    }
    return level;
  }

}
