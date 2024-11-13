package Pattern;
import java.util.Scanner;

public class Pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int line=1;line<=num;line++){
            for(int numberoftimes=1;numberoftimes<=line;numberoftimes++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}