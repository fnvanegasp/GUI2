/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
/**
 *
 * @author Estudiante
 */
public class TestPaintComponent extends JFrame{
    public TestPaintComponent(){
        add(new NewPanel());
    }
    
public static void main(String[] args){
    TestPaintComponent frame = new TestPaintComponent();
    frame.setTitle("Test");
    frame.setSize(250,400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}



class NewPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawLine(120,145, 80, 185);
        g.drawLine(40,145, 80, 185);
        g.drawLine(120,145, 120, 235);
        g.drawLine(120,145, 140, 195);
        g.drawLine(100,215, 140, 195);
        g.drawLine(120,235, 100, 255);
        g.drawLine(80,275, 100, 255);
        g.drawLine(120,235, 160, 255);
        g.drawLine(140,275, 160, 255);
                
        g.drawRect(100, 100, 40, 40);
        
        g.setColor(Color.red);
        g.fillOval(100, 100, 40, 40); //CABEZA
        g.setColor(Color.green);
        g.fillRect(110, 140, 20, 10); //CUELLO
        g.setColor(Color.green);
        g.fillRect(70, 180, 20, 10); //CODO IZQ
        g.setColor(Color.green);
        g.fillRect(30, 140, 20, 10); //MANO IZQ
        g.setColor(Color.green);
        g.fillRect(130, 190, 20, 10); //CODO DER
        g.setColor(Color.green);
        g.fillRect(90, 210, 20, 10); //MANO DER
        g.setColor(Color.green);
        g.fillRect(110, 230, 20, 10); //CADERA
        g.setColor(Color.green);
        g.fillRect(150, 250, 20, 10); //RODILLA DER
        g.setColor(Color.green);
        g.fillRect(130, 270, 20, 10); //PIE DER
        g.setColor(Color.green);
        g.fillRect(90, 250, 20, 10); //RODILLA IZQ
        g.setColor(Color.green);
        g.fillRect(70, 270, 20, 10); //PIE IZQ
    }
}