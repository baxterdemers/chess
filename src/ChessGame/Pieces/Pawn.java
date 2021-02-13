package ChessGame.Pieces;

import ChessGame.Pieces.utils.Color;
import ChessGame.Spot;

import java.util.List;

public class Pawn extends Piece{
    public Pawn(Color color, Spot spot) {
        super(color, spot, 1, 'P');
    }

    @Override
    public List<Spot> getValidMoves() {
        return null;
    }
}
