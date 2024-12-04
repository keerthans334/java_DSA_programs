import java.util.Scanner;
public class array_jugling{
    Scanner sc=new Scanner(System.in);
    public void jugling(int n){
        int arr[]=new int[n];
        int ar[]=new int[n];  
       System.out.println("enter the array elements"); 
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("how many times you want to jugle the array");
       int d=sc.nextInt();
       while(d!=0){
       ar[0]=arr[n-1];
        for(int i=0;i<n-1;i++){
            ar[i+1]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=ar[i];
        }
        d--;
       }
       for(int i=0;i<n;i++){
        System.out.print(ar[i]+" ");
       }
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        array_jugling aj=new array_jugling();
        aj.jugling(n);
     }
}
