import javax.swing.*;

public class SplitPaneExample_exp20 extends JFrame {

    public SplitPaneExample_exp20() {
        setTitle("Split Pane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panels for the split pane
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Panel 1"));
        
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2"));
        
        // Create a split pane with horizontal orientation
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        
        // Set the initial size of the split pane
        splitPane.setDividerLocation(150);
        
        // Add the split pane to the frame
        add(splitPane);
        
        // Set frame size and visibility
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SplitPaneExample_exp20::new);
    }
}
