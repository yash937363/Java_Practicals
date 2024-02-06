import javax.swing.*;

class Form{
  public Form(){
    JFrame f = new JFrame();
    JLabel L1 = new JLabel("Enter Name : ");
    JLabel L2 = new JLabel("Enter Age :");
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JButton b = new JButton("Submit");
    f.add(L1);
    f.add(L2);
    f.add(t1);
    f.add(t2);
    f.add(b);
    f.setVisible(true);
    f.setSize(500,500);
    f.setLayout(null);
    L1.setBounds(10,10,200,50);
    L2.setBounds(10,70,200,50);
    t1.setBounds(250,10,200,50);
    t2.setBounds(250,70,200,50);
    b.setBounds(10,110,200,50);
  }
}

class demoForm{
  public static void main(String args[]){
    Form f = new Form();
  }
}
    