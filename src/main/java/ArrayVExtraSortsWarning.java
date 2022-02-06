import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ArrayVExtraSortsWarning {
    private static final String TITLE = "ArrayV-Extra-Sorts.jar";
    private static final String OPEN_INSTALL_GUIDE = "Open Install Guide";
    private static final String CLOSE = "Close";
    private static final URI INSTALL_GUIDE_URI;

    static {
        try {
            INSTALL_GUIDE_URI =new URI("https://github.com/Gaming32/ArrayV-Extra-Sorts#installing");
        } catch (URISyntaxException e) {
            throw new Error(e);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        int decision = JOptionPane.showOptionDialog(
            null,
            "It looks like you tried to run ArrayV-Extra-Sorts.jar manually! This does not work.\n" +
            "For more info on how to install the Extra Sorts Pack, please see the install guide.",
            TITLE,
            JOptionPane.YES_NO_OPTION,
            JOptionPane.ERROR_MESSAGE,
            null,
            new String[] { OPEN_INSTALL_GUIDE, CLOSE },
            OPEN_INSTALL_GUIDE
        );
        if (decision == 0) { // OPEN_INSTALL_GUIDE
            try {
                Desktop.getDesktop().browse(INSTALL_GUIDE_URI);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(
                    null,
                    "Failed to open install guide: " + e,
                    TITLE,
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}
