import java.util.*; 
import java.lang.Math;

public class Events {

  // Returns false if the player loses, idk how this will be useful (if at all)
  public static boolean battle(Player player, ArrayList<Entity> entities) {
    
    int turnNum = 1;
    System.out.println("Entering into battle...");
    
    printEnemeiesOnField(entities);
    System.out.println();

    Scanner input = new Scanner(System.in);

    battleLoop:
    while(player.getAlive()) {

      System.out.println("** Turn "+turnNum+" **");

      // Player Turn
      System.out.println("== Player Turn ==");
      System.out.println(
        player.getName()+" ("+player.getCurrentHealth()+"/"+player.getMaxHealth()+"):\n"+
        "  [1] Attack\n"+
        "  [2] Escape\n"+
        "  [3] View Player Stats");
      System.out.print("Select Option: ");
      int option = input.nextInt();

      switch(option) {
        // Attack
        case 1:
          if(entities.size()>1) {
            printEnemeiesOnField(entities);
            System.out.print("Select which enemy to attack: ");
            option = input.nextInt();
            entities.get(option-1).takeDamage(player.getAttack());
            System.out.println("-> Player "+player.getName()+" has done "+player.getAttack()+" damage to ["+option+"] "+entities.get(option-1).getType());
          } else {
            entities.get(0).takeDamage(player.getAttack());
            System.out.println("-> Player "+player.getName()+" has done "+player.getAttack()+" damage to ["+1+"] "+entities.get(option-1).getType());
          }
          break;

        // Escape
        case 2:
        // TODO change probability depending on number of enemies
          System.out.print("Attempting escape...");
          // 66% chance to escape
          if(Math.random() > 0.66) {
            System.out.println("Success!");
            return true;
          } else {
            System.out.println("Failed!");
          }
          break;
        
        // Show player stats 
        case 3:
          System.out.println();
          System.out.println(player);
          continue;
      }

      // Checks if any enemies have been killed
      // and gives appropriate rewards to the player if so
      for(Entity entity: entities) {
        if(!entity.getAlive()) {
          System.out.println("-> "+entity.getType()+" has died");
          System.out.println("Player "+player.getName()+" has gained "+entity.getExpDrop()+" exP");
          player.expGain(entity.getExpDrop());
          entities.remove(entity);
        }
      }

      System.out.println();
      printEnemeiesOnField(entities);

      // Enemy Turn
      System.out.println("== Enemy Turn ==");
      for(int i=0; i<entities.size(); i++) {
        player.takeDamage(entities.get(i).getAttack());
        System.out.println("-> ["+(i+1)+"] "+entities.get(i).getType()+" has done "+entities.get(i).getAttack()+" damage to player "+player.getName());
      }
      System.out.println();

      turnNum++;



    }

    System.out.println("--> Player "+player.getName()+" has died");
    System.out.println();
    System.out.println("Game Over!");
    return false;

  }

  private static void printEnemeiesOnField(ArrayList<Entity> entities) {
    System.out.println("Enemies:");
    for (int i=0; i<entities.size(); i++) {
      System.out.println("  ["+(i+1)+"] "+entities.get(i).getType()+" ("+entities.get(i).getCurrentHealth()+"/"+entities.get(i).getMaxHealth()+")");
    }
  }

}
