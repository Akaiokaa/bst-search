import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    @Test
    public void testContainsEmptyTree(){
        assertFalse(BstSearch.contains(null, 10));
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
}
