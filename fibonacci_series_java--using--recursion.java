import java.util.Scanner;
public class Fibonacci_series {
    public static  int recursion(int  n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
    return recursion(n-1)+recursion(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of terms you want");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(recursion(i)+" ");
        }
    }
}
