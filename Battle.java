import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

class Battle{
	JFrame f;
	
	JButton a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
	JButton c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
	JButton d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12;
	JButton e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12;
	JButton f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12;
	JButton g1, g2, g3, g4, g5, g6, g7, g8, g9, g10, g11, g12;
	JButton h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11, h12;
	JButton i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12;
	JButton j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12;
	JButton k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12;
	JButton l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;

	JButton newGameB, settingsB, howPlayB, back1B, back2B, back3B;
	JRadioButton r1, r2, r3;
	JLabel mainL, howPlayL, creditsL;

	JPanel card1, card2, card3, card4;
	//using a card panel to quickly switch between GUI's
	JPanel cardPanel = new JPanel(new CardLayout());

	Battle(){
		//basic frame details
		JFrame f = new JFrame("Battleship");
		f.setSize(1000, 750);

		//Card 1, Main menu
		card1 = new JPanel();
		card1.setBackground(Color.gray);
		mainL = new JLabel("Panel label");
		newGameB = new JButton("New Game");
		//button listener and code to switch stuff
			newGameB.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("card2");
					Map.initializeImages();
					Map.randomizeMap();
				}
			});
		settingsB = new JButton("Settings");
		//button listener and code to switch stuff
			settingsB.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("card3");
				}
			});
		howPlayB = new JButton("How to Play");
		//button listener and code to switch stuff
			howPlayB.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("card4");
				}
			});
		
		card1.add(mainL);
		card1.add(newGameB);
		card1.add(settingsB);
		card1.add(howPlayB);

		//Card 2, Start a game section
		card2 = new JPanel();
		card2.setBackground(Color.gray);
		back1B = new JButton("Back to Main Menu");
		Icon oceanTile = new ImageIcon("ocean.png");

		a1 = new JButton(oceanTile);
		a2 = new JButton(oceanTile);
		a3 = new JButton(oceanTile);
		a4 = new JButton(oceanTile);
		a5 = new JButton(oceanTile);
		a6 = new JButton(oceanTile);
		a7 = new JButton(oceanTile);
		a8 = new JButton(oceanTile);
		a9 = new JButton(oceanTile);
		a10 = new JButton(oceanTile);
		a11 = new JButton(oceanTile);
		a12 = new JButton(oceanTile);

		b1 = new JButton(oceanTile);
		b2 = new JButton(oceanTile);
		b3 = new JButton(oceanTile);
		b4 = new JButton(oceanTile);
		b5 = new JButton(oceanTile);
		b6 = new JButton(oceanTile);
		b7 = new JButton(oceanTile);
		b8 = new JButton(oceanTile);
		b9 = new JButton(oceanTile);
		b10 = new JButton(oceanTile);
		b11 = new JButton(oceanTile);
		b12 = new JButton(oceanTile);

		c1 = new JButton(oceanTile);
		c2 = new JButton(oceanTile);
		c3 = new JButton(oceanTile);
		c4 = new JButton(oceanTile);
		c5 = new JButton(oceanTile);
		c6 = new JButton(oceanTile);
		c7 = new JButton(oceanTile);
		c8 = new JButton(oceanTile);
		c9 = new JButton(oceanTile);
		c10 = new JButton(oceanTile);
		c11 = new JButton(oceanTile);
		c12 = new JButton(oceanTile);

		d1 = new JButton(oceanTile);
		d2 = new JButton(oceanTile);
		d3 = new JButton(oceanTile);
		d4 = new JButton(oceanTile);
		d5 = new JButton(oceanTile);
		d6 = new JButton(oceanTile);
		d7 = new JButton(oceanTile);
		d8 = new JButton(oceanTile);
		d9 = new JButton(oceanTile);
		d10 = new JButton(oceanTile);
		d11 = new JButton(oceanTile);
		d12 = new JButton(oceanTile);

		e1 = new JButton(oceanTile);
		e2 = new JButton(oceanTile);
		e3 = new JButton(oceanTile);
		e4 = new JButton(oceanTile);
		e5 = new JButton(oceanTile);
		e6 = new JButton(oceanTile);
		e7 = new JButton(oceanTile);
		e8 = new JButton(oceanTile);
		e9 = new JButton(oceanTile);
		e10 = new JButton(oceanTile);
		e11 = new JButton(oceanTile);
		e12 = new JButton(oceanTile);

		f1 = new JButton(oceanTile);
		f2 = new JButton(oceanTile);
		f3 = new JButton(oceanTile);
		f4 = new JButton(oceanTile);
		f5 = new JButton(oceanTile);
		f6 = new JButton(oceanTile);
		f7 = new JButton(oceanTile);
		f8 = new JButton(oceanTile);
		f9 = new JButton(oceanTile);
		f10 = new JButton(oceanTile);
		f11 = new JButton(oceanTile);
		f12 = new JButton(oceanTile);

		g1 = new JButton(oceanTile);
		g2 = new JButton(oceanTile);
		g3 = new JButton(oceanTile);
		g4 = new JButton(oceanTile);
		g5 = new JButton(oceanTile);
		g6 = new JButton(oceanTile);
		g7 = new JButton(oceanTile);
		g8 = new JButton(oceanTile);
		g9 = new JButton(oceanTile);
		g10 = new JButton(oceanTile);
		g11 = new JButton(oceanTile);
		g12 = new JButton(oceanTile);

		h1 = new JButton(oceanTile);
		h2 = new JButton(oceanTile);
		h3 = new JButton(oceanTile);
		h4 = new JButton(oceanTile);
		h5 = new JButton(oceanTile);
		h6 = new JButton(oceanTile);
		h7 = new JButton(oceanTile);
		h8 = new JButton(oceanTile);
		h9 = new JButton(oceanTile);
		h10 = new JButton(oceanTile);
		h11 = new JButton(oceanTile);
		h12 = new JButton(oceanTile);

		i1 = new JButton(oceanTile);
		i2 = new JButton(oceanTile);
		i3 = new JButton(oceanTile);
		i4 = new JButton(oceanTile);
		i5 = new JButton(oceanTile);
		i6 = new JButton(oceanTile);
		i7 = new JButton(oceanTile);
		i8 = new JButton(oceanTile);
		i9 = new JButton(oceanTile);
		i10 = new JButton(oceanTile);
		i11 = new JButton(oceanTile);
		i12 = new JButton(oceanTile);

		j1 = new JButton(oceanTile);
		j2 = new JButton(oceanTile);
		j3 = new JButton(oceanTile);
		j4 = new JButton(oceanTile);
		j5 = new JButton(oceanTile);
		j6 = new JButton(oceanTile);
		j7 = new JButton(oceanTile);
		j8 = new JButton(oceanTile);
		j9 = new JButton(oceanTile);
		j10 = new JButton(oceanTile);
		j11 = new JButton(oceanTile);
		j12 = new JButton(oceanTile);

		k1 = new JButton(oceanTile);
		k2 = new JButton(oceanTile);
		k3 = new JButton(oceanTile);
		k4 = new JButton(oceanTile);
		k5 = new JButton(oceanTile);
		k6 = new JButton(oceanTile);
		k7 = new JButton(oceanTile);
		k8 = new JButton(oceanTile);
		k9 = new JButton(oceanTile);
		k10 = new JButton(oceanTile);
		k11 = new JButton(oceanTile);
		k12 = new JButton(oceanTile);

		l1 = new JButton(oceanTile);
		l2 = new JButton(oceanTile);
		l3 = new JButton(oceanTile);
		l4 = new JButton(oceanTile);
		l5 = new JButton(oceanTile);
		l6 = new JButton(oceanTile);
		l7 = new JButton(oceanTile);
		l8 = new JButton(oceanTile);
		l9 = new JButton(oceanTile);
		l10 = new JButton(oceanTile);
		l11 = new JButton(oceanTile);
		l12 = new JButton(oceanTile);
	
		//button listener and code to switch stuff
			back1B.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("card1");
				}
			});

		card2.add(a1);
		card2.add(a2);
		card2.add(a3);
		card2.add(a4);
		card2.add(a5);
		card2.add(a6);
		card2.add(a7);
		card2.add(a8);
		card2.add(a9);
		card2.add(a10);
		card2.add(a11);
		card2.add(a12);

		card2.add(b1);
		card2.add(b2);
		card2.add(b3);
		card2.add(b4);
		card2.add(b5);
		card2.add(b6);
		card2.add(b7);
		card2.add(b8);
		card2.add(b9);
		card2.add(b10);
		card2.add(b11);
		card2.add(b12);

		card2.add(c1);
		card2.add(c2);
		card2.add(c3);
		card2.add(c4);
		card2.add(c5);
		card2.add(c6);
		card2.add(c7);
		card2.add(c8);
		card2.add(c9);
		card2.add(c10);
		card2.add(c11);
		card2.add(c12);

		card2.add(d1);
		card2.add(d2);
		card2.add(d3);
		card2.add(d4);
		card2.add(d5);
		card2.add(d6);
		card2.add(d7);
		card2.add(d8);
		card2.add(d9);
		card2.add(d10);
		card2.add(d11);
		card2.add(d12);

		card2.add(e1);
		card2.add(e2);
		card2.add(e3);
		card2.add(e4);
		card2.add(e5);
		card2.add(e6);
		card2.add(e7);
		card2.add(e8);
		card2.add(e9);
		card2.add(e10);
		card2.add(e11);
		card2.add(e12);

		card2.add(f1);
		card2.add(f2);
		card2.add(f3);
		card2.add(f4);
		card2.add(f5);
		card2.add(f6);
		card2.add(f7);
		card2.add(f8);
		card2.add(f9);
		card2.add(f10);
		card2.add(f11);
		card2.add(f12);

		card2.add(g1);
		card2.add(g2);
		card2.add(g3);
		card2.add(g4);
		card2.add(g5);
		card2.add(g6);
		card2.add(g7);
		card2.add(g8);
		card2.add(g9);
		card2.add(g10);
		card2.add(g11);
		card2.add(g12);

		card2.add(h1);
		card2.add(h2);
		card2.add(h3);
		card2.add(h4);
		card2.add(h5);
		card2.add(h6);
		card2.add(h7);
		card2.add(h8);
		card2.add(h9);
		card2.add(h10);
		card2.add(h11);
		card2.add(h12);

		card2.add(i1);
		card2.add(i2);
		card2.add(i3);
		card2.add(i4);
		card2.add(i5);
		card2.add(i6);
		card2.add(i7);
		card2.add(i8);
		card2.add(i9);
		card2.add(i10);
		card2.add(i11);
		card2.add(i12);

		card2.add(j1);
		card2.add(j2);
		card2.add(j3);
		card2.add(j4);
		card2.add(j5);
		card2.add(j6);
		card2.add(j7);
		card2.add(j8);
		card2.add(j9);
		card2.add(j10);
		card2.add(j11);
		card2.add(j12);

		card2.add(k1);
		card2.add(k2);
		card2.add(k3);
		card2.add(k4);
		card2.add(k5);
		card2.add(k6);
		card2.add(k7);
		card2.add(k8);
		card2.add(k9);
		card2.add(k10);
		card2.add(k11);
		card2.add(k12);

		card2.add(l1);
		card2.add(l2);
		card2.add(l3);
		card2.add(l4);
		card2.add(l5);
		card2.add(l6);
		card2.add(l7);
		card2.add(l8);
		card2.add(l9);
		card2.add(l10);
		card2.add(l11);
		card2.add(l12);

		card2.add(back1B);

		//Card 3, Settings section
		card3 = new JPanel();
		BoxLayout box = new BoxLayout(card3, BoxLayout.Y_AXIS);
		card3.setLayout(box);
		card3.setBorder(new EmptyBorder(new Insets(200, 400, 200, 200)));
		card3.setBackground(Color.gray);
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

		back2B = new JButton("Back to Main Menu");
		//button listener and code to switch stuff
			back2B.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("card1");
				}
			});

		card3.add(settingsLabel);
		card3.add(r1);
		card3.add(r2);
		card3.add(r3);
		card3.add(back2B);
		

		//Card 4, How to play section
		card4 = new JPanel();
		BoxLayout box1 = new BoxLayout(card4, BoxLayout.Y_AXIS);
		card4.setLayout(box1);
		card4.setBorder(new EmptyBorder(new Insets(200, 400, 200, 200)));
		card4.setBackground(Color.gray);
		howPlayL = new JLabel("Fill in how to play stuff here");
		creditsL = new JLabel("Put names and copyright info here");
		back3B = new JButton("Back to main screen");
			//button listener and code to switch stuff
			back3B.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
					switchLayout("card1");
				}
			});

		card4.add(howPlayL);
		card4.add(creditsL);
		card4.add(back3B);



		//setting all cards in the deck
		cardPanel.add(card1, "card1");
		cardPanel.add(card2, "card2");
		cardPanel.add(card3, "card3");
		cardPanel.add(card4, "card4");


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