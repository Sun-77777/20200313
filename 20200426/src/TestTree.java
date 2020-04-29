
import java.util.*;

public class TestTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<Integer> preorder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        //访问根节点
        res.add(root.val);
        //递归访问左子树
        //把参数中的集合里的所有元素都add到当前集合中
        res.addAll(preorder(root.left));
        res.addAll(preorder(root.right));
        return res;

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
        TreeNode ret = null;
        ret = find1(root.left,toFind);
        if (ret != null) {
            return ret;
        }
        return find1(root.right,toFind);
    }

    public static void lastOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prev = null;
        while (true) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            if (stack.empty()) {
                break;
            }

            TreeNode top = stack.peek();
            if (top.right == null || top.right == prev) {
                System.out.print(top.val + " ");
                stack.pop();
                prev = top;
            } else {
                cur = cur.right;
            }
        }
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (true) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (stack.empty()) {
                break;
            }
            TreeNode top = stack.pop();
            System.out.println(top.val + " ");

            cur = cur.right;
        }
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            System.out.print(cur.val + " ");
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null) {
                stack.push(cur.left);
            }
        }
    }
    private StringBuilder sb = new StringBuilder();
    public String treestr(TreeNode t) {
        if (t == null) {
            return "";
        }
        helper(t);
        return sb.toString();
    }
    public static void helper(TreeNode t) {

    }



    //判断是否是完全二叉树
    public boolean isComplete(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean isFirstStep = true;
        //
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (isFirstStep) {
                if (cur.left != null && cur.right != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left != null && cur.right == null) {
                    isFirstStep = false;
                } else if (cur.left == null && cur.right != null) {
                    return false;
                }
            } else {
                if (cur.left != null || cur.right != null) {
                    return false;
                }
            }
        }
        return true;
    }
}
