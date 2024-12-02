import java.util.Scanner;
public class LeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int result = num << 1;
        System.out.println("Result is: " + result);
    }
    
}
