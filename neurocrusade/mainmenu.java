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

public class mainmenu implements ActionListener{
    JFrame frame;
    JButton play;
    JButton mechanics;
    JButton credits;
    
    public mainmenu()
    {
        frame = new JFrame("NeuroCrusade");
        play = new JButton("Play");
        mechanics = new JButton("Mechanics");
        credits = new JButton("Credits");
    }
}
