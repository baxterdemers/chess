package ChessGame.Pieces;

import ChessGame.Pieces.utils.Color;
import ChessGame.Spot;

import java.util.List;

public class Knight extends Piece{

    public Knight(Color color, Spot spot) {
        super(color, spot, 3, 'N', name);
    }

    @Override
    public List<Spot> getValidMoves() {
        return null;
    }
}
