public class Palindrome_String {

    public static boolean checkPalindromeString(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.print("The String "+ str + " is not a Palindrome");
                return false;
            }
        }
        System.out.print("The String "+ str + " is a Palindrome");
        return true;
    }
    public static void main(String args[]){
        String name = new String("racecar");
        checkPalindromeString(name);
    }
}
