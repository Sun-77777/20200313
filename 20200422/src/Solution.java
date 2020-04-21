import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<List<Integer>> grids = new ArrayList<>();
        List<Integer> gridsRow = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int[] arr = new int[m*n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int z = 0;
                arr[z] = grid[i][j];
                z++;
            }
        }
        for (int i = 0; i < m*n; i++) {
            arr[i] = arr[(m*n-1+k)/(m*n-1)];
        }
        return grids;
    }
}
