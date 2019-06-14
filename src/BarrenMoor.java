import java.util.Scanner;

public class BarrenMoor extends Input {
    private static Scanner sc = new Scanner(System.in);

    public BarrenMoor() {
        System.out.println("Welcome to Barren Moor!       Type 'exit' at any time to quit");
        System.out.println("You have no idea what's happened.. Try \"Start\"");
        resetPlayerPosition();
        makeCreature();
        makeDeepBog();
        Pit();
        while (true) {
            String input = sc.next();
            try {
                if (input.equalsIgnoreCase("Start")) {
                    System.out.println("You don't know what happened to you or why you're here...\n"
                            + "You look down to notice that you're in a dirty thick mud but you can't see anything more than three feet in front.. \n"
                            + "There is a device in your hand. The face has a number on it and that's it.. what could it be? Let's find out!\n"
                            + "Try typing \"n\" for north, \"s\" for south, \"e\" for east or \"w\" for west to move around.");
                    break;
                } else {
                    System.out.println("Please type \"Start\" to begin the game.");
                }
            } catch (Exception e) {
                System.out.println("Please type \"Start\" to begin the game.");
            }
        }
        takeInput();
    }
}
