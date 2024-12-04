import java.util.Scanner;

public class CircularList {
    class Node {
        int data;
        Node next;

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    Node head;
    int index = -1;

    public CircularList() {
        head = null;
    }

    public boolean isEmpty() { 
        return head == null;
    }

    public void insertFirst(int val) { 
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            newNode.next = head;
            ++index;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        head = newNode;
        temp.next = head;
        ++index;
    }

    public void insertLast(int val) { 
        Node newNode = new Node(val);
        if (isEmpty()) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        ++index;
    }

    public void insertPos(int val, int pos) { 
        if (pos < 0 || pos > index + 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        ++index;
    }

    public void insertKey(int val, int key) { 
        if (isEmpty()) {
            System.out.println("The linked list is empty");
            return;
        }
        if (head.data == key) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        do {
            if (temp.next.data == key) {
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                ++index;
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("The data element not found");
    }

    public void deleteFirst() { 
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.next == head) {
            System.out.println(head.data + " is deleted");
            head = null;
            --index;
            return;
        }
        System.out.println(head.data + " is deleted");
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
        --index;
    }

    public void deleteLast() { 
        if (isEmpty()) {
            System.out.println("The linked list is empty");
            return;
        }
        if (head.next == head) {
            deleteFirst();
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        System.out.println(temp.next.data + " is deleted");
        temp.next = head;
        --index;
    }

    public void deletePos(int pos) { 
        if (pos < 0 || pos > index) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.next.data + " is deleted");
        temp.next = temp.next.next;
        --index;
    }

    public void deleteKey(int val) { 
        if (isEmpty()) {
            System.out.println("The linked list is empty");
            return;
        }
        if (head.data == val) {
            deleteFirst();
            return;
        }
        Node temp = head;
        while (temp.next != head && temp.next.data != val) {
            temp = temp.next;
        }
        if (temp.next.data == val) {
            System.out.println(temp.next.data + " is deleted");
            temp.next = temp.next.next;
            --index;
        } else {
            System.out.println("Invalid data element");
        }
    }

    public void display() { 
        if (isEmpty()) {
            System.out.println("The linked list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ---> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularList cl = new CircularList();
        int ch, n, pos, key;
        System.out.println("1. Is empty\n2. Insert first\n3. Insert last\n4. Insert pos\n5. Insert key\n6. Delete first\n7. Delete last\n8. Delete pos\n9. Delete key\n10. Display\n11. Exit");
        do {
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println(cl.isEmpty() ? "Linked list is empty" : "Linked list is not empty");
                    break;
                case 2:
                    System.out.println("Enter the element:");
                    n = sc.nextInt();
                    cl.insertFirst(n);
                    break;
                case 3:
                    System.out.println("Enter the element:");
                    n = sc.nextInt();
                    cl.insertLast(n);
                    break;
                case 4:
                    System.out.println("Enter the element:");
                    n = sc.nextInt();
                    System.out.println("Enter the position:");
                    pos = sc.nextInt();
                    cl.insertPos(n, pos);
                    break;
                case 5:
                    System.out.println("Enter the element:");
                    n = sc.nextInt();
                    System.out.println("Enter the key element:");
                    key = sc.nextInt();
                    cl.insertKey(n, key);
                    break;
                case 6:
                    cl.deleteFirst();
                    break;
                case 7:
                    cl.deleteLast();
                    break;
                case 8:
                    System.out.println("Enter the position:");
                    pos = sc.nextInt();
                    cl.deletePos(pos);
                    break;
                case 9:
                    System.out.println("Enter the key element:");
                    key = sc.nextInt();
                    cl.deleteKey(key);
                    break;
                case 10:
                    cl.display();
                    break;
                case 11:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 11);
        sc.close();
    }
}
