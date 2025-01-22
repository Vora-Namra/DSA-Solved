public class SumOfN {

    static int  sumofnum(int n){
        if(n==1){
            return 1;
        }
        return n + sumofnum(n-1);
    }

    public static void main(String[] args) {
        int num = sumofnum(5);
        System.out.println(num);
    }
    
}
