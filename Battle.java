import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

//import jdk.internal.jshell.tool.resources.version;

//import sun.net.www.content.text.plain;

class Battle{
	protected static Icon islandTile;

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

	JLabel m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;
	JLabel n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12;
	JLabel o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12;
	JLabel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;
	JLabel q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12;
	JLabel r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12;
	JLabel s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12;
	JLabel t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;
	JLabel u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12;
	JLabel v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12;
	JLabel w1, w2, w3, w4, w5, w6, w7, w8, w9, w10, w11, w12;
	JLabel x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12;

	JButton newGameB, settingsB, howPlayB, back1B, back2B, back3B;
	JRadioButton radio1, radio2, radio3;
	JLabel mainL, howPlayL, creditsL;

	JPanel card1, card2, card3, card4;
	//using a card panel to quickly switch between GUI's
	JPanel cardPanel = new JPanel(new CardLayout());

	Battle(){

		int [][] bigGrid = new int[12][12];
		for(int i=0;i<5;i++){
			PuzzlePieceGrids.gridInGrid(IslandGen.createIsland(6),bigGrid);
			
		}

		//basic frame details
		JFrame f = new JFrame("Battleship");
		f.setSize(400, 800);
		f.setResizable(false);

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
		final Icon oceanTile = new ImageIcon("ocean.png");
		final Icon islandTile = new ImageIcon("island.png");

//Creation of Labels, need to change how the Tiles are assigned.
		m1 = new JLabel(oceanTile);
		m2 = new JLabel(oceanTile);
		m3 = new JLabel(oceanTile);
		m4 = new JLabel(oceanTile);
		m5 = new JLabel(oceanTile);
		m6 = new JLabel(oceanTile);
		m7 = new JLabel(oceanTile);
		m8 = new JLabel(oceanTile);
		m9 = new JLabel(oceanTile);
		m10 = new JLabel(oceanTile);
		m11 = new JLabel(oceanTile);
		m12 = new JLabel(oceanTile);

		n1 = new JLabel(oceanTile);
		n2 = new JLabel(oceanTile);
		n3 = new JLabel(oceanTile);
		n4 = new JLabel(oceanTile);
		n5 = new JLabel(oceanTile);
		n6 = new JLabel(oceanTile);
		n7 = new JLabel(oceanTile);
		n8 = new JLabel(oceanTile);
		n9 = new JLabel(oceanTile);
		n10 = new JLabel(oceanTile);
		n11 = new JLabel(oceanTile);
		n12 = new JLabel(oceanTile);

		o1 = new JLabel(oceanTile);
		o2 = new JLabel(oceanTile);
		o3 = new JLabel(oceanTile);
		o4 = new JLabel(oceanTile);
		o5 = new JLabel(oceanTile);
		o6 = new JLabel(oceanTile);
		o7 = new JLabel(oceanTile);
		o8 = new JLabel(oceanTile);
		o9 = new JLabel(oceanTile);
		o10 = new JLabel(oceanTile);
		o11 = new JLabel(oceanTile);
		o12 = new JLabel(oceanTile);

		p1 = new JLabel(oceanTile);
		p2 = new JLabel(oceanTile);
		p3 = new JLabel(oceanTile);
		p4 = new JLabel(oceanTile);
		p5 = new JLabel(oceanTile);
		p6 = new JLabel(oceanTile);
		p7 = new JLabel(oceanTile);
		p8 = new JLabel(oceanTile);
		p9 = new JLabel(oceanTile);
		p10 = new JLabel(oceanTile);
		p11 = new JLabel(oceanTile);
		p12 = new JLabel(oceanTile);

		q1 = new JLabel(oceanTile);
		q2 = new JLabel(oceanTile);
		q3 = new JLabel(oceanTile);
		q4 = new JLabel(oceanTile);
		q5 = new JLabel(oceanTile);
		q6 = new JLabel(oceanTile);
		q7 = new JLabel(oceanTile);
		q8 = new JLabel(oceanTile);
		q9 = new JLabel(oceanTile);
		q10 = new JLabel(oceanTile);
		q11 = new JLabel(oceanTile);
		q12 = new JLabel(oceanTile);

		r1 = new JLabel(oceanTile);
		r2 = new JLabel(oceanTile);
		r3 = new JLabel(oceanTile);
		r4 = new JLabel(oceanTile);
		r5 = new JLabel(oceanTile);
		r6 = new JLabel(oceanTile);
		r7 = new JLabel(oceanTile);
		r8 = new JLabel(oceanTile);
		r9 = new JLabel(oceanTile);
		r10 = new JLabel(oceanTile);
		r11 = new JLabel(oceanTile);
		r12 = new JLabel(oceanTile);

		s1 = new JLabel(oceanTile);
		s2 = new JLabel(oceanTile);
		s3 = new JLabel(oceanTile);
		s4 = new JLabel(oceanTile);
		s5 = new JLabel(oceanTile);
		s6 = new JLabel(oceanTile);
		s7 = new JLabel(oceanTile);
		s8 = new JLabel(oceanTile);
		s9 = new JLabel(oceanTile);
		s10 = new JLabel(oceanTile);
		s11 = new JLabel(oceanTile);
		s12 = new JLabel(oceanTile);

		t1 = new JLabel(oceanTile);
		t2 = new JLabel(oceanTile);
		t3 = new JLabel(oceanTile);
		t4 = new JLabel(oceanTile);
		t5 = new JLabel(oceanTile);
		t6 = new JLabel(oceanTile);
		t7 = new JLabel(oceanTile);
		t8 = new JLabel(oceanTile);
		t9 = new JLabel(oceanTile);
		t10 = new JLabel(oceanTile);
		t11 = new JLabel(oceanTile);
		t12 = new JLabel(oceanTile);

		u1 = new JLabel(oceanTile);
		u2 = new JLabel(oceanTile);
		u3 = new JLabel(oceanTile);
		u4 = new JLabel(oceanTile);
		u5 = new JLabel(oceanTile);
		u6 = new JLabel(oceanTile);
		u7 = new JLabel(oceanTile);
		u8 = new JLabel(oceanTile);
		u9 = new JLabel(oceanTile);
		u10 = new JLabel(oceanTile);
		u11 = new JLabel(oceanTile);
		u12 = new JLabel(oceanTile);

		v1 = new JLabel(oceanTile);
		v2 = new JLabel(oceanTile);
		v3 = new JLabel(oceanTile);
		v4 = new JLabel(oceanTile);
		v5 = new JLabel(oceanTile);
		v6 = new JLabel(oceanTile);
		v7 = new JLabel(oceanTile);
		v8 = new JLabel(oceanTile);
		v9 = new JLabel(oceanTile);
		v10 = new JLabel(oceanTile);
		v11 = new JLabel(oceanTile);
		v12 = new JLabel(oceanTile);

		w1 = new JLabel(oceanTile);
		w2 = new JLabel(oceanTile);
		w3 = new JLabel(oceanTile);
		w4 = new JLabel(oceanTile);
		w5 = new JLabel(oceanTile);
		w6 = new JLabel(oceanTile);
		w7 = new JLabel(oceanTile);
		w8 = new JLabel(oceanTile);
		w9 = new JLabel(oceanTile);
		w10 = new JLabel(oceanTile);
		w11 = new JLabel(oceanTile);
		w12 = new JLabel(oceanTile);

		x1 = new JLabel(oceanTile);
		x2 = new JLabel(oceanTile);
		x3 = new JLabel(oceanTile);
		x4 = new JLabel(oceanTile);
		x5 = new JLabel(oceanTile);
		x6 = new JLabel(oceanTile);
		x7 = new JLabel(oceanTile);
		x8 = new JLabel(oceanTile);
		x9 = new JLabel(oceanTile);
		x10 = new JLabel(oceanTile);
		x11 = new JLabel(oceanTile);
		x12 = new JLabel(oceanTile);

		JLabel[] labelArray = new JLabel[]{m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,o1,o2,o3,o4,o5,o6,o7,o8,o9,o10,o11,o12,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11,w12,x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12};


//Creation of Buttons
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
//A Listeners
		a1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a1.setIcon(islandTile);
			}
		});
		a2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a2.setIcon(islandTile);
			}
		});
		a3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a3.setIcon(islandTile);
			}
		});
		a4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a4.setIcon(islandTile);
			}
		});
		a5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a5.setIcon(islandTile);
			}
		});
		a6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a6.setIcon(islandTile);
			}
		});
		a7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a7.setIcon(islandTile);
			}
		});
		a8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a8.setIcon(islandTile);
			}
		});
		a9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a9.setIcon(islandTile);
			}
		});
		a10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a10.setIcon(islandTile);
			}
		});
		a11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a11.setIcon(islandTile);
			}
		});
		a12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				a12.setIcon(islandTile);
			}
		});
