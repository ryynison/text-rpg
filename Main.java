
public class Main {
  public static void main(String[] args) {

    Player player1 = new Player("player");
    System.out.println(player1);
    player1.expGain(202);
    player1.levelUp();
    System.out.println(player1);

  }
}
