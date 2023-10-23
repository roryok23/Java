package iact;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddNumbersFrame extends JFrame{
	
	//add the data members
	JLabel lblX;
	JTextField txtX;
	JLabel lblY;
	JTextField txtY;
	JButton btnAdd;
	JLabel lblResult;
	JTextField txtResult;
	JLabel lblEmpty;
	
	
	public AddNumbersFrame(){
		super("Add Numbers"); //set the text on the title bar
		//rows, cols, hspace, vspace
		setLayout(new GridLayout(4, 2, 5, 5));
		
		//Initialize the objects for the JFrame
		lblX = new JLabel("X:");
		txtX = new JTextField(10);
		lblY = new JLabel("Y:");
		txtY = new JTextField(10);
		lblEmpty = new JLabel();
		btnAdd = new JButton("Add Numbers");
		lblResult = new JLabel("Result:");
		txtResult = new JTextField(10);
		
		
		add(lblX);
		add(txtX);
		add(lblY);
		add(txtY);
		add(lblEmpty);
		add(btnAdd);
		add(lblResult);
		add(txtResult);
		
		
		btnAdd.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						String xString = txtX.getText();
						String yString = txtY.getText();
						double x, y, result;
						try{
							
							x = Double.parseDouble(xString);
						}catch (Exception ex){
							
							//do pop up message
							JOptionPane.showMessageDialog(null, "Not a valid number x set to 0");
							x = 0.0;
						}
						
						try{
							
							y = Double.parseDouble(xString);
						}catch (Exception ex){
							
							//do pop up message
							JOptionPane.showMessageDialog(null, "Not a valid number y set to 0");
							y = 0.0;
						}
						
						result = x + y;
						txtResult.setText(result+"");//concatenated and empty string
													//to convert to a string
					}
					
				}
				);
		
		
	}
	
	
	
	

}
