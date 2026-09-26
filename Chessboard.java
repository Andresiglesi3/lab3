// Shall define a class for the chessboard responsible for checking if a coordinate is within the chessboard.
// Shall use the ChessBoard class to verify that the original position of the chess piece is correct, shall prompt the user again when a collected position is invalid and indicate valid ranges for columns and rows
// Shall assume that the chess piece given by the user is the only piece within the chessboard

public class Chessboard{
    // This class has a CONSTANT MAX_ROW = 8 and MIN_ROW = 1, as well as an enumerated type for columns.
    public static final int MAX_ROW = 8;
    public static final int MIN_ROW = 1;

    public enum Column{
        A, B, C, D, E, F, G, H
    }
    //The class has a method called “boolean withinChessboard( column, row)
    public static boolean withinChessboard(char column, int row){
        if(row < MIN_ROW || row > MAX_ROW){
            return false;
        }
        try{
            Column.valueOf(String.valueOf(column).toUpperCase());
            return true;
        } catch(IllegalArgumentException e){
            return false;
        }
    }
}