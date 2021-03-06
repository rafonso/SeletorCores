/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ColorDescriptionPanel.java
 *
 * Created on 08/06/2009, 22:37:05
 */

package seletorcores;

/**
 *
 * @author rafael
 */
public class ColorDescriptionPanel extends javax.swing.JPanel {

    private static String COLOR_SIMPLE_FORMAT = "RGB(%d, %d, %d)";
    private static String COLOR_HEXA_FORMAT = "#%02X%02X%02X";
    private static String COLOR_PERCENT_FORMAT = "RGB(%d%%, %d%%, %d%%)";

    /** Creates new form ColorDescriptionPanel */
    public ColorDescriptionPanel() {
        initComponents();
    }

    public ColorDescriptionPanel(java.awt.Color c) {
        this();
        this.txfDecimal.setText(String.format(COLOR_SIMPLE_FORMAT, c.getRed(), c.getGreen(), c.getBlue()));
        this.txfHexadecimal.setText(String.format(COLOR_HEXA_FORMAT, c.getRed(), c.getGreen(), c.getBlue()));
        // Percentual
        int rPercent = (int) (100 * c.getRed() / 255.0);
        int gPercent = (int) (100 * c.getGreen() / 255.0);
        int bPercent = (int) (100 * c.getBlue() / 255.0);
        this.txfPercentual.setText(String.format(COLOR_PERCENT_FORMAT, rPercent, gPercent, bPercent));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDecimal = new javax.swing.JLabel();
        lblHexadecimal = new javax.swing.JLabel();
        lblPercentual = new javax.swing.JLabel();
        txfDecimal = new javax.swing.JTextField();
        txfHexadecimal = new javax.swing.JTextField();
        txfPercentual = new javax.swing.JTextField();

        lblDecimal.setText("Decimal");

        lblHexadecimal.setText("Hexadecimal");

        lblPercentual.setText("Percentual");

        txfDecimal.setEditable(false);
        txfDecimal.setText("RGB(000, 000, 000)");

        txfHexadecimal.setEditable(false);
        txfHexadecimal.setText("#FFFFFF");

        txfPercentual.setEditable(false);
        txfPercentual.setText("RGB(00%, 00%, 00%)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPercentual)
                    .addComponent(lblHexadecimal)
                    .addComponent(lblDecimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(txfPercentual, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(txfHexadecimal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDecimal)
                    .addComponent(txfDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHexadecimal)
                    .addComponent(txfHexadecimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPercentual)
                    .addComponent(txfPercentual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDecimal;
    private javax.swing.JLabel lblHexadecimal;
    private javax.swing.JLabel lblPercentual;
    private javax.swing.JTextField txfDecimal;
    private javax.swing.JTextField txfHexadecimal;
    private javax.swing.JTextField txfPercentual;
    // End of variables declaration//GEN-END:variables

}
