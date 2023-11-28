import javax.swing.*;
import java.awt.*;

public class Medium2 {
    private JFrame mainframe;
    private JPanel controlPanel;
    private JPanel southPanel;
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
        mainframe.setLayout(new GridLayout(3,3));

        JButton button1=new JButton("button1");
        mainframe.add(button1);
        JButton button2=new JButton("button2");
        mainframe.add(button2);
        JButton button3=new JButton("button3");
        mainframe.add(button3);
        JButton button4=new JButton("button4");
        mainframe.add(button4);

        JPanel southPanel=new JPanel();
        southPanel.setLayout(new BorderLayout());
        JButton button10=new JButton("button10");
        southPanel.add(button10,BorderLayout.SOUTH);

        JPanel controlPanel=new JPanel();
        controlPanel.setLayout(new GridLayout(1,2));
        JLabel label1=new JLabel("label1");
        controlPanel.add(label1);
        JButton button9=new JButton("button9");
        controlPanel.add(button9);
        southPanel.add(controlPanel,BorderLayout.CENTER );

        mainframe.add(southPanel);

        JButton button5=new JButton("button5");
        mainframe.add(button5);
        JButton button6=new JButton("button6");
        mainframe.add(button6);
        JButton button7=new JButton("button7");
        mainframe.add(button7);
        JButton button8=new JButton("button8");
        mainframe.add(button8);

        mainframe.setVisible(true);
    }

}
