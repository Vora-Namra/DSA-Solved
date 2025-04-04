public class NiceSubArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1,};
        int k =3;
        int res = numberOfSubarrays(arr, k);
        System.out.println(res);
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int total = 0;
        int count =0;
        while(right < nums.length){
          if(count == k){
              total++;
              if(nums[left]%2 == 1){
                  count--;
              }
              left++;
              right++;
          }
         else if(nums[right]%2 == 1){
              count++;
              right++;
          }
          else if(nums[right]%2 == 0){
              right++;
          }
  
        }
        return total;
      }
  
}
