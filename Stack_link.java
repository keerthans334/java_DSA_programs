import java.util.Scanner;
class node{
    int data;
    node next;   
}
public class stack_link {
  node head;
  public void  Stack_link(){
    head = null;
  }
  public void push(int n){
    node newnode=new node();
    newnode.data=n;
    newnode.next=head;
    head=newnode;
  }
  public boolean isempty(){
    return head==null;
}
public void pop(){
    if(isempty()){
        System.out.println("Stack is empty");
        return;
    }
    head=head.next;

}
public void display(){
    if(isempty()){
        System.out.println("Stack is empty!");
        return ;
    }
    node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ---> ");
        temp=temp.next;
    }
    System.out.println("null");
}
public void peek(){
    if(isempty()){
        System.out.println("Stack is empty");
        return ;
    }
System.out.println("the peek element is"+head.data);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1.push 2.pop 3.display 4.peek 5.exit");
    stack_link sl=new stack_link();
    int ch;
    do{
        System.out.println("enter the choice");
         ch=sc.nextInt();
    switch(ch) {
        case 1:
            System.out.println("enter the element to push into the stack");
            int ele=sc.nextInt();
            sl.push(ele);
            break;
        case 2:
            System.out.println("the element is deleted");
            sl.pop();
            break;
        case 3:
            System.out.println("the stack elements are");
            sl.display();
            break;
        case 4:
            sl.peek();
            break;
        case 5:
            System.exit(1);


    
        default:
            System.out.println("invallied choice");;
            }
        }while(ch!=5);
    }
}



