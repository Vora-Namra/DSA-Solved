public class Fibo {
    static int getnum(int n){

        if(n == 1){
            return n;
        }

        if(n == 0){
            return n;
        }

        return getnum(n-1)+getnum(n-2);

    }

    public static void main(String[] args) {
        int num = getnum(6);
        System.out.println(num);
    }
    
}
