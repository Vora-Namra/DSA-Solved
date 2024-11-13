import java.util.Arrays;

public class Bubble_Sort{
    public static void main(String[] args) {
        int arr[] = {5,3,7,4,8,2,9};
        
        System.out.println(Arrays.toString(arr));
        bubble(arr);
    }

    static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}