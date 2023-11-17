import javax.swing.*;
import java.awt.*;

public class SwingEasy1 {
    private JFrame mainframe;
    private JPanel controlPanel;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public SwingEasy1(){
        prepareGUI();
    }


    public static void main(String[] args) {
        SwingEasy1 SwingSDemo= new SwingEasy1();
    }

    public void prepareGUI(){

        JButton button1 = new JButton ("button 1");
        button1.setSize(500, 50);


        JButton button3= new JButton ("button 3" );
        button3.setSize(500, 50);

        JFrame mainframe= new JFrame("Fall break"); //mainframe is frame of window
        mainframe.setBounds(0,0,500, 400);
        mainframe.setLayout(new BorderLayout());
        mainframe.add(button1, BorderLayout.NORTH);
        mainframe.add(button3, BorderLayout.SOUTH);

        JPanel controlPanel= new JPanel(); //control panel in one of the rows in main frame's grid
        controlPanel.setLayout (new GridLayout (2, 3)); //north// south// east west

        JButton button2 = new JButton("button 2");
        controlPanel.add(button2);
        JLabel label1=new JLabel("label 1");
        controlPanel.add(label1);
        JButton button4=new JButton ("button 4");
        controlPanel.add(button4);
        JLabel label2=new JLabel("label 2");
        controlPanel.add(label2);
        JButton button5= new JButton ("button 5");
        controlPanel.add(button5);


        mainframe.add(controlPanel);

        mainframe.setVisible(true);
    }


}