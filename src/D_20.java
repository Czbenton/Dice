import java.util.Random;

/**
 * Created by Zach on 9/16/16.
 */
public class D_20 {


    public void rollOneOrMoreD20(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            System.out.println("Your d20 rolled a: " + (randomGenerator.nextInt(20)+1) );
            i++;
        }


    }
}
