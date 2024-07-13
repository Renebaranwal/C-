public class Parameter {
    public static void main(String[] args) {
        //int num = sumTwoNumbers(4 , 7);
        //System.out.println(num);
        System.out.println(sumTwoNumbers(4 , 7));
        System.out.println(sumTwoNumbers(14 , 8));
        
    }
    public static int sumTwoNumbers(int first , int second)
    {
        System.out.println("First number received: " + first);
        System.out.println("Second number received: " + second);
        int sum = first + second;
        return sum;

    }
    
    
}
