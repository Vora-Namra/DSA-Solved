public class PairSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15,19,20};
        int target = 17;
        int res[] = new int[2];
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                res[0] = left;
                res[1] = right;
                break;
            }
            else if(sum<target){
                left++;
            }
            else if(sum>target){
                right--;
            }
        }
        System.out.println(res[0]);
        System.out.println(res[1]);

    }
    
}
