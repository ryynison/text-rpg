
public class Main {
  public static void main(String[] args) {

    Player player1 = new Player("Bryan");
    System.out.println(player1);
    player1.expGain(152);
    player1.levelUp();
    System.out.println(player1);

  }
}
