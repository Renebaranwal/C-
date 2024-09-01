import java.util.Scanner;
class rev 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = sc.nextInt();
        int rev = reverseDigit(num);
        System.out.println(rev);
    }
    public static int reverseDigit(int num)
    {
        int newNum = 0;
        while (num > 0)
        {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }
}
        
