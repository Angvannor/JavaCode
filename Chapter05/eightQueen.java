public class eightQueen {
    static int N = 8;
    static int[][] board = new int[N][N];

    public static void main(String[] args){
        if(solve(0)){
            printBoard();
        }else{
            System.out.println("无解");
        }
    }

    public static boolean solve(int row){
        if(row >= N) return true; // 8行都放好了，成功！

        for(int col = 0;col < N;col++){
            if(isSafe(row,col)){ //检查能不能放
                board[row][col] = 1; //试着放下皇后

                if(solve(row + 1)) return true; //递归放下一行

                board[row][col] = 0; //【回溯】如果不行，把皇后拿掉，换下一列试试
            }
        }
        return false; //这一行所有列都试过了，放不下
    }

    public static boolean isSafe(int row, int col){
        for(int i = 0; i < row; i++){
            // 1. 检查正上方
            if(board[i][col] == 1) return false;

            int offset = row - i; // 行差值

            // 2. 检查左上对角线：确保列索引 >= 0
            if(col - offset >= 0 && board[i][col - offset] == 1) return false;

            // 3. 检查右上对角线：确保列索引 < N
            if(col + offset < N && board[i][col + offset] == 1) return false;
        }
        return true;
    }

  public static void printBoard(){
      for(int[] rows : board){
          for(int cell : rows){
              System.out.print(cell == 1 ? "Q" : " . ");
          }
          System.out.println();
      }
  }

}


