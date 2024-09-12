public class Pattern2 {
    public static void main(String[] args) {
        int num=5;
        for(int line1=1;line1<=(2*num)-1;line1++){
            System.out.print("*");
        }
        System.out.println();
        int star=num-1;
        int space=1;
        for(int row=1;row<=num-1;row++){
            for(int i=1;i<=star;i++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
        }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            System.out.println();
            star--;
            space+=2;
        }
    }
}
