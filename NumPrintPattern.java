public class NumPrintPattern {
    public static void main(String[] args) {
        int star=1;
        int num = 7;
        for(int line=1;line<=num;line++){
            for(int printStar=1;printStar<=star;printStar++){
                System.out.print(printStar);
            }
            System.out.println();
            if(line<=num/2){

                
                star++;
            }
            else{
                star--;
            }
        }
    }
}
