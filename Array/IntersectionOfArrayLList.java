package Array;
import java.util.ArrayList;

public class IntersectionOfArrayLList {
    public static void main(String[] args) {
        int[] one = {10,19,20,30,40,40,50};
        int[] two = {15,16,17,20,25,30,40,40};
        System.out.println(Intersection(one,two));
    }
    public static ArrayList<Integer> Intersection(int[] one,int[] two){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;int j=0;
        while(i<one.length && j<two.length){
            if(one[i]<two[j]){
                i++;
            }
            else if(one[i]>two[j]){
                j++;
            }
            else{
                list.add(one[i]);
                i++;
                j++;
            }
        }
        return list;
    }
    
}
