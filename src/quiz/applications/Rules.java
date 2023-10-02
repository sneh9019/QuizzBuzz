package quiz.applications;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to QuizzyBuzz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 32));
        heading.setForeground(new Color(224, 16, 22));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(new Color(251, 255, 255));
        rules.setText(
            "<html>"+ 
                "1.  Strictly prohibit any form of cheating, including using external resources, communicating with others" + "<br><br>" +
                "2.  Read and follow all instructions provided for each question or section of the quiz." + "<br><br>" +
                "3.  Answer questions honestly and to the best of your knowledge" + "<br><br>" +
                "4. Submit answers within the allotted time" + "<br><br>" +
                "5. Minimize distractions and maintain focus during the quiz" + "<br><br>" +
                "6. Close unrelated browser tabs or applications." + "<br><br>" +
                "7.  Submit the quiz within the specified deadline" + "<br><br>" +
                "8. Ensure your internet connection and any required software or tools are functioning correctly before starting the quiz." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(224, 16, 22));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(224, 16, 22));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}