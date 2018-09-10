package javaapplication14;

import java.awt.Container;
import java.awt.Graphics;

public class MainClass {

 
    public static void main(String[] args) {
        Frame start = new Frame();
        start.setLocation(700, 300);
       // start.setVisible(true);
        
        Snake snake = new Snake();
        
        snake.setLocation(700, 300);
        snake.setVisible(true);
        
  
    }
    
}
