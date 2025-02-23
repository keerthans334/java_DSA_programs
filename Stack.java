// method1 : stack operations such as push, pop, peek & display without using menu driven
import java.util.*;
public class Stack {
	int s[];
	int top,size;
	public Stack(int max) {
		size=max;
		top=-1;
		s = new int[size];
	}
	public boolean isFull() {
		if(top==size-1)    // return (top==size-1);
			return true;
		else
			return false;
	}
	public boolean isEmpty() {
		if(top==-1)  // return(top==-1);
			return true;
		else
			return false;
	}
	public void push(int n) {
		if(isFull())
			System.out.println("stack is full or overflow");
		else {
			top++;
			s[top]=n;
			System.out.println(s[top]+" is pushed into the stack");
		}
	}
	public void pop() {
		if(isEmpty())
            System.out.println(" stack is empty");
		else {
			System.out.println(s[top]+" is popped out from stack");
			top--;
        }
	return;
	}
	public void peek() {
		if(isEmpty())
            System.out.println(" stack is empty");
		else 
			System.out.println(s[top]+" is the peek of the stack");
		return;
	}
	public void display() {
		if(isEmpty())
        System.out.println(" stack is empty");
		else  {
            System.out.println(" stack contains");
			for(int i=top;i>=0;i--)  
				System.out.print(s[i]+"  ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of stack: ");
		n=sc.nextInt();
		Stack s1 = new Stack(n);
		s1.push(11);
        s1.push(22);
        s1.push(33);
		s1.peek();
        s1.push(44);
        
        s1.push(66);
        s1.display();
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
    }}      
        
================================
// method2 : stack operations such as push, pop, peek & display using menu driven
import java.util.*;
public class Stack {
	int s[];
	int top,size;
	public Stack(int max) {
		size=max;
		top=-1;
		s = new int[size];
	}
	public boolean isFull() {
		if(top==size-1)    // return (top==size-1);
			return true;
		else
			return false;
	}
	public boolean isEmpty() {
		if(top==-1)  // return(top==-1);
			return true;
		else
			return false;
	}
	public void push(int n) {
		if(isFull())
			System.out.println("stack is full or overflow");
		else {
			top++;
			s[top]=n;
			System.out.println(s[top]+" is pushed into the stack");
		}
	}
	public void pop() {
		if(isEmpty())
            System.out.println(" stack is empty");
		else {
			System.out.println(s[top]+" is popped out from stack");
			top--;
        }
	return;
	}
	public void peek() {
		if(isEmpty())
            System.out.println(" stack is empty");
		else 
			System.out.println(s[top]+" is the peek of the stack");
		return;
	}
	public void display() {
		if(isEmpty())
        System.out.println(" stack is empty");
		else  {
            System.out.println(" stack contains");
			for(int i=top;i>=0;i--)  
				System.out.print(s[i]+"  ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n,choice;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of stack: ");
		n=sc.nextInt();
		Stack obj = new Stack(n);
	 do{ System.out.println("1. push 2. pop 3. display 4. peek 5. exit");
			System.out.print("Enter your option: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1: System.out.print("enter any value to push into stack ");
					n=sc.nextInt();
					obj.push(n); break;
				case 2: obj.pop(); break;
				case 3: obj.display(); break;
				case 4: obj.peek(); break;
				case 5: System.exit(1);  // break
				default: System.out.println("Enter right option"); break;
			}
		}while(choice!=5);
	}
}

        
