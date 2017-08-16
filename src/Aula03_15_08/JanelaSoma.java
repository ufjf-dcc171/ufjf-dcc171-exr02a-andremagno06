/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03_15_08;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
class JanelaSoma extends JFrame{
    private final JLabel iblNumero1;
    private final JLabel iblNumero2;
    private final JLabel iblNumero3;
    private final JTextField txtNumero1;
    private final JTextField txtNumero2;
    
    private int n1;
    private int n2;
    
    
    
    public JanelaSoma() throws HeadlessException{
       super("Soma");
       
       setLayout(new FlowLayout(FlowLayout.CENTER));
       
       iblNumero1 = new JLabel("Numero1");
       txtNumero1 = new JTextField(15);
       add(iblNumero1);
       add(txtNumero1);
        
       iblNumero2 = new JLabel("Numero1");
       txtNumero2 = new JTextField(15);
       add(iblNumero2);
       add(txtNumero2);
       iblNumero3 = new JLabel("");
       add(iblNumero3);
       
       
       txtNumero1.addActionListener(new Numero1Enter());
       txtNumero2.addActionListener(new Numero2Enter());
       
      
       
       
    }

    private  class Numero2Enter implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            n2 = Integer.parseInt(txtNumero2.getText());
            iblNumero3.setText(Integer.toString(n1+n2));
            
        }
    }

    private class Numero1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
         
        n1 = Integer.parseInt(txtNumero1.getText());
        txtNumero2.requestFocus();
        }
    }
    
}
