import java.util.*;
public class Scanners {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner dy=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=dy.nextInt();
        System.out.println("Enter the value of b: ");
        b=dy.nextInt();
        c=a+b;
        System.out.println("Sum is:" + c);
        dy.close();
    }

    
}
