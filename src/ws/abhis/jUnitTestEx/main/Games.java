/*
 * File: Games.java
 * Author: Abhishek Dey Das
 * Web: http://abhis.ws
 * Description: An example piece of code
 */
package ws.abhis.jUnitTestEx.main;

public class Games {
  private double cost;
  private String gameName;
  
  //getters and setters
  public void setGameName(String gameName) {
    this.gameName = gameName;
  }
  
  public void setGameCost(double gameCost) {
    this.cost = gameCost;
  }
  
  public String getGameName() {
    return this.gameName;
  }
  
  public double getGameCost() {
    return this.cost;
  }
  
  //sum of two games
  public Games sumOfGames(Games one, Games two) {
    Games result = new Games();
    result.cost = one.cost + two.cost;
    result.gameName = one.gameName + two.gameName;
    return result;
  }
}
