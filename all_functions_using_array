import java.util.Scanner;
public class traverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n=sc.nextInt();
        traverse s=new traverse();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int choice;
        do{
            System.out.println("enter your choice:");
            System.out.println("1.insertion\n 2. delition\n 3.traversal \n 4.sorting_asc\n 5.sorting_desc\n 6.exit");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    s.insertion(arr);
                    break;
                case 2:
                    s.delition(arr);
                    break;
                case 3:
                    s.traversal(arr);
                    break;
                case 4:
                    s.sorting_asc(arr);
                    break;
                case 5:
                    s.sorting_dsc(arr);
                    break;
                default:
                        if(choice!=6)
                        System.out.println("invalied choice");
    
                    
            }
        }while(choice!=6);
        
        
    }
    Scanner sc=new Scanner(System.in);
    public void insertion(int[] arr){
     System.out.println("enter the position of element where you want to insert the array");
        int p=sc.nextInt();
        if(p<arr.length){
        System.out.println("enter the element");
        arr[p]=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
            
        }
    }
    else{
        System.out.println("invalid position");
    }
        
    }
    public void delition(int[] arr){
        System.out.println("enter the position of element where you want to delete the element");
        int p=sc.nextInt();
        if(p<arr.length){
            
        for(int i=p;i<arr.length;i++){
            if(i+1<arr.length)
          arr[i]=arr[i+1];
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
        }
            else{
                    System.out.println("invlied position");
                }    
        }   
    public void traversal(int[] arr){

            System.out.println("enter the element to find position ");
            int p=sc.nextInt();
            int position=-1;
            for(int i=0;i<arr.length-1;i++){
              if(arr[i]==p)
              position=i;
            }
            if(position!=-1){
                System.out.println("element"+p+"found in position:"+position);
            }
            else{
                System.out.println("element not found");
            }
    
    }
    public void sorting_asc(int[] arr){
        int item;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                item=arr[i];
                arr[i]=arr[j];
                arr[j]=item;            }
        }
    }
    System.out.println("array after sorting..");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"\t");
    }
    }
    public void sorting_dsc(int[] arr){
        int item;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j]){
                item=arr[i];
                arr[i]=arr[j];
                arr[j]=item;            
            }
        }
    }
    System.out.println("array after sorting..");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"\t");
    }
}
}
