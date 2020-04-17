import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackQueueInterview {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('{','}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            Character top = stack.pop();

            if (map.get(c).equals(top)) {
                continue;
            }

            /*if (top == '(' && c == ')') {
                continue;
            }
            if (top == '[' && c == ']') {
                continue;
            }
            if (top == '{' && c == '}') {
                continue;
            }*/

            //前面三个合法情况都没有命中，剩下的就只能是非法情况了
            return false;
        }
        if (stack.empty()) {
            return true;
        }
        //奇数个
        return false;
    }
}
