public class DiagonalSum2D {
    public static void main(String args[])
    {
        int[][] numArr = ArrayUtility2D.input2DArray();
        long sum = sumOfDiagonals(numArr);
        System.out.println(sum);


    }
    public static long sumOfDiagonals(int[][] numArr)
    {
        long leftSum = sumOfLeftDiagonal(numArr);
        long rightSum = sumOfRightDiagonal(numArr);
        long sum = leftSum + rightSum;
        if (numArr.length % 2 != 0)
        {
            int index = numArr.length / 2;
            sum = sum - numArr[index][index];
        }

        return sum;
    }
    public static long sumOfLeftDiagonal(int[][] numArr)
    {
        long sum = 0;
        int i = 0;
        while (i < numArr.length)
        {
            sum = sum + numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumOfRightDiagonal(int[][] numArr)
    {
        long sum = 0;
        int i = 0;
        while (i < numArr.length)
        {
            int col = numArr.length - 1 - i;
            sum = sum + numArr[i][col];
              
          i++;  
        }
        return sum;
    }
}
