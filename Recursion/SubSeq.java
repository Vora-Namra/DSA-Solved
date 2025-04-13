public class SubSeq{
    public static void main(String[] args) {
        subseqfunc("", "abc");
    }
    public static void subseqfunc(String res, String s){
        if(s.isEmpty()){
            System.out.println(res);
            return;
        }
        char ch = s.charAt(0);
        subseqfunc(res+ch, s.substring(1));
        subseqfunc(res, s.substring(1));
    }
}