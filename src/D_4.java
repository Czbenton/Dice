import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Zach on 9/16/16.
 */
public class D_4 {

List<Integer> a = new ArrayList<>();

    public void rollOneOrMoreD4(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            a.add(randomGenerator.nextInt(4)+1);
            i++;
        }

    }

    public void displayRollResults() {
        System.out.println("Your d4 rolled a: " + a.toString()+"\n");
    }
}