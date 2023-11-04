package Day17;

public enum ChessPiece {
    KING_WHITE(100,"♔"), QUEEN_WHITE(9,"♕"), ROOK_WHITE(5,"♖"),
    BISHOP_WHITE(3.5,"♗"), KNIGHT_WHITE(3,"♘"), PAWN_WHITE(1,"♙"),
    KING_BLACK(100,"♚"), QUEEN_BLACK(9,"♛"), ROOK_BLACK(5,"♜"),
    BISHOP_BLACK(3.5,"♝"), KNIGHT_BLACK(3,"♞"), PAWN_BLACK(1,"♟");
    private final double value;
    private final String symbol;

    ChessPiece(double value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }
    public double getValue(){
        return value;
    }
    public String getSymbol(){
        return symbol;
    }
}
