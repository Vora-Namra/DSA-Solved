public class SortArray012 {
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0,1,2,0,0};
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                zero++;
            }else if(arr[i] == 1){
                one++;
            }else{
                two++;
            }
        }

        int j =0;
        while(zero>0){
            arr[j++] = 0;
            zero--;
        }
        while(one>0){
            arr[j++] = 1;
            one--;
        }
        while(two>0){
            arr[j++] = 2;
            two--;
        }

        for(int num:arr){
            System.out.println(num);
        }
        
    }
}
