public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1};
        int freq=0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(freq == 0){
                ans = arr[i];
            }
            if(arr[i] == ans){
                freq++;
            }else{
                freq--;
            }
        }
        System.out.println(ans);
    }
}
