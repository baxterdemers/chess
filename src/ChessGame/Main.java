package ChessGame;

import static ChessGame.Board.ANSI_RESET;
import static ChessGame.Board.ANSI_RED;

public class Main {

    public static void main(String[] args){
        System.out.println(ANSI_RED + "CHESS" + ANSI_RESET);
        System.out.println("Initializing new game...");
        Game game = new Game();
        game.board.showBoard();
        Spot spot = game.board.getSpotChessNotation(2, 'b');
        System.out.println(spot.getMaybePiece().get());
    }
}
