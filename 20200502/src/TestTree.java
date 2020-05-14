public class TestTree {
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
    public Node root = null;

    public Node insert(int key,int value) {
        if (root == null) {
            root = new Node(key, value);
            return root;
        }

        Node cur = root;
        Node prev = null;

        while (cur != null) {
            if (key < cur.key) {
                prev = cur;
                cur = cur.left;
            } else if (key > cur.key) {
                prev = cur;
                cur = cur.right;
            } else {
                cur.value = value;
                return cur;
            }
        }

        Node newNode = new Node(key, value);
        if (newNode.key < prev.key) {
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
        /*if (key < prev.key) {
            prev.left = new Node(key,value);
        } else {
            prev.right = new Node(key, value);
        }*/
        return newNode;
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
                //找到了要删除的结点
                removeNode1(cur,parent);
                return;
            }
        }
        return;
    }

    private void removeNode1(Node cur, Node parent) {
        if (cur.left == null) {
            if (cur == root) {
                root = cur.right;
            } else if (cur == parent.left) {
                parent.left = cur.right;
            } else if (cur == parent.right) {
                parent.right = cur.right;
            }
        } else if (cur.right == null) {
            if (cur == root) {
                root = cur.left;
            } else  if (cur == parent.left) {
                parent.left = cur.left;
            } else if (cur == parent.right) {
                parent.right = cur.left;
            }
        } else {
            Node scapeGoat1 = cur.right;
            Node scapeGoatParent1 = cur;
            while (scapeGoat1.left != null) {
                scapeGoatParent1 = scapeGoat1;
                scapeGoat1 = scapeGoat1.left;
            }
            cur.key = scapeGoat1.key;
            cur.value = scapeGoat1.value;

            if (scapeGoat1 == scapeGoatParent1.left) {
                scapeGoatParent1.left = scapeGoat1.right;
            } else {
                scapeGoatParent1.right = scapeGoat1.right;
            }
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.key + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.key + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TestTree testTree = new TestTree();

        testTree.insert(9,90);         testTree.insert(9,90);
        testTree.insert(5,90);
        testTree.insert(2,90);
        testTree.insert(7,90);
        testTree.insert(6,90);
        testTree.insert(8,90);

        preOrder(testTree.root);
        inOrder(testTree.root);


    }

}



