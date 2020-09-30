import javax.swing.*;
import java.awt.*;

public class enquiry extends JFrame {
   public enquiry(){
    intialenquiry();
    maincomp();
    }
    private void intialenquiry (){
        setTitle("enquiry");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void maincomp (){
       JPanel hend = new JPanel() ;
        JPanel sahar = new JPanel() ;
       JButton jb = new JButton("back") ;
        JLabel jl = new JLabel("your current balance") ;
        jl.setSize(300,300);
        JLabel jl2 = new JLabel("xxxxx") ;
        jl2.setSize(300,300);

        hend.add(jl);
        hend.add(jl2);
       sahar.add(jb);

        add(hend,BorderLayout.CENTER);
        add(sahar,BorderLayout.SOUTH);


    }

    public static void main(String[] args) {
     new enquiry().setVisible(true);
    }
}
