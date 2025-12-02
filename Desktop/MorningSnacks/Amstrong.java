import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int user_input = input.nextInt();

        int original = user_input;  
        int sum_cube = 0;

        while (user_input > 0) {
            int digit = user_input % 10;
            sum_cube += digit * digit * digit;
            user_input /= 10;
        }

        if (original == sum_cube) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is NOT an Armstrong number");
        }
    }
}












