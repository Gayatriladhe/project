import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Book_Billing extends JFrame implements ActionListener
{
	
	JLabel lbl;  
    JCheckBox cb1,cb2,cb3,cb4,cb5,cb6;  
    JButton b;  
    Book_Billing(){  
        lbl=new JLabel("Book Billing System");  
        lbl.setBounds(50,50,300,40);  
        lbl.setFont(new Font("Arial", Font.BOLD, 28));
        
        cb1=new JCheckBox("Java  Author:Bruce Eckel ");  
        cb1.setBounds(100,100,550,50);  
        
        cb2=new JCheckBox("C++  Author:Paul Laurence");  
        cb2.setBounds(100,150,550,50);  
        
        cb3=new JCheckBox("Python Author: Mark Lutz");  
        cb3.setBounds(100,200,550,50); 
        
        cb4=new JCheckBox("JavaScript  Author: David");  
        cb4.setBounds(100,250,550,50); 
        
        cb5=new JCheckBox("Angular2 Author: Nate Murray");  
        cb5.setBounds(100,300,550,50);
        
        cb6=new JCheckBox("Machine Learning Author: Aurelien");  
        cb6.setBounds(100,350,550,50);
        
        b=new JButton("Buy");  
        b.setBounds(100,400,80,30);  
        b.addActionListener(this);  
        add(lbl);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(cb5);
        add(cb6);
        add(b);  
        setSize(400,500);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        float amount=0;  
        String msg="";  
        if(cb1.isSelected()){  
            amount+=500;  
            msg="Java: 500\n";  
        }  
        if(cb2.isSelected()){  
            amount+=350;  
            msg+="C++: 350\n";  
        }  
        if(cb3.isSelected()){  
            amount+=650;  
            msg+="Python: 650\n";  
        }  
        if(cb4.isSelected()){  
            amount+=400;  
            msg+="JavaScript: 400\n";  
        }  
        if(cb5.isSelected()){  
            amount+=350;  
            msg+="Angular2: 350\n";  
        }  
        if(cb6.isSelected()){  
            amount+=950;  
            msg+="Machine Learning: 950\n";  
        }  
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    }  
    public static void main(String[] args) {  
        new Book_Billing();  
    }  
	
	
	
	

}
