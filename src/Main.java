public class Main {

    private final static int ROW_COUNT = 3;
    private final static int COL_COUNT = 3;

    private final static String CELL_STATE_EMPTY = " ";
    private final static String CELL_STATE_X = "X";
    private final static String CELL_STATE_0 = "0";

    public static void main(String[] args) {
        String[][] board = createBoard();

        System.out.println("Hello World");
    }

    private static void startGameRound() {
        String[][] board = createBoard();
        startGameLoop(board);

    }

    private static String[][] createBoard() {
        String[][] board = new String[ROW_COUNT][COL_COUNT];

        for (int col = 0; col < ROW_COUNT; col++) {
            for (int row = 0; row < COL_COUNT; row++) {
                board[row][col] = CELL_STATE_EMPTY;
            }
        }
        return board;
    }

    private static void startGameLoop() {

    }

    private static void makePlayerTurn() {

    }

    private static void makeBotTurn() {

    }

    private static void checkGameState() {

    }

}
