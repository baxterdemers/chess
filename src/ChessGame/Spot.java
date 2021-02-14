package ChessGame;

import ChessGame.Pieces.Piece;

import java.util.Optional;

public class Spot {

    private Optional<Piece> maybePiece;
    private int row;
    private int column;

    public Spot(int row, int column){
        this.row = row;
        this.column = column;
        maybePiece = Optional.empty();
    }

    public Spot(Piece piece, int row, int column){
        this.maybePiece = Optional.of(piece);
        this.row = row;
        this.column = column;
    }

    public Optional<Piece> getMaybePiece(){
        return maybePiece;
    }

    public void setPiece(Piece piece){
        maybePiece = Optional.of(piece);
    }

    public String getChessNotation(){
        return getCharForNumber() + (row + 1);
    }
    public String getCharForNumber() {
        int i = column + 1;
        return i > 0 && i < 9 ? String.valueOf((char)(i + 64)) : null;
    }
    public String toString(){
        return "Spot: " + getChessNotation();
    }
}
