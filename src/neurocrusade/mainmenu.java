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

 @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == newmechanicsIcon){
            frame.dispose();
            mechanics la = new mechanics();
            la.setFrame();
        }
        
        else if (e.getSource() == newcreditsIcon){
            frame.dispose();
            credits cl = credits();
            cl.setFrame();
        }
        
        else if (e.getSource() == newplayIcon){
            frame.dispose();
            play ng = play();
            ng.setFrame();
        }
        
        else if (e.getSource() == settingsIcon){
            settings st = settings();
            st.setFrame();
        }
        
        else if (e.getSource() == musicIcon){
            click.mute(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }
}
