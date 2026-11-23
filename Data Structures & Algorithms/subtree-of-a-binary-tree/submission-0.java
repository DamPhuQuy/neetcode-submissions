class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (isSameTree(node, subRoot)) {
                return true;
            }

            if (node.left != null) {
                stack.push(node.left);
            }

            if (node.right != null) {
                stack.push(node.right);
            }
        }

        return false;
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode[]> stack = new Stack<>();
        stack.push(new TreeNode[]{p, q});

        while (!stack.isEmpty()) {
            TreeNode[] pair = stack.pop();

            TreeNode a = pair[0];
            TreeNode b = pair[1];

            if (a == null && b == null) continue;
            if (a == null || b == null) return false;
            if (a.val != b.val) return false;

            stack.push(new TreeNode[]{a.left, b.left});
            stack.push(new TreeNode[]{a.right, b.right});
        }

        return true;
    }
}