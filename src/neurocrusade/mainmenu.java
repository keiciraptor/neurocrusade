/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neurocrusade;

/**
 *
 * @author Kei Pasaol
 * @author KJ Ares
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainmenu implements MouseListener{
    JFrame frame;
    JLabel play;
    ImageIcon playIcon;
    JLabel mechanics;
    ImageIcon mechanicsIcon;
    JLabel credits;
    ImageIcon creditsIcon;
    JLabel settings; 
    ImageIcon settingsIcon;
    JLabel music;
    ImageIcon musicIcon;
    ImageIcon gamebgIcon;
    ImageIcon img;
    //place all other elements in the background too, yuh
    //PlaySound click;
    public mainmenu()
    {
        //click = newPlaySound();
        
        frame = new JFrame("NeuroCrusade");
        
        gamebgIcon = new ImageIcon("Images/mainmenu.png");
        //set
        playIcon = new ImageIcon("Images/play.png");
        //set
        mechanicsIcon = new ImageIcon("Images/mech.png");
        //set
        creditsIcon = new ImageIcon("Images/creds.png");
        //set
        settingsIcon = new ImageIcon("Images/settings.png");
        //set
        musicIcon = new ImageIcon("Images/music.png");
        //set
        
    }
    
    public void setFrame()
    {
        frame.setLayout(new GraphPaperLayout(new Dimension(27,18)));
       
    }
}
