package Heaps;
import java.util.PriorityQueue;

public class KthLarget {
    public static void main(String[] args) {
        int arr[] = {2,5,10,3,18,19,45};
        int k = 3;
        int ans = KthLargetFunc(arr,k);
        System.out.println(ans);
    }

    public static int KthLargetFunc(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:arr){
            pq.add(num);
            if(pq.size()>k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}
