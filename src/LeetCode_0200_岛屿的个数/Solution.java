package LeetCode_0200_岛屿的个数;

/**
 * @Author OliverYu
 * @Date 2019/4/9 10:18
 * @Email 253757635@qq.com
 * @Description TODO
 */
public class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || (grid.length == 1 && grid[0].length == 0)) {
            return 0;
        }
        int Row = grid.length;
        int Col = grid[0].length;
        int res = 0;
        for (int i=0; i<Row; i++) {
            for (int j=0; j<Col; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    infect(grid,i,j,Row,Col);
                }
            }
        }
        return res;
    }

    private void infect(char[][] grid, int i, int j, int Row, int Col) {
        if (i<0 || i>=Row || j<0 || j>=Col || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = 2;
        infect(grid,i-1,j,Row,Col);
        infect(grid,i+1,j,Row,Col);
        infect(grid,i,j-1,Row,Col);
        infect(grid,i,j+1,Row,Col);
    }

    public static void main(String[] args) {
        char[][] m1 = {};
        System.out.println(new Solution().numIslands(m1));
    }
}
