import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;

public class ChessMenuBarTest {

    // Prueba que los menús se creen correctamente y que contengan los elementos correctos
    @Test
    void testCreateMenus() {
        ChessMenuBar menuBar = new ChessMenuBar();
        assertEquals(3, menuBar.getMenuCount());
        assertEquals("File", menuBar.getMenu(0).getText());
        assertEquals(2, menuBar.getMenu(0).getItemCount());
        assertEquals("Options", menuBar.getMenu(1).getText());
        assertEquals(2, menuBar.getMenu(1).getItemCount());
        assertEquals("Help", menuBar.getMenu(2).getText());
        assertEquals(1, menuBar.getMenu(2).getItemCount());
    }


    // Prueba la funcionalidad del botón "Exit"
    @Test
    void testExitHandler() {
        ChessMenuBar menuBar = new ChessMenuBar();
        JFrame frame = new JFrame();
        frame.setJMenuBar(menuBar);
        menuBar.getMenu(0).getItem(1).doClick();
        assertFalse(frame.isActive());
        assertFalse(frame.isVisible());
    }

}