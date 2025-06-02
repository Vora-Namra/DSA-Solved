import java.util.*;

public class ArraySubsequences {

    // Recursive function to generate all subsequences
    public static void generateSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> result) {
        // Base case: reached the end of the array
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // Store a copy of current subsequence
            return;
        }

        current.add(arr[index]);

        generateSubsequences(arr, index + 1, current, result);
        current.remove(current.size() - 1);

        // Include current element
        generateSubsequences(arr, index + 1, current, result);

        // Backtrack to remove the last added element
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<List<Integer>> result = new ArrayList<>();

        generateSubsequences(arr, 0, new ArrayList<>(), result);

        System.out.println("All subsequences of the array:");
        for (List<Integer> subseq : result) {
            System.out.println(subseq);
        }
    }
}
