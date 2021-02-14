package ChessGame.Pieces;

import ChessGame.Pieces.utils.Color;
import ChessGame.Spot;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece{

    private boolean hasMoved;

    public Pawn(Color color, Spot spot) {
        super(color, spot, 1, 'P', name);
        hasMoved = false;
    }

    @Override
    public List<Spot> getValidMoves() {
        List<Spot> validMoves = new ArrayList<>();
        return validMoves;
    }
}
