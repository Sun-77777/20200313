public class Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
  }
    //最近公共祖先
    private TreeNode lca = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        findNode(root,p,q);
        return lca;
    }

    private boolean findNode(TreeNode root,TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        int left = findNode(root.left,p,q) ? 1 : 0;
        int right = findNode(root.right,p,q) ? 1 : 0;

        int mid = (root == p || root == q) ? 1 : 0;

        if (left+right+mid == 2) {
            lca = root;
        }
        return (left+right+mid) > 0;
    }


}
