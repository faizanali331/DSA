import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST{

    class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            left = null;
            right = null;
            this.key = key;
        }
    }
    Node root;
    public void insertNode(int key){

        Node newNode = new Node(key);
        if(root == null){
            root = newNode;
        }else{
            insert(newNode, root, key);
        }
    }
    public void insert(Node node, Node root, int key){
        if(key<root.key){
            if(root.left == null){
                root.left = node;
            }else{
                insert(node, root.left, key);
            }
        }else{
            if(root.right == null){
                root.right = node;
            }else{
                insert(node, root.right, key);
            }
        }
    }
    public void preTraverse(Node root){
        if(root == null) return;

        System.out.print(root.key+" ");
        preTraverse(root.left);
        preTraverse(root.right);
    }
    public void inorderTraversal(Node root){
        if(root == null) return;

        inorderTraversal(root.left);
        System.out.print(root.key+" ");
        inorderTraversal(root.right);
    }
    public void postTraversal(Node root){
        if(root == null) return;

        postTraversal(root.left);
        postTraversal(root.right);
        System.out.print(root.key+" ");
    }
    public void breadthFisrtTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.key+" ");
            if(current.left!=null){
                queue.add(current.left);
            }
            if(current.right!=null){
                queue.add(current.right);
            }
        }

    }
    public void depthFirstTraversal(Node node){
        if(node == null) return;
        Stack<Node> stk = new Stack<>();
       stk.push(node);

        while(!stk.isEmpty()){
            Node current = stk.pop();
            System.out.print(current.key+" ");

            if(current.left!=null){
                stk.push(current.left);
            }
            if(current.right!=null){
                stk.push(current.right);
            }
        }

    }
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insertNode(15);
        bst.insertNode(16);
        bst.insertNode(12);
        bst.insertNode(19);
        bst.insertNode(2);
        bst.insertNode(23);
        bst.insertNode(31);
        bst.insertNode(29);

        System.out.println("preorder traversal");
        bst.preTraverse(bst.root);
        System.out.println();

        System.out.println("inorder traversal");
        bst.inorderTraversal(bst.root);
        System.out.println();

        System.out.println("postorder traversal");
        bst.postTraversal(bst.root);
        System.out.println();

        System.out.println("BFT");
        bst.breadthFisrtTraversal(bst.root);
        System.out.println();

        System.out.println("DFT");
        bst.depthFirstTraversal(bst.root);
    }
}
