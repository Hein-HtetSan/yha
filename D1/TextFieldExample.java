import javax.swing.*;
import java.awt.event.*;

public class TextFieldExample implements ActionListener{
    JTextField tf1, tf2, tf3;
    JButton b1, b2;
    TextFieldExample(){
        JFrame f = new JFrame();
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 100, 25);
        tf2 = new JTextField();
        tf2.setBounds(170, 50, 100, 25);
        tf3 = new JTextField();
        tf3.setBounds(350, 50, 100, 25);
        b1 = new JButton("+");
        b1.setBounds(50, 100, 70, 25);
        b1.addActionListener(this);
        b2 = new JButton("-");
        b2.setBounds(150, 100, 70, 25);
        b2.addActionListener(this);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if(e.getSource() == b1){
            c = a+b;
        }else if(e.getSource() == b2){
            c = a-b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String[] args){
        new TextFieldExample();
    }
}