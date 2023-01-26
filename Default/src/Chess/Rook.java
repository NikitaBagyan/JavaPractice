package Chess;

public class Rook extends ChessPiece{
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;
        if (Math.abs(toLine - line) == 0 && Math.abs(toColumn - column) > 0 ||
                Math.abs(toLine - line) > 0 && Math.abs(toColumn - column) == 0) return true;

       return false;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
