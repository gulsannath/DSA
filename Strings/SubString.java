public class SubString {

    public static String subString(String str, int startIndex, int endIndex){
        String subStr = "";
        for(int i=startIndex;i<endIndex;i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str = "GulsanNath";
        System.out.println(subString(str, 0, 6)); 
        //Inbuilt-Method
        System.out.print(str.substring(0, 6)); 
    }
}
