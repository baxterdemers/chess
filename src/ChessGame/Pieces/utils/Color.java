package ChessGame.Pieces.utils;

import static ChessGame.Board.*;

public enum Color {
    WHITE("white", ANSI_YELLOW),
    BLACK("black", ANSI_BLACK);

    private final String value;
    private final String ansiColor;

    private Color(String value, String ansiColor){
        this.value = value;
        this.ansiColor = ansiColor;
    }

    public String asString(){
        return this.value;
    }

    public String getAnsiColor(){
        return this.ansiColor;
    }
}
