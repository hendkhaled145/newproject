import javax.swing.*;
import java.awt.*;

public class withdrawal extends JFrame {
    public withdrawal(){
        intialwithdrawal();
        maincomp();
    }
    private void intialwithdrawal (){
        setTitle("withdrawal");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    private void maincomp (){
        JPanel hend = new JPanel() ;
        JPanel sahar = new JPanel() ;

        JButton jb1 = new JButton("withdrawal");
        JButton jb2 = new JButton("back") ;
        JLabel jl = new JLabel("enter balance");
        JTextField jt = new JTextField(10) ;
        jt.setSize(300,300);

        hend.add(jb1);
        hend.add(jb2);

        sahar.add(jl);
        sahar.add(jt);

        add(sahar, BorderLayout.CENTER) ;
        add(hend,BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
    new withdrawal().setVisible(true);
    }
}
