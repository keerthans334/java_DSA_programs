import java.util.Scanner;
public class insert_mid_link {
    class node{
        node next=null;
        int  data;
    }
    node head;
    public insert_mid_link(){
        head=null;
    }
    public  void insert_first(int n){
        node newnode=new node();
        newnode.data=n;
        newnode.next=head;
        head=newnode;
    }
    public void insert_last(int n){
        node newnode=new node();
        newnode.data=n;
        newnode.next=null;
        node temp=head;
        while (temp.next!=null) {
            temp=temp.next;            
        }
        temp.next=newnode;
    }
    public void insert_mid(int n,int pos){
        node newnode=new node();
        newnode.data=n;
        newnode.next=null;
        node temp=head;
        node mid=null;
        if(pos==head.data){
            newnode.next=head;
            head=newnode;
            return;
        }
        while(temp.next!=null&&temp.data!=pos){
            mid=temp;
            temp=temp.next;
        }
        if(temp.data==pos&&temp.next==null){
            newnode.next=mid.next;
            mid.next=newnode;
            return;
        }
        if(temp.next==null){
        System.out.println("node didn't found at that data point");
        return;
        }
        newnode.next=mid.next;
        mid.next=newnode;

         
    }
    public  void  delete(int n){
        System.out.println("the node is deleted at that data point");
        node temp=head;
        node pos=null;
        if(head.data==n){
            head=head.next;
        }
        while(temp.next!=null&&temp.data!=n){
            pos=temp;
            temp=temp.next;

            }
            if(temp.next==null){
                System.out.println("the node  at this data point not found");
                return;
            }
            pos.next=temp.next;

        }
        public void display(){
            System.out.println("the data elments are!");
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ---> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            insert_mid_link md=new  insert_mid_link();
            System.out.println("1.insert-node-begin  2.insert-node-end 3-insert-node-atpos 4.delelte-node  5.display-node-data  6.exit");
            int ch,ele;
            do{
                System.out.println("enter your choice");
                ch=sc.nextInt();
                switch (ch) {
                    case 1:
                    System.out.println("enter the element");
                     ele=sc.nextInt();
                    md.insert_first(ele);
                    break;
                    case 2:
                    System.out.println("enter the element");
                    ele=sc.nextInt();
                    md.insert_last(ele);
                    break;
                    case 3:
                    System.out.println("enter the element");
                    ele=sc.nextInt();
                    System.out.println("enter the data of the node from where you want to insert new node");
                    int pos=sc.nextInt();
                    md.insert_mid(ele, pos);
                    break;
                    case 4:
                    System.out.println("enter the data part of the node which need to be deleted");
                    ele=sc.nextInt();
                    md.delete(ele);
                    break;
                    case 5:
                    md.display();
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
