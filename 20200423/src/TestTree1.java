
public class TestTree1 {

    static class Node {
        public char val;
        public Node left;
        public Node right;

        public Node(char val) {
            this.val = val;
        }
    }

    public static Node build() {

        Node A = new Node('A');
        Node B= new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.right = F;
        E.left = G;
        F.left = H;
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

    public static void lastOrder(Node root) {
        if (root == null) {
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static int getSize(Node root) {
        if (root == null) {
            return 0;
        }

        return 1 + getSize(root.left) + getSize(root.right);
    }

    public static int leafSize(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return leafSize(root.left) + leafSize(root.right);
    }

    public static int kSize(Node root,int k) {
        if (root == null || k < 0) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return kSize(root.left,k-1) + kSize(root.right,k-1);
    }



    public static void main(String[] args) {
        Node root = build();
        int ret = getSize(root);
        System.out.println(ret);



    }
}

