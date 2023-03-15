/*
Dilara KARATAŞ 02200201044
 */
package binarysearchtreee;

/**
 *
 * @author dilar
 */
public class BinarySearchTree {

    private Node root;

    public boolean insert(int data) {
        root = insert(root, data);
        return true;
    }

    private Node insert(Node node, int data) {

        if (node == null) {
            return new Node(data);
        }


        if (node.data > data) {
            node.left = insert(node.left, data);
        }


        if (node.data < data) {
            node.right = insert(node.right, data);
        }
        
        else{
            return node;
        }
        return node;
    }

  
    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

 
    public void inOrderTraversal(Node node){

    
        if(node!=null){

            
            inOrderTraversal(node.left);

            
            System.out.println(node.data);

 
            inOrderTraversal(node.right);
        }
    }


   
    public boolean delete(int data){
        return delete(root, data)!=null;
    }

    private Node delete(Node root, int data){
       
        if(root ==null){
            return root;
        }
   
        else if(root.data>data){
            root.left = delete(root.left, data);
        }

        else if(root.data< data){
            root.right = delete(root.right, data);
        }
        else{
       
            if(root.left ==null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

          
            root.data = findMin(root.right);

            root.right= delete(root.right, root.data);
        }
        return root;
    }

    private int findMin(Node node){
        
        int min = node.data;

        while(node.left!=null){
            min = node.left.data;
            node = node.left;
        }
        return min;
    }
    public void printInorder() {
        printInOrderRec(root);
        System.out.println("");
    }

    private void printInOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printInOrderRec(currRoot.left);
        System.out.print(currRoot.data + ", ");
        printInOrderRec(currRoot.right);
    }
    public void printPreorder() {
        printPreOrderRec(root);
        System.out.println("");
    }

    private void printPreOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        System.out.print(currRoot.data + ", ");
        printPreOrderRec(currRoot.left);
        printPreOrderRec(currRoot.right);
    }
    public void printPostorder() {
        printPostOrderRec(root);
        System.out.println("");
    }

    private void printPostOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }
        printPostOrderRec(currRoot.left);
        printPostOrderRec(currRoot.right);
        System.out.print(currRoot.data + ", ");
        

    }
   }
