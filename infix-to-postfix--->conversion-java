import java.util.Scanner;
public class infix_to_postfix{
int top;
char stack[];
String str="";
public infix_to_postfix(int size){
stack=new char[size];
top=-1;
}
public String push(String str1){
   for(int i=0;i<str1.length();i++){
        char c=str1.charAt(i);
     int prece=precedence(c);
    
    if(prece==-1){
        str+=c;
    }
    else if(c=='('){
        top++;
        stack[top]=c;

    }
    else if(c==')'){
        while(top!=-1&&stack[top]!='('){
            str+=stack[top--];
        }
        top--;
    }
    else{
        while(top!=-1&&precedence(stack[top])>=prece){
            str+=stack[top--];
        }
        stack[++top]=c;
    } 
}
    while(top!=-1)
    str+=stack[top--];

return str;
}


public int precedence(char c){
    switch (c) {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '(':
        case ')':
            return 0;
        default:
            return -1;
    }

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the infix expression");
     String str=sc.nextLine();
     infix_to_postfix ip =new infix_to_postfix(str.length());
    String  postfix=ip.push(str);
     System.out.println("the postfix expression is:\n"+postfix);
     sc.close();
}
}
