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
    }
}
