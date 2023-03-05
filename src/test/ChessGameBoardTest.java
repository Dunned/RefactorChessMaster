package test;

import static org.junit.Assert.*;

import codigos.BoardSquare;
import codigos.ChessGameBoard;
import org.junit.Test;

public class ChessGameBoardTest {

    @Test
    public void testClearCell() {
        ChessGameBoard board = new ChessGameBoard();
        BoardSquare[][] cells = board.getCells();

        // Check that board contains some cells
        assertNotNull(cells);
        assertTrue(cells.length > 0);
        assertTrue(cells[0].length > 0);

        // Clear a cell and check that it is cleared
        board.clearCell(0, 0);
        assertNull(cells[0][0].getPieceOnSquare());
    }
}

