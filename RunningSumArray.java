public class RunningSumArray {

    public static void getRunningsum(int arr[]){
        int[] res = new int[arr.length];
        int result = 0;
        for(int i=0;i<arr.length;i++){
            result = result + arr[i];
            res[i] = result;
            System.out.println(result);
        }
        
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        getRunningsum(arr1);
        
    }
}
