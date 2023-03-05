package codigos;

public interface ChessGamePieceFactory {
    ChessGamePiece createPiece(ChessGameBoard board, int row, int col, int color);
}