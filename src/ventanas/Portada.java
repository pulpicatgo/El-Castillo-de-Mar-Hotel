
package ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Portada extends JPanel{
    private Image fondo;
    @Override
    public void paint(Graphics g){
    super.paint(g);
 
   
    //this.setLocationRelativeTo(null);
    //estableciendo color de las letras
    g.setColor(Color.black);
    //establezco la fuente que quiero con la clase font
    Font fuente =new Font("Arial",Font.PLAIN,20 );
    g.setFont(fuente);//coordenadas x,y
   // Dimension dimension = this.getSize();
    ImageIcon icon = new ImageIcon(getClass().getResource("/ElCastillo/uaa.png"));
    g.drawImage(icon.getImage(), 150, 25, null);
    g.drawString("UNIVERSIDAD AUTONOMA DE AGUASCALIENTES",50,260);
    g.drawImage(fondo, 50, 25, this);
    g.drawString("CENTRO DE CIENCIAS BASICAS",50,278);
    g.drawString("ING. sistemas computacionales",50,300);
    g.drawString("Programacion lll",50,325);
    g.drawString("Profesora: Georgina Salazar Partida",50,350);
    g.drawString("Aumnos:                4B",50,400);
    g.drawString("Angel Daniel Medina Juarez  ID.256387",50,425);
    g.drawString("Ruben Ivan Lopez Guevara    ID.253858",50,450);
    g.drawString("Regina Hernadnez Juarez     ID.259328",50,475);
    }
    //creamos la platillade la aplicaion usando graphics
    public static void main(String[] args) {
        
        JFrame ventana =new JFrame("Portada");
        Portada objeto=new Portada();
       
        ventana.add(objeto);
        ventana.setSize(700,700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tipografia directa
        
                
    }

}
