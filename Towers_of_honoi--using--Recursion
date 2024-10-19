import java.util.Scanner;
public class towers_of_honoi {
    public static void recursion(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("move the disk 1 from "+source+" to "+destination);
            return;
        }
        recursion(n-1,source ,destination,helper);
        System.out.println("move the disk "+n+ " from "+source+" to "+destination);
        recursion(n-1,helper,source,destination);
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the number of disks:");
        int n=Sc.nextInt();
        recursion(n,"R","C","L");
    }
    }
