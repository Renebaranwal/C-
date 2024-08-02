class maxminArray {
    public static void main(String[] args) {
        int[] numArr = ArrayUtility.inputArray();
        int min = min(numArr);
        System.out.println(min);
        int max = max(numArr);
        System.out.println(max);
    
    }
    
    public static int min(int[] numArr)
    {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArr.length)
        {
            if(min > numArr[i])
            {
                min = numArr[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] numArr)
    {
        int i = 0;
        if(numArr[i] == 0)
        {
            return Integer.MIN_VALUE; 
        }
        int max = numArr[0];
        
        while(i < numArr.length)
        {
            if(max < numArr[i])
            {
                max = numArr[i];
            }
            i++;

        }
        return max;
    }
}
