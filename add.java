import java.util.Scanner;

public class add {
    public static void main(String[] args) {

        System.out.println("Enter the character");

        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        int value = a;

        System.out.println(a + 3);

        System.out.println("Input is  " + a);
    }

}
