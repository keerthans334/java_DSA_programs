import java.util.Scanner;
public class Binary_Search_tree{
    class Node{
        int data;
        Node left;
        Node right;
        private Node(int val){
            data = val;
            left = null;
            right = null;
            }
        }
        Node root;

    public Binary_Search_tree() {
        root=null;
    }
        
        public boolean  isempty(){
            return root==null;
        }
        public void insert(int val){
            if(isempty()){
                root=new Node(val);
                return;
            }
            Node current=root;
            Node parent=null;
            while(current!=null){
                parent=current;
                if(val<current.data){
                    current=current.left;
                }
                else{
                    current=current.right;
                }
            }
                if(val<parent.data){
                    parent.left=new Node(val);
                }
                else{
                    parent.right=new Node(val);
                }
            }
        
        public void inorder_traversal(){
            inorder(root);
        }
            static void  inorder(Node root){
                if(root==null){
                    return;
                }
                inorder(root.left);
                System.out.print(root.data+ " ");
                inorder(root.right);
            }
        public void postorder_traversal(){
            postorder(root);
        }
        static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public void preorder_traversal(){
            preorder(root);
        }
         static void preorder(Node root){
            if(root==null){
                return;
            }
                System.out.print(root.data+" ");
                preorder(root.left);
                preorder(root.right);
            }
            public static void main(String[] args) {
                Binary_Search_tree bst=new Binary_Search_tree();
                Scanner sc=new Scanner(System.in);
                System.out.println("1.insert Node\n2.inorder traversal\n3.postorder travesal\n4.preorder traversal\n5.exit");
                int val,ch;
                do { 
                    System.out.println("enter your choice");
                    ch=sc.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("enter the value");
                            val=sc.nextInt();
                            bst.insert(val);
                            break;
                        case 2:
                            bst.inorder_traversal();
                            break;
                        case 3:
                            bst.postorder_traversal();
                            break;
                        case 4:
                            bst.preorder_traversal();
                            break;
                        case 5:
                            System.exit(1);
                        default:
                            System.out.println("invallied choice");;
                    }
                } while (ch!=5);
            }
         }

        


