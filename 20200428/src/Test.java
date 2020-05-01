import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;


public class Test {
    public class Pair {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        public Pair(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
            this.sum = num1+num2;
        }
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k <= 0) {
            return result;
        }

        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.sum - o2.sum;
            }
        });
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                queue.offer(new Pair(nums1[i], nums2[j]));
            }
        }

        for (int i = 0; i < k; i++) {
            Pair cur = queue.poll();
            List<Integer> list = new ArrayList<>();
            if (cur != null) {
                list.add(cur.num1);
                list.add(cur.num2);
                result.add(list);
            }
        }
        return result;
    }
}
