/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seletorcores;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JApplet;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author rafael
 */
public class SeletorApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded
     * into the browser.
     */
    public void init() {
        try {
            super.add(new SeletorCores3());
            super.setSize(1041, 800);
            String nativeLF = UIManager.getSystemLookAndFeelClassName();
            UIManager.setLookAndFeel(nativeLF);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SeletorApplet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SeletorApplet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SeletorApplet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SeletorApplet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // TODO overwrite start(), stop() and destroy() methods
}
