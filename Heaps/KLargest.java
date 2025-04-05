package Heaps;
import java.util.PriorityQueue;

public class KLargest{
    public static void main(String[] args) {
        int arr[] = {2,5,10,3,18,19,45};
        int k = 3;
     
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:arr){
            pq.add(num);
            if(pq.size()>k){
                pq.remove();
            }
        }
        int i = 0;
        while(i<k){
            System.out.println(pq.poll());
            i++;
        }        
    }
}
