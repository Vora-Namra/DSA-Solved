import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int target = 6;
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        int ans[] = new int[2];
        while(left<=right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                ans[0] = left;
                ans[1] = right;
                break;
            }

            if(sum<target){
                left++;
            }
            if(sum>target){
                right--;
            }
            
        }
        System.out.println(Arrays.toString(ans));
    }
}
