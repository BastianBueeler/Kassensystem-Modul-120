package bordertest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frametest extends JFrame implements ActionListener {

	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JPanel pnl = new JPanel();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	public Frametest() {
		setLayout(new BorderLayout());
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.DARK_GRAY);
		
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(btn1);
		pnl.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add(pnl, BorderLayout.WEST);
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frametest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn1) {
			this.remove(p2);
			this.add(p1, BorderLayout.CENTER);
		} else if(e.getSource() == btn2) {
			this.remove(p1);
			this.add(p2, BorderLayout.CENTER);
		}
		
		this.repaint(); // schöner wäre grundsätzlich der Einsatz eines CardLayouts im Center Bereich
		this.revalidate();
	}
	
	
}
