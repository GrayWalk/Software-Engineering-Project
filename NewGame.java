import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewGame extends JFrame{
	NewGame(){
		//create top panel
		JPanel markerPanel = new JPanel();
		markerPanel.setBackground(Color.blue);
		markerPanel.setBounds(0,0,400,400);
		//create bottom panel
		JPanel playerPanel = new JPanel();
		playerPanel.setBackground(Color.red);
		playerPanel.setBounds(0,400,400,400);
		
		JLabel topText = new JLabel("Mark guesses here");
		topText.setForeground(Color.WHITE);
		JLabel botText = new JLabel("Your islands appear here");
	
	    this.setTitle("New Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
		this.setLayout(null);
        this.setSize(400,839);
        this.setVisible(true);
		this.add(markerPanel);
		this.add(playerPanel);
		markerPanel.add(topText);
		playerPanel.add(botText);
	}
}