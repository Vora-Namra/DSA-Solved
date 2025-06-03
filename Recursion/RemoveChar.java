public class RemoveChar{
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'o';
        StringBuffer sb = new StringBuffer();
        System.out.println(removeChar(str, ch,sb,0));
    }
    public static String removeChar(String str,char ch,StringBuffer sb,int idx){
        if(idx == str.length()){
            return sb.toString();
        }
        char curr = str.charAt(idx);
        if(curr != ch){
            sb.append(curr);
        }
        return removeChar(str, ch, sb, idx+1);
    }
}