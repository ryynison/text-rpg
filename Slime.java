import java.lang.Math;

public class Slime extends Entity {

  public Slime() {
    type = "Slime";
    level = 1;
    maxHealth = 5;
    currentHealth = maxHealth;
    attack = 1;
    gold = 2;

    int min = 4; int max = 800;
    expDrop = (int) (Math.random() * (max - min) + min);
  }

  // Getters/setters

  // ^w^ //

  public String toString() {
    return ""+
    "Slime Statistics:\n"+
    "  Health: "+currentHealth+"/"+maxHealth+"\n"+
    "  Attack: "+attack+"\n"+
    "  Level: "+level+"\n"+
    "  Experience on Drop: "+expDrop+"\n"+
    "  Gold on Drop: "+gold;
  }

}
