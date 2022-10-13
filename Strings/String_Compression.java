public class String_Compression {

    public static String compressedString(String str){
        // String newStr = "";
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            // newStr += str.charAt(i);
            sb.append(str.charAt(i));
            if(count > 1){
                // newStr += count.toString();
                sb.append(count.toString());
            }        
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbcccdde";

        System.out.print(compressedString(str));
    }
}
