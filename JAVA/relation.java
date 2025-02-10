import java.util.Scanner;
public class relation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("You are eligible to drive");
        }
        else 
        {
            System.out.println("beta cycle chalao");
        }
    }
    
}
