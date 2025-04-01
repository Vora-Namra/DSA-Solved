public class MaxSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,-1,-5,9,30,-2, 40};

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum = 0;
            }    
        
        }
        System.out.println(max);
    }
    
}
