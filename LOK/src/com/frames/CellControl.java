package com.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JTable;

public class CellControl extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CellControl frame = new CellControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws InterruptedException 
	 */
	public CellControl() throws InterruptedException {
		setTitle("Control de celdas");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton tglbtnAbrir = new JToggleButton("C");
		tglbtnAbrir.setToolTipText("Cerrada");
		tglbtnAbrir.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(tglbtnAbrir.getText().equals("C")){
					tglbtnAbrir.setText("A");
					tglbtnAbrir.setToolTipText("Abierta");
				}else{
					tglbtnAbrir.setText("C");
					tglbtnAbrir.setToolTipText("Cerrada");
				}
			}
		});
		tglbtnAbrir.setBounds(358, 31, 39, 23);
		contentPane.add(tglbtnAbrir);
		
		table = new JTable();
		table.setBounds(27, 31, 271, 201);
		contentPane.add(table);
		

	}
}
