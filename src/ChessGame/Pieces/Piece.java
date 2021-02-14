package ChessGame.Pieces;

import ChessGame.Pieces.utils.Color;
import ChessGame.Spot;

import java.util.List;

public abstract class Piece{

    private final Color color;
    private final Spot spot;
    private final int value;
    private final char formattedPiece;



    public Piece(Color color, Spot spot, int value, char formattedPiece){
        this.color = color;
        this.spot = spot;
        this.value = value;
        this.formattedPiece = formattedPiece;
    }

    public Color getColor() {
        return color;
    }

    public Spot getSpot() { return spot; }

    public int getValue() {
        return value;
    }

    public String getFormattedPiece() {
        return String.valueOf(formattedPiece);
    }

    public abstract List<Spot> getValidMoves();

    @Override
    public String toString() {
        return "Piece{" +
                color +
                spot +
                ", value=" + value +
                formattedPiece +
                '}';
    }
}
