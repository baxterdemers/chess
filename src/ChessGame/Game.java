package ChessGame;

import ChessGame.Pieces.utils.Color;

public class Game {

    public Board board;
    public Color turn;

    public Game(){
        board = new Board();
        turn = Color.WHITE;
    }
}
