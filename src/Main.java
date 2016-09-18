import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printWelcomeScreen();

        while (true) { //user types /exit to quit
            promptUserToRollDice();
        }
    }

    public static void promptUserToRollDice() {
        Dice dice = new Dice();

        boolean continueLoop = true;
        while (continueLoop) {
            continueLoop = false;
            System.out.println(ANSI_CYAN + "Please select a die to roll: [d4] [d6] [d8] [d10] [d12] [d20]" + ANSI_RESET);
            String userInput = scanner.nextLine();

            switch (userInput.toLowerCase()) {
                case "d4":
                    System.out.println("How many die would you like to roll?");
                    int d4num;
                    try {
                        d4num = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Error: Bad Input." + ANSI_RESET);
                        break;
                    }
                    dice.rollOneOrMoreD4(d4num);
                    dice.displayRollResults();
                    break;
                case "d6":
                    System.out.println("How many die would you like to roll?");
                    int d6num;
                    try {
                        d6num = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Error: Bad Input." + ANSI_RESET);
                        break;
                    }
                    dice.rollOneOrMoreD6(d6num);
                    dice.displayRollResults();
                    break;
                case "d8":
                    System.out.println("How many die would you like to roll?");
                    int d8num;
                    try {
                        d8num = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Error: Bad Input." + ANSI_RESET);
                        break;
                    }
                    dice.rollOneOrMoreD8(d8num);
                    dice.displayRollResults();
                    break;
                case "d10":
                    System.out.println("How many die would you like to roll?");
                    int d10num;
                    try {
                        d10num = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Error: Bad Input." + ANSI_RESET);
                        break;
                    }
                    dice.rollOneOrMoreD10(d10num);
                    dice.displayRollResults();
                    break;
                case "d12":
                    System.out.println("How many die would you like to roll?");
                    int d12num;
                    try {
                        d12num = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Error: Bad Input." + ANSI_RESET);
                        break;
                    }
                    dice.rollOneOrMoreD12(d12num);
                    dice.displayRollResults();
                    break;
                case "d20":
                    System.out.println("How many die would you like to roll?");
                    int d20num;
                    try {
                        d20num = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Error: Bad Input." + ANSI_RESET);
                        break;
                    }
                    dice.rollOneOrMoreD20(d20num);
                    dice.displayRollResults();
                    break;
                case "d100":
                    System.out.println("How many die would you like to roll?");
                    int d100num;
                    try {
                        d100num = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(ANSI_RED + "Error: Bad Input." + ANSI_RESET);
                        break;
                    }
                    dice.rollOneOrMoreD100(d100num);
                    dice.displayRollResults();
                    break;
                case "/exit":
                    System.exit(0);
                default:
                    System.out.println(ANSI_RED + "Error: Bad Input." + ANSI_RESET);
                    continueLoop = true;
            }
        }
    }

    public static void printWelcomeScreen() {

        System.out.println(ANSI_RED + " __          ________ _      ____  __  __ ______      _        \n" +
                " \\ \\        / /  ____| |    / __ \\|  \\/  |  ____|    | |       \n" +
                "  \\ \\  /\\  / /| |__  | |   | |  | | \\  / | |__       | |_ ___  \n" +
                "   \\ \\/  \\/ / |  __| | |   | |  | | |\\/| |  __|      | __/ _ \\ \n" +
                "    \\  /\\  /  | |____| |___| |__| | |  | | |____     | || (_) |\n" +
                "  ___\\/  \\/   |______|______\\____/|_|  |_|______|_    \\__\\___/ \n" +
                " |  _ \\           | |            ( )     |  __ \\(_)        | | \n" +
                " | |_) | ___ _ __ | |_ ___  _ __ |/ ___  | |  | |_  ___ ___| | \n" +
                " |  _ < / _ \\ '_ \\| __/ _ \\| '_ \\  / __| | |  | | |/ __/ _ \\ | \n" +
                " | |_) |  __/ | | | || (_) | | | | \\__ \\ | |__| | | (_|  __/_| \n" +
                " |____/ \\___|_| |_|\\__\\___/|_| |_| |___/ |_____/|_|\\___\\___(_) \n" +
                "                                                               \n" +
                "                                                               " + ANSI_RESET);

        System.out.println(ANSI_BLUE + "                                                    / \\\n" +
                "                                                  /|/ \\|\\\n" +
                "                                                 /|/   \\|\\\n" +
                "                                                /|/     \\|\\\n" +
                "                                  /  \\         /|/   __  \\|\\\n" +
                "                                 /    \\       /|/ | |  |  \\|\\         ^            __  __\n" +
                "                _________       /  __  \\      ==  | |  |   ==       /   \\         /\\/  \\/\\ \n" +
                "              || ------ ||     /  |  |  \\     \\|\\ | |__|  /|/      /     \\       /\\/    \\/\\\n" +
                "    ^         ||  |'''  ||     =  |__|  =      \\|\\       /|/      /   __  \\     /\\/      \\/\\\n" +
                "  /   \\       ||  |___  ||     \\  |  |  /       \\|\\     /|/      /  |  _|  \\   /\\/__   __ \\/\\\n" +
                " / |_| \\      ||  |___| ||      \\ |__| /         \\|\\   /|/       \\  | |__  /  /\\/  _| |  | \\/\\\n" +
                "/    |  \\     || ______ ||       \\    /           \\|\\ /|/         \\       /   \\/  |__ |__|  \\/\n" +
                "_________       --------          \\  /              \\ /            =======    ================ \n\n\n" + ANSI_RESET);


    }

}
