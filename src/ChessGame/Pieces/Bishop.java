package ChessGame.Pieces;

import ChessGame.Pieces.utils.Color;
import ChessGame.Spot;

import java.util.List;

public class Bishop extends Piece{

    public Bishop(Color color, Spot spot) {
        super(color, spot, 3, 'B');
    }

    @Override
    public List<Spot> getValidMoves() {
        return null;
    }
}
