package ChessGame;

import ChessGame.Pieces.*;
import ChessGame.Pieces.utils.Color;

import java.util.Optional;

public class Board {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final int BOARD_SIZE = 8;
    private final Spot[][] boardArray;

    public Board(){
        this.boardArray = new Spot[BOARD_SIZE][BOARD_SIZE];
        for(int row = 0; row<Board.BOARD_SIZE; row++) {
            for (int column = 0; column < Board.BOARD_SIZE; column++) {
                Spot spot = new Spot(row, column);
                if (row==1){
                    Pawn pawn = new Pawn(Color.WHITE, spot);
                    spot.setPiece(pawn);
                    boardArray[row][column] = spot;
                } else if (row==6){
                    Pawn pawn = new Pawn(Color.BLACK, spot);
                    spot.setPiece(pawn);
                    boardArray[row][column] = spot;
                } else if (row == 0 || row == 7) {
                    Color color = row==0 ? Color.WHITE : Color.BLACK;
                    if(column == 0 || column == 7){
                        Rook rook = new Rook(color, spot);
                        spot.setPiece(rook);
                        boardArray[row][column] = spot;
                    } else if (column == 1 || column == 6){
                        Knight knight = new Knight(color, spot);
                        spot.setPiece(knight);
                        boardArray[row][column] = spot;
                    } else if (column == 2 || column == 5){
                        Bishop bishop = new Bishop(color, spot);
                        spot.setPiece(bishop);
                        boardArray[row][column] = spot;
                    } else if (column == 3) {
                        Queen queen = new Queen(color, spot);
                        spot.setPiece(queen);
                        boardArray[row][column] = spot;
                    } else {
                        King king = new King(color, spot);
                        spot.setPiece(king);
                        boardArray[row][column] = spot;
                    }
                } else {
                    boardArray[row][column] = new Spot(row, column);
                }
            }
        }
    }

    public Spot getSpotChessNotation(int row, char column){
        row = row - 1;
        if (column == 'a'){
            return getSpot(row, 0);
        }
        if (column == 'b'){
            return getSpot(row, 1);
        }
        if (column == 'c'){
            return getSpot(row, 2);
        }
        if (column == 'd'){
            return getSpot(row, 3);
        }
        if (column == 'e'){
            return getSpot(row, 4);
        }
        if (column == 'f'){
            return getSpot(row, 5);
        }
        if (column == 'g'){
            return getSpot(row, 6);
        }
        if (column == 'h'){
            return getSpot(row, 7);
        }
        throw new RuntimeException("no valid column found");
    }

    public Spot getSpot(int row, int column){
        return boardArray[row][column];
    }

    private String getFormattedPiece(Optional<Piece> maybePiece){
        if (maybePiece.isPresent()){
            Piece piece = maybePiece.get();
            return piece.getColor().getAnsiColor() + piece.getFormattedPiece() + ANSI_RESET;
        } else {
            return " ";
        }
    }

    public void showBoard(){
        for(int row = Board.BOARD_SIZE-1; row >= 0; row--) {
            System.out.println();
            System.out.println("---------------------------------");

            for (int column = Board.BOARD_SIZE-1; column >= 0; column--) {
                Spot spot = boardArray[row][column];
                Optional<Piece> maybePiece = spot.getMaybePiece();
                System.out.print("| " + getFormattedPiece(maybePiece) + " ");
            }
            System.out.print("|");
        }
        System.out.println();
        System.out.println("---------------------------------");
    }

}
