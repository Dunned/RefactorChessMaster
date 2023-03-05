package codigos;

public class BishopFactory implements ChessGamePieceFactory {
    @Override
    public ChessGamePiece createPiece(ChessGameBoard board, int row, int col, int color) {
        return new Bishop(board, row, col, color);
    }
}
