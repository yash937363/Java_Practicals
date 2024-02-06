import javax.swing.*;

class buttondemo{
  public buttondemo(){
    JFrame f = new JFrame();
    JButton b = new JButton("Button");
    f.add(b);
    f.setVisible(true);
    f.setSize(500,500);
    f.setLayout(null);
    b.setBounds(200,200,100,100);
  }
}

class demobutton{
  public static void main(String args[]){
    buttondemo b = new buttondemo();
  }
}
    