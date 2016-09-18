import java.util.Random;

/**
 * Created by Zach on 9/16/16.
 */
public class D_12 {


    public void rollOneOrMoreD12(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            System.out.println("Your d12 rolled a: " + (randomGenerator.nextInt(12)+1) );
            i++;
        }


    }
}
