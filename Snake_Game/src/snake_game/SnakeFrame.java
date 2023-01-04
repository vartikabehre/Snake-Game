/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snake_game;

import javax.swing.JFrame;

/**
 *
 * @author SONAM
 */
public class SnakeFrame  extends  JFrame{
      SnakeFrame(){
        this.add(new SnakePanel());
        this.setTitle("Snake");
        this.setResizable(false);
        this.setVisible(true);
        this.pack();

      }

     public static void main(String[] args) {
     new SnakeFrame();
     
    }

}
