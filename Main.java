
package lab5a;



    import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(() -> {
        
            JFrame window = new JFrame("CS232 Lab #5D");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            window.getContentPane().add(new Lab5D());

            window.setSize(500, 500);
            window.setLocationRelativeTo(null);
            window.setVisible(true);
            
        });
        
    }
    
}

