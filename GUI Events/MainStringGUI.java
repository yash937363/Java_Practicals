import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StringGUI extends JFrame implements ActionListener{
  JButton up,lo,le,co;
  JTextField input1,input2;
  JLabel ans;

  public StringGUI(){
    input1 = new JTextField(10);
    input2 = new JTextField(10);
    up = new JButton("UpperCase");
    lo = new JButton("LowerCase");
    le = new JButton("Length");
    co = new JButton("Concat");
    ans = new JLabel("");
    up.addActionListener(this);
    lo.addActionListener(this);
    le.addActionListener(this);
    co.addActionListener(this);  
    add(input1);
    add(input2);
    add(up);
    add(lo);
    add(le);
    add(co);
    add(ans);
    FlowLayout fl = new FlowLayout();
    setLayout(fl);
    setVisible(true);
    setSize(500,500);
  }
  public void actionPerformed(ActionEvent e){
    String s1 = input1.getText();
    String s2 = input2.getText();
    
    if(e.getSource() == up){
      ans.setText(s1.toUpperCase()+" "+s2.toUpperCase());
    }else if(e.getSource() == lo){
      ans.setText(s1.toLowerCase()+" "+s2.toLowerCase());
    }else if(e.getSource() == le){
      ans.setText("Length 1 : "+s1.length()+" Length 2 : "+s2.length());
    }else if(e.getSource() == co){
      ans.setText(s1+s2);
    }
  }
}
class MainStringGUI{
  public static void main(String[] args){
    StringGUI sg = new StringGUI();
  }
}