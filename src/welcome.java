import javax.swing.*;
import java.awt.*;

public class welcome extends JFrame {
    public welcome (){
        intialwelcome();
        maincomp();
    }
    private void intialwelcome (){
        setTitle("welcome to our bank lobna ");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    private void maincomp (){
        JPanel sahar = new JPanel();
        sahar.setLayout(new GridLayout(3,1));
        JRadioButton jr1 =new JRadioButton("withdrawal");
        JRadioButton jr2 =new JRadioButton("deposit");
        JRadioButton jr3 =new JRadioButton("enquiry");



        ButtonGroup g1 = new ButtonGroup();
        g1.add(jr1);
        g1.add(jr2);
        g1.add(jr3);


        sahar.add(jr1);
        sahar.add(jr2);
        sahar.add(jr3);

        add( sahar) ;


    }


    public static void main(String[] args) {
        new welcome().setVisible(true);
    }
}
