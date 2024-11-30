public class gcd3 {
    public static void main(String[] args) {
        int n1 = 20 , n2 = 15;
        int gcd = findGcdd(n1 , n2);
        System.out.println("GCD of " + n1 + "and " + n2 + " is: " + gcd);

    }
    public static int findGcdd(int a, int b)
    {
        while(a > 0 && b > 0)
        {
            if(a > b)
            {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if(a == 0)
        {
            return b;
        }
        return a;
    }
    
}
