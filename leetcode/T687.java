import javax.swing.tree.TreeNode;

public class T687 {
    public static void main(String[] a){
System.out.print("1");
    }
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max;
    public int longestUnivaluePath(TreeNode root) {
    if(root==null){
        return 0;
    }
    getmax(root, root.val);
    return max;
    }
    public int getmax(TreeNode node,int parent){
        int leftmax=getmax(node.left, node.val);
        int rightmax=getmax(node.right, node.val);
        max=Math.max(max, rightmax+leftmax);
        if(node.val==parent){
            return Math.max(leftmax, rightmax)+1;
        }
        return 0;
    }
}
}

