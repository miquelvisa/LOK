package com.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.variables.LoginData;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 281, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(92, 11, 173, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 14, 72, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 38, 72, 14);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkLogin();
			}

			private void checkLogin() {
				LoginData ld = new LoginData();
				switch(ld.compare(textField.getText(), String.valueOf(passwordField.getPassword()))){
				case -1:JOptionPane.showMessageDialog(null, "El usuario introducido no existe.","Usuario incorrecto",2);break;
				case 0:JOptionPane.showMessageDialog(null, "La constraseña introducida para ese usuario es incorrecta.","Contraseña incorrecta",2);break;
				case 1:break;
				default:break;
				}
				
			}
		});
		btnNewButton.setBounds(10, 78, 255, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(92, 35, 173, 20);
		contentPane.add(passwordField);
	}
}
