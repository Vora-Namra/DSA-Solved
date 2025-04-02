public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int len = nums.length;
        int[] ans =  new int[len];
        int prefix[] = new int[len];
        int suffix[] = new int[len];
        prefix[0] = 1;
        suffix[len-1] = 1;
        for(int i=1;i<len;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        for(int j=len-2;j>=0;j--){
            suffix[j] = suffix[j+1] * nums[j+1];
        }
        for(int i=0;i<len;i++){
            ans[i] =prefix[i] * suffix[i];
        }

    for(int num:ans){
        System.out.println(num);
    }
    }
}
