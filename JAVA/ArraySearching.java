import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 87, 65, 4, 68, 23, 9, 98, 34};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound)
        {
            System.out.println("yo found");
        }
        else{
            System.out.println("not found");
        }
    }
    public static boolean isFound(int[] arr, int num)
    {
        int index = 0;
        while(index < arr.length)
        {
            if(arr[index] == num)
            {
                return true;
            }
            index++;

        }
        return false;
    }
    
}
