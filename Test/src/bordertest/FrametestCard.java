package bordertest;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrametestCard extends JFrame implements ActionListener {

	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JPanel pnl = new JPanel();
	JPanel center = new JPanel();
	CardLayout card = new CardLayout();
	
	final static String PNL1 = "Card1";
	final static String PNL2 = "Card2";
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	public FrametestCard() {
		setLayout(new BorderLayout());
		center.setLayout(card);
		
		p1.setBackground(Color.LIGHT_GRAY);
		p2.setBackground(Color.DARK_GRAY);
		
		center.add(p1, PNL1);
		center.add(p2, PNL2);
		card.show(center, PNL1);
		
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(btn1);
		pnl.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add(pnl, BorderLayout.WEST);
		add(center, BorderLayout.CENTER);
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FrametestCard();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn1) {
			card.show(center, PNL1);
		} else if(e.getSource() == btn2) {
			card.show(center, PNL2);
		}
	}
	
	
}