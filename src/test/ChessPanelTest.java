package test;

import codigos.ChessGraveyard;
import codigos.ChessPanel;
import org.junit.Test;
import javax.swing.SwingUtilities;

import java.awt.*;

import static org.junit.Assert.*;

public class ChessPanelTest {

    @Test
    public void testComponentPlacement() throws Exception {
        ChessPanel panel = new ChessPanel();
        SwingUtilities.invokeLater(() -> {
            assertEquals(BorderLayout.NORTH, panel.getComponent(0).getName());
            assertEquals(BorderLayout.CENTER, panel.getComponent(1).getName());
            assertEquals(BorderLayout.SOUTH, panel.getComponent(2).getName());
            assertEquals(BorderLayout.WEST, panel.getComponent(3).getName());
            assertEquals(BorderLayout.EAST, panel.getComponent(4).getName());
            assertEquals(800, panel.getPreferredSize().width);
            assertEquals(600, panel.getPreferredSize().height);
        });
    }

    @Test
    public void testGetGraveyard() throws Exception {
        ChessPanel panel = new ChessPanel();
        ChessGraveyard graveyard1 = new ChessGraveyard("Player 1's graveyard");
        ChessGraveyard graveyard2 = new ChessGraveyard("Player 2's graveyard");
        SwingUtilities.invokeLater(() -> {
            assertSame(graveyard1, panel.getGraveyard(1));
            assertSame(graveyard2, panel.getGraveyard(2));
        });
    }

    // Additional tests for getGameLog(), getGameBoard(), and getGameEngine()
}

