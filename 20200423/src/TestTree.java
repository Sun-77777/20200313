public class TestTree {

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
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.right = F;
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

    public static void lastOrder(Node root) {
        if (root == null) {
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static int sizeNode = 0;
    public static void getSize(Node root) {
        if (root == null) {
            return;
        }
        sizeNode++;
        getSize(root.left);
        getSize(root.right);

    }
    public static void main(String[] args) {
        Node root = build();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        lastOrder(root);
        System.out.println();
//        getSize(root);
//        System.out.println(sizeNode);

    }
}
