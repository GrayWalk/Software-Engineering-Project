import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
	
	//needs to be declared outside framclass so actionPerformed has access to it
    JButton newGameB;
    JButton AIDiffB;
    JButton instructionsB;
	JLabel l;
   
    Menu(){
		//creates new game button
		newGameB = new JButton("New Game");
		newGameB.setBounds(65,100,100,50);
        newGameB.addActionListener(this); //links the event listener to the button.
        //creates AI difficulty selector button
        AIDiffB = new JButton("CPU Difficulty");
        AIDiffB.setBounds(200,100,100,50);
        //creates instructions button
        instructionsB = new JButton("How to play");
        instructionsB.setBounds(325,100,100,50);
	
        this.setTitle("Battleship Menu"); //sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit when x is pressed
        this.setResizable(false); //prevent resize
		this.setLayout(null);
        this.setSize(500,500); //set x and y dimension of frame
        this.setVisible(true); //make frame visible

        //Adds elements to frame
        this.add(newGameB);
        this.add(AIDiffB);
        this.add(instructionsB);

        //ImageIcon image = new ImageIcon("logo.png"); //create image icon
        //this.setIconImage(image.getImage()); //change icon of frame
        //I will add a cool icon I found so that we can replace the dumb java logo at the top of the window
        
        this.getContentPane().setBackground(new Color(95,153,110)); //change background color
    }
	
	//listens for actions
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==newGameB){
			new NewGame();
		}
	}
}