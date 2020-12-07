package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Calculator {

	private JFrame frmStandardCalculator;
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
					window.frmStandardCalculator.setVisible(true);
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
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.setBounds(100, 100, 350, 460);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 19, 312, 40);
		frmStandardCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		frmStandardCalculator.setJMenuBar(menuBar);
		
		JMenu File = new JMenu("File");
		menuBar.add(File);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmStandardCalculator.setTitle("Standard Calculator");
				frmStandardCalculator.setBounds(100, 100, 350, 460);
				textField.setBounds(10, 19, 312, 40);
			}
		});
		
		File.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmStandardCalculator.setTitle("Scientific Calculator");
				frmStandardCalculator.setBounds(100, 100, 625, 460);
				textField.setBounds(10, 19, 590, 40);
			}
		});
		File.add(mntmNewMenuItem_1);
		
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		File.add(mntmNewMenuItem_2);
		
		
		
		
		
		//-------------------------Standard-----------------------------
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
		btnBack.setBounds(10, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnBack);
		
		
		
		JButton btnCE = new JButton("CE");
		btnCE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnCE.setBounds(75, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnCE);
		
		
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClear.setBounds(137, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnClear);
		
		
		
		JButton btnPM = new JButton("±");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = num * (-1);
				textField.setText(String.valueOf(num));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPM.setBounds(202, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnPM);
		
		
		JButton btnSqrR = new JButton("\u221A");
		btnSqrR.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSqrR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.sqrt(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnSqrR.setBounds(267, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnSqrR);
		
		
		
		
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
		frmStandardCalculator.getContentPane().add(btn7);
		
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn8.getText();
				textField.setText(input);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(75, 135, 55, 55);
		frmStandardCalculator.getContentPane().add(btn8);
		
		
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn9.getText();
				textField.setText(input);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(137, 135, 55, 55);
		frmStandardCalculator.getContentPane().add(btn9);
		
		
		
		
		JButton btnD = new JButton("/");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "/";
			}
		});
		btnD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnD.setBounds(202, 135, 55, 55);
		frmStandardCalculator.getContentPane().add(btnD);
		
		
		
		JButton btnPerc = new JButton("%");
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "%";
			}
		});
		btnPerc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPerc.setBounds(267, 135, 55, 55);
		frmStandardCalculator.getContentPane().add(btnPerc);
		
		
		
		
		//-------------------------------------Row 3----------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn4.getText();
				textField.setText(input);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(10, 201, 55, 55);
		frmStandardCalculator.getContentPane().add(btn4);
		
		
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn5.getText();
				textField.setText(input);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(75, 201, 55, 55);
		frmStandardCalculator.getContentPane().add(btn5);
		
		
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn6.getText();
				textField.setText(input);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(137, 201, 55, 55);
		frmStandardCalculator.getContentPane().add(btn6);
		
		
		
		
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
		frmStandardCalculator.getContentPane().add(btnM);
		
		
		
		
		JButton btnFrac = new JButton("1/x");
		btnFrac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = 1/num;
				textField.setText(String.valueOf(num));
			}
		});
		btnFrac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFrac.setBounds(267, 201, 55, 55);
		frmStandardCalculator.getContentPane().add(btnFrac);
		
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
		frmStandardCalculator.getContentPane().add(btn1);
		
		
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn2.getText();
				textField.setText(input);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(75, 267, 55, 55);
		frmStandardCalculator.getContentPane().add(btn2);
		
		
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn3.getText();
				textField.setText(input);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(137, 267, 55, 55);
		frmStandardCalculator.getContentPane().add(btn3);
		
		
		
		
		JButton btnS = new JButton("-");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "-";
			}
		});
		btnS.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnS.setBounds(202, 267, 55, 55);
		frmStandardCalculator.getContentPane().add(btnS);
		
		//---------------------------------------Row 5-----------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btn0.getText();
				textField.setText(input);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(10, 333, 120, 55);
		frmStandardCalculator.getContentPane().add(btn0);
		
		
		
		
		JButton btnDot = new JButton(".");	
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = textField.getText() + btnDot.getText();
				textField.setText(input);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(137, 333, 55, 55);
		frmStandardCalculator.getContentPane().add(btnDot);
		
		
		
		
		JButton btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "+";
			}
		});
		btnP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnP.setBounds(202, 333, 55, 55);
		frmStandardCalculator.getContentPane().add(btnP);
		
		
		
		
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
				else if(ops == "Mod")
				{
					result = num1 % num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(ops == "Exp")
				{
					result = Math.exp(num1);
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
			}
		});
		btnEq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEq.setBounds(267, 267, 55, 121);
		frmStandardCalculator.getContentPane().add(btnEq);
		
		
		
		
		
		//-------------------------------Scientific------------------------
		
		//----------------------------------Row 1--------------------------
		
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.log(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnLog.setBounds(347, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnLog);
		
		
		
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.sin(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnSin.setBounds(412, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnSin);
		
		
		
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.sinh(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnSinh.setBounds(477, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnSinh);
		
		
		
		
		JButton btnMod = new JButton("Mod");
		btnMod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "Mod";
			}
		});
		btnMod.setBounds(542, 70, 55, 55);
		frmStandardCalculator.getContentPane().add(btnMod);
		
		
		//----------------------------------Row 2--------------------------
		
		
		JButton btnPI = new JButton("\u03C0");
		btnPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num;
				num = 3.1415926535897932384626433832795;
				textField.setText(String.valueOf(num));
			}
		});
		btnPI.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPI.setBounds(347, 135, 55, 55);
		frmStandardCalculator.getContentPane().add(btnPI);
		
		
		
		
		JButton btnCos = new JButton("Cos");
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.cos(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnCos.setBounds(412, 135, 55, 55);
		frmStandardCalculator.getContentPane().add(btnCos);
		
		
		
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.cosh(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnCosh.setBounds(477, 135, 55, 55);
		frmStandardCalculator.getContentPane().add(btnCosh);
		
		
		
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.log10(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnLnx.setBounds(542, 135, 55, 55);
		frmStandardCalculator.getContentPane().add(btnLnx);
		
		
		//----------------------------------Row 3--------------------------
		
		
		JButton btnExp = new JButton("x^y");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.pow(num, num);
				textField.setText(String.valueOf(num));
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnExp.setBounds(347, 201, 55, 55);
		frmStandardCalculator.getContentPane().add(btnExp);
		
		
		
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.tan(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnTan.setBounds(412, 201, 55, 55);
		frmStandardCalculator.getContentPane().add(btnTan);
		
		
		
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.tanh(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTanh.setBounds(477, 201, 55, 55);
		frmStandardCalculator.getContentPane().add(btnTanh);
		
		
		
		
		JButton btnE = new JButton("Exp");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				ops = "Exp";
			}
		});
		btnE.setBounds(542, 201, 55, 55);
		frmStandardCalculator.getContentPane().add(btnE);
		
		
		//----------------------------------Row 4---------------------------
		
		
		JButton btnSqr = new JButton("x^2");
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = num*num;
				textField.setText(String.valueOf(num));
			}
		});
		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSqr.setBounds(347, 267, 55, 55);
		frmStandardCalculator.getContentPane().add(btnSqr);
		
		
		
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.cbrt(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnCbr.setBounds(412, 267, 55, 55);
		frmStandardCalculator.getContentPane().add(btnCbr);
		
		
		
		
		JButton btnRound = new JButton("Rund");
		btnRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = Math.round(num);
				textField.setText(String.valueOf(num));
			}
		});
		btnRound.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnRound.setBounds(477, 267, 55, 55);
		frmStandardCalculator.getContentPane().add(btnRound);


		
		
		JButton btnTwoPi = new JButton("2* \u03C0");
		btnTwoPi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num;
				num = (3.1415926535897932384626433832795) * 2;
				textField.setText(String.valueOf(num));
			}
		});
		btnTwoPi.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTwoPi.setBounds(542, 267, 55, 55);
		frmStandardCalculator.getContentPane().add(btnTwoPi);
		//---------------------------------Row 5------------------------------
		
		
		
		JButton btnCube = new JButton("x^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num = Double.parseDouble(String.valueOf(textField.getText()));
				num = num*num*num;
				textField.setText(String.valueOf(num));
			}
		});
		btnCube.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCube.setBounds(347, 333, 55, 55);
		frmStandardCalculator.getContentPane().add(btnCube);
		
		
		
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a,2));
			}
		});
		btnBin.setBounds(412, 333, 55, 55);
		frmStandardCalculator.getContentPane().add(btnBin);
		
		
		
		
		JButton btnHex = new JButton("Hex");
		btnHex.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a,16));
			}
		});
		btnHex.setBounds(477, 333, 55, 55);
		frmStandardCalculator.getContentPane().add(btnHex);
		
		
		
		
		JButton btnOct = new JButton("Oct");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(textField.getText());
				textField.setText(Integer.toString(a,8));
			}
		});
		btnOct.setBounds(542, 333, 55, 55);
		frmStandardCalculator.getContentPane().add(btnOct);
		
	}
}
