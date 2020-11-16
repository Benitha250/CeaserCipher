import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //For user to input
        Scanner keyboard = new Scanner(System.in);

        //to allow string input only
        String character = "^[a-zA-Z]+$";

        //to store the input
        String sentence;

        //to store the shift key
        int key;

        System.out.print("Enter the string: ");
        sentence = keyboard.nextLine();

        if (sentence.matches(character)) {
            System.out.print("Please enter a key between 1 to 25: ");
            key = keyboard.nextInt();

            if (key < 1 || key > 25) {
                System.out.printf(" The key must be between 1 and 25, you entered %d.\n", key);
            }

            System.out.println("Input string:\t" + sentence);

        }
    }
}
