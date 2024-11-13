package Pattern;
public class InvertedNumPyramid {
    public static void main(String[] args) {
        int num=5;
        int tnum=num;
        for(int line=1;line<=5;line++){
            for(int print=1;print<=tnum;print++){
                System.out.print(print);
            }
            tnum--;
            System.out.println();
        }
    }
}
