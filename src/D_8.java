import java.util.Random;

/**
 * Created by Zach on 9/16/16.
 */
public class D_8 {


    public void rollOneOrMoreD8(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            System.out.println("Your d8 rolled a: " + (randomGenerator.nextInt(8)+1) );
            i++;
        }


    }
}
