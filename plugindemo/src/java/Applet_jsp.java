/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditya
 */
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet_jsp extends Applet implements ActionListener
{
   public void init()
   {
       setBackground(Color.black);
       Button r = new Button("RED");
       add(r);
       r.addActionListener(this);
       
       Button g = new Button("GREEN");
       add(g);
       g.addActionListener(this);
       
       Button b = new Button("BLUE");
       add(b);
       b.addActionListener(this);
       
   }
   public void actionPerformed(ActionEvent e)
   {
     if(e.getActionCommand().equals("RED"))
      {
        setBackground(Color.red);
      }
      if(e.getActionCommand().equals("BLUE"))
      {
        setBackground(Color.blue);
      }
      if(e.getActionCommand().equals("GREEN"))
      {
        setBackground(Color.green);
      }
   }

}
