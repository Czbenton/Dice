import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Zach on 9/16/16.
 */
public class Dice {

    List<Integer> rollResultsList = new ArrayList<>();

    public void rollOneOrMoreD4(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            rollResultsList.add(randomGenerator.nextInt(4) + 1);
            i++;
        }
    }

    public void rollOneOrMoreD6(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            rollResultsList.add(randomGenerator.nextInt(6) + 1);
            i++;
        }
    }

    public void rollOneOrMoreD8(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            rollResultsList.add(randomGenerator.nextInt(8) + 1);
            i++;
        }
    }

    public void rollOneOrMoreD10(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            rollResultsList.add(randomGenerator.nextInt(10) + 1);
            i++;
        }
    }

    public void rollOneOrMoreD12(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            rollResultsList.add(randomGenerator.nextInt(12) + 1);
            i++;
        }
    }

    public void rollOneOrMoreD20(int rollThisMany) {
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            rollResultsList.add(randomGenerator.nextInt(20) + 1);
            i++;
        }
    }

    public void rollOneOrMoreD100(int rollThisMany) { //secret option not given in prompt
        Random randomGenerator = new Random(System.currentTimeMillis());
        int i = 1;
        while (i <= rollThisMany) {
            rollResultsList.add(randomGenerator.nextInt(100) + 1);
            i++;
        }
    }

    public void displayRollResults() {
        System.out.println("Your dice rolled: " + rollResultsList.toString());
        System.out.println("For a total of: " + sumOfRollResults(rollResultsList) + "\n");

    }

    public int sumOfRollResults(List<Integer> rollResultsList) {
        int sum = 0;
        for (Integer i : rollResultsList) {
            sum += i;
        }
        return sum;
    }

}