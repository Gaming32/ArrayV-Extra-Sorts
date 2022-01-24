import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ArrayVExtraSortsWarning {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(
            null,
            "It looks like you tried to run ArrayV-Extra-Sorts.jar manually! This does not work.",
            "ArrayV-Extra-Sorts.jar",
            JOptionPane.ERROR_MESSAGE
        );
    }
}
