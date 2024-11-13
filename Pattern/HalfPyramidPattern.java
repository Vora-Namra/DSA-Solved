package Pattern;
public class HalfPyramidPattern{
    public static void main(String[] args) {
        int num=4;
        for(int line=1;line<=num;line++){
            for(int printStar=1;printStar<=line;printStar++){
                System.out.print(printStar);
            }
                System.out.println();
        }
    }
}