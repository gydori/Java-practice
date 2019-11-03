public class Main {
    public static void main(String[] args) {
        int[][] board1 = new int[][]{{5, 3, 4, 6, 7, 8, 9, 1, 2}, {6, 7, 2, 1, 9, 5, 3, 4, 8}, {1, 9, 8, 3, 4, 2, 5, 6, 7}, {8, 5, 9, 7, 6, 1, 4, 2, 3}, {4, 2, 6, 8, 5, 3, 7, 9, 1}, {7, 1, 3, 9, 2, 4, 8, 5, 6}, {9, 6, 1, 5, 3, 7, 2, 8, 4}, {2, 8, 7, 4, 1, 9, 6, 3, 5}, {3, 4, 5, 2, 8, 6, 1, 7, 9}};
        int[][] board2 = new int[][]{{5, 3, 4, 6, 7, 8, 9, 1, 2}, {6, 7, 2, 1, 9, 5, 3, 4, 8}, {1, 9, 8, 1, 5, 2, 5, 6, 7}, {8, 5, 9, 7, 6, 1, 4, 2, 3}, {4, 2, 6, 8, 5, 3, 7, 9, 1}, {7, 1, 3, 9, 2, 4, 8, 5, 6}, {9, 6, 1, 5, 3, 7, 2, 8, 4}, {2, 8, 7, 4, 1, 9, 6, 3, 5}, {3, 4, 5, 2, 8, 6, 1, 7, 9}};
        System.out.println(sudoku(board2));
        System.out.println(System.nanoTime());
    }

    public static boolean sudoku(int[][] board) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            sum += i;
        }
        int i = 0;
        for (i = 0; i < board.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < board[i].length; j++) {
                sumRow += board[i][j];
            }
            if (sumRow != sum) {
                break;
            }
        }
        if (i == board.length) {
            return true;
        } else {
            return false;
        }
    }
}
