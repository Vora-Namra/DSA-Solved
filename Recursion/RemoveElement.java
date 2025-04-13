public class RemoveElement{
    public static void main(String[] args) {
        String str = "baccad";
        String target =  "a";
        int index = 0;
        StringBuffer sb  = new StringBuffer("");
        String res = RemoveElementFunc(str,target,index,sb);
        System.out.println(res);
    }

    public static String RemoveElementFunc(String str, String target,int index,StringBuffer sb){
        if(index  == str.length()){
            return sb.toString();
        }
        String val = String.valueOf(str.charAt(index));
        if(!val.equals(target)){
            sb.append(val);
        }
        return RemoveElementFunc(str, target, index + 1, sb);
    }
}