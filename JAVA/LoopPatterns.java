import java.util.Scanner;
class LoopPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        printRightHalfPyramid(rows);
        printReverseRightHalfPyramid(rows);
        printLeftHalfPyramid(rows);

    }
    public static void printReverseRightHalfPyramid(int maxRows)
    {
        System.out.println("Here is the reverse right half pyramid");
        int rows = maxRows;
        while(rows > 0)
        {
            int i = 0;
            while(i < rows)
            {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;



    }
}
public static void printLeftHalfPyramid(int maxRows)
{
    System.out.println("Here is the left half pyramid");
    int rows = maxRows;
    while(rows > 0)
    {
        //to print space 
        int j = 0;
        while(j < rows - 1)
        {
            System.out.print("  ");
            j++;
        }
        //to print star 
        int i = 0;
        while(i <= maxRows - rows)
        {
            System.out.print("* ");
            i++;
        }
        System.out.println();
        rows--;
    }
}
    public static void printRightHalfPyramid(int maxRows)
    {
        System.out.println("Here is the right half pyramid");
        int rows = 0;
        while (rows < maxRows)
        {
            System.out.print("*");
            int i = 0;
            while(i < rows)
            {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;

        }
    }
    
    
}
