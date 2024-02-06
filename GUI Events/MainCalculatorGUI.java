import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculatorGUI extends JFrame implements ActionListener{
  JTextField t1,t2;
  JButton ad,su,di,mu;
  JLabel l;
  public CalculatorGUI(){
    JLabel l1 = new JLabel("Enter Number : ");
    JLabel l2 = new JLabel("Enter Number : ");
    t1 = new JTextField(10);
    t2 = new JTextField(10);
    ad = new JButton("Add");
    su = new JButton("Sub");
    di = new JButton("Div");
    mu = new JButton("Mul");
    l = new JLabel("Nothing Selected");
    ad.addActionListener(this);
    su.addActionListener(this);
    di.addActionListener(this);
    mu.addActionListener(this);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(ad);
    add(su);
    add(di);
    add(mu);
    add(l);
    GridLayout gl = new GridLayout(5,2);
    FlowLayout fl = new FlowLayout();
    setLayout(gl);
    setSize(500,500);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
    int a,b,c;
    a = Integer.parseInt(t1.getText());
    b = Integer.parseInt(t2.getText());
    if(e.getSource() == ad){
      c = a + b;
      l.setText("Addition : "+c);
    }else if(e.getSource() == su){
      c = a - b;
      l.setText("Subtraction : "+c);
    }else if(e.getSource() == di){
      c = a / b;
      l.setText("Division : "+c);
    }else if(e.getSource() == mu){
      c = a * b;
      l.setText("Multiplication : "+c);
    }
  }
}
class MainCalculatorGUI{
  public static void main(String[] args){
    CalculatorGUI cl = new CalculatorGUI();
  }
}