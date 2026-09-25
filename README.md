# Lab 3 - Chess Pieces with Hierarchy and Polymorphism

## Project Overview
The purpose of this project is to apply object-roiented design principles: inheritance, polymorphism, and encapsulation, to validate chess moves for 6 user-selected pieces without the if or switch statements.

## Technical Information

### Files Needed
- `Chesspiece.java` (Abstract Base Class)
- `Chessboard.java`
- `PieceType.java` (Enum Types)
- `Column.java` (Enum, if we're doing extra credit)
- `Pawn.java`
- `Rook.java`
- `Knight.java`
- `Bishop.java`
- `Queen.java` (Inherits from Rook)
- `King.java` (Inherits from Queen)
- `Main.java`

### Hierarchy and Architecture Rules
- **Abstract Base Class:** `ChessPiece` contains common fields, constructors, getters, setters, and `abstract boolean verifyMove(char newCol, int newRow)`.
- **Direct Subclasses:** `Pawn`, `Knight`, `Bishop`, and `Rook` extend `ChessPiece`.
- **Inheritance Chain:** `Queen` extends `Rook` (reuses orthogonal move logic and adds diagonal validation). `King` extends `Queen` (restricts movement to a single square in any direction).
- **Polymorphism Rule:** `Main.java` must store all 6 pieces in a `ChessPiece[]` array and verify moves solely via `piece.verifyMove(...)`—no `instanceof`, `getClass()`, `if`, or `switch` checks for piece types.

---

#### Team Tasks & Work Breakdown
Three balanced roles: Core Hierarchy & Enums, Board & Independent Pieces, and Controller & Multi-level Hierarchy.

| Team Member | Assigned Files |
| :--- | :--- |
| **Person 1** | Main.java |
| **Person 2: Pamela** | ChessPiece.java<br>PieceType.java<br>Chessboard.java<br>Pawn.java |
| **Person 3** | Knight.java<br>Bishop.java<br>Rook.java<br>Queen.java<br>King.java |

---
## Attributes & Method Signatures

### Base Class: `ChessPiece`
- `protected String piece_name;`
- `protected String color;`
- `protected char column;`
- `protected int row;`
- `public ChessPiece()`
- `public ChessPiece(String piece_name, String color, char column, int row)`
- `public String getPieceName()`
- `public String getColor()`
- `public char getColumn()`
- `public int getRow()`
- `public void setColumn(char column)`
- `public void setRow(int row)`
- `public abstract boolean verifyMove(char newCol, int newRow)`

---

## Output Format Requirement
For each of the 6 pieces evaluated in the polymorphic loop, display:
- Valid: `[NamePiece] at [column, row] can move to [newCol, newRow]`
- Invalid: `[NamePiece] at [column, row] can NOT move to [newCol, newRow]`

---

## Git Workflow
Create a feature branch for your assigned files, test compilation locally, and submit a pull request against `main`:

```bash
# Option A
git checkout -b feature/foundation-chessboard

# Option B
git checkout -b feature/pieces-pawn-knight-bishop

# Option C
git checkout -b feature/pieces-chain-main# lab3
