package Chess;

public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
 //      if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;
 //      if ((color.equals("White") && line == 1) || (color.equals("Black") && line == 1)) {
 //          if

 //          }
 //          return true;
 //      }
 //      return false;
        // пешка может сделать ход на 2 клетки только первым ходом
        if (color.equals("White") && toLine - line == 2 && line == 1  && toColumn - column == 0) return true;
        if (color.equals("Black") && line - toLine == 2 && line == 6  && toColumn - column == 0) return true;

// пешка не может выйти за доску
        if (toLine > 7 || toLine < 0 || toColumn > 7 || toColumn < 0) return false;

// пешка не может остаться на своем месте
        if (Math.abs(toLine - line) == 0) return false;

// пешка может сделать ход на 2 клетки только первым ходом
        if (Math.abs(toLine - line) > 1 || Math.abs(toColumn - column) > 0) return false;

// пешка может ходить только вперед
        if (toLine <= line && getColor().equals("White")) return false;
        if (toLine >= line && getColor().equals("Black")) return false;

        return true;
 }

    @Override
    public String getSymbol() {
        return "P";
    }
}
