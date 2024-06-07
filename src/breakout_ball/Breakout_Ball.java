/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout_ball;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class Breakout_Ball {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Gameplay gamePlay = new Gameplay();

        frame.setBounds(200, 100, 700, 600);
        frame.setTitle("Breakout Ball");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(gamePlay);
        frame.setVisible(true);

    }

}
