public class TestTree {

    static class Node {
        public char val;
        public Node left;
        public Node right;
        //此处没有parent

        public Node(char val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }

    static Node build() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        E.left = G;

        return A;
    }


    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    /*public static int treeSize = 0;
    public static void size(Node root) {
        if (root == null) {
            return;
        }
        treeSize++;
        size(root.left);
        size(root.right);
    }*/

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        //借助递归思想把问题拆分
        //整个树的节点个数= 根节点个数+左子树节点个数+右字数节点个数
        return 1 + size(root.left) + size(root.right);
    }
    /*public static int leafSize = 0;
    public static void leafSize(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafSize++;
            return;
        }
        leafSize(root.left);
        leafSize(root.right);
    }*/

    public static int leafSize(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right ==null) {
            return 1;
        }
        //叶子节点个数 = 左子树叶子的节点个数 + 右子树叶子的节点个数
        return leafSize(root.left) + leafSize(root.right);
    }

    public static int kLevelSize(Node root,int k) {
        if (root == null || k < 1) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        //把问题拆分
        //求树第k层节点个数 = 左子树的k-1 层节点个数 + 右子树的k-1层节点个数
        return kLevelSize(root.left,k-1) + kLevelSize(root.right,k-1);

    }
    /*public static Node result = null;
    public static void find(Node root,char val) {
        if (root == null) {
            return;
        }
        if (root.val == val) {
            result = root;
            return;
        }
        find(root.left,val);
        find(root.right,val);
    }*/

    public static Node find(Node root,int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        }
        Node result = find(root.left,val);

        if (result != null) {
            return result;
        }
        return find(root.right,val);
    }

    public static void main(String[] args) {
        Node root = build();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        size(root);
        //System.out.println(treeSize);
        int ret = leafSize(root);
        System.out.println(ret);

//        find(root,'A');
//        System.out.println(result);

        Node ret1 = find(root,'B');
        System.out.println(ret1);
    }
}
