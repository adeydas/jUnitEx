package ws.abhis.jUnitTestEx.main;

public class CallGames {
  public static void main(String[] args) {
    Games firstGame = new Games();
    Games secondGame = new Games();
    firstGame.setGameName("Resident Evil");
    firstGame.setGameCost(40.00);
    secondGame.setGameName("Need for Speed");
    secondGame.setGameCost(39.99);
    
    Games result = new Games();
    result = firstGame.sumOfGames(firstGame, secondGame);
    
    System.out.println(result.getGameName() + " = " + result.getGameCost());
  }
}
