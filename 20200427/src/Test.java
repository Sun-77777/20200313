public class Test {
    static class TreeNode {
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    '}';
        }
    }
    public static TreeNode result = null;
    public static void find(TreeNode root,char toFind) {
        if (root == null) {
            return;
        }
        if (root.val == toFind) {
            result = root;
            return;
        }
        find(root.left,toFind);
        find(root.right,toFind);
    }

    public static TreeNode find1(TreeNode root,char toFind) {
        if (root == null) {
            return null;
        }

        if (root.val == toFind) {
            return root;
        }

        TreeNode ret = find1(root.left,toFind);
        if (ret != null) {
            return ret;
        }
        return find1(root.right,toFind);
    }

    public static int kLeveNode(TreeNode root,int k) {
        if (root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return kLeveNode(root.left,k-1) + kLeveNode(root.right,k-1);
    }

    public static TreeNode buile() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        A.left = B;
        A.right = C;
        B.left = D;
        C.right = E;
        D.right = F;
        return A;

    }
    public static void main(String[] args) {
        TreeNode root = buile();
        int ret = kLeveNode(root,4);
        System.out.println(ret);
        TreeNode ret1 = find1(root,'E');
        System.out.println(ret1);
        find(root,'G');
        System.out.println(result);

    }
}
