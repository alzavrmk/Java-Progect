package homework05;

public class ferz {
  public static void main(String[] args){
    arr();
  }
  public static void printMatrix(char[][] board) {
      // 8x8 board
      int n = board.length;
      System.out.println();
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(board[i][j]);
        }
        System.out.println();
      }
      System.out.println();
  
    }
  
    public static void updateBoard(int row, int col, boolean[][] logicalBoard) {
      int n = logicalBoard.length;
  
      // update the row
      for (int j = 0; j < n; j++) {
        logicalBoard[row][j] = false;
      }
  
      // update the column
      for (int j = 0; j < n; j++) {
        logicalBoard[j][col] = false;
      }
  
      // update the diagonals
      int r = row;
      int c = col;
      while (r >= 0 && c >= 0) {
        logicalBoard[r][c] = false;
        r--;
        c--;
      }
  
      r = row;
      c = col;
      while (r < 8 && c < 8) {
        logicalBoard[r][c] = false;
        r++;
        c++;
      }
  
      r = row;
      c = col;
      while (r < 8 && c >= 0) {
        logicalBoard[r][c] = false;
        r++;
        c--;
      }
  
      r = row;
      c = col;
      while (r >= 0 && c < 8) {
        logicalBoard[r][c] = false;
        r--;
        c++;
      }
    }
  
    public static char[][] copyArray(char[][] original) {
      char[][] copy = new char[original.length][];
      for (int i = 0; i < original.length; i++) {
        copy[i] = original[i].clone();
      }
      return copy;
    }
  
    public static boolean[][] copyArray(boolean[][] original) {
      boolean[][] copy = new boolean[original.length][];
      for (int i = 0; i < original.length; i++) {
        copy[i] = original[i].clone();
      }
      return copy;
    }
  
    public static void arr(char[][] board, boolean[][] logicalBoard, int rowNumber) {
      if (rowNumber == 8) {
        printMatrix(board);
        return;
      }
  
      int n = board.length;
      for (int column = 0; column < n; column++) {
        if (logicalBoard[rowNumber][column]) {
          char[][] newBoard = copyArray(board);
          boolean[][] newLogicalBoard = copyArray(logicalBoard);
          newBoard[rowNumber][column] = 'x';
          newLogicalBoard[rowNumber][column] = false;
          updateBoard(rowNumber, column, newLogicalBoard);
          arr(newBoard, newLogicalBoard, rowNumber + 1);
        }
      }
    }
  
    public static void arr() {
      int N = 8;
      char[][] board = new char[8][8];
      boolean[][] logicalBoard = new boolean[8][8];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          board[i][j] = '0';
          logicalBoard[i][j] = true;
        }
      }
      arr(board, logicalBoard, 0);
    }
      
        
   }
