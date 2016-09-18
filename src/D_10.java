import java.util.Random;

/**
 * Created by Zach on 9/16/16.
 */
public class D_10 {


    public void rollOneOrMoreD10(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            System.out.println("Your d10 rolled a: " + (randomGenerator.nextInt(10)+1) );
            i++;
        }


    }
}
