import java.util.Scanner;
public class cqueues {

    int f,n,r;
    int[] queue;
    public  cqueues(int m){
        f=r=-1;
        n=m;
        queue=new int[n];

    }
    public boolean isempty(){
        if(f==-1 ){
            System.out.println("queue is empty");
            return true;

        }
        else {
            return false;
        }
    }
    public boolean isfull(){
        if ((r+1)%n==f){
            System.out.println("queue is full");
            return  true;

        }
        else {
            return false;
        }
    }
    public void enqueue(){
        if(isfull()){
            
            System.out.println("queue is full");
        }
        else{
            r=(r+1)%n;
            System.out.println("enter the element");
            Scanner sc=new Scanner(System.in);
            int  a=sc.nextInt();
            queue[r]=a;
            if(f==-1){                           
                f=0;
            }

        }
    }
    public void dequeue(){
    if(isempty()){
        System.out.println("queue is empty");
    }
    else{
        System.out.println("the element is deleted");
        if (f==r){
            f=r=-1;
            System.out.println("queue is empty");
        }
            f=(f+1)%n;
        

    }
}
    public void display(){
        if(isempty()){
            System.out.println(" queue is empty");

        }
        else{
            System.out.println("the queue elements are:");
            for( int i=f;i!=r;i=(i+1)%n){
                System.out.println(queue[i]);
            }
            System.out.println(queue[r]);
            }
        }

    public void fpeek(){
        if(isempty()){
    }
    else{
        System.out.println("the front element is "+queue[f]);
    }
}
    public void rpeek(){
        if(isempty()){

        }
        System.out.println("the rear peek is"+queue[r]);
    }
    public static void main(String[] args) {
    Scanner  sc=new Scanner(System.in);
    System.out.println("enter the size of the queue.");
    int n=sc.nextInt();
    cqueues q= new cqueues(n);
   int ch=0;
        do{
            System.out.println("enter your choice");
            System.out.println("1.enqueue 2.dequeue 3.fpeek 4.rpeek 5.display 6.exit");
             ch=sc.nextInt();
            switch (ch) {
                case 1:
                    q.enqueue();
                    break;
                case 2:
                q.dequeue();
                break;
                case 3:
                q.fpeek();
                break;
                case 4:
                q.rpeek();
                break;
                case 5:
                q.display();
                break;
                case 6:
                System.exit(1);
            
                default:
                System.out.println("invallied choice");
                    break;
            }
        }while(ch!=6);

    }
    
}
