public class Test {
    public class Node {
        public int key;
        public int value;
        public Node left;
        public Node right;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node root = null;

    public Node find(int key) {
        Node cur = root;
        while (cur != null) {
            if (key < cur.key) {
                cur = cur.left;
            } else if (key > cur.key) {
                cur = cur.right;
            } else {
                return cur;
            }
        }
        return null;
    }


    public void remove(int key) {
        //1.
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (key < cur.key) {
                parent = cur;
                cur = cur.left;
            } else if (key > cur.key) {
                parent = cur;
                cur = cur.right;
            } else {
                removeNode(cur,parent);
                return;
            }
        }
        return;
    }

    private void removeNode(Node cur, Node parent) {
        if (cur.left == null) {
            //1.没有左子树
            if (cur == root) {
                //1.1
                root = cur.right;
            } else if (cur == parent.left){
                //1.2
                parent.left = cur.right;
            } else if (cur == parent.right) {
                //1.3
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            //2.没有右子树
            if (cur == root) {
                //2.1
                root = cur.left;
            } else if (cur == parent.left) {
                //2.2
                parent.left = cur.left;
            } else if (cur == parent.right) {
                //2.3
                parent.right = cur.left;
            }
        } else {
            //3.
            //3.1
            Node scapeGoat = cur.right;
            Node scapeGoatParent = cur;
            while (scapeGoat.left != null) {
                scapeGoatParent = scapeGoat;
                scapeGoat = scapeGoatParent.left;
            }
            //3.2
            cur.key = scapeGoat.key;
            cur.value = scapeGoat.value;
            if (scapeGoat == scapeGoatParent.left) {
                scapeGoatParent.left = scapeGoat.right;
            } else {
                scapeGoatParent.right = scapeGoat.right;
            }
        }
    }
}
