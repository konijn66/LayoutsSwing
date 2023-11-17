import javax.swing.*;
import java.awt.*;

public class Medium2 {
    private JFrame mainframe;
    private JPanel controlPanel;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;

    public Medium2(){
        prepareGUI();
    }

    public static void main(String[] args) {
        Medium2 myMedium2=new Medium2();
    }

    public void prepareGUI(){
        JFrame mainframe=new JFrame();
        mainframe.setBounds(0,0,500, 400);
        mainframe.setLayout(new GridLayout());
        
        mainframe.setVisible(true);
    }

}
