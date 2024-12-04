import java.util.Scanner;
public class infix_to_postfix_evaluation{
   int top;
   int stack[];
   public infix_to_postfix_evaluation(int size){
    stack=new int[size];
    top=-1;
   } 
   public int control(String str){
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(Character.isDigit(c)==true){
            push(c-'0');
    
        }
        else{
            evaluate(c);
        }
    }
    return stack[top];
   }
   public void push(int n){
    stack[++top]=n;
    return;
   }
   public void evaluate(char c){
    int val2=stack[top--];
    int val1=stack[top--];
    switch (c) {
        case '+':
            push(val1+val2);
            return;
        case '-':
            push(val1-val2);
            return;
        case '*':
            push(val1*val2);
            return;
        case '/':
            push(val1/val2);
            return;
    }
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the postfix exspresion: ");
    String str=sc.nextLine();
    infix_to_postfix_evaluation ipe=new infix_to_postfix_evaluation(str.length());
    int value=ipe.control(str);
    System.out.println("the evaluated postfix exspresion is: "+value);
    sc.close();
   }
}
