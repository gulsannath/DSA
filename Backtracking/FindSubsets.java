public class FindSubsets {

    public static void findSubsets(String str, String ans, int i){
        
        //Base Case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //For Yes Case
        findSubsets(str, ans+str.charAt(i), i+1);
        //For No Case
        findSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        String ans = "";
        int startIdx = 0;
        findSubsets(str, ans, startIdx);
    }
}
