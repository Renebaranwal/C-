/*import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();
        int gcd = printGcd(first, second);
        System.out.println("GCD of the numbers is: " + gcd);


    }
    public static int printGcd(int num1,int num2) //method
    {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
               gcd = i; 
            }
           i++; 
        }

        return gcd;
        

    }
    public static int least(int num1, int num2)
    {
        if (num1 < num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
    
}*/
import java.util.Scanner;
class GCD
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = sc.nextInt();
        System.out.println("Enter second number");
        int second = sc.nextInt();
        int gcd = gcd(first , second);
        System.out.println(gcd);
}
    public static int gcd(int first , int second)
    {
       int gcd = 1;
       int i = 2;
       int least = least(first , second);
       while(i <= least)
       {
        if(first % i == 0 && second % i == 0)
        {
            gcd = i;
        }
        i++;
       }



       return gcd; 

    }
    public static int least(int first , int second)
    {
       if (first < second)
       {
        return first;
       } 
       else{
        return second;
       }
    }
}
