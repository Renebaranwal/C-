public class SumAvg2DArray {
    public static void main(String[] args) {
        int[][] numArr = ArrayUtility2D.input2DArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println(sum);
        System.out.println(avg);
        
}
public static long sum(int[][] numArr)
{
    long sum = 0;
    int i = 0;
    while(i < numArr.length)
    {
        int j = 0;
        while(j < numArr[i].length)
        {
          sum = sum + numArr[i][j]; 
          j++; 
        }
        i++;
    }
    return 0;
}
public static double average(int[][] numArr)
{
    if (numArr.length == 0)
    {
        return 0; 
    }
    int rows = numArr.length;
    int cols = numArr[0].length;
    double size = rows 
    double
    
}
