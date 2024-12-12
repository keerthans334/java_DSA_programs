import java.util.Scanner;
class linear_search{
    static int linear_search(int[] a,int ele){
        int i;
        for( i=0;i<a.length;i++){
            if(a[i]==ele){
                return(i);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to search");
        int ch=sc.nextInt();
        linear_search ls=new linear_search();
        int pos=linear_search(arr,ch);
        if(pos>0){
            System.out.println("the element "+ch+" exists in the given array at position :"+pos);
        }
        else{
            System.out.println("the element not found");
        }
    }
}
