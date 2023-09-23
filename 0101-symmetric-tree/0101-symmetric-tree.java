/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true; // 빈 트리는 대칭으로 처리
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode leftSubtree, TreeNode rightSubtree) {
        if (leftSubtree == null && rightSubtree == null) {
            return true; // 양쪽 서브트리가 빈 경우 대칭
        }
        if (leftSubtree == null || rightSubtree == null) {
            return false; // 한쪽만 빈 경우 대칭 아님
        }
        if (leftSubtree.val != rightSubtree.val) {
            return false; // 값이 다른 경우 대칭 아님
        }
        // 좌우 서브트리를 재귀적으로 비교
        return isMirror(leftSubtree.left, rightSubtree.right) && isMirror(leftSubtree.right, rightSubtree.left);
    }

    
}