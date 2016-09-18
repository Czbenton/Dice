import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Zach on 9/16/16.
 */
public class DiceTests {

    @Test
    public void doesDiceExistAndStoreResults() {  //this applies to all sizes of dice
        Dice dice = new Dice();
        assertTrue(dice != null);
        dice.rollOneOrMoreD4(5);    //user chooses how many times to roll a die
        assertTrue(dice.rollResultsList != null);   //results are stored in list
    }

    @Test
    public void areD4_RollResultsValid() {
        Dice dice = new Dice();
        dice.rollOneOrMoreD4(5);
        assertTrue(dice.rollResultsList.get(0) > 0 && dice.rollResultsList.get(0) < 5);
        assertTrue(dice.rollResultsList.get(1) > 0 && dice.rollResultsList.get(1) < 5);
        assertTrue(dice.rollResultsList.get(2) > 0 && dice.rollResultsList.get(2) < 5);
        assertTrue(dice.rollResultsList.get(3) > 0 && dice.rollResultsList.get(3) < 5);
        assertTrue(dice.rollResultsList.get(4) > 0 && dice.rollResultsList.get(4) < 5);
    }

    @Test
    public void areD6_RollResultsValid() {
        Dice dice = new Dice();
        dice.rollOneOrMoreD6(5);
        assertTrue(dice.rollResultsList.get(0) > 0 && dice.rollResultsList.get(0) < 7);
        assertTrue(dice.rollResultsList.get(1) > 0 && dice.rollResultsList.get(1) < 7);
        assertTrue(dice.rollResultsList.get(2) > 0 && dice.rollResultsList.get(2) < 7);
        assertTrue(dice.rollResultsList.get(3) > 0 && dice.rollResultsList.get(3) < 7);
        assertTrue(dice.rollResultsList.get(4) > 0 && dice.rollResultsList.get(4) < 7);
    }

    @Test
    public void areD8_RollResultsValid() {
        Dice dice = new Dice();
        dice.rollOneOrMoreD8(5);
        assertTrue(dice.rollResultsList.get(0) > 0 && dice.rollResultsList.get(0) < 9);
        assertTrue(dice.rollResultsList.get(1) > 0 && dice.rollResultsList.get(1) < 9);
        assertTrue(dice.rollResultsList.get(2) > 0 && dice.rollResultsList.get(2) < 9);
        assertTrue(dice.rollResultsList.get(3) > 0 && dice.rollResultsList.get(3) < 9);
        assertTrue(dice.rollResultsList.get(4) > 0 && dice.rollResultsList.get(4) < 9);
    }

    @Test
    public void areD10_RollResultsValid() {
        Dice dice = new Dice();
        dice.rollOneOrMoreD10(5);
        assertTrue(dice.rollResultsList.get(0) > 0 && dice.rollResultsList.get(0) < 11);
        assertTrue(dice.rollResultsList.get(1) > 0 && dice.rollResultsList.get(1) < 11);
        assertTrue(dice.rollResultsList.get(2) > 0 && dice.rollResultsList.get(2) < 11);
        assertTrue(dice.rollResultsList.get(3) > 0 && dice.rollResultsList.get(3) < 11);
        assertTrue(dice.rollResultsList.get(4) > 0 && dice.rollResultsList.get(4) < 11);
    }

    @Test
    public void areD12_RollResultsValid() {
        Dice dice = new Dice();
        dice.rollOneOrMoreD12(5);
        assertTrue(dice.rollResultsList.get(0) > 0 && dice.rollResultsList.get(0) < 12);
        assertTrue(dice.rollResultsList.get(1) > 0 && dice.rollResultsList.get(1) < 12);
        assertTrue(dice.rollResultsList.get(2) > 0 && dice.rollResultsList.get(2) < 12);
        assertTrue(dice.rollResultsList.get(3) > 0 && dice.rollResultsList.get(3) < 12);
        assertTrue(dice.rollResultsList.get(4) > 0 && dice.rollResultsList.get(4) < 12);
    }

    @Test
    public void areD20_RollResultsValid() {
        Dice dice = new Dice();
        dice.rollOneOrMoreD20(5);
        assertTrue(dice.rollResultsList.get(0) > 0 && dice.rollResultsList.get(0) < 21);
        assertTrue(dice.rollResultsList.get(1) > 0 && dice.rollResultsList.get(1) < 21);
        assertTrue(dice.rollResultsList.get(2) > 0 && dice.rollResultsList.get(2) < 21);
        assertTrue(dice.rollResultsList.get(3) > 0 && dice.rollResultsList.get(3) < 21);
        assertTrue(dice.rollResultsList.get(4) > 0 && dice.rollResultsList.get(4) < 21);
    }

    @Test
    /*
    * this test rolls a d10 5 times and then tests to make sure the total sum of the rolls is valid
    * since all other dice use the same sum method, this one test is all that is needed to ensure the method works
     */
    public void sumOfResultsAreValid() {
        Dice dice = new Dice();
        dice.rollOneOrMoreD10(5);
        assertTrue((dice.sumOfRollResults(dice.rollResultsList)) >= 5 && (dice.sumOfRollResults(dice.rollResultsList)) <= 50);
    }
}
