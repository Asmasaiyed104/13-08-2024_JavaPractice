import java.util.Scanner;

public class UserSizeArray {

    public static void main(String[] args) {

        int[] sizeUser = new int[5]; // Create an array to hold 5 integers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Numbers:");

        // Loop to get user input for the array
        for (int i = 0; i < sizeUser.length; i++) {
            sizeUser[i] = sc.nextInt();
        }

        // Loop to print the values in the array
        System.out.println("You entered:");
        for (int i = 0; i < sizeUser.length; i++) {
            System.out.println(sizeUser[i]);
        }

        sc.close();
    }
}
