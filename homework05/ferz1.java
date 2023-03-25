package homework05;

public class ferz1 {
  public static void main(String[] args){
    arrangeQueens();
  }
  public static void printMatrix(char[][] board) {
      // 8x8 board
      int n = board.length;
      System.out.println();
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(board[i][j] + "|");
        }
        System.out.println();
      }
      System.out.println();
  
    }
  
    public static void updateBoard(int row, int col, Byte[][] matrix) {
      int n = matrix.length;

      for (int i = 0; i < n; n++) {
        for (int j = 0; j < n; j++) {
          matrix [i][j] = 
      }
        
          
        }
      }
  
      for (int j = 0; j < n; j++) {
        logicalBoard[row][j] = false;
      }
  
      // update the column
      for (int j = 0; j < n; j++) {
        logicalBoard[j][col] = false;
      }
  
      
        
   }
