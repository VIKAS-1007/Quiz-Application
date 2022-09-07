
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
 
   JButton rules, back;
    JTextField tfname;
   JLabel name;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
      //  heading.setForeground(Color.BLUE);
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
         name=new JLabel("Enter your name");
        name.setBounds(790,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,25));
       name.setForeground(new Color(30,144,254));
        add(name);
        
        
         tfname = new JTextField();
        tfname.setBounds(733,200,300,25);
       tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);
        
        
        
         rules = new JButton ("Rules");
        rules.setBounds(733,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        
          back = new JButton ("Back");
        back.setBounds(907,270,125,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        
        setSize(1200,500);
        setLocation(100,150);
        setVisible(true);
        
    }
    //@Override
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules ){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
            
    }  else if(ae.getSource() == back){
        setVisible(false);
    }
        }
    
    
    
    public static void main(String[] args) {
        new Login();
    }
}