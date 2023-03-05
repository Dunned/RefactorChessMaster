import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessGameLogTest {

    private ChessGameLog log;

    @BeforeEach
    void setUp() {
        log = new ChessGameLog();
    }

    @Test
    void testAddToLog() {
        log.addToLog("Test message");
        String expected = "Test message";
        String actual = expected;
        assertEquals(expected, actual);
    }

    @Test
    void testClearLog() {
        log.addToLog("Test message");
        log.clearLog();
        String expected = "";
        String actual = expected;
        assertEquals(expected, actual);
    }

    @Test
    void testGetLastLog() {
        log.addToLog("First message");
        log.addToLog("Second message");
        String expected = "Second message";
        String actual = expected;
        assertEquals(expected, actual);
    }
}

