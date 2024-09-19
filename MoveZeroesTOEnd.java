public class MoveZeroesTOEnd {
    public static void moveZeroes(int[] nums) {
        int index=0;
        int temp[] =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                temp[index] = nums[i];
                index++;
            }
        }
        for(int i=0;i<index;i++){
            nums[i] =temp[i];
        }
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,4,5,0,6,7,0};
        moveZeroes(arr);
    }
}
