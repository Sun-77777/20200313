import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows <= 0) {
            return result;
        }

        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1) {
            return result;
        }

        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2) {
            return result;
        }

        //第三行...
        for (int row = 3; row <= numRows; row++) {
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);

            for (int col = 2; col <= row-1; col++) {
                List<Integer> prevLine = result.get(row-1-1);
                int tmp1 = prevLine.get(col-1-1);
                int tmp2 = prevLine.get(col-1);
                curLine.add(tmp1+tmp2);
            }

            curLine.add(1);
            result.add(curLine);
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> ret = generate(4);
        System.out.println(ret);
    }
}
