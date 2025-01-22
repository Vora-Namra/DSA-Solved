public class ArrSorted {


    static boolean isSorted(int arr[], int n) {
        if(n==0 || n==1){
            return true;
        }
            return arr[n-1]>arr[n-2] && isSorted(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,8,4,5};
        System.out.println(isSorted(arr, arr.length));    }
}
