import java.util.*; 


public class Main {
  public static void main(String[] args) {
    System.out.println();

    // Testing player class
    Player player = new Player("Bryan");
    System.out.println(player);
    
    // Testing battle function
    ArrayList<Entity> slimes = new ArrayList<Entity>();
    slimes.add(new Slime());
    slimes.add(new Slime());
    Events.battle(player, slimes);




  }

}
