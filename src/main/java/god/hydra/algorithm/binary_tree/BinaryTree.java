package god.hydra.algorithm.binary_tree;

import god.hydra.classDef.AlgorithmDef;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树相关
 * 比如前中后遍历
 */
public class BinaryTree implements AlgorithmDef {

    /*
    四种主要的遍历思想为：
    前序遍历：根结点 ---> 左子树 ---> 右子树
    中序遍历：左子树---> 根结点 ---> 右子树
    后序遍历：左子树 ---> 右子树 ---> 根结点
    层次遍历：只需按层次遍历即可
     */

    /**
     * 前序遍历-递归
     * 根结点 ---> 左子树 ---> 右子树
     * @param root
     * @param result
     */
    public void preOrderTraverse(TreeNode root, List<Integer> result){
        if (null != root) {
//            将当前结果插入结果集
            result.add(root.getVal());
//            先获取左节点的值
            preOrderTraverse(root.getLeft(), result);
//            当左节点为空或加入结果集后，再将右节点加入
            preOrderTraverse(root.getRight(), result);
        }
    }

    /**
     * 前序遍历-无递归
     * @param root
     * @param result
     */
    public void preOrderTraverseNoRecur(TreeNode root, List<Integer> result){
//        栈模型，即需要先进先出的一个模型
//        因为当左节点为空时，需要找到上一个节点，取他的右节点，上一个节点比上上个节点先进，但是要先出
        List<TreeNode> stack = new LinkedList<>();
        TreeNode treeNode = root;
        while (null != treeNode || !stack.isEmpty()) {
            if (null != treeNode) {
//                如果当前节点不为空则将当前节点加入结果集
                result.add(treeNode.getVal());
//                将当前节点放入栈，以便当下一个节点的左节点为空时可以找到当前节点，然后访问他的右节点
                stack.add(treeNode);
                treeNode = treeNode.getLeft();
            } else {
//                当前节点为空，则找到上一个节点，然后获取到他的右节点
                TreeNode preTreeNode = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                treeNode = preTreeNode.getRight();
            }
        }
    }

    /**
     * 中序遍历-递归
     * 左子树---> 根结点 ---> 右子树
     * @param root
     * @param result
     */
    public void inOrderTraverse(TreeNode root, List<Integer> result){
        if (null != root) {
//            先将左节点插入集合
            inOrderTraverse(root.getLeft(), result);
//            再将当前节点插入
            result.add(root.getVal());
//            最后放入右节点
            inOrderTraverse(root.getRight(), result);
        }
    }

    /**
     * 中序无递归
     * @param root
     * @param result
     */
    public void inOrderTraverseNoRecur(TreeNode root, List<Integer> result){
        List<TreeNode> stack = new LinkedList<>();
        TreeNode treeNode = root;
//        当前节点为空并且已无上一个节点时停止循环
        while (null != treeNode || !stack.isEmpty()) {
            if (null != treeNode) {
//                当前节点不为空时，将当前节点节点压入栈
                stack.add(treeNode);
                treeNode = treeNode.getLeft();
            } else {
//                当前节点为空则向上获取上一个(根)节点
                TreeNode preTreeNode = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
//                将其值插入结果集
                result.add(preTreeNode.getVal());
//                左节点已为空，则遍历右节点
                treeNode = preTreeNode.getRight();
            }
        }
    }

    /**
     * 后续遍历-递归
     * 左子树 ---> 右子树 ---> 根结点
     * @param root
     * @param result
     */
    public void postOrderTraverse(TreeNode root, List<Integer> result){
        if (null != root) {
//            先将左节点插入集合
            postOrderTraverse(root.getLeft(), result);
//            再将右节点插入
            postOrderTraverse(root.getRight(), result);
//            最后放入当前节点
            result.add(root.getVal());
        }
    }

//    TODO 未完成
    public void postOrderTraverseNoRecur(TreeNode root, List<Integer> result){
        List<TreeNode> stack = new LinkedList<>();
        TreeNode treeNode = root;
        while (null != treeNode || !stack.isEmpty()) {
            if (null != treeNode) {
                stack.add(treeNode);
                treeNode = treeNode.getLeft();
            } else {
                TreeNode preTreeNode = stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);
                result.add(preTreeNode.getVal());
                treeNode = preTreeNode.getRight();
            }
        }
    }

    /**
     * 数节点对象
     */
    public static class TreeNode{
//        当前节点的值
        private int val;
//        左节点
        private TreeNode left;

//        右节点
        private TreeNode right;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
