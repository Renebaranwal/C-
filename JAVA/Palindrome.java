import java.util.Scanner;
class Palindrome {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome)
        {
            System.out.println("Your number is palindrome number");
        }
        else{
            System.out.println("Your number is not a palindrome");
        }
    }
    public static boolean isPalindrome(int num)
    {
        int reverse = reverse(num);
        return num == reverse;
    }
    public static int reverse(int num)
    {
        int newNum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;


    }
     
    
}
