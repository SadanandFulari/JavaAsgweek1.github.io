import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {

        System.out.println("Enter the character");

        Scanner ch = new Scanner(System.in);
        char input = ch.next().charAt(0);

        int value = input;

        System.out.println(value);

    }
}
