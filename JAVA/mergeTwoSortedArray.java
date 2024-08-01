public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergeArr = merge(arr1 , arr2);
        System.out.println("Your merge array is: ");
        ArrayUtility.displayArray(mergeArr);

    }
    public static int[] merge(int[] arr1 , int[] arr2)
    {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize]; 
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else 
            {
                newArr[k] = arr2[j];
                k++;
                j++;

            }

        }
        while (i < arr1.length)
        {
            newArr[k++] = arr1[i++];
            

        }
        while (j < arr2.length)
        {
            newArr[k++] = arr2[j++];
            
        }
        return newArr;


    }
    
}

    

