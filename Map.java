import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Map {
    public static int row = 7;
    public static int column = 7;
    public static BufferedImage [][] images;

    public static void initializeImages(){
        images = new BufferedImage[row][column];
    }

    //inspiration for map loading images method from CS 1410 Tower Defense project
    public static void addSingleImage(int r, int c, String file){
        if(r >= row || r < 0){
            System.err.println("Invalid row value");
        } else if(c >= column || c < 0){
            System.err.println("Invalid column value");
        }

        try{
            images[r][c] = ImageIO.read(new File(file));
        } catch(IOException fnf){
            System.err.println("File not Found");
        }

    }

	public static void createMap(Graphics img) {
        for(int r = 0; r < row; r++){
            for(int c = 0; c < column; c++){
                img.drawImage(images[r][c], 64, 64, null);
            }
        }
    }
    
    public static void randomizeMap(){
        for(int r = 0; r < row; r++){
            for(int c = 0; c < column; c++){
                int max = 2;
                int min = 1;
                int random = (int)Math.random() * (max - min + 1) + min;
                if(random == 1){
                    addSingleImage(r, c, "ocean.png");
                } else {
                    addSingleImage(r, c, "islang.png");
                }
            }
        }
    }



}