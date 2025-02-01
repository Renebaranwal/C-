import java.util.Scanner;

public class DiceProblem {

   
    public static int countWaysToSum(int target) {
        
        if (target == 0) {
            return 1;
        }
        
       
        if (target < 0) {
            return 0;
        }
        
        int ways = 0;
        
        
        for (int i = 1; i <= 6; i++) {
            ways += countWaysToSum(target - i);
        }
        
        return ways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int target = 10;

        
        int result = countWaysToSum(target);

       
        System.out.println("Number of ways to get sum " + target + ": " + result);
    }
}
