package ChessGame;

import ChessGame.Pieces.Piece;

import java.util.Optional;

public class Spot {

    private Optional<Piece> maybePiece;

    public Spot(){
        maybePiece = Optional.empty();
    }

    public Spot(Piece piece){
        this.maybePiece = Optional.of(piece);
    }

    public Optional<Piece> getMaybePiece(){
        return maybePiece;
    }

    public void setPiece(Piece piece){
        maybePiece = Optional.of(piece);
    }
}
