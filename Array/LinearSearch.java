import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50,};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int idx = search(arr,target);
        
        System.out.println(idx);

    }

   public static int search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
