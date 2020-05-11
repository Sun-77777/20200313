import java.util.HashMap;
import java.util.Map;

public class TestMap {
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

    }
}
