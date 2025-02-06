import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateSubsets(arr, 0, temp, ans);
        System.out.println(ans);
    }


    public static void generateSubsets(int[] arr, int idx, List<Integer> temp, List<List<Integer>> ans) {
        
        if (idx == arr.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[idx]);
        generateSubsets(arr, idx + 1, temp, ans);

    
        temp.remove(temp.size() - 1);
        generateSubsets(arr, idx + 1, temp, ans);
    }
}