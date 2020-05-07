
import java.util.LinkedList;
import java.util.Queue;

public class TestTree {
    public class Node {
        public int val;
        public Node left;
        public Node right;

        public Node(char val) {
            this.val = val;
        }
    }
    //层次遍历
    public static void levelOrderTraversal(Node root) {
        //1.创建一个队列
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.offer(root);
        //2.进入循坏，循环结束条件队列为空
        while (!queue.isEmpty()) {
            // a).取出队首元素
            Node cur = queue.poll();
            // b).访问队首元素
            System.out.print(cur.val + " ");
            // c).把当前节点的左右子树分别入队列
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
}
