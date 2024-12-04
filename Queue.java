// method 1
import java.util.*;
public class Queue {
	int q[];
	int front, rear, size;
	Queue(int size) {
		this.size = size;
		front=rear=-1;
		q = new int[size];
	}
	public boolean isEmpty() {
		if ((front==-1) || (rear==-1))   // or if(r==-1)
			return true;
		else
			return false;
		                 	//return (rear==front-1);
	}
	public boolean isFull() {
		if(rear==size-1)
			return true;
		else
			return false;
			//return (rear==size-1);
	}
	public void enqueue(int n) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			if(front==-1)  // insert very first element
			  {
				front=0;  //front++;
			  }	 
			rear++;
			q[rear] = n;
			System.out.println(n+" is inserted into the queue");
		}
	}
	public void dequeue() {
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.println(q[front]+" is deleted");
			if(front==rear)  // when queue has single element
			   front=rear=-1;
			else
		    	front++;
		 }
	}
	public void display() {
		if(isEmpty())
			System.out.println("queue is emtpy");
		else {
			System.out.println("queue contains ");
			for(int i=front;i<=rear;i++)
				System.out.print(q[i]+" ");
			System.out.println();
		}
	}
	public void fpeek() {
		if(isEmpty())
			System.out.println("queue is empty");
		else 
			System.out.println("front peek is"+q[front]);
	}
	public void rpeek() {
		if(isEmpty())
			System.out.println("queue is empty");
		else 
			System.out.println("rear peek is"+q[rear]);
  }
	public static void main(String[] args) {
		int n,choice,size;
 		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the queue ");
		size = sc.nextInt();
		Queue obj = new Queue(size);
	 	obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.fpeek();
		obj.rpeek();
		obj.enqueue(40);
		obj.display();
		obj.dequeue();
		obj.dequeue();
		obj.display();
		obj.dequeue();
		obj.dequeue();
	}
}


============================================================
// method 2 : menu driven
// perform queue operations using a menu driven program
import java.util.*;
public class Queue {
	int q[];
	int front, rear, size;
	Queue(int size) {
		this.size = size;
		front=rear=-1;
		q = new int[size];
	}
	public boolean isEmpty() {
		if ((front==-1) || (rear==-1))   // or if(r==-1)
			return true;
		else
			return false;
		                 	//return (rear==front-1);
	}
	public boolean isFull() {
		if(rear==size-1)
			return true;
		else
			return false;
			//return (rear==size-1);
	}
	public void enqueue(int n) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			if(front==-1)  // insert very first element
			  {
				front=0;  //front++;
			  }	 
			rear++;
			q[rear] = n;
			System.out.println(n+" is inserted into the queue");
		}
	}
	public void dequeue() {
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.println(q[front]+" is deleted");
			if(front==rear)  // when queue has single element
			   front=rear=-1;
			else
		    	front++;
		 }
	}
	public void display() {
		if(isEmpty())
			System.out.println("queue is emtpy");
		else {
			System.out.println("queue contains ");
			for(int i=front;i<=rear;i++)
				System.out.print(q[i]+" ");
			System.out.println();
		}
	}
	public void fpeek() {
		if(isEmpty())
			System.out.println("queue is empty");
		else 
			System.out.println("front peek is"+q[front]);
	}
	public void rpeek() {
		if(isEmpty())
			System.out.println("queue is empty");
		else 
			System.out.println("rear peek is"+q[rear]);
  }
	public static void main(String[] args) {
		int n,choice,size;
 		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the queue ");
		size = sc.nextInt();
		Queue obj = new Queue(size);
        	do{ System.out.println("1. enqueue 2. dequeue 3. display 4. front peek 5. rear peek 6. exit");
			System.out.print("Enter your option: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1: System.out.print("enter any value to insert into queue ");
					n=sc.nextInt();
					obj.enqueue(n); break;
				case 2: obj.dequeue(); break;
				case 3: obj.display(); break;
				case 4: obj.fpeek(); break;
				case 5: obj.rpeek(); break;
				case 6: System.exit(1);  // break
				default: System.out.println("Enter right option"); break;
			}
		}while(choice!=6);
	}
}
