import java.util.Scanner;
public class queues_link{
    class node{
        int data;
        node next;
    }
    node head;
    public queues_link(){
         head=null;
    }
    
    public boolean isempty(){
        return(head==null);
    }
    public  void enqueue(int  n){
        node  newnode=new node();
        newnode.data=n;
        newnode.next=null;
        if(isempty()){
            head=newnode;
        }else{
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
        
}
    public void dequeue(){
       if(isempty()){
        System.out.println("the queue is empty");
        return;
       }
       System.out.println("the element is deleted.");
       head=head.next;
    }
    public void display(){
    if(isempty()){
        System.out.println("the queue is empty");
        return;
    }
    System.out.println("the elements are.");
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"---> ");
        temp=temp.next;
    }
    System.out.println("nulll");
    }
    public void frontpeek(){
        if(isempty()){
            System.out.println("the queue is empty");
            return;
        }
        System.out.println("the frontpeek element is :"+head.data);
    }
    public void rearpeek(){
        if(isempty()){
            System.out.println("the queue is empty");
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        System.out.println("the rear peek element is"+temp.data);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1,enqueue 2.dequeue 3.display 4.frontpeek 5.rearpeek 6.exit");
        int ch;
        queues_link sl=new queues_link();
        do{
            System.out.println("enter your choice!");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                System.out.println("enter the value to add in queue");
                int ele=sc.nextInt();
                sl.enqueue(ele);
                break;
                case 2:
                sl.dequeue();
                break;
                case 3:
                sl.display();
                break;
                case 4:
                sl.frontpeek();
                break;
                case 5:
                sl.rearpeek();
                break;
                case 6:
                System.exit(1);
                default:
                System.out.println("invallied choice!");
                    break;
            }


        }while(ch!=6);
    }

}
