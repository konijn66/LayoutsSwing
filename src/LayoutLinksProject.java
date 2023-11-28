import javax.swing.*;
import java.awt.*;

public class LayoutLinksProject {
    private JFrame mainframe;
    private JPanel northPanel;
    private JPanel enterPanel;
    private JPanel bigPanel;
    private JButton enterButton;
    private JButton clearButton;
    private TextArea URLbox;
    private TextArea searchBox;
    private JLabel results;

    public LayoutLinksProject(){
        prepareGUI();
    }

    public static void main(String[] args) {
        LayoutLinksProject myLayoutLinksProject=new LayoutLinksProject();
    }

    public void prepareGUI(){
        JFrame mainframe=new JFrame();
        mainframe.setBounds(0,0,700,500);
        mainframe.setLayout(new BorderLayout());


        JPanel northpanel=new JPanel();
        northpanel.setLayout(new GridLayout(2,1));
        JTextArea URLbox=new JTextArea("URL:");
        northpanel.add(URLbox);
            JPanel enterPanel=new JPanel();
            enterPanel.setLayout(new BorderLayout());
            JTextArea searchBox=new JTextArea("search bar:");
            enterPanel.add(searchBox);
            northpanel.add(enterPanel);
        mainframe.add(northpanel, BorderLayout.NORTH);

        JLabel results=new JLabel();
        mainframe.add(results, BorderLayout.CENTER);

        mainframe.setVisible(true);
    }

}
