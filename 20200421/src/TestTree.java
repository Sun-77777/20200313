public class TestTree {

    static class Node {
        public char val;
        public Node left;
        public Node right;
        //此处没有parent

        public Node(char val) {
            this.val = val;
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

    }


    public static void main(String[] args) {

    }
}
