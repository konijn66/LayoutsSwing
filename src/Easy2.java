import javax.swing.*;
import java.awt.*;

public class Easy2 {
    private JFrame mainframe;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public Easy2(){
        prepareGUI();
    }

    public static void main(String[] args) {
        Easy2 myEasy2=new Easy2();
    }
    public void prepareGUI(){
        JFrame mainframe=new JFrame("Easy 2");
        mainframe.setBounds(0,0,500, 400);
        mainframe.setLayout(new BorderLayout());

        JButton button1=new JButton("button 1");
        mainframe.add(button1, BorderLayout.NORTH);
        JButton button3=new JButton("button 3");
        mainframe.add(button3, BorderLayout.SOUTH);
        JButton button2=new JButton("button 2");
        mainframe.add(button2, BorderLayout.WEST);
        JButton button4=new JButton("button 4");
        mainframe.add(button4, BorderLayout.EAST);
        JButton button5=new JButton("button 5");
        mainframe.add(button5, BorderLayout.CENTER);

        mainframe.setVisible(true);

    }


}
