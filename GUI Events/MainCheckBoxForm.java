import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CheckBoxForm extends JFrame implements ActionListener{
  JCheckBox c1,c2,c3,c4;
  JLabel ans;

  public CheckBoxForm(){
    c1 = new JCheckBox("C");
    c2 = new JCheckBox("C++");
    c3 = new JCheckBox("Java");
    c4 = new JCheckBox("Python");
    JLabel l1 = new JLabel("Select Subject");
    JButton b = new JButton("Submit");
    b.addActionListener(this);
    ans = new JLabel("Nothing Selected");
    add(l1);
    add(c1);
    add(c2);
    add(c3);
    add(c4);
    add(ans);
    add(b);
    GridLayout gl = new GridLayout(7,1);
    setLayout(gl);
    setVisible(true);
    setSize(500,500);
  }
  public void actionPerformed(ActionEvent e){
    String str = "Subjects :";    

    if(c1.isSelected()){
      str+=" "+c1.getLabel();
    }
    if(c2.isSelected()){
      str+=" "+c2.getLabel();
    }
    if(c3.isSelected()){
      str+=" "+c3.getLabel();
    }
    if(c4.isSelected()){
      str+=" "+c4.getLabel();
    }
    ans.setText(str);
  }
}
class MainCheckBoxForm{
  public static void main(String[] args){
    CheckBoxForm cbf = new CheckBoxForm();
  }
}