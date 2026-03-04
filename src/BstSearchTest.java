import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void testContainsEmptyTree(){
        assertFalse(BstSearch.contains(null, 10));
    }

    @Test
    public void testContainsTargetIsRoot(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10);
        assertTrue(BstSearch.contains(root, 10));
    }
    
       /*
         * Integer BST structure:
         *
         *          5
         *        /   \
         *       3     8
         *      / \   / \
         *     2   4 6   9
         *
         * search 4
         */
        /*
        */
    @Test
    public void testContainsLeft(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10);
        root.left = new BinaryTreeNode<Integer>(9);
        root.left.left = new BinaryTreeNode<Integer>(6);
        root.left.left.left = new BinaryTreeNode<Integer>(3);
        assertTrue(BstSearch.contains(root, 3));
    }

    @Test
    public void testContainsRight(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(10);
        root.right = new BinaryTreeNode<Integer>(20);
        root.right.right = new BinaryTreeNode<Integer>(40);
        root.right.right.right = new BinaryTreeNode<Integer>(50);
        assertTrue(BstSearch.contains(root, 50));
    }
    
    @Test
    public void testContainsTargetFound(){
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(5);
        root.left = new BinaryTreeNode<Integer>(3);
        root.left.right = new BinaryTreeNode<Integer>(4);
        root.left.left = new BinaryTreeNode<Integer>(2);

        root.right = new BinaryTreeNode<Integer>(8);
        root.right.left = new BinaryTreeNode<Integer>(6);
        root.right.right = new BinaryTreeNode<Integer>(9);
        
        assertTrue(BstSearch.contains(root, 9));
    }
    /*
    * String BST structure:
    *
    *           "m"
    *         /     \
    *       "c"      "t"
    *      /   \     /   \
    *    "a"   "e" "p"   "z"
    *
    * a
    */
   @Test
    public void testContainsTargetFoundString(){
        BinaryTreeNode<String> root = new BinaryTreeNode<String>("m");
        root.left = new BinaryTreeNode<String>("c");
        root.left.left = new BinaryTreeNode<String>("a");
        root.left.right = new BinaryTreeNode<String>("e");

        root.right = new BinaryTreeNode<String>("t");
        root.right.left = new BinaryTreeNode<String>("p");
        root.right.right = new BinaryTreeNode<String>("z");
        
        assertTrue(BstSearch.contains(root, "a"));
    }

   @Test
    public void testContainsTargetNotInTree(){
        BinaryTreeNode<String> root = new BinaryTreeNode<String>("m");
        root.left = new BinaryTreeNode<String>("c");
        root.left.left = new BinaryTreeNode<String>("a");
        root.left.right = new BinaryTreeNode<String>("e");

        root.right = new BinaryTreeNode<String>("t");
        root.right.left = new BinaryTreeNode<String>("p");
        root.right.right = new BinaryTreeNode<String>("z");
        
        assertFalse(BstSearch.contains(root, "404 not found!"));
    }
    
   @Test
    public void testContainsExactMatch() {
        /*
                market
              /        \
            cart       zebra
            /    \
          apple   earth     
        */
        BinaryTreeNode<String> root = new BinaryTreeNode<>("market");
        root.left = new BinaryTreeNode<>("cart");
        root.right = new BinaryTreeNode<>("zebra");

        root.left.left = new BinaryTreeNode<>("apple");
        root.left.right = new BinaryTreeNode<>("earth");

        assertFalse(BstSearch.contains(root, "zebra tamer"));
    }
}
