package ChessGame.Pieces;

import ChessGame.Pieces.utils.Color;
import ChessGame.Spot;

import java.util.List;

public class King extends Piece {

    public King(Color color, Spot spot){
        super(color,spot, Integer.MAX_VALUE, 'K', name);
    }

    @Override
    public List<Spot> getValidMoves() {
        return null;
    }
}
