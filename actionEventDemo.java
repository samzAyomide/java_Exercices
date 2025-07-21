import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionEventDemo extends JFrame implements ActionListener
{
    JButton click;
    JPanel Panel;
    JLabel message;

    public ActionEventDemo()
    {
        super("Action Event Demo");
        click = new JButton("Click");
        Panel = new JPanel();
        message = new JLabel();

        add(Panel);
        Panel.add(click);
        Panel.add(message);

        setSize(300,300);
        setVisible(true);

        public void actionPerformed(ActionEvent e)
        {
              message.setText("Welcome to Event Handling in Java");
        }
        public static void main (String [] args)
        {
            ActionEventDemo obj = new ActionEventDemo();
        }
    
    
    }
}