public class Fibo{

    public static int PrintFibo(int n){
        if(n<2){
            return n;
        }
        return PrintFibo(n-1)+PrintFibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(PrintFibo(2));
    }
}