import java.util.*;
public class ArrayUtility2D {
    public static int[][] input2DArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] numArray = new int[rows][columns];
        int i = 0;
        while(i < rows)
        {
            int j = 0;
            while(j < columns)
            {
                System.out.println("Enter element of rows: " + (i+1) + ", column: " + (j+1) + " :");
                numArray[i][j] = sc.nextInt();
                j++;
            }
            i++;

            }
            return numArray;

        }

         
         
    }
    
