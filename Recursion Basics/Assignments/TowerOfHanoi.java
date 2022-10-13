import java.util.Scanner;
public class TowerOfHanoi {

    public static void towerOfHanoi(int n,String src, String helper, String dest){
        //Base Case
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        //kaam
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of disks:");
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "B", "C");
    }
}
