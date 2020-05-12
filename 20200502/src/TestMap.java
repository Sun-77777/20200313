import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static int[] singleTwoNumber(int [] nums) {
        int ret = 0;
        for (int i : nums) {
            ret ^= i;
        }
        int bit = 0;
        for (; bit < 32; bit++) {
            if ((ret & (1 << bit)) > 0) {
                break;
            }
        }
        int a = 0;
        int b = 0;
        for (int i : nums) {
            if ((i & (1 << bit)) > 0) {
                a ^= i;
            } else {
                b ^= i;
            }
        }
        return new int[]{a,b};
    }
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums) {
            Integer cur = map.get(i);
            if (cur == null) {
                map.put(i,1);
            } else {
                map.put(i,cur+1);
            }
        }
        for (Map.Entry<Integer,Integer> x : map.entrySet()) {
            if (x.getValue().equals(1)) {
                return x.getKey();
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,5};
        int[] ret = singleTwoNumber(nums);
        System.out.println(Arrays.toString(ret));

    }
}