//B Listeners
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b1.setIcon(islandTile);
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b2.setIcon(islandTile);
			}
		});
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b3.setIcon(islandTile);
			}
		});
		b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b4.setIcon(islandTile);
			}
		});
		b5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b5.setIcon(islandTile);
			}
		});
		b6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b6.setIcon(islandTile);
			}
		});
		b7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b7.setIcon(islandTile);
			}
		});
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b8.setIcon(islandTile);
			}
		});
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b9.setIcon(islandTile);
			}
		});
		b10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b10.setIcon(islandTile);
			}
		});
		b11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b11.setIcon(islandTile);
			}
		});
		b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				b12.setIcon(islandTile);
			}
		});
//C Listeners
		c1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c1.setIcon(islandTile);
			}
		});
		c2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c2.setIcon(islandTile);
			}
		});
		c3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c3.setIcon(islandTile);
			}
		});
		c4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c4.setIcon(islandTile);
			}
		});
		c5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c5.setIcon(islandTile);
			}
		});
		c6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c6.setIcon(islandTile);
			}
		});
		c7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c7.setIcon(islandTile);
			}
		});
		c8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c8.setIcon(islandTile);
			}
		});
		c9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c9.setIcon(islandTile);
			}
		});
		c10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c10.setIcon(islandTile);
			}
		});
		c11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c11.setIcon(islandTile);
			}
		});
		c12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				c12.setIcon(islandTile);
			}
		});
//D Listeners
		d1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d1.setIcon(islandTile);
			}
		});
		d2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d2.setIcon(islandTile);
			}
		});
		d3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d3.setIcon(islandTile);
			}
		});
		d4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d4.setIcon(islandTile);
			}
		});
		d5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d5.setIcon(islandTile);
			}
		});
		d6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d6.setIcon(islandTile);
			}
		});
		d7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d7.setIcon(islandTile);
			}
		});
		d8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d8.setIcon(islandTile);
			}
		});
		d9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d9.setIcon(islandTile);
			}
		});
		d10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d10.setIcon(islandTile);
			}
		});
		d11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d11.setIcon(islandTile);
			}
		});
		d12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				d12.setIcon(islandTile);
			}
		});
//E Listeners
		e1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e1.setIcon(islandTile);
			}
		});
		e2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e2.setIcon(islandTile);
			}
		});
		e3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e3.setIcon(islandTile);
			}
		});
		e4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e4.setIcon(islandTile);
			}
		});
		e5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e5.setIcon(islandTile);
			}
		});
		e6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e6.setIcon(islandTile);
			}
		});
		e7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e7.setIcon(islandTile);
			}
		});
		e8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e8.setIcon(islandTile);
			}
		});
		e9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e9.setIcon(islandTile);
			}
		});
		e10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e10.setIcon(islandTile);
			}
		});
		e11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e11.setIcon(islandTile);
			}
		});
		e12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				e12.setIcon(islandTile);
			}
		});
//F Listeners
		f1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f1.setIcon(islandTile);
			}
		});
		f2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f2.setIcon(islandTile);
			}
		});
		f3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f3.setIcon(islandTile);
			}
		});
		f4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f4.setIcon(islandTile);
			}
		});
		f5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f5.setIcon(islandTile);
			}
		});
		f6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f6.setIcon(islandTile);
			}
		});
		f7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f7.setIcon(islandTile);
			}
		});
		f8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f8.setIcon(islandTile);
			}
		});
		f9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f9.setIcon(islandTile);
			}
		});
		f10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f10.setIcon(islandTile);
			}
		});
		f11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f11.setIcon(islandTile);
			}
		});
		f12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				f12.setIcon(islandTile);
			}
		});
//G Listeners
		g1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g1.setIcon(islandTile);
			}
		});
		g2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g2.setIcon(islandTile);
			}
		});
		g3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g3.setIcon(islandTile);
			}
		});
		g4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g4.setIcon(islandTile);
			}
		});
		g5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g5.setIcon(islandTile);
			}
		});
		g6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g6.setIcon(islandTile);
			}
		});
		g7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g7.setIcon(islandTile);
			}
		});
		g8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g8.setIcon(islandTile);
			}
		});
		g9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g9.setIcon(islandTile);
			}
		});
		g10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g10.setIcon(islandTile);
			}
		});
		g11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g11.setIcon(islandTile);
			}
		});
		g12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				g12.setIcon(islandTile);
			}
		});
//H Listeners
		h1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h1.setIcon(islandTile);
			}
		});
		h2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h2.setIcon(islandTile);
			}
		});
		h3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h3.setIcon(islandTile);
			}
		});
		h4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h4.setIcon(islandTile);
			}
		});
		h5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h5.setIcon(islandTile);
			}
		});
		h6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h6.setIcon(islandTile);
			}
		});
		h7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h7.setIcon(islandTile);
			}
		});
		h8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h8.setIcon(islandTile);
			}
		});
		h9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h9.setIcon(islandTile);
			}
		});
		h10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h10.setIcon(islandTile);
			}
		});
		h11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h11.setIcon(islandTile);
			}
		});
		h12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				h12.setIcon(islandTile);
			}
		});
//I Listeners
		i1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i1.setIcon(islandTile);
			}
		});
		i2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i2.setIcon(islandTile);
			}
		});
		i3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i3.setIcon(islandTile);
			}
		});
		i4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i4.setIcon(islandTile);
			}
		});
		i5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i5.setIcon(islandTile);
			}
		});
		i6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i6.setIcon(islandTile);
			}
		});
		i7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i7.setIcon(islandTile);
			}
		});
		i8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i8.setIcon(islandTile);
			}
		});
		i9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i9.setIcon(islandTile);
			}
		});
		i10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i10.setIcon(islandTile);
			}
		});
		i11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i11.setIcon(islandTile);
			}
		});
		i12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				i12.setIcon(islandTile);
			}
		});
//J Listeners
		j1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j1.setIcon(islandTile);
			}
		});
		j2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j2.setIcon(islandTile);
			}
		});
		j3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j3.setIcon(islandTile);
			}
		});
		j4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j4.setIcon(islandTile);
			}
		});
		j5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j5.setIcon(islandTile);
			}
		});
		j6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j6.setIcon(islandTile);
			}
		});
		j7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j7.setIcon(islandTile);
			}
		});
		j8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j8.setIcon(islandTile);
			}
		});
		j9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j9.setIcon(islandTile);
			}
		});
		j10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j10.setIcon(islandTile);
			}
		});
		j11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j11.setIcon(islandTile);
			}
		});
		j12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				j12.setIcon(islandTile);
			}
		});
//K Listeners
		k1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k1.setIcon(islandTile);
			}
		});
		k2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k2.setIcon(islandTile);
			}
		});
		k3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k3.setIcon(islandTile);
			}
		});
		k4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k4.setIcon(islandTile);
			}
		});
		k5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k5.setIcon(islandTile);
			}
		});
		k6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k6.setIcon(islandTile);
			}
		});
		k7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k7.setIcon(islandTile);
			}
		});
		k8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k8.setIcon(islandTile);
			}
		});
		k9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k9.setIcon(islandTile);
			}
		});
		k10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k10.setIcon(islandTile);
			}
		});
		k11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k11.setIcon(islandTile);
			}
		});
		k12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				k12.setIcon(islandTile);
			}
		});
//L Listeners
		l1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l1.setIcon(islandTile);
			}
		});
		l2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l2.setIcon(islandTile);
			}
		});
		l3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l3.setIcon(islandTile);
			}
		});
		l4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l4.setIcon(islandTile);
			}
		});
		l5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l5.setIcon(islandTile);
			}
		});
		l6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l6.setIcon(islandTile);
			}
		});
		l7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l7.setIcon(islandTile);
			}
		});
		l8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l8.setIcon(islandTile);
			}
		});
		l9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l9.setIcon(islandTile);
			}
		});
		l10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l10.setIcon(islandTile);
			}
		});
		l11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l11.setIcon(islandTile);
			}
		});
		l12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				l12.setIcon(islandTile);
			}
		});

//Adds the buttons at the top
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

//These add the label tiles to the bottom of the jframe
		card2.add(m1);
		card2.add(m2);
		card2.add(m3);
		card2.add(m4);
		card2.add(m5);
		card2.add(m6);
		card2.add(m7);
		card2.add(m8);
		card2.add(m9);
		card2.add(m10);
		card2.add(m11);
		card2.add(m12);

		card2.add(n1);
		card2.add(n2);
		card2.add(n3);
		card2.add(n4);
		card2.add(n5);
		card2.add(n6);
		card2.add(n7);
		card2.add(n8);
		card2.add(n9);
		card2.add(n10);
		card2.add(n11);
		card2.add(n12);

		card2.add(o1);
		card2.add(o2);
		card2.add(o3);
		card2.add(o4);
		card2.add(o5);
		card2.add(o6);
		card2.add(o7);
		card2.add(o8);
		card2.add(o9);
		card2.add(o10);
		card2.add(o11);
		card2.add(o12);

		card2.add(p1);
		card2.add(p2);
		card2.add(p3);
		card2.add(p4);
		card2.add(p5);
		card2.add(p6);
		card2.add(p7);
		card2.add(p8);
		card2.add(p9);
		card2.add(p10);
		card2.add(p11);
		card2.add(p12);

		card2.add(q1);
		card2.add(q2);
		card2.add(q3);
		card2.add(q4);
		card2.add(q5);
		card2.add(q6);
		card2.add(q7);
		card2.add(q8);
		card2.add(q9);
		card2.add(q10);
		card2.add(q11);
		card2.add(q12);

		card2.add(r1);
		card2.add(r2);
		card2.add(r3);
		card2.add(r4);
		card2.add(r5);
		card2.add(r6);
		card2.add(r7);
		card2.add(r8);
		card2.add(r9);
		card2.add(r10);
		card2.add(r11);
		card2.add(r12);

		card2.add(s1);
		card2.add(s2);
		card2.add(s3);
		card2.add(s4);
		card2.add(s5);
		card2.add(s6);
		card2.add(s7);
		card2.add(s8);
		card2.add(s9);
		card2.add(s10);
		card2.add(s11);
		card2.add(s12);

		card2.add(t1);
		card2.add(t2);
		card2.add(t3);
		card2.add(t4);
		card2.add(t5);
		card2.add(t6);
		card2.add(t7);
		card2.add(t8);
		card2.add(t9);
		card2.add(t10);
		card2.add(t11);
		card2.add(t12);

		card2.add(u1);
		card2.add(u2);
		card2.add(u3);
		card2.add(u4);
		card2.add(u5);
		card2.add(u6);
		card2.add(u7);
		card2.add(u8);
		card2.add(u9);
		card2.add(u10);
		card2.add(u11);
		card2.add(u12);

		card2.add(v1);
		card2.add(v2);
		card2.add(v3);
		card2.add(v4);
		card2.add(v5);
		card2.add(v6);
		card2.add(v7);
		card2.add(v8);
		card2.add(v9);
		card2.add(v10);
		card2.add(v11);
		card2.add(v12);

		card2.add(w1);
		card2.add(w2);
		card2.add(w3);
		card2.add(w4);
		card2.add(w5);
		card2.add(w6);
		card2.add(w7);
		card2.add(w8);
		card2.add(w9);
		card2.add(w10);
		card2.add(w11);
		card2.add(w12);

		card2.add(x1);
		card2.add(x2);
		card2.add(x3);
		card2.add(x4);
		card2.add(x5);
		card2.add(x6);
		card2.add(x7);
		card2.add(x8);
		card2.add(x9);
		card2.add(x10);
		card2.add(x11);
		card2.add(x12);

		//card2.add(back1B);
		//grid layout height by width
		card2.setLayout(new GridLayout(24,12));

		//Card 3, Settings section
		card3 = new JPanel();
		BoxLayout box = new BoxLayout(card3, BoxLayout.Y_AXIS);
		card3.setLayout(box);
		card3.setBorder(new EmptyBorder(new Insets(200, 400, 200, 200)));
		card3.setBackground(Color.gray);
		JLabel settingsLabel = new JLabel("These buttons are to change the size of the overall grid, the default is 7 x 7");
		radio1 = new JRadioButton("10 x 10 grid");
		radio1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Map.row = 10;
				Map.column = 10;
			}
		});
		radio2 = new JRadioButton("15 x 15 grid");
		radio2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				Map.row = 15;
				Map.column = 15;	
			}
		});
		radio3 = new JRadioButton("20 x 20 grid");
		radio3.addActionListener(new ActionListener(){
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

		int temp = 0;
		for(int i=0; i<12; i++){
			for(int j=0; j<12; j++){
				temp++;
				if(bigGrid[i][j] == 2){
					labelArray[temp].setIcon(islandTile);
				}
			}
		}


		//add main panel to the screen frame
		f.add(cardPanel);
		f.setVisible(true);



	}

	private void switchLayout(String newLayout){
		CardLayout c = (CardLayout)(cardPanel.getLayout());
		c.show(cardPanel, newLayout);
	}

	/*
	public static void labelFill(int[][] bigGrid,Icon islandTile, JLabel[] labelArray){
		int temp = 0;
		for(int i=0; i<12; i++){
			for(int j=0; j<12; j++){
				temp++;
				if(bigGrid[i][j] == 2){
					labelArray[temp].setIcon(islandTile);
				}
			}
		}
	}
	*/
	public static void main(String[] args){
		//PuzzlePieceGrids.printGrid(bigGrid);

		SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			new Battle();
			}
		});
	}
}