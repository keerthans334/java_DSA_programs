import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int val) {
        data = val;
        prev = null;
        next = null;
    }
}

public class doublylist {
    Node head;
    Node tail;

    public doublylist() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = tail = newNode; 
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode; 
        }
    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            insertFirst(val); 
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode; 
        }
    }

    public void displayForward() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <--> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
    public void Deletefirst(){
        if(isEmpty()){
            return;
        }
        if(head.next==null){
            System.out.println(head.data+"is deleted");
            head=tail=null;
            return;
        }
        System.out.println(head.data+"is deleted");
        head=head.next;
        head.prev=null;
    }
    public void Deletelast(){
        if(isEmpty()){
            return;
        }
        if(head.next==null){
        System.out.println(tail.data+"is deleted");
            head=tail=null;
            return;
        }
        System.out.println(tail.data+"is deleted");
        tail=tail.prev;
        tail.next=null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Insert First\n2. Insert Last\n3. Display Forward\n4. Display Backward\n5. Delete First\n6.Delete last\n7. Exit");
        int ch, val;
       doublylist dl = new doublylist();
        do {
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the element:");
                    val = sc.nextInt();
                    dl.insertFirst(val);
                    break;
                case 2:
                    System.out.println("Enter the element:");
                    val = sc.nextInt();
                    dl.insertLast(val);
                    break;
                case 3:
                    dl.displayForward();
                    break;
                case 4:
                    dl.displayBackward();
                    break;
                case 5:
                    dl.Deletefirst();
                    break;
                case 6:
                    dl.Deletelast();
                    break;
                case 7:
                    System.exit(0); 
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 7);
        sc.close();
    }
}
