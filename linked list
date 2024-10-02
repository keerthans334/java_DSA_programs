
import java.util.Scanner;
 class Node{
    int data;
    Node next;
   
}
  class Linkedlist {
    Node  head;
    public Linkedlist(){
    head=null;
    }
   public void insert(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next=head;
    head=newNode;
   }
   public  void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
  }
  public void delete() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    System.out.println("enter the student Marks whom you want to remove:");
    Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    System.out.println("the student with marks " + marks + " is deleted");

    if (head.data == marks) {
        head = head.next;
        return;
    }

    Node temp = head;
    Node previous = null;

    while (temp != null && temp.data != marks) {
        previous = temp;
        temp = temp.next;
    }

    if (temp == null) {
        System.out.println("Student with marks " + marks + " not found");
        return;
    }

    previous.next = temp.next;
}

    public static  void main(String[] args) {
      Linkedlist l=new Linkedlist();
      int ch;
  Scanner sc=new Scanner(System.in);
      System.out.println("1. add new student \n2. display student marks \n3.remove student \n4.exit");
      do{
        System.out.println("enter your choice");
        ch=sc.nextInt();
        switch(ch){
          case 1:
                  System.out.println("enter the data");
                 int m=sc.nextInt();
                  l.insert(m);
                  
                  break;
          case 2 :
                  l.printList();
                  break;
          case 3:
                  l.delete();
                  break;
          case 4:
                  System.exit(1);
                  break;
          default:
                  System.out.println("invalid choice");

        }
      }while(ch!=4);


    }
}







