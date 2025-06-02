public class BinarySearch{
    public static int binarySearch(int arr[],int target,int s,int e){
        
        if(s > e){
            return -1; // Base case: target not found
        }

        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(target<arr[mid]){
            return binarySearch(arr, target, s, mid - 1);
        }
            return binarySearch(arr, target, mid + 1, e);
        
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int target = 10;
        int res  = binarySearch(arr,target,0,arr.length-1);
        System.out.println(res);
    }
}