package hust.soict.globalict.gui.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingCounter extends JFrame {

	private JTextField tfCount;
	private JButton btnCount;
	private JButton btnSub;
	private int count;
	
	public SwingCounter() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("Count"));
		tfCount = new JTextField("0",10);
		tfCount.setEditable(false);
		cp.add(tfCount);
		
		btnCount = new JButton("Count");
		cp.add(btnCount);
		
		btnCount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				++count;
				tfCount.setText(count + "");
			}
		});
		
		btnSub = new JButton("Sub");
		cp.add(btnSub);
		
		btnSub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				--count;
				tfCount.setText(count + "");
				
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Swing Counter");
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingCounter(); // Let the constructor do the job
			}
		});
	}
}
