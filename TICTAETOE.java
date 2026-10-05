import java.util.Scanner;

public class TICTAETOE {
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // 2. making board for print terminals
    public static void printBoard(char[][] board) {
        System.out.println("----------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // 3. Winnig Check: Rows, Columns, Diagonals
    public static boolean checkWin(char[][] boards, char player) {
        for (int i = 0; i < 3; i++) {
            if (boards[i][0] == player && boards[i][1] == player && boards[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (boards[0][j] == player && boards[1][j] == player && boards[2][j] == player) {
                return true;
            }
        }

        if (boards[0][0] == player && boards[1][1] == player && boards[2][2] == player) {
            return true;
        }

        if (boards[0][2] == player && boards[1][1] == player && boards[2][0] == player) {
            return true;
        }

        return false;
    }

    // 4. Draw check
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // 5. MAIN GAME ENGINE LOOP
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        char currentPlayer = 'X';
        boolean gameOver = false;

        initializeBoard(board);

        System.out.println("--- WElcome to Tic-Tae-Toe ---");

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (row [0-2] and col [0-2]): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Input Validation: Range aur khali cell check
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;

                // After Moving, win check
                if (checkWin(board, currentPlayer)) {
                    printBoard(board);
                    System.out.println("Congratulations! Player " + currentPlayer + " wins!");
                    gameOver = true;
                }
                // when none of win, it Match Draw !
                else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a Draw!");
                    gameOver = true;
                }
                // Turn and Switch the game
                else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid Move! Spot already taken or out of range. Try again.");
            }
        }

    }
}
