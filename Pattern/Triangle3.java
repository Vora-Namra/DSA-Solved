import java.util.Scanner;

public class Triangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();

        for(int i=1;i<= num;i++){
           for(int j=i;j>0;j--){
            System.out.print(j);
           } 
           System.out.println();
        }
    }
}
