public class LinearSearch {

    public static boolean isFound(int arr[],int target,int index){
        if(index == arr.length) return false;
        if(arr[index] == target){
            return true;
        }
        return isFound(arr,target,index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,8,20,473,3564,0};
        int target = 20;
        System.out.println(isFound(arr,target,0));
    }
}
