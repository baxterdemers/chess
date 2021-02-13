package ChessGame.Pieces;

import ChessGame.Pieces.utils.Color;
import ChessGame.Spot;

import java.util.List;

public class Rook extends Piece{

    public Rook(Color color, Spot spot) {
        super(color, spot, 5, 'R');
    }

    @Override
    public List<Spot> getValidMoves() {
        return null;
    }
}
