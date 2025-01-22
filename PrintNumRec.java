

public class PrintNumRec {

    static void myfunc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        myfunc(n-1);
    }
    public static void main(String[] args) {
       myfunc(5);
    }
    
}
