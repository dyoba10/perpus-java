/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appperpusse03;

import com.jtattoo.plaf.AbstractLookAndFeel;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import form.Login;
import form.MenuUtama;
import javax.swing.UIManager;

/**
 *
 * @author Gen-Xander
 */
public class AppPerpusSE03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
           // UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            // UIManager.setLookAndFeel("com.jtattoo.plaf.abstract.AbstractLookAndFeel");
             UIManager.setLookAndFeel(new BernsteinLookAndFeel());
           Login log = new Login();
        log.setVisible(true); 
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
    
}
