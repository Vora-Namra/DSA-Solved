public class CountZeros {

    public static int countZeros(int num,int res){
        if(num == 0){
            return res ;
        }
        if(num%10 == 0){
            res++;
        }
        return countZeros(num/10, res);

    }
    public static void main(String[] args) {
        int num = 100202003;
        System.out.println(countZeros(num,0));
    }
}
