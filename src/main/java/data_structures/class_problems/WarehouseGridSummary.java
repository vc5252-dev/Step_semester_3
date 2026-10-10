package data_structures.class_problems;
public class WarehouseGridSummary {
    // Returns {totalItems, maxRow, maxColumn}; ties keep the first row-major cell.
    public static int[] warehouseSummary(int[][] grid) {
        int total = 0, max = grid[0][0], maxRow = 0, maxColumn = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                int value = grid[row][col];
                total += value;
                if (value > max) {
                    max = value;
                    maxRow = row;
                    maxColumn = col;
                }
            }
        }
        return new int[]{total, maxRow, maxColumn};
    }
    public static void main(String[] args) {
        int[][] grid = {{4, 9, 2}, {7, 1, 6}, {3, 12, 5}};
        int[] r = warehouseSummary(grid);
        System.out.println("(" + r[0] + ", (" + r[1] + ", " + r[2] + "))");
    }
}
