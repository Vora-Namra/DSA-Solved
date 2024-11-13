package Array;
public class TwoDimentionalArray {
    public static void main(String[] args) {
        int arr[][] ={
            {1,2,7},
            {3,4,8},
            {5,6,9}
        };

        System.out.println("length of row:"+arr.length);
        System.out.println("length of column: "+arr[0].length);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
