import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ResultGUI extends JFrame implements ActionListener {
    JTextField s1,s2,s3,s4,s5;
    JButton result;
    public ResultGUI(){
        JLabel empty = new JLabel("");
        JLabel l1 = new JLabel("Enter marks of 5 subjects : ");
        JLabel l2 = new JLabel("Subject 1");
        JLabel l3 = new JLabel("Subject 2");
        JLabel l4 = new JLabel("Subject 3");
        JLabel l5 = new JLabel("Subject 4");
        JLabel l6 = new JLabel("Subject 5");
        s1 = new JTextField(10);
        s2 = new JTextField(10);
        s3 = new JTextField(10);
        s4 = new JTextField(10);
        s5 = new JTextField(10);
        result = new JButton("result");
        result.addActionListener(this);
        add(l1);
        add(empty);
        add(l2);
        add(s1);
        add(l3);
        add(s2);
        add(l4);
        add(s3);
        add(l5);
        add(s4);
        add(l6);
        add(s5);
        add(result);
        GridLayout gl = new GridLayout(7,2,10,10);
        setLayout(gl);
        setSize(500,500);
        setVisible(rootPaneCheckingEnabled);
    }
    public void actionPerformed(ActionEvent e){
        int n1,n2,n3,n4,n5,total;
        float percentage;
        String grade = "";
        n1 = Integer.parseInt(s1.getText());
        n2 = Integer.parseInt(s2.getText());
        n3 = Integer.parseInt(s3.getText());
        n4 = Integer.parseInt(s4.getText());
        n5 = Integer.parseInt(s5.getText());
        total = n1+n2+n3+n4+n5;
        percentage = total / 5.0f;
        if(percentage >= 75){
            grade = "O";
        }else if (percentage < 75 && percentage >= 65) {
            grade = "A";
        }else if (percentage < 65 && percentage >= 55) {
            grade = "B";
        }else if (percentage < 55 && percentage >= 45) {
            grade = "C";
        }else if (percentage < 45 && percentage >= 35) {
            grade = "D";
        }else if (percentage < 35) {
            grade = "F";
        }
        String ans = "Total : "+total+"\nPercentage : "+percentage+"\nGrade : "+grade;

        JOptionPane.showMessageDialog(result,ans,"Result", JOptionPane.INFORMATION_MESSAGE);
    }    
}

class ResultMain {
    public static void main(String[] args) {
        ResultGUI r = new ResultGUI();       
    }
}