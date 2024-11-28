public class printDivisor {
        public static void main(String[] args) {
            int number = 14;
            
            System.out.print("Divisors of " + number + " are: ");
            
            // Loop from 1 to number to find divisors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
