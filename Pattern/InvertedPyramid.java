package Pattern;
public class InvertedPyramid {
    public static void main(String[] args) {
        int num=4;
        int space = num-1;
        int star=1;
        for(int line=1;line<=num;line++){
            for(int s=1;s<=space;s++){
                System.out.print(" ");
            }
            for(int st=1;st<=star;st++){
                System.out.print("*");
            }
            space--;
            star++;
            
        System.out.println("");
        }
    }
}
