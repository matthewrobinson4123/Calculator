package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double num1;
	double num2;
	double result;
	String ops;
	String ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 283, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 19, 247, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//---------------------------Row 1------------------------
		
		JButton btnBack = new JButton("<-");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back = null;
				
				if (textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					back = strB.toString();
					textField.setText(back);
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBack.setBounds(10, 69, 55, 55);
		frame.getContentPane().add(btnBack);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(75, 69, 55, 55);
		frame.getContentPane().add(btnClear);
		
		
		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPerc.setBounds(137, 69, 55, 55);
		frame.getContentPane().add(btnPerc);
		
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "+";
			}
		});
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnP.setBounds(202, 69, 55, 55);
		frame.getContentPane().add(btnP);
		
		//---------------------------Row 2------------------------
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn7.getText();
				textField.setText(input);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(10, 135, 55, 55);
		frame.getContentPane().add(btn7);
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn8.getText();
				textField.setText(input);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(75, 135, 55, 55);
		frame.getContentPane().add(btn8);
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn9.getText();
				textField.setText(input);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(137, 135, 55, 55);
		frame.getContentPane().add(btn9);
		
		
		JButton btnS = new JButton("-");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "-";
			}
		});
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnS.setBounds(202, 135, 55, 55);
		frame.getContentPane().add(btnS);
		
		//-------------------------------------Row 2----------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn4.getText();
				textField.setText(input);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 201, 55, 55);
		frame.getContentPane().add(btn4);
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn5.getText();
				textField.setText(input);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(75, 201, 55, 55);
		frame.getContentPane().add(btn5);
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn6.getText();
				textField.setText(input);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(137, 201, 55, 55);
		frame.getContentPane().add(btn6);
		
		
		JButton btnM = new JButton("*");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "*";
			}
		});
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnM.setBounds(202, 201, 55, 55);
		frame.getContentPane().add(btnM);
		
		//--------------------------------------Row 4------------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn1.getText();
				textField.setText(input);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(10, 267, 55, 55);
		frame.getContentPane().add(btn1);
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn2.getText();
				textField.setText(input);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(75, 267, 55, 55);
		frame.getContentPane().add(btn2);
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn3.getText();
				textField.setText(input);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(137, 267, 55, 55);
		frame.getContentPane().add(btn3);
		
		
		JButton btnD = new JButton("/");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "/";
			}
		});
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnD.setBounds(202, 267, 55, 55);
		frame.getContentPane().add(btnD);
		
		//---------------------------------------Row 5-----------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn0.getText();
				textField.setText(input);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(10, 333, 55, 55);
		frame.getContentPane().add(btn0);
		
		
		JButton btnDot = new JButton(".");	
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(75, 333, 55, 55);
		frame.getContentPane().add(btnDot);
		
		
		JButton btnPM = new JButton("±");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = num * (-1);
				textField.setText(String.valueOf(num));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPM.setBounds(137, 333, 55, 55);
		frame.getContentPane().add(btnPM);
		
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = Double.parseDouble(textField.getText());
				if(ops == "+")
				{
					result = num1 + num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(ops == "-")
				{
					result = num1 - num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(ops == "*")
				{
					result = num1 * num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(ops == "/")
				{
					result = num1 / num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(ops == "%")
				{
					result = num1 % num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEq.setBounds(202, 333, 55, 55);
		frame.getContentPane().add(btnEq);
	}
}
