
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int row=1;row<=num;row++){
            for(int col = 1;col<=num;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
