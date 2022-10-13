public class Anagrams {

    public static boolean checkAnagrams(String str1,String str2){
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        int count = 0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    count++;
                }
            }
        }
        if(count == s1.length()){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String str1 = "Care";
        String str2 = "rAce";

        System.out.print(checkAnagrams(str1, str2));
    }
}
