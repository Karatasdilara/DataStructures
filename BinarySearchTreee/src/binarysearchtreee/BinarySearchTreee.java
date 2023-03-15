

/*Dilara KARATAŞ 02200201044*/


package binarysearchtreee;

public class BinarySearchTreee {

  
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(52);
        bst.insert(15);
        bst.insert(56);
        bst.insert(9);
        bst.insert(16);
        bst.insert(54);
        bst.insert(3);
        bst.insert(10);
        bst.insert(65);
        bst.insert(72);
        bst.insert(61);


        System.out.println("********Önce *********");
        bst.inOrderTraversal();

        bst.delete(56);

        System.out.println("********Silindikten Sonra*********");
        bst.inOrderTraversal();
        
        System.out.println("ınorder sıralamaı");
        bst.printInorder();
        
        System.out.println("preorder sıralamaı");
        bst.printPreorder();
        
        System.out.println("postorder sıralamaı");
        bst.printPostorder();
      
    }
   
    }

    

