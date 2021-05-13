/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVP.Inventario;

import MVP.Inventario.product.ProductFrame;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Dionicio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new ProductFrame(); // GUI gui = new GUI() as well
                // default value JFrame.HIDE_ON_CLOSE
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        
        
    }

}
