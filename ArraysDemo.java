public class ArraysDemo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr);  // it will print  [I@5ca881b5 bcaz I->int @5c881b->location of arr
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=4;

        int arr1[] =arr;
        arr1[3] =100;                       // 0 1 2 100 4 will be printed 
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);  
        }

        

         

        
    }
    
}
