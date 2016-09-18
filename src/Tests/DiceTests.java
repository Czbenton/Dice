import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Zach on 9/16/16.
 */
public class DiceTests {
/*
Given that a D-4 exists, DONE
And the user chooses how many times to roll (5times), DONE

When the die are rolled (5 times for example), DONE

Then the (5) random results are all displayed to the user, DONE
And each result is within 1-4; DONE
And the user is prompted to select another die to roll.
 */
    @Test
    public void doesD4ExistAndIsValid() {
        D_4 d4 = new D_4();
        assertTrue(d4 != null);
        d4.rollOneOrMoreD4(5);
        assertTrue(d4.a != null);
        assertTrue(d4.a.get(0) > 0 && d4.a.get(0) < 5);
        assertTrue(d4.a.get(1) > 0 && d4.a.get(1) < 5);
        assertTrue(d4.a.get(2) > 0 && d4.a.get(2) < 5);
        assertTrue(d4.a.get(3) > 0 && d4.a.get(3) < 5);
        assertTrue(d4.a.get(4) > 0 && d4.a.get(4) < 5);

    }


}
