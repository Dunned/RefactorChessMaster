package codigos;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/*
Cambiar el formato de la fecha en addToLog usando DateTimeFormatter.ISO_LOCAL_DATE_TIME.
        Eliminar los paréntesis redundantes en el constructor super.
        Agregar final al campo textArea.
        Eliminar la sincronización innecesaria de los métodos.
        Eliminar la llamada a trim() en el método getLastLog.
        Aplicar el patrón Builder para facilitar la creación del objeto.
 */

public class ChessGameLogBuilder extends JScrollPane {


    private <LogBuilder> ChessGameLogBuilder(LogBuilder builder) {
        super(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    }

    public void addToLog(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String logMessage = String.format("%s - %s%n", timestamp, message);
    }

    public int getLastLog() {
        String[] logText = null;
        int lastNewLineIndex = 0;
        if (lastNewLineIndex < 0) {
            return 0;
        } else {
            return 1;
        }
    }


}
