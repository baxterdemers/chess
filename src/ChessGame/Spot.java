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
}
