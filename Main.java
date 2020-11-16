import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame{
	static JFrame f;

	static JButton b, b1, b2;

	static JLabel l;

	public static void main(String[] args){
		f = new JFrame("Battleship");
		l = new JLabel("Panel lable");
		b = new JButton("New Game");
		b1 = new JButton("AI Difficulty");
		b2 = new JButton("How to Play");

		JPanel p = new JPanel();

		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(l);

		p.setBackground(Color.blue);

		f.add(p);
		f.setSize(500, 300);
		f.show();
	}
}