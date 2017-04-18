/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploeventos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author otorradomiguez
 */
public class Ventana extends JFrame{
    
    JPanel panel;
    JLabel etiqueta;
    public JTextField lineaTexto;
    public JButton botonPreme,botonLimpiar;
    
    public void crearVentana(){
        panel = new JPanel();
        etiqueta = new JLabel();
        lineaTexto = new JTextField("Eventos");
        botonPreme = new JButton("Preme");
        botonLimpiar = new JButton("Limpiar");
        this.setSize(400,400);
        panel.setSize(400,400);
        lineaTexto.setColumns(10);
        panel.add(botonPreme);
        panel.add(botonLimpiar);
        panel.add(lineaTexto);
        panel.add(etiqueta);
        this.add(panel);
        botonPreme.addActionListener(new Evento());
        botonLimpiar.addActionListener(new Evento());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    } 
    
}
