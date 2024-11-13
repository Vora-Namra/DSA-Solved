import java.util.Arrays;

public class Selection_Sort {
    
    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            
            // Swap the found minimum element with the first element
            swap(arr, i, min_idx);
        }
    }
    
    // Method to swap two elements in an array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}