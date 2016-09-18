import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        printWelcomeScreen();

        while (true) { //user types /exit to quit
            promptUserToRollDice();
        }


    }

    public static void promptUserToRollDice() {
        D_4 d4 = new D_4();
        D_6 d6 = new D_6();
        D_8 d8 = new D_8();
        D_10 d10 = new D_10();
        D_12 d12 = new D_12();
        D_20 d20 = new D_20();
        D_100 d100 = new D_100();

        boolean continueLoop = true;
        while (continueLoop) {
            continueLoop = false;
            System.out.println(ANSI_CYAN + "Please select a die to roll: [d4] [d6] [d8] [d10] [d12] [d20]" + ANSI_RESET);
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "d4":
                    System.out.println("How many die would you like to roll?");
                    int d4num = Integer.parseInt(scanner.nextLine());
                    d4.rollOneOrMoreD4(d4num);
                    d4.displayRollResults();
                    //TODO: finish the test cases and make sure all other dice work like this one does right now.
                    //TODO: finish the user stories...omg
                    break;
                case "d6":
                    System.out.println("How many die would you like to roll?");
                    int d6num = Integer.parseInt(scanner.nextLine());
                    d6.rollOneOrMoreD6(d6num);
                    break;
                case "d8":
                    System.out.println("How many die would you like to roll?");
                    int d8num = Integer.parseInt(scanner.nextLine());
                    d8.rollOneOrMoreD8(d8num);
                    break;
                case "d10":
                    System.out.println("How many die would you like to roll?");
                    int d10num = Integer.parseInt(scanner.nextLine());
                    d10.rollOneOrMoreD10(d10num);
                    break;
                case "d12":
                    System.out.println("How many die would you like to roll?");
                    int d12num = Integer.parseInt(scanner.nextLine());
                    d12.rollOneOrMoreD12(d12num);
                    break;
                case "d20":
                    System.out.println("How many die would you like to roll?");
                    int d20num = Integer.parseInt(scanner.nextLine());
                    d20.rollOneOrMoreD20(d20num);
                    break;
                case "d100":
                    System.out.println("How many die would you like to roll?");
                    int d100num = Integer.parseInt(scanner.nextLine());
                    d100.rollOneOrMoreD100(d100num);
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
