import javax.swing.*;
import java.awt.*;

public class SwingS {
        private JFrame mainframe;
        private JPanel controlPanel;
        private JLabel statusLabel;
        private TextArea ta;
        private JButton button;

        public SwingS(){
            prepareGUI();
        }


    public static void main(String[] args) {
        SwingS SwingSDemo= new SwingS();
    }

    public void prepareGUI(){
        JFrame mainframe= new JFrame("Fall break"); //mainframe is frame of window
        mainframe.setBounds(0,0,500, 400);
        mainframe.setLayout(new GridLayout (4, 1));

        JPanel controlPanel= new JPanel(); //control panel in one of the rows in main frame's grid
        controlPanel.setLayout (new BorderLayout()); //north// south// east west

        JButton button = new JButton ("start already");
        controlPanel.add(button, BorderLayout.WEST);

        JLabel statusLabel= new JLabel("Taking too long");
        controlPanel.add(statusLabel, BorderLayout.SOUTH);

        mainframe.add(controlPanel);

        JTextArea ta= new JTextArea();

        mainframe.setVisible(true);
    }


}
