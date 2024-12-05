/*import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum = printSum(num);
        System.out.println("Sum of Digits: " + sum);
}
     public static int printSum(int num)
     {
        int sum = 0;
        while(num > 0)
        {
             sum = sum + (num % 10);
             num = num / 10;
        

     }
     return sum;
    
}
}*/
import java.util.Scanner;
class SumOfDigits
{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number");
          int num = sc.nextInt();
          int sum = printSum(num);
          System.out.println("Sum of digit is: " + sum);


     }
     public static int printSum(int num)
     {
          int sum = 0;
          while(num > 0)
          {
               sum = sum + (num % 10);
               num = num / 10;
          }
          return sum;
     }
}
