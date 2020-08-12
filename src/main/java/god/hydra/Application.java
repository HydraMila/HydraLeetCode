package god.hydra;

import god.hydra.algorithm.binary_search.BinarySearch;
import god.hydra.algorithm.binary_tree.BinaryTree;
import god.hydra.algorithm.climbing_stairs.ClimbingStairs;
import god.hydra.algorithm.move_zero.MoveZero;

import java.util.LinkedList;
import java.util.List;

/**
 * 主要启动类
 */
public class Application {

    public static void main(String[] args) {

//        移动零
        /*int[] testArr = {0, 2, 0, 1, 4};
        int[] testArr = {0, 0, 0, 0, 0};
        int[] testArr = {2, 0, 1, 4};
        MoveZero moveZero = new MoveZero();
        moveZero.moveZero(testArr);
        moveZero.printAnswer(testArr);*/

//        二分查找法具体实现
//        BinarySearch binarySearch = new BinarySearch();
        /*int[] nums = {1, 3, 5, 7, 9, 11};
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.printAnswer(binarySearch.binarySearch(nums, 8));*/

        /*int[] numsLeft = {1, 2, 2, 2, 4};
        binarySearch.printAnswer(binarySearch.binarySearchLeftBound(numsLeft, 2));*/

//        爬楼梯
//        ClimbingStairs climbingStairs = new ClimbingStairs();
//        climbingStairs.printAnswer(climbingStairs.climbingStairs(6));
//        climbingStairs.printAnswer(climbingStairs.climbingStairsFinb(6));

//        二叉树遍历
//        组装入参 start
        BinaryTree.TreeNode root = new BinaryTree.TreeNode();
        BinaryTree.TreeNode treeNode2 = new BinaryTree.TreeNode();
        BinaryTree.TreeNode treeNode3 = new BinaryTree.TreeNode();
        BinaryTree.TreeNode treeNode4 = new BinaryTree.TreeNode();
        BinaryTree.TreeNode treeNode5 = new BinaryTree.TreeNode();
        BinaryTree.TreeNode treeNode6 = new BinaryTree.TreeNode();
        BinaryTree.TreeNode treeNode7 = new BinaryTree.TreeNode();
        BinaryTree.TreeNode treeNode8 = new BinaryTree.TreeNode();

        root.setVal(1);
        treeNode2.setVal(2);
        treeNode3.setVal(3);
        treeNode4.setVal(4);
        treeNode5.setVal(5);
        treeNode6.setVal(6);
        treeNode7.setVal(7);
        treeNode8.setVal(8);

        treeNode5.setLeft(treeNode7);
        treeNode5.setRight(treeNode8);

        treeNode2.setLeft(treeNode4);
        treeNode2.setRight(treeNode5);

        treeNode3.setLeft(treeNode6);

        root.setLeft(treeNode2);
        root.setRight(treeNode3);
//        组装入参 end

        BinaryTree binaryTree = new BinaryTree();
        List<Integer> result = new LinkedList<>();
//        前序遍历
//        binaryTree.preOrderTraverse(root, result);
//        binaryTree.preOrderTraverseNoRecur(root, result);

//        中序遍历
        binaryTree.inOrderTraverse(root, result);
        binaryTree.inOrderTraverseNoRecur(root, result);

        binaryTree.printAnswer(result);
    }


}
