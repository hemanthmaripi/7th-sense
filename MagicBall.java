import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MagicBall implements ActionListener {

	private static JLabel askingLabel;
	private static JTextField questionField;
	private static JButton submitButton;
	private static JLabel sysOpinion;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setBackground(Color.pink);
		
		askingLabel = new JLabel("Enter your question below");
		askingLabel.setBounds(110,20,200,25);
		panel.add(askingLabel);
		
		questionField = new JTextField(70);
		questionField.setBounds(40,60,300,25);
		panel.add(questionField);
		
		submitButton = new JButton("TELL ME YOUR VIEW");
		submitButton.setBounds(85,100,200,25);
		submitButton.addActionListener(new MagicBall());
		panel.add(submitButton);
		
		sysOpinion = new JLabel("");
		sysOpinion.setBounds(40,140,200,25);
		panel.add(sysOpinion);
		
		frame.setVisible(true);
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Random rand = new Random();
		int r = rand.nextInt(5);
		System.out.println(r);
		switch(r) {
		case 0: sysOpinion.setText("As I see it. yes.");
		break;
		case 1: sysOpinion.setText("Sign point to yes");break;
		case 2: sysOpinion.setText("I think no");break;
		case 3: sysOpinion.setText("Yes");break;
		case 4: sysOpinion.setText("No");break;
		}
		
	}
}
