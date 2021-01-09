
import java.awt.EventQueue;

/**     
 * Simple Java Calculator
 * @author Navroop Chahal
 * */

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	//Variables for the buttons and text field
	private JFrame frame;
	private JTextField textField;
	private JButton btnButton_Clear;
	private JButton btnButton_00;
	private JButton btnButton_PercentSign;
	private JButton btnButton_7;
	private JButton btnButton_4;
	private JButton btnButton_1;
	private JButton btnButton_0;
	private JButton btnButton_8;
	private JButton btnButton_5;
	private JButton btnButton_2;
	private JButton btnButton_DecimalDot;
	private JButton btnButton_EqualSign;
	private JButton btnButton_3;
	private JButton btnButton_6;
	private JButton btnButton_9;
	private JButton btnButton_DivideSign;
	private JButton btnButton_MultiplySign;
	private JButton btnButton_MinusSign;
	private JButton btnButton_PlusSign;

	// Variables for the calculator operations
	double FirstNumber;
	double SecondNumber;
	double FinalResult;
	String operator;
	String FinalAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application Calc.
	 */
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		textField.setBounds(23, 30, 303, 71);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
// Code for BackSpace button
		JButton btnButton_BackSpce = new JButton("\uF0E7");
		btnButton_BackSpce.setForeground(Color.BLACK);
		btnButton_BackSpce.setBackground(Color.GREEN);
		btnButton_BackSpce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Delete = null;
				if(textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Delete = str.toString();
					textField.setText(Delete);
				}
			}
		});
		btnButton_BackSpce.setFont(new Font("WingDings", Font.BOLD | Font.ITALIC, 18));
		btnButton_BackSpce.setBounds(6, 113, 84, 72);
		frame.getContentPane().add(btnButton_BackSpce);
		
// Code for Clear Button
		btnButton_Clear = new JButton("C");
		btnButton_Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnButton_Clear.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_Clear.setBounds(91, 113, 84, 72);
		frame.getContentPane().add(btnButton_Clear);
	
// Code for double 00 button
		btnButton_00 = new JButton("00");
		btnButton_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_00.getText();
				textField.setText(num);
			}
		});
		btnButton_00.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_00.setBounds(176, 113, 84, 72);
		frame.getContentPane().add(btnButton_00);
		
// Code for % sign button
		btnButton_PercentSign = new JButton("%");
		btnButton_PercentSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});
		btnButton_PercentSign.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_PercentSign.setBounds(260, 113, 84, 72);
		frame.getContentPane().add(btnButton_PercentSign);
		
// Code for number 7 button
		btnButton_7 = new JButton("7");
		btnButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_7.getText();
				textField.setText(num);
			}
		});
		btnButton_7.setBackground(Color.LIGHT_GRAY);
		btnButton_7.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_7.setBounds(6, 183, 84, 72);
		frame.getContentPane().add(btnButton_7);

// Code for number 4 button
		btnButton_4 = new JButton("4");
		btnButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_4.getText();
				textField.setText(num);
			}
		});
		btnButton_4.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_4.setBounds(6, 255, 84, 72);
		frame.getContentPane().add(btnButton_4);

// Code for number 1 button
		btnButton_1 = new JButton("1");
		btnButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_1.getText();
				textField.setText(num);
			}
		});
		btnButton_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_1.setBounds(6, 328, 84, 72);
		frame.getContentPane().add(btnButton_1);

	// Code for number 0 button
		btnButton_0 = new JButton("0");
		btnButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_0.getText();
				textField.setText(num);
			}
		});
		btnButton_0.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_0.setBounds(6, 400, 84, 72);
		frame.getContentPane().add(btnButton_0);

// Code for number 8 button
		btnButton_8 = new JButton("8");
		btnButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_8.getText();
				textField.setText(num);
			}
		});
		btnButton_8.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_8.setBounds(91, 183, 84, 72);
		frame.getContentPane().add(btnButton_8);

// Code for number 5 button
		btnButton_5 = new JButton("5");
		btnButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_5.getText();
				textField.setText(num);
			}
		});
		btnButton_5.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_5.setBounds(91, 255, 84, 72);
		frame.getContentPane().add(btnButton_5);

// Code for number 2 button
		btnButton_2 = new JButton("2");
		btnButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_2.getText();
				textField.setText(num);
			}
		});
		btnButton_2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_2.setBounds(91, 328, 84, 72);
		frame.getContentPane().add(btnButton_2);

//Code for the decimal dot button
		btnButton_DecimalDot = new JButton(".");
		btnButton_DecimalDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_DecimalDot.getText();
				textField.setText(num);
			}
		});
		btnButton_DecimalDot.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_DecimalDot.setBounds(91, 400, 84, 72);
		frame.getContentPane().add(btnButton_DecimalDot);
		
// Code for = sign button and this is where all the operation of the calculator works
		btnButton_EqualSign = new JButton("=");
		btnButton_EqualSign.setForeground(Color.GREEN);
		btnButton_EqualSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String FinalAnswer;
				SecondNumber = Double.parseDouble(textField.getText());
				//Code for the plus operation to work
				if(operator == "+") {
					FinalResult = FirstNumber + SecondNumber;
					FinalAnswer = String.format("%.2f", FinalResult);
					textField.setText(FinalAnswer);
				}
				
				//Code for the minus operator to work
				else if(operator == "-") {
					FinalResult = FirstNumber - SecondNumber;
					FinalAnswer = String.format("%.2f", FinalResult);
					textField.setText(FinalAnswer);
				}
				
				//Code for the multiplication operator to work
				else if(operator == "x") {
					FinalResult = FirstNumber * SecondNumber;
					FinalAnswer = String.format("%.2f", FinalResult);
					textField.setText(FinalAnswer);
				}
				
				// Code for the division operator 
				else if(operator == "÷") {
					FinalResult = FirstNumber / SecondNumber;
					FinalAnswer = String.format("%.2f", FinalResult);
					textField.setText(FinalAnswer);
				}
				
				//Code for the percent operator
				else if(operator == "%") {
					FinalResult = (FirstNumber / SecondNumber) * 100;
					FinalAnswer = String.format("%.2f", FinalResult);
					textField.setText(FinalAnswer);
				}
				
			}
		});
		btnButton_EqualSign.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_EqualSign.setBounds(176, 400, 84, 72);
		frame.getContentPane().add(btnButton_EqualSign);

// Code for number 3 button
		btnButton_3 = new JButton("3");
		btnButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_3.getText();
				textField.setText(num);
			}
		});
		btnButton_3.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_3.setBounds(176, 328, 84, 72);
		frame.getContentPane().add(btnButton_3);
	
// Code for number 6 button
		btnButton_6 = new JButton("6");
		btnButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_6.getText();
				textField.setText(num);
			}
		});
		btnButton_6.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_6.setBounds(176, 255, 84, 72);
		frame.getContentPane().add(btnButton_6);

// Code for number 9 button
		btnButton_9 = new JButton("9");
		btnButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btnButton_9.getText();
				textField.setText(num);
			}
		});
		btnButton_9.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_9.setBounds(176, 183, 84, 72);
		frame.getContentPane().add(btnButton_9);

// Code for ÷ symbol button
		btnButton_DivideSign = new JButton("÷");
		btnButton_DivideSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "÷";
			}
		});
		btnButton_DivideSign.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_DivideSign.setBounds(260, 183, 84, 72);
		frame.getContentPane().add(btnButton_DivideSign);
		
// Code for x symbol button
		btnButton_MultiplySign = new JButton("x");
		btnButton_MultiplySign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "x";
			}
		});
		btnButton_MultiplySign.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_MultiplySign.setBounds(260, 255, 84, 72);
		frame.getContentPane().add(btnButton_MultiplySign);

// Code for - symbol button
		btnButton_MinusSign = new JButton("-");
		btnButton_MinusSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});
		btnButton_MinusSign.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_MinusSign.setBounds(260, 328, 84, 72);
		frame.getContentPane().add(btnButton_MinusSign);

// Code for + symbol button
		btnButton_PlusSign = new JButton("+");
		btnButton_PlusSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
				
			}
		});
		btnButton_PlusSign.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 18));
		btnButton_PlusSign.setBounds(260, 400, 84, 72);
		frame.getContentPane().add(btnButton_PlusSign);
	}
}
