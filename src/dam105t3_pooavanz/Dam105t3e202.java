
package dam105t3_pooavanz;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;


public class Dam105t3e202 extends javax.swing.JFrame {

    static double metrosCaja = 2.5;

    public Dam105t3e202() {
        
        initComponents();
        
        // Config Ventana
        setTitle("Empresa de Suelos");
        setLocationRelativeTo(null);
        
        for (TiposMadera tipMadera : TiposMadera.values()) {
            
            comboxTipoMadera.addItem(tipMadera);
            
        }
        
    }

    // NO MODIFICAR!
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAncho = new javax.swing.JLabel();
        labelAlto = new javax.swing.JLabel();
        labelTipoMadera = new javax.swing.JLabel();
        labelPorCaja = new javax.swing.JLabel();
        labelCantCajas = new javax.swing.JLabel();
        labelPrecioTotal = new javax.swing.JLabel();
        fieldAncho = new javax.swing.JTextField();
        fieldAlto = new javax.swing.JTextField();
        fieldCantCajas = new javax.swing.JTextField();
        fieldPrecioTotal = new javax.swing.JTextField();
        comboxTipoMadera = new javax.swing.JComboBox<>();
        buttonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAncho.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelAncho.setText("Ancho:");

        labelAlto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelAlto.setText("Alto:");

        labelTipoMadera.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTipoMadera.setText("Tipo de madera:");

        labelPorCaja.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPorCaja.setText("Cada caja 2.5 m2");

        labelCantCajas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCantCajas.setText("Cajas a comprar:");

        labelPrecioTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPrecioTotal.setText("Importe a pagar:");

        buttonCalcular.setText("Calcular");
        buttonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAncho)
                    .addComponent(labelPrecioTotal)
                    .addComponent(labelCantCajas)
                    .addComponent(labelPorCaja)
                    .addComponent(labelTipoMadera)
                    .addComponent(labelAlto))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fieldCantCajas)
                    .addComponent(buttonCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldAncho, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldAlto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboxTipoMadera, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fieldPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAncho)
                    .addComponent(fieldAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlto)
                    .addComponent(fieldAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoMadera)
                    .addComponent(comboxTipoMadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPorCaja)
                    .addComponent(buttonCalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCantCajas)
                    .addComponent(fieldCantCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrecioTotal)
                    .addComponent(fieldPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalcularActionPerformed
        
        if (fieldAncho.getText().equals("") || fieldAlto.getText().equals("")) {
            
            JOptionPane.showMessageDialog(this, "Tienes que introducir el Ancho y el Alto");
            
        }
        
        else {
            
            try {
            
                double ancho = Double.parseDouble(fieldAncho.getText());
            
                double alto = Double.parseDouble(fieldAlto.getText());
                
                double m2 = ancho * alto;
                
                
                TiposMadera tipoMade = comboxTipoMadera.getItemAt(comboxTipoMadera.getSelectedIndex());
                
                int precioMad = tipoMade.getPrecio();
                
                
                double cajasConDec = m2 / metrosCaja;
                
                double redondeoCajas = Math.round(cajasConDec);
                
                if (redondeoCajas < cajasConDec) {
                    
                    redondeoCajas++;
                    
                }
                
                fieldCantCajas.setText(String.valueOf(Math.round(redondeoCajas)));
                
                fieldPrecioTotal.setText(String.valueOf(Math.round(redondeoCajas * precioMad)));
            
            } catch (NumberFormatException ex) {
            
                JOptionPane.showMessageDialog(this, "Los datos introducidos tienen que ser valores numéricos!");
            
            }
            
        }
        
    }//GEN-LAST:event_buttonCalcularActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dam105t3e202.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dam105t3e202.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dam105t3e202.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dam105t3e202.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dam105t3e202().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalcular;
    private javax.swing.JComboBox<TiposMadera> comboxTipoMadera;
    private javax.swing.JTextField fieldAlto;
    private javax.swing.JTextField fieldAncho;
    private javax.swing.JTextField fieldCantCajas;
    private javax.swing.JTextField fieldPrecioTotal;
    private javax.swing.JLabel labelAlto;
    private javax.swing.JLabel labelAncho;
    private javax.swing.JLabel labelCantCajas;
    private javax.swing.JLabel labelPorCaja;
    private javax.swing.JLabel labelPrecioTotal;
    private javax.swing.JLabel labelTipoMadera;
    // End of variables declaration//GEN-END:variables
}
