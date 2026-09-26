// Shall create a hierarchy of classes, using a base class called ChessPiece. All pieces inherit from this class.
// Shall have an abstract method verifyMove(LocationX: newX, int: newY) that verifies if the piece can move to the target position passed as parameters.
// Add the following attributes: piece_name, color, column, row
// Add the following methods: empty constructor, constructor with parameters for each class field, getter methods for color, column, and row fields, setter for column and row, method to verify its piece movement verifyMove(column, row)

public abstract class ChessPiece{
    // Attributes
    private String piece_name;
    private String color;
    private char column;
    private int row;

    // Default constructor
    public ChessPiece(){
        this.piece_name = "";
        this.color = "";
        this.column = 'A';
        this.row = 1;
    }

    // Constructor with parameters
    public ChessPiece(String piece_name, String color, char column, int row){
        this.piece_name = piece_name;
        this.color = color;
        this.column = column;
        this.row = row;
    }

    // Getter methods for color, column, and row fields
    public String getPieceName(){
        return piece_name;
    }

    public String getColor(){
        return color;
    }

    public char getColumn(){
        return column;
    }

    public int getRow(){
        return row;
    }

    // Setter methods for column and row 
    public void setColumn(char column){
        this.column = column;
    }

    public void setRow(int row){
        this.row = row;
    }

    // Method to verify its piece movement verifyMove(column, row)
    public abstract boolean verifyMove(char column, int row);
}