import java.util.Scanner;

public class Inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int num = sc.nextInt();



        for(int i=1;i<=num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }

            for(int j=0;j<=num-i;j++){
                System.out.print(i);
            }
            System.out.println();

        }
    }
}
