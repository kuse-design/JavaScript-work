public class ArmstrongNumbers {
    public static void main(String[] args) {

        for (int number = 1; number <= 1000; number++) {

            int sum_cube = 0;
            int original_number = number;

            while (original_number > 0) {
                int digit = original_number % 10;
                sum_cube += digit * digit * digit;
                original_number /= 10;
            }

            if (number == sum_cube) {
                System.out.println(number);
            }
        }
    }
}

