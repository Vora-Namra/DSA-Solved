class Add2Arrays {
    public static void main(String[] args) {
        int one[] = {9,9,5,8};
        int two[] = {6,7};

        System.out.println(SumofTwoArray(one,two));
    }
    private static ArrayList<Integer> SumofTwoArray(int[] one,int[] two){
        ArrayList<Integer> ans = new ArrayList<>();
        int carry=0;
        int i=one.length-1;
        int j=two.length-1;
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0){
                sum += one[i];
            }
            if(j>=0){
                sum+=two[j];
            }
            sum = sum + carry;
            int rem = sum %10;
            carry = sum /10;
            ans.add(0,rem);
            i--;
            j--;
        }
        if(carry!=0){
            ans.add(0,carry);
        }
        return ans;
    }
}
