package battleship;

public class Gameboard {

    private char[][] gameBoard;
    private char[][] fogOfWarBoard;
    private String[] columnHeader;
    private String[] rowHeader;

        Gameboard() {
            gameBoard = new char[10][10];
            fogOfWarBoard = new char[10][10];
            columnHeader = new String[]{
                    " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
            rowHeader = new String[]{
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    gameBoard[i][j] = '~';
                    fogOfWarBoard[i][j] = '~';
                }
            }
        }

        private void printBoard(char[][] board) {
            for (int i = 0; i < columnHeader.length; i++) {
                System.out.print(columnHeader[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < rowHeader.length; i++) {
                System.out.print(rowHeader[i] + " ");
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        public void printGameBoard() {
            printBoard(gameBoard);
        }

        public void printFogOfWarBoard() {
            printBoard(fogOfWarBoard);
        }

        public void updateBoard(int startRow, int startCol, int endRow, int endCol, Battleships ship) {
            if (startRow == endRow) {
                int startIndex = Math.min(startCol, endCol);
                int endIndex = Math.max(startCol, endCol);
                for (int i = startIndex; i <= endIndex; i++) {
                    gameBoard[startRow][i] = 'O';
                    ship.storeShipCoordinates(startRow, i);
                }
            } else {
                int startIndex = Math.min(startRow, endRow);
                int endIndex = Math.max(startRow, endRow);
                for (int i = startIndex; i <= endIndex; i++) {
                    gameBoard[i][startCol] = 'O';
                    ship.storeShipCoordinates(i, startCol);
                }
            }
        }

        public boolean checkProximity(int startRow, int startCol, int endRow, int endCol) {
            boolean isShipTooClose = false;

            int topLeftCol = Math.min(startCol, endCol) - 1;
            int topLeftRow = Math.min(startRow, endRow) - 1;
            int bottomRightCol = Math.max(startCol, endCol) + 1;
            int bottomRightRow = Math.max(startRow, endRow) + 1;

            for (int r = topLeftRow; r <= bottomRightRow; r++) {
                if (r < 0 || r > 9) {
                    continue;
                }
                for (int c = topLeftCol; c <= bottomRightCol; c++) {
                    if (c < 0 || c > 9) {
                        continue;
                    }
                    if (gameBoard[r][c] == 'O') {
                       isShipTooClose = true;
                    }
                }
            }
            return isShipTooClose;
        }

        public boolean takeAShot(int row, int col) {
            boolean didItHit = false;
            if (gameBoard[row][col] == 'O' || gameBoard[row][col] == 'X') {
                didItHit = true;
                fogOfWarBoard[row][col] = 'X';
                gameBoard[row][col] = 'X';
            } else {
                fogOfWarBoard[row][col] = 'M';
                gameBoard[row][col] = 'M';
            }
            return didItHit;
        }

}
