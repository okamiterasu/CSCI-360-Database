import java.io.* ; 
import java.awt.event.* ;  
import javax.sound.sampled.* ;
import javax.swing.* ;
import java.util.* ;

//initial code from final project from another class
public class student implements ActionListener{
	private static JLabel Userlabel;
	private static JLabel intro ; 
	private static JLabel message ; 
	public static JTextField userText;
	public static JButton LogInbutton;
	private static JLabel LogTrue;
	public static JButton Exit ; 
	
	static int LogSuccess;
	
	public void student() {
		JFrame frame = new JFrame("TA") ; 
		JPanel panel = new JPanel();
    	frame.setSize(600,600);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.add(panel);
    	panel.setLayout(null);
    	
    	
    	message = new JLabel("This is the GUI for the Basic Student Layout") ; 
    	message.setBounds(100,10,600,10) ; 
    	panel.add(message) ;
    	
    	Exit = new JButton("Exit") ; 
    	Exit.setBounds(300,70,100,25);
    	Exit.addActionListener(new exit());
    	panel.add(Exit) ; 
    	
    	LogTrue = new JLabel("");
    	LogTrue.setBounds(10,110,300,25);
    	panel.add(LogTrue);
    	frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}