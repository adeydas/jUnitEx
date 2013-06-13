/*
 * Test games
 */
package ws.abhis.jUnitTestEx.test;

import ws.abhis.jUnitTestEx.main.Games;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestGames extends TestCase {
  private Games gameOne;
  private Games gameTwo;
  
  //sets up the objects
  protected void setup() {
    gameOne.setGameName("Terminator");
    gameOne.setGameCost(49.99);
    gameTwo.setGameName("Sarah Conner Chronicles");
    gameTwo.setGameCost(39.99);
  }
  
  //method to test whether equal
  public void testEquals() {
    //game is not null
    Assert.assertTrue(!gameOne.equals(null));
    //the same object should be the equal
    Assert.assertEquals(gameOne, gameOne);
    Assert.assertTrue(!gameOne.equals(gameTwo));
  }
  
  public void testSum() {
    Games expected = new Games();
    //we expect this name to come up
    expected.setGameName("TerminatorSarah Conner Chronicles");
    //this might fail the case as double doesn't restrict to two decimal places
    expected.setGameCost(89.98);
    Games result = gameOne.sumOfGames(gameTwo, gameOne);
    Assert.assertTrue(expected.equals(result));
  }
  
  //call tests dynamically
  public static Test suite() {
    return new TestSuite(TestGames.class);
  }
   
}
