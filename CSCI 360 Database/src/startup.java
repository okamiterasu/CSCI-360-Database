import java.awt.event.* ;  
import javax.swing.* ;

//initial code from final project from another class
public class startup implements ActionListener{
	private static JLabel Userlabel;
	private static JLabel intro ; 
	private static JLabel message ; 
	public static JTextField userText;
	public static JButton LogInbutton;
	public static JButton Exit ; 
	private static JLabel LogTrue;
	static int LogSuccess;
	
	public static void main(String[] args) throws Exception{

		@SuppressWarnings("unused")
		final var db = new Database("./project.db");
		
		
		JFrame frame = new JFrame("startup") ; 
		JPanel panel = new JPanel();
    	frame.setSize(550, 200);
    	frame.setLocationRelativeTo(null);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.add(panel);
    	panel.setLayout(null);
    	
    	intro = new JLabel("THIS SOFTWARE IS NOT USED TO BE USED FOR UNIVERSITY MANAGEMENT PURPOSE") ; 
    	intro.setBounds(10,10,600,10) ; 
    	panel.add(intro) ;
    	
    	message = new JLabel("Please enter your ID") ; 
    	message.setBounds(100,70,600,10) ; 
    	panel.add(message) ;
    	
    	Userlabel = new JLabel("ID: ");
    	Userlabel.setBounds(70, 40, 80, 25); 
    	panel.add(Userlabel);
    	
    	
    	userText = new JTextField(20);
    	userText.setBounds(100, 40, 165, 25);
    	panel.add(userText) ; 
    	
        LogInbutton = new JButton("Log In");
    	LogInbutton.setBounds(300, 40, 100, 25);
    	LogInbutton.addActionListener(new startup());
    	panel.add(LogInbutton);
    	
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
		String user = userText.getText() ; 
		
		if(user.equals("ta")) {
				TA teacherassist = new TA() ;
				teacherassist.ta() ; 
		}
		else if(user.equals("student")) {
			student stu = new student() ; 
			stu.student(); 
		}
		else if(user.equals("professor")) {
			professor pro = new professor() ; 
			pro.prof(); 
		}
		else if(user.equals("staff")) {
			staff s = new staff() ; 
			s.staff(); 
		}
		else if(user.equals("admin")) {
			admin a = new admin() ; 
			a.admin(); 
		}
		
		else {
			//will tell the user to try again
			LogTrue.setText("ID NOT Recognized, Please Try Again");
			
		}
		
	}
	

}
