public class Rec_demo{
         public static void  printnum(int num,int target) {
            if(num == target){
                System.out.println(num);
                return;
            }
            printnum(num + 1, target);
            System.out.println(num);
           
        }
    public static void main(String[] args) {
        printnum(1,6);
    }
}