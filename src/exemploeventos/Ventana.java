/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploeventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author otorradomiguez
 */
public class Ventana extends JFrame implements ActionListener {
    
    JPanel panel;
    JLabel etiqueta;
    JTextField lineaTexto;
    JButton botonPreme,botonLimpiar;
    
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
        botonPreme.addActionListener(this);
        botonLimpiar.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
      
    @Override
    public void actionPerformed(ActionEvent e){
        /*
        con e.getSource nos devuelve el objeto que llamó al ActionEvent,
        lo que nos permite establecer diferentes comportamientos para
        el metodo actionPerformed, dependiendo del objeto que lo haya llamado,
        en este caso, si es botonPreme o botonLimpiar.
        */
        if(e.getSource()==botonPreme){
        /*
        String texto = lineaTexto.getText();
        etiqueta.setText(texto);
        */
        //En una linea
        etiqueta.setText(lineaTexto.getText());
        }
        else if(e.getSource()==botonLimpiar){
            lineaTexto.setText("");
            etiqueta.setText("");
        }
    }
}
