public class PerfectNumbers {
    public static void main(String[] args) {

        for (int number = 1; number < 1000; number++) {

            int sum_of_divisor = 0;

            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sum_of_divisor += divisor;
                }
            }

            if (number == sum_of_divisor) {
                System.out.println(number);
            }
        }
    }
}

