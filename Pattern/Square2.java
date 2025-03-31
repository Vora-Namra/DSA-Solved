
import java.util.Scanner;

public class Square2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int count =1;
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num;col++){
                System.out.print(count++);
            }
            System.out.println();
        }
    }
}
