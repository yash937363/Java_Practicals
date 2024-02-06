import javax.swing.*;

class hobbieForm{
  public hobbieForm(){
    JFrame f = new JFrame();
    JLabel l = new JLabel("Select Your Hobbies");
    JCheckBox c1 = new JCheckBox("Badminton");
    JCheckBox c2 = new JCheckBox("Cricket");
    JCheckBox c3 = new JCheckBox("Football");
    JCheckBox c4 = new JCheckBox("Tennis");
    JButton b = new JButton("Submit");
    f.setSize(500,500);
    f.setVisible(true);
    f.setLayout(null);
    f.add(l);
    f.add(c1);
    f.add(c2);
    f.add(c3);
    f.add(c4);
    f.add(b);
    l.setBounds(10,10,150,20);
    c1.setBounds(10,40,100,20);
    c2.setBounds(10,70,100,20);
    c3.setBounds(10,100,100,20);
    c4.setBounds(10,130,100,20);
    b.setBounds(10,160,100,20);
  }
}

class FormHobbie{
  public static void main(String args[]){
    hobbieForm h = new hobbieForm();
  }
}