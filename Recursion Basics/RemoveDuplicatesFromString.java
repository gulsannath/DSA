import java.util.Scanner;
public class RemoveDuplicatesFromString {

    //only for String containing lowerCase alphabets 
    public static void removeDuplicates(String str, int idx, StringBuilder newString, boolean map[]){
        //Base Case
        if(idx == str.length()){
            System.out.print("The String after removing duplicates Characters become:"+newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx+1, newString, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString.append(currChar), map);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.next();
        int start = 0;
        removeDuplicates(str, start, new StringBuilder(""), new boolean[26]);
    }
}
