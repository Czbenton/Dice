import java.util.Random;

/**
 * Created by Zach on 9/16/16.
 */
public class D_100 {

    public void rollOneOrMoreD100(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            System.out.println("Your d100 rolled a: " + (randomGenerator.nextInt(100)+1) );
            i++;
        }


    }
}
