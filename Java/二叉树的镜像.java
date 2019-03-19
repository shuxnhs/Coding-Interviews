// 二叉树的镜像

// 题目描述：
// 操作给定的二叉树，将其变换为源二叉树的镜像。

/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
// 方法一思路： 递归调转两颗子树（写多一个递归方法，返回镜像之后的子树）
public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null)return;
        if(root.left == null && root.right == null)return;

        TreeNode tmp = root.left;
        root.left = getMirror(root.right);
        root.right = getMirror(tmp);
    }

    private TreeNode getMirror(TreeNode node){
        if(node == null)return null;
        TreeNode tmp = node.left;
        node.left = getMirror(node.right);
        node.right = getMirror(tmp);
        return node;
    }
}

// 方法二思路： 使用原函数，在内部进行调转镜像
public class Solution {
    public void Mirror(TreeNode root) {
        if(root == null)return;
        if(root.left == null && root.right == null)return;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        if(root.right != null) Mirror(root.right);
        if(root.left != null) Mirror(root.left);
    } 
}