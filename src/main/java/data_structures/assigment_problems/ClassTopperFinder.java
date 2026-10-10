package data_structures.assigment_problems;
public class ClassTopperFinder {
    // Returns {rowIndex, total}; strict > keeps the smallest row index in a tie.
    public static int[] findTopper(int[][] marks) {
        int bestRow = 0, bestTotal = -1;
        for (int row = 0; row < marks.length; row++) {
            int total = 0;
            for (int mark : marks[row]) total += mark;
            if (total > bestTotal) {
                bestTotal = total;
                bestRow = row;
            }
        }
        return new int[]{bestRow, bestTotal};
    }
    public static void main(String[] args) {
        int[][] marks = {{78, 85, 90}, {88, 92, 79}, {65, 70, 95}};
        int[] r = findTopper(marks);
        System.out.println("(" + r[0] + ", " + r[1] + ")");
    }
}
