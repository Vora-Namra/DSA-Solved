package Pattern;
public class BinaryTriangle {
    public static void main(String[] args) {
        int num=4;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
