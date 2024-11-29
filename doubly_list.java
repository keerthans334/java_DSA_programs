import java.util.Scanner;
public class doubly_list{
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int val){
            data=val;
            next=null;
            prev=null;
    
        }
    
    }
    Node head;
    Node tail;
    public  doubly_list(){
        head=null;
        tail=null;
    }
    public boolean isempty(){
        if (head==null){
            System.out.println("the list is empty.");
            return true;
        }
        return false;
    }
    public void insertfirst(int val){
        Node newnode=new Node(val);
        if (head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
    }
    public void insertlast(int val){
        Node newnode=new Node(val);
        if (isempty()){
            head=newnode;
            return;
        }
        newnode.prev=tail;
        tail.next=newnode;
        tail=newnode;
    }
    public void insert_pos(int val,int pos){
        if(isempty()){
            return;
        }
        int index=0;
        Node temp=head;
        Node prev=null;
        while (index!=pos && temp!=null){
            prev=temp;
            temp=temp.next;
            ++index;
        }
        if(temp==null){
            System.out.println("invallied position");
            return;
        }
        Node newnode=new Node(val);
        if(index==0){
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
            return;
        }
        temp.prev=newnode;
        newnode.next=temp;
        prev.next=newnode;
    }
    public void insert_key(int val,int key){
        if(isempty()){
            return;
        }
        if(head.data==key){
            Node newnode=new Node(val);
            System.out.println("the Node is Inserted");
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
            return;
        }
        if(tail.data==key){
            Node newnode=new Node(val);
            System.out.println("the Node is Inserted");
            tail.prev.next=newnode;
            newnode.prev=tail.prev;
            tail.prev=newnode;
            newnode.next=tail;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.data!=key && temp!=null){
            prev=temp;
            temp=temp.next;
        }
        if(temp.data==key){
            System.out.println("the Node is inserted");
            Node newnode=new Node(val);
            prev.next=newnode;
            newnode.prev=prev;
            newnode.next=temp;
            temp.prev=newnode;
            return;
        }
        System.out.println("invallied key");

    }
    public void delete_first(){
        if(isempty()){
            return;
        }
        if(head.next==null){
            System.out.println("the Node is deleted");
            head=null;
            return;
        }
        System.out.println("the Node is deleted");
        head=head.next;
        head.prev=null;
    }
    public void delte_last(){
        if(isempty()){
            return;
        }
        if(head.next==null){
            System.out.println("the Node is deleted");
            head=null;
            return;
        }
        System.out.println("the Node is deleted");
        tail=tail.prev;
        tail.next=null;
    }
    public void delete_pos(int pos){
        if(isempty()){
            return;
        }
        int index=0;
        Node temp=head;
        Node prev=null;
        while (index!=pos && temp!=null){
            prev=temp;
            temp=temp.next;
            ++index;
        }
        if(temp==null){
            System.out.println("invallied position");
            return;
        }
        System.out.println("the Node is deleted");
        if(pos==0){
            head=head.next;
            head.prev=null;
            return;
        }
        if(temp==tail){
            tail=tail.prev;
            tail.next=null;
            return;
        }
        prev.next=temp.next;
        temp.next.prev=prev;
    }
    public void delete_key(int key){
        if(isempty()){
            System.out.println("the list is empty");
            return;
        }
        if(head.data==key){
            System.out.println("the Node is delted");
            head=head.next;
            head.prev=null;
            return;
        }
        if(tail.data==key){
            System.out.println("the Node is deleted");
            tail=tail.prev;
            tail.next=null;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.data!=key && temp!=null){
            prev=temp;
            temp=temp.next;
        }
        if(temp.data==key){
            System.out.println("the Node is deleted");
            prev.next=temp.next;
            temp.next.prev=prev;
            return;
        }
        System.out.println("invallied key");
    }
    public void display_forward(){
        if(isempty()){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <---> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void display_backward(){
        if(isempty()){
            return;
        }
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" <---> ");
            temp=temp.prev;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        doubly_list dl=new doubly_list();
        int ch,val,key,pos;
        System.out.println("1.isempty\n2.insert first\n3.insert last\n4.insert position\n5.insert key\n6.delete first\n7.delete last\n8.delete position\n9.delete key\n10.display forward\n11.display backward\n12.exit");
        do{
            System.out.println("enter yoour choice");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    dl.isempty();
                    break;
                case 2:
                    System.out.println("enter the value:");
                    val=sc.nextInt();
                    dl.insertfirst(val);
                    break;

                case 3:
                    System.out.println("enter the value:");
                    val=sc.nextInt();
                    dl.insertlast(val);
                    break;
                case 4:
                    System.out.println("ennter the value:");
                    val=sc.nextInt();
                    System.out.println("enter the position:");
                    pos=sc.nextInt();
                    dl.insert_pos(val, pos);
                    break;
                case 5:
                    System.out.println("ennter the value:");
                    val=sc.nextInt();
                    System.out.println("enter the key:");
                    key=sc.nextInt();
                    dl.insert_key(val, key);
                    break;
                case 6:
                    dl.delete_first();
                    break;
                case 7:
                    dl.delte_last();
                    break;
                case 8:
                    System.out.println("enter the position:");
                    pos=sc.nextInt();
                    dl.delete_pos(pos);
                    break;
                case 9:
                    System.out.println("enter the key:");
                    key=sc.nextInt();
                    dl.delete_key(key);
                    break;
                case 10:
                    dl.display_forward();
                    break;
                case 11:
                    dl.display_backward();
                    break;
                case 12:
                    System.exit(1);
                default:
                    System.out.println("invallied choice");
                    break;
            }

        }while(ch!=12); 
        sc.close();
    }
}
