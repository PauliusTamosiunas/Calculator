package com.calculator.org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton buttonOne;
	private JButton buttonTwo;
	private JButton buttonThree;
	private JButton buttonFour;
	private JButton buttonFive;
	private JButton buttonSix;
	private JButton buttonSeven;
	private JButton buttonEight;
	private JButton buttonNine;
	private JButton buttonZero;
	private JButton buttonSum;
	private JButton buttonMinus;
	private JButton buttonMultiplication;
	private JButton buttonDivision;
	private JButton buttonDot;
	private JButton buttonEqual;
	private JButton buttonClear;
	
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;
	private JButton buttonPerc;
	double number;
	
	

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
		frame.setBounds(100, 100, 405, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(36, 16, 319, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		buttonOne = new JButton("1");
		buttonOne.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonOne.getText();
				textField.setText(EnterNumber);
				
				
			}
		});
		buttonOne.setBounds(36, 93, 50, 50);
		frame.getContentPane().add(buttonOne);
		
		buttonTwo = new JButton("2");
		buttonTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonTwo.getText();
				textField.setText(EnterNumber);
				
				
			}
		});
		buttonTwo.setBounds(98, 93, 50, 50);
		frame.getContentPane().add(buttonTwo);
		
		buttonThree = new JButton("3");
		buttonThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonThree.getText();
				textField.setText(EnterNumber);
				
			}
		});
		buttonThree.setBounds(160, 93, 50, 50);
		frame.getContentPane().add(buttonThree);
		
		buttonFour = new JButton("4");
		buttonFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonFour.getText();
				textField.setText(EnterNumber);
				
			}
		});
		buttonFour.setBounds(36, 155, 50, 50);
		frame.getContentPane().add(buttonFour);
		
		buttonFive = new JButton("5");
		buttonFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonFive.getText();
				textField.setText(EnterNumber);
				
			}
		});
		buttonFive.setBounds(98, 155, 50, 50);
		frame.getContentPane().add(buttonFive);
		
		buttonSix = new JButton("6");
		buttonSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonSix.getText();
				textField.setText(EnterNumber);
				
			}
		});
		buttonSix.setBounds(160, 155, 50, 50);
		frame.getContentPane().add(buttonSix);
		
		buttonSeven = new JButton("7");
		buttonSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonSeven.getText();
				textField.setText(EnterNumber);
				
			}
		});
		buttonSeven.setBounds(36, 215, 50, 50);
		frame.getContentPane().add(buttonSeven);
		
		buttonEight = new JButton("8");
		buttonEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = textField.getText() + buttonEight.getText();
				textField.setText(EnterNumber);
			
			}
		});
		buttonEight.setBounds(98, 215, 50, 50);
		frame.getContentPane().add(buttonEight);
		
		buttonNine = new JButton("9");
		buttonNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonNine.getText();
				textField.setText(EnterNumber);
				
			}
		});
		buttonNine.setBounds(160, 217, 50, 50);
		frame.getContentPane().add(buttonNine);
		
		buttonSum = new JButton("+");
		buttonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		buttonSum.setBounds(242, 93, 50, 50);
		frame.getContentPane().add(buttonSum);
		
		buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			firstNumber = Double.parseDouble(textField.getText());
			textField.setText("");
			operations = "-";
			
			
			}
		});
		buttonMinus.setBounds(242, 155, 50, 50);
		frame.getContentPane().add(buttonMinus);
		
		buttonMultiplication = new JButton("*");
		buttonMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
				
			}
		});
		buttonMultiplication.setBounds(304, 155, 50, 50);
		frame.getContentPane().add(buttonMultiplication);
		
		buttonDivision = new JButton("/");
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		buttonDivision.setBounds(305, 93, 50, 50);
		frame.getContentPane().add(buttonDivision);
		
		buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
				textField.setText(textField.getText() + ".");
				firstNumber = Double.parseDouble(textField.getText());
				
				
				} catch(Exception arg3) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
					textField.setText("");
				}
			}
		});
		buttonDot.setBounds(160, 278, 50, 50);
		frame.getContentPane().add(buttonDot);
		
		buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				try {
				if (operations == "+") {
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} 
					

				else if (operations == "-") {
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} 
				
				else if (operations == "*") {
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "/") {
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "%") {
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				}
				catch(Exception arg3) {
					JOptionPane.showMessageDialog(null, "Please enter a valid number");
					textField.setText("");
			      }	
			}
			
		});
		buttonEqual.setBounds(242, 278, 113, 50);
		frame.getContentPane().add(buttonEqual);
		
		buttonZero = new JButton("0");
		buttonZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + buttonZero.getText();
				textField.setText(EnterNumber);
				
			}
		});
		buttonZero.setBounds(36, 278, 50, 50);
		frame.getContentPane().add(buttonZero);
		
		buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("");
				
			}
		});
		buttonClear.setBounds(242, 215, 50, 50);
		frame.getContentPane().add(buttonClear);
		
		buttonPerc = new JButton("%");
		buttonPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
				
			}
		});
		buttonPerc.setBounds(305, 215, 50, 50);
		frame.getContentPane().add(buttonPerc);
	}

}
