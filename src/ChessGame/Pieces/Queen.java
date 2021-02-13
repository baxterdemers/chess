package ChessGame.Pieces;

import ChessGame.Pieces.utils.Color;
import ChessGame.Spot;

import java.util.List;

public class Queen extends Piece {

    public Queen(Color color, Spot spot) {
        super(color, spot, 9, 'Q');
    }

    @Override
    public List<Spot> getValidMoves() {
        return null;
    }
}
