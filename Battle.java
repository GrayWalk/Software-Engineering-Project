import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Battle{
	JFrame f;

	JButton b, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;

	JLabel l, l1, l2, l3, l4, l5;

	JPanel c1, c2, c3, c4;
	//using a card panel to quickly switch between GUI's
	JPanel cardPanel = new JPanel(new CardLayout());

	Battle(){
		//basic frame details
		JFrame f = new JFrame("Battleship");
		f.setSize(1000, 750);

		//Card 1, Main menu
		c1 = new JPanel();
		c1.setBackground(Color.blue);
		l = new JLabel("Panel label");
		b = new JButton("New Game");
		//button listener and code to switch stuff
			b.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c2");
				}
			});
		b1 = new JButton("Settings");
		//button listener and code to switch stuff
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c3");
				}
			});
		b2 = new JButton("How to Play");
		//button listener and code to switch stuff
			b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c4");
				}
			});
		
		c1.add(l);
		c1.add(b);
		c1.add(b1);
		c1.add(b2);

		//Card 2, Start a game section
		c2 = new JPanel();
		c2.setBackground(Color.blue);
		b3 = new JButton("Back to Main Menu");
		//button listener and code to switch stuff
			b3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c1");
				}
			});

		c2.add(b3);

		//Card 3, Settings section
		c3 = new JPanel();
		c3.setBackground(Color.blue);
		b4 = new JButton("Back to Main Menu");
		//button listener and code to switch stuff
			b4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c1");
				}
			});

		c3.add(b4);

		//Card 4, How to play section
		c4 = new JPanel();
		c4.setBackground(Color.blue);
		l1 = new JLabel("Fill in how to play stuff here");
		l2 = new JLabel("Put names and copyright info here");
		b5 = new JButton("Back to main screen");
			//button listener and code to switch stuff
			b5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c1");
				}
			});

		c4.add(l1);
		c4.add(l2);
		c4.add(b5);



		//setting all cards in the deck
		cardPanel.add(c1, "c1");
		cardPanel.add(c2, "c2");
		cardPanel.add(c3, "c3");
		cardPanel.add(c4, "c4");


		//add main panel to the screen frame
		f.add(cardPanel);
		f.setVisible(true);

	}

	private void switchLayout(String newLayout){
		CardLayout c = (CardLayout)(cardPanel.getLayout());
		c.show(cardPanel, newLayout);
	}

	public static void main(String[] args){
		
		SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			new Battle();
			}
		});
	}
}