
public class Palindrome {

    public static boolean isPalindrome(String str, int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str = "madam";
        int len = str.length();
        System.out.println(isPalindrome(str,0,len-1));
    }
}
