public class BubbleSort {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4,1,5,2,3};
        //O(n^2) Bubble sort
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
