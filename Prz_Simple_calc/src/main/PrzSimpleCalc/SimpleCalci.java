package main.PrzSimpleCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleCalci {
	
	static Logger LOGGER = LoggerFactory.getLogger(SimpleCalci.class);
	private JFrame frame;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalci window = new SimpleCalci();
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
	public SimpleCalci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.gray);
		frame.setForeground(Color.LIGHT_GRAY);
		frame.setBounds(450, 100, 305, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PrzSimpleCalci");
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.ORANGE));
		editorPane.setBounds(10, 11, 269, 80);
		editorPane.setFont(new Font("Arial", Font.PLAIN, 28));
		editorPane.setBackground(Color.WHITE);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		btnNewButton.setBounds(10, 109, 59, 46);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		btnNewButton_1.setBounds(75, 109, 59, 46);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_1_1 = new JButton("C");
		btnNewButton_1_1.setBackground(Color.PINK);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				actionReceived.setText(null);
				
			}
		});
		btnNewButton_1_1.setBounds(205, 109, 59, 46);
		btnNewButton_1_1.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		btnNewButton_2.setBounds(140, 109, 59, 46);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_1_1_1 = new JButton("-");
		btnNewButton_1_1_1.setBackground(Color.PINK);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionReceived.setText("sub");
				value2.setText(null);
				
				
			}
		});
		btnNewButton_1_1_1.setBounds(205, 237, 59, 46);
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.PLAIN, 34));
		
		JButton btnNewButton_2_1 = new JButton("9");
		btnNewButton_2_1.setBackground(Color.PINK);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+9);
			}
		});
		btnNewButton_2_1.setBounds(140, 237, 59, 46);
		btnNewButton_2_1.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setBackground(Color.PINK);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		btnNewButton_3.setBounds(10, 237, 59, 46);
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.setBackground(Color.PINK);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		btnNewButton_1_2.setBounds(75, 237, 59, 46);
		btnNewButton_1_2.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_1_1_2 = new JButton("+");
		btnNewButton_1_1_2.setBackground(Color.PINK);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionReceived.setText("add");
				value2.setText(null);
			}
		});
		btnNewButton_1_1_2.setBounds(205, 173, 59, 46);
		btnNewButton_1_1_2.setFont(new Font("Arial", Font.PLAIN, 32));
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.setBackground(Color.PINK);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		btnNewButton_2_2.setBounds(140, 173, 59, 46);
		btnNewButton_2_2.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setBackground(Color.PINK);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		btnNewButton_4.setBounds(10, 173, 59, 46);
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setBackground(Color.PINK);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		btnNewButton_1_3.setBounds(75, 173, 59, 46);
		btnNewButton_1_3.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_3_1 = new JButton("7");
		btnNewButton_3_1.setBounds(10, 549, 59, 46);
		btnNewButton_3_1.setFont(new Font("Arial", Font.PLAIN, 28));
		
		JButton btnNewButton_1_2_1 = new JButton("8");
		btnNewButton_1_2_1.setBounds(75, 549, 59, 46);
		btnNewButton_1_2_1.setFont(new Font("Arial", Font.PLAIN, 28));
		
		JButton btnNewButton_2_1_1 = new JButton("9");
		btnNewButton_2_1_1.setBounds(140, 549, 59, 46);
		btnNewButton_2_1_1.setFont(new Font("Arial", Font.PLAIN, 28));
		
		JButton btnNewButton_1_1_1_1 = new JButton("1");
		btnNewButton_1_1_1_1.setBounds(205, 549, 59, 46);
		btnNewButton_1_1_1_1.setFont(new Font("Arial", Font.PLAIN, 28));
		
		JButton btnNewButton_3_2 = new JButton("0");
		btnNewButton_3_2.setBackground(Color.PINK);
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
	
			
		});
		btnNewButton_3_2.setBounds(10, 301, 59, 46);
		btnNewButton_3_2.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_3_3 = new JButton(".");
		btnNewButton_3_3.setBackground(Color.PINK);
		btnNewButton_3_3.setBounds(75, 301, 59, 46);
		btnNewButton_3_3.setFont(new Font("Arial", Font.PLAIN, 36));
		
		JButton btnNewButton_3_4 = new JButton("/");
		btnNewButton_3_4.setBackground(Color.PINK);
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionReceived.setText("div");
				value2.setText(null);
			}
		});
		btnNewButton_3_4.setBounds(140, 301, 59, 46);
		btnNewButton_3_4.setFont(new Font("Arial", Font.PLAIN, 30));
		
		JButton btnNewButton_3_5 = new JButton("*");
		btnNewButton_3_5.setBackground(Color.PINK);
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionReceived.setText("mul");
				value2.setText(null);
			}
		});
		btnNewButton_3_5.setBounds(205, 301, 59, 46);
		btnNewButton_3_5.setFont(new Font("Arial", Font.PLAIN, 34));
		
		JButton btnNewButton_5 = new JButton("=");
		btnNewButton_5.setBackground(Color.PINK);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one=Integer.parseInt(value1.getText());
				int two=Integer.parseInt(value2.getText());
				
				
				if(actionReceived.getText().equals("sub"))
				{ int sub=one-two;
					value2.setText(String.valueOf(sub));
				}
				if(actionReceived.getText().equals("add"))
				{ int add=one+two;
					value2.setText(String.valueOf(add));
				}
				if(actionReceived.getText().equals("mul"))
				{ int mul=one*two;
					value2.setText(String.valueOf(mul));
				}
				if(actionReceived.getText().equals("div"))
				{ int div=one/two;
					value2.setText(String.valueOf(div));
				}
			}
		});
		btnNewButton_5.setBounds(150, 365, 114, 36);
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 34));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton_4);
		frame.getContentPane().add(btnNewButton_1_3);
		frame.getContentPane().add(btnNewButton_2_2);
		frame.getContentPane().add(btnNewButton_1_1_2);
		frame.getContentPane().add(btnNewButton_3);
		frame.getContentPane().add(btnNewButton_1_2);
		frame.getContentPane().add(btnNewButton_2_1);
		frame.getContentPane().add(btnNewButton_1_1_1);
		frame.getContentPane().add(btnNewButton_3_2);
		frame.getContentPane().add(btnNewButton_3_3);
		frame.getContentPane().add(btnNewButton_3_4);
		frame.getContentPane().add(btnNewButton_3_5);
		frame.getContentPane().add(btnNewButton_5);
		frame.getContentPane().add(btnNewButton_3_1);
		frame.getContentPane().add(btnNewButton_1_2_1);
		frame.getContentPane().add(btnNewButton_2_1_1);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton_2);
		frame.getContentPane().add(btnNewButton_1_1);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBounds(75, 30, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		value2 = new JTextField();
		value2.setBackground(Color.WHITE);
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setFont(new Font("Arial", Font.PLAIN, 24));
		value2.setAlignmentY(0.2f);
		value2.setAlignmentX(0.2f);
		value2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.MAGENTA));
		value2.setBounds(75, 53, 190, 32);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		actionReceived = new JLabel(""); // making global variable
		actionReceived.setBounds(10, 365, 97, 36);
		frame.getContentPane().add(actionReceived);
		
		value1 = new JTextField();
		value1.setBackground(Color.WHITE);
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setFont(new Font("Arial", Font.PLAIN, 18));
		value1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 255)));
		value1.setBounds(121, 19, 143, 30);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		

	}
	
	private JLabel actionReceived;
}
