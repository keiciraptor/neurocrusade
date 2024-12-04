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
    ImageIcon newplayIcon;
    JLabel mechanics;
    ImageIcon newmechanicsIcon;
    JLabel credits;
    ImageIcon newcreditsIcon;
    JLabel settings; 
    ImageIcon settingsIcon;
    JLabel music;
    ImageIcon musicIcon;
    //place all other elements in the background too, yuh
    //PlaySound click;
    public mainmenu()
    {
        //click = newPlaySound();
        
        frame = new JFrame("NeuroCrusade");
        
        
    }
    
    public void setFrame()
    {
        frame.setLayout(new GraphPaperLayout(new Dimension(27,18)));
       
    }
}
