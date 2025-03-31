import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            
            for(int j=0;j<=num-i-1;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
