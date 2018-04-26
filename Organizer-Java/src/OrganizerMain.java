import javax.swing.*;

public class OrganizerMain {
	JFrame frame;
	OrganizerMain(){
		frame=new JFrame();
		JButton button = new JButton("Open");
		
		button.setBounds(200,150,90,50);
		
		frame.add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setSize(1920, 1080);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
	

	}

}
