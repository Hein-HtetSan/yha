import javax.swing.*;
import java.awt.event.*;

public class WelcomeTestDrive implements ActionListener{
    JTextField tf1, tf2;
    JButton b1;
    JLabel l1, l2, l3, l4;
    WelcomeTestDrive(){
        JFrame f = new JFrame();
        l1 = new JLabel("Enter Name : ");
        l1.setBounds(50, 50, 100, 30);
        tf1 = new JTextField();
        tf1.setBounds(50, 80, 200, 25);
        l3 = new JLabel();
        l3.setBounds(400, 80, 200, 30);

        l2 = new JLabel("Enter Age : ");
        l2.setBounds(50, 130, 100, 30);
        tf2 = new JTextField();
        tf2.setBounds(50, 160, 200, 25);
        l4 = new JLabel();
        l4.setBounds(400, 160, 300, 30);

        b1 = new JButton("Submit");
        b1.setBounds(50, 240, 100, 25);
        b1.addActionListener(this);

        f.add(tf1); f.add(l1);
        f.add(tf2); f.add(l2);
        f.add(b1); f.add(l3); f.add(l4);
        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int age = Integer.parseInt(s2);
        if(e.getSource() == b1){
            l3.setText("Welcome " + s1 + "!");
            tf1.setText(null);
            if(age >= 14){
                l4.setText("You are allowed!");
            }else{
                l4.setText("You must be over 14! You are not allowed!");
            }
            tf2.setText(null);
        }
    }
    public static void main(String[] args){
        new WelcomeTestDrive();
    }
}