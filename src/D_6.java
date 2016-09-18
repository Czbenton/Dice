import java.util.Random;

/**
 * Created by Zach on 9/16/16.
 */
public class D_6 {


    public void rollOneOrMoreD6(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            System.out.println("Your d6 rolled a: " + (randomGenerator.nextInt(6)+1) );
            i++;
        }


    }
}
