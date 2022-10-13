public class String_charAt{

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstName = "Gulsan";
        String middleName = "kumar";
        String lastName = "Nath";

        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}