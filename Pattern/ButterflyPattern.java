package Pattern;

public class ButterflyPattern {
   
   public static void main(String[] args) {
    
    int num=5;
    int star=1;
    int space=num-1;

    for(int i=1;i<=num;i++){
        for(int starprint=1;starprint<=star;starprint++){
            System.out.print("*");
        }
        for(int spaceprint=1;spaceprint<=space;spaceprint++){
            System.out.print(" ");
        }
        for(int starprint=1;starprint<=star;starprint++){
            System.out.print("*");
        }
        
    star++;
    space=-2;
    
    System.out.println();
        
    }
   }
    
}
 