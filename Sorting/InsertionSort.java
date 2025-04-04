public class InsertionSort {
    public static void main(String[] args) {

        //O(n^2) Insertion sort
        int arr[] = {4,1,5,2,3};
        int n = arr.length;

        for(int i=1;i<n;i++){
            int key = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>key){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = key;
        }

        for(int num:arr){
            System.out.println(num);
        }
    }
}
