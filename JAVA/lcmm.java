import java.util.Scanner;
class lcmm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter num 2 : ");
        int b = sc.nextInt();
        int ans = ( a > b) ? a : b;
        while ( ans % a != 0 || ans % b != 0)
        {
            ans++;
        }
        System.out.println("LCM of " + a + " and " +  b + " is " + ans);

    }
    
}
