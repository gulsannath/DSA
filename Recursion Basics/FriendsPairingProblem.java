import java.util.Scanner;
public class FriendsPairingProblem{

    public static int friendsPairingProblem(int n){
        //Base Case
        if(n==1 || n==2){
            return n;
        }
        else{
            return friendsPairingProblem(n-1)+(n-1)*friendsPairingProblem(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Total no. of Friends:");
        int friends = sc.nextInt();
        System.out.print("The total no. of ways all friends can be paired up:"+friendsPairingProblem(friends));
    }
}