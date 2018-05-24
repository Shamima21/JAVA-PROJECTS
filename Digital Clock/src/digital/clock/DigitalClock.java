
package digital.clock;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class DigitalClock extends JFrame{

    JLabel jlabClock;
    ClockThread ct;
    
    public DigitalClock(){
        jlabClock=new JLabel("");
     
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlabClock.setFont(new Font("Comin Sans MS", Font.BOLD, 25));
        add(jlabClock); 
        setSize(400,100);
       
        setLocationRelativeTo(null);
         ct = new ClockThread(this);
        setVisible(true);
    
    }
  
    public static void main(String[] args) {
        
        new DigitalClock();
    }

  

    
    
}
