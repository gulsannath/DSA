import java.util.*;
public class Anagrams_Optimised {

    public static void isAnagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){

            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result){
                System.out.print(str1+" and "+str2+" are anagram to each other");
            }
            else{
                System.out.print(str1+" and "+str2+" are not anagram to each other");
            }
        }
        else{
            System.out.print(str1+" and "+str2+" are not anagram to each other");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First String:");
        String str1 = sc.next(); 
        System.out.print("Enter the Second String:");
        String str2 = sc.next();

        isAnagram(str1, str2);
    }
}
