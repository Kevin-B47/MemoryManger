package memmanager;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JLabel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class ProgBlock extends javax.swing.JPanel { // This class makes it so much easier to keep track of all panels and info thats stored
    private String name = "OverrideMe";
    private double sizeY = 0;
    private double sizeX = 0;
    private double mem = 0;
    private javax.swing.JPanel parent = null;
    private javax.swing.JLabel lbl = null;
    private javax.swing.JLabel memlbl = null;
    private Font robo = new Font("Roboto", Font.BOLD,10);
    
    public ProgBlock(javax.swing.JPanel parent,int localX, int localY, int x, double y, String name, Color newColor, double mem){
        setLayout(new BorderLayout());
        this.name = name; // vars
        sizeY = y;
        sizeX = x;
        this.parent = parent;
        this.mem = mem; 
        
        setBounds(localX, localY, x, (int)y); // comp
        setVisible(true);
        parent.add(this);
        setBackground(newColor);
        
        lbl = new javax.swing.JLabel(name+" ("+mem+"k)"); // name
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setVerticalAlignment(JLabel.CENTER);
        lbl.setFont(robo);
        lbl.setForeground(new Color(255,255,255));
        add(lbl, BorderLayout.CENTER);
        
        parent.getParent().repaint();
    }
    
    
    public String GetName(){
        return name;
    }
    
    public void SetName(String name){
        this.name = name;
    }
    
    public double GetMem(){
        return mem;
    }
    
    public javax.swing.JPanel ReturnParent(){
        return parent;
    }
    
    public void setProgSize(int y){ // Only the y will ever change
        setSize(getWidth(), y);
    }
    
    public double getSizeY(){
        return sizeY;
    }
    
}
