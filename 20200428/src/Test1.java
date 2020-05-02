
import java.util.PriorityQueue;

public class Test1 {
    public static int lastStoneWeight(int[] stones) {
        int len = stones.length;
        if (len == 0) {
            return 0;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int stone: stones) {
            queue.offer(stone);
        }
        while (queue.size() > 1) {
            Integer head1 = queue.poll();
            Integer head2 = queue.poll();

            if (head1 != head2) {
                queue.offer(head1-head2);
            }
        }
        if (queue.isEmpty()) {
            return 0;
        }
        return queue.peek();

    }

    public static void main(String[] args) {
        int[] stones = {2,7,5,1,8,1};
        int ret = lastStoneWeight(stones);
        System.out.println(ret);
    }
}
