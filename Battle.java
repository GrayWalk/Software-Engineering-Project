import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

class Battle{
	JFrame f;

	JButton b, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
	JRadioButton r1, r2, r3;
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
		c1.setBackground(Color.gray);
		l = new JLabel("Panel label");
		b = new JButton("New Game");
		//button listener and code to switch stuff
			b.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c2");
					Map.initializeImages();
					Map.randomizeMap();
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
			b2.addActionListener(new ActionListener(){
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
		c2.setBackground(Color.gray);
		b3 = new JButton("Back to Main Menu");
		//Create 2 panels top containing 12x12 button array
		//button listener and code to switch stuff
			b3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c1");
				}
			});

		c2.add(b3);

		//Card 3, Settings section
		c3 = new JPanel();
		BoxLayout box = new BoxLayout(c3, BoxLayout.Y_AXIS);
		c3.setLayout(box);
		c3.setBorder(new EmptyBorder(new Insets(200, 400, 200, 200)));
		c3.setBackground(Color.gray);
		JLabel settingsLabel = new JLabel("These buttons are to change the size of the overall grid, the default is 7 x 7");
		r1 = new JRadioButton("10 x 10 grid");
		r1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Map.row = 10;
				Map.column = 10;
			}
		});
		r2 = new JRadioButton("15 x 15 grid");
		r2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Map.row = 15;
				Map.column = 15;	
			}
		});
		r3 = new JRadioButton("20 x 20 grid");
		r3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Map.row = 20;
				Map.column = 20;
			}
		});

		b4 = new JButton("Back to Main Menu");
		//button listener and code to switch stuff
			b4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("c1");
				}
			});

		c3.add(settingsLabel);
		c3.add(r1);
		c3.add(r2);
		c3.add(r3);
		c3.add(b4);
		

		//Card 4, How to play section
		c4 = new JPanel();
		BoxLayout box1 = new BoxLayout(c4, BoxLayout.Y_AXIS);
		c4.setLayout(box1);
		c4.setBorder(new EmptyBorder(new Insets(200, 400, 200, 200)));
		c4.setBackground(Color.gray);
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