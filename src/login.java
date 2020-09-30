import javax.swing.*;
import java.awt.*;

public class login extends JFrame {
    public login (){
     initiallogin();
     maincomp();
    }
    private void initiallogin (){
        setTitle("login");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    private void maincomp (){
        JPanel hend = new JPanel();

        JButton jb1 =new JButton("login");
      hend.add(jb1);
        add(hend,BorderLayout.SOUTH);
       JPanel sahar = new JPanel();
       sahar.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel jl = new JLabel("enter user account") ;
        jl.setSize(50,30);
        sahar.add(jl) ;
        JTextField  jt=  new JTextField(10) ;
        jt.setSize(50,50);
        sahar.add(jt) ;


        JLabel jl2 = new JLabel("password") ;
        jl2.setSize(50,30);
       sahar.add(jl2) ;
        JPasswordField jt2=  new JPasswordField(10) ;
        jt2.setSize(50,50);
        sahar.add(jt2) ;
        add(sahar,BorderLayout.CENTER);


    }


    public static void main(String[] args) {
   new login().setVisible(true);
    }
}
