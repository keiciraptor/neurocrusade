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
    JLabel mech;
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
        
        playIcon = new ImageIcon("Images/play.png");
        img = new ImageIcon(playIcon.getImage().getScaledInstance(207,64,Image.SCALE_DEFAULT));
        play = new JLabel(img);
        
        mechanicsIcon = new ImageIcon("Images/mech.png");
        img = new ImageIcon(mechanicsIcon.getImage().getScaledInstance(207,64,Image.SCALE_DEFAULT));
        mech = new JLabel(img);
        
        creditsIcon = new ImageIcon("Images/creds.png");
        img = new ImageIcon(creditsIcon.getImage().getScaledInstance(207,64,Image.SCALE_DEFAULT));
        credits = new JLabel(img);
        
        settingsIcon = new ImageIcon("Images/settings.png");
        img = new ImageIcon(settingsIcon.getImage().getScaledInstance(207,64,Image.SCALE_DEFAULT));
        settings = new JLabel(img);
        
        musicIcon = new ImageIcon("Images/music.png");
        img = new ImageIcon(musicIcon.getImage().getScaledInstance(207,64,Image.SCALE_DEFAULT));
        music = new JLabel(img);
        
        frame.setContentPane(new JLabel(gamebgIcon));
        
    }
    
    public void setFrame()
    {
        frame.setLayout(new GraphPaperLayout(new Dimension(24,18)));
        frame.add(play, new Rectangle(2,10,5,2));
        frame.add(mech, new Rectangle(2,13,5,2));
        frame.add(credits, new Rectangle(2,16,5,2));
        frame.add(settings, new Rectangle(14,1,2,2));
        frame.add(music, new Rectangle(16,1,2,2));
        
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(782,695);
        
        play.addMouseListener(this);
    }
    public static void main(String[] args) {
        mainmenu mm = new mainmenu();
        mm.setFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==play)
        {
            game g = new game();
            g.setFrame();
            frame.dispose();
        }
        else if(e.getSource()==credits)
        {
            credits c = new credits();
            c.setFrame();
            frame.dispose();
        }
        else if(e.getSource()==mech)
        {
            mech m = new mech();
            m.setFrame();
            frame.dispose();
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
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
