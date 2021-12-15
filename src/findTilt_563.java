import javax.swing.tree.TreeNode;

public class findTilt_563 {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int child(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return child(root.left) + child(root.right) + root.val;
        }

        public int findTilt(TreeNode root) {
            if (root == null) {
                return 0;
            }

            return Math.abs(child(root.left) - child(root.right)) + findTilt(root.left) + findTilt(root.right);
        }
    }
}
