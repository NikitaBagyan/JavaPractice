package Chess;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (line == toLine && column == toColumn) return false;
        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;

        if (Math.abs(toLine - line) > 1 ||(Math.abs(toColumn - column) > 1)) return false;
        if (Math.abs(toLine - line) == Math.abs(toColumn - column) && Math.abs(toLine - line) == 1) return true;
        if (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) == 1 ||
                Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 0) return true;

//
        return false;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (checkPos(line) && checkPos(column)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (chessBoard.board[i][j] != null) {
                        if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}



