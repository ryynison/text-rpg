
public class Player extends Entity {

  private final String name; // Player name
  private int exp; // experience points for leveling up

  public Player(int level, int maxHealth, int health, int defense,
  int attack, int gold, String name) {
    super(0, 10, 10, 1, 1, 0);
    this.name = name;
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
    "  Level: "+name+"\n"+
    "  Experience: to be implememnted\n"+
    "  Gold: "+gold;
  }

  public int levelUp() {
    return 0;
  }

}
