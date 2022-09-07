
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
Rules(String name){
    this.name=name;
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    JLabel heading=new JLabel("Welcome "+  name  + "  to simple Minds");
        heading.setBounds(50,20,700,35);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
      //  heading.setForeground(Color.BLUE);
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
      //  heading.setForeground(Color.BLUE);
      //  rules.setForeground(new Color(30,144,254));
        rules.setText(
              "<html>"+ 
                "1. There will be a total of 10 questions" + "<br><br>" +
                "2. Each question will award 10 points" + "<br><br>" +
                "3. A 50-50 lifeline is provided,which can be only used once" + "<br><br>" +
                "4. No minus marking for wrong answer." + "<br><br>" +
                "5. To move onto next question click on the next button " + "<br><br>" +
                "6. Thirty seconds will be provided for each question" + "<br><br>" +
                "7. One the thirty second are up ,the participant will get the next question automatically." + "<br><br>" +
                "8. The score will be provided in the end out of 100" + "<br><br>" +
            "<html>"
      
        );
        add(rules);
        
       back = new JButton ("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
          start = new JButton ("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        
    setSize(800,650);
    setLocation(300,48);
    setVisible(true);
}
    
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==start) {
            setVisible(false);
            new Quiz(name);
    }
        else {
            setVisible(false);
            new Login();
        }
    }


public static void main(String[] args){
      new Rules("User");

}
}
