import java.util.Scanner;
class Palind
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong)
        {
            System.out.println("here is the armstrong number");
        }
        else{
            System.out.println("its not armstrong number");
        }
    }
    public static boolean isArmstrong(int num)
    {
        int reverse = reverse(num);
        
        return num == reverse(num);
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
