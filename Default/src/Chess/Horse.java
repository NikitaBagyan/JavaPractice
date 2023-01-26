package Chess;

public class Horse extends ChessPiece {
    public Horse(String color) {
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
        if ((Math.abs(toLine - line) == 2 && Math.abs(toColumn - column) == 1) || (Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 2)) return true;

        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
