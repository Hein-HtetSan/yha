package Piano.src;
import javax.swing.*;
import java.awt.event.*;

public class Main implements ActionListener{
    JButton c, d, e, f, g, a, b, c1, d1, e1, f1, cs, ds, fs, gs, bb, cso, dso;
    JLabel l1;
    Main(){
        JFrame jf = new JFrame("Piano");

        c = new JButton("C");
        c.setBounds(10, 100, 50, 50);
        d = new JButton("D");
        d.setBounds(10, 100, 50, 50);
        e = new JButton("E");
        e.setBounds(10, 100, 50, 50);
        f = new JButton("F");
        f.setBounds(10, 100, 50, 50);
        g = new JButton("G");
        g.setBounds(10, 100, 50, 50);
        a = new JButton("A");
        a.setBounds(10, 100, 50, 50);
        b = new JButton("B");
        b.setBounds(10, 100, 50, 50);
        c1 = new JButton("C1");
        c1.setBounds(10, 100, 50, 50);
        d1 = new JButton("D1");
        d1.setBounds(10, 100, 50, 50);
        e1 = new JButton("E1");
        e1.setBounds(10, 100, 50, 50);
        f1 = new JButton("F1");
        f1.setBounds(10, 100, 50, 50);

        cs = new JButton("C#");
        cs.setBounds(10, 100, 50, 50);
        ds = new JButton("D#");
        ds.setBounds(10, 100, 50, 50);
        fs = new JButton("F#");
        fs.setBounds(10, 100, 50, 50);
        gs = new JButton("G#");
        gs.setBounds(10, 100, 50, 50);
        cso = new JButton("C#_1");
        cso.setBounds(10, 100, 50, 50);
        dso = new JButton("D#_1");
        dso.setBounds(10, 100, 50, 50);

        jf.add(c); jf.add(d); jf.add(e); jf.add(f); jf.add(g); jf.add(a); jf.add(b); jf.add(c1);
        jf.add(d1); jf.add(e1); jf.add(f1); jf.add(cs); jf.add(ds); jf.add(fs); jf.add(gs); jf.add(cso);
        jf.add(dso);


        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        a.addActionListener(this);
        b.addActionListener(this);
        c1.addActionListener(this);
        d1.addActionListener(this);
        e1.addActionListener(this);
        f1.addActionListener(this);
        g.addActionListener(this);

        cs.addActionListener(this);
        ds.addActionListener(this);
        fs.addActionListener(this);
        gs.addActionListener(this);
        bb.addActionListener(this);
        cso.addActionListener(this);
        dso.addActionListener(this);


        jf.setSize(600, 400);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setResizable(false);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args){

    }
}