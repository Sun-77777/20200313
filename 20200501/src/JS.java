import java.util.HashSet;
import java.util.Set;

public class JS {
    public int numJewelsInStones(String J, String S) {
        int count = 0;

        //TreeSet.contains O(logN)
        //1.
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
