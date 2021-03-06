import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//type of J-Frame
//Step 1: implements ActionListener.
public class Farenheit implements ActionListener{
	
	JFrame myFrame = new JFrame();  //outer shell frame
	JPanel myPanel = new JPanel();  //2 buttons
	JLabel F;
	JTextField cels;
	public Farenheit() {
		
		myPanel.setLayout(new FlowLayout());//sets how the buttons are placed
		
		//creating buttons
				cels = new JTextField("celsius");
				JButton C = new JButton("Convert");
			    F = new JLabel("Fahreinheit");// label class variable
				//add your buttons to the Action Listener.
				C.addActionListener(this);

				//add your buttons to the panel.
				myPanel.add(cels);
				myPanel.add(C);
				myPanel.add(F);
				//add your panel to the frame.
				myFrame.add(myPanel);
				myFrame.setTitle("Convert Celcius to Fareinheit");
				myFrame.setSize(400, 400);
				myFrame.setVisible(true);

	}

	//Implement your reaction for each button.
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();   //grabbing the string name of the button
		
		System.out.println("You clicked " + str + " button");
		
		if(str.equals("Convert")) {
			double celsius = Double.parseDouble(cels.getText());
			double Convert = celsius * (9/5) + 32;
			F.setText(Convert + "fahrenheit");
		}
		}

	public static void main(String args[]) {
		new Farenheit();
	}
}	



