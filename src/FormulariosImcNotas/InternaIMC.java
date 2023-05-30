import javax.swing.JOptionPane;

public class InternaIMC extends javax.swing.JInternalFrame {

    
    public InternaIMC() {
        initComponents();
      
    }
    IMC nuevo = new IMC();
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TiTxr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EdadText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PesoText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EstaturaText = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(500, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Indice de Masa Corporal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));
        getContentPane().add(TxtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, -1));

        jLabel3.setText("Documento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        TiTxr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiTxrActionPerformed(evt);
            }
        });
        getContentPane().add(TiTxr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 110, -1));

        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        EdadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadTextActionPerformed(evt);
            }
        });
        getContentPane().add(EdadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 70, -1));

        jLabel5.setText("Peso");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 20));

        PesoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoTextActionPerformed(evt);
            }
        });
        getContentPane().add(PesoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 70, -1));

        jLabel6.setText("Estatura");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, 20));
        getContentPane().add(EstaturaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 70, -1));

        Calcular.setText("Imprimir");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 50));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, 30));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 80, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TiTxrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiTxrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiTxrActionPerformed

    private void PesoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoTextActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void EdadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdadTextActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
      Double Altura =(Double.parseDouble(EstaturaText.getText()));
        Double peso =(Double.parseDouble(PesoText.getText()));
        nuevo.setAltura(Altura);
        nuevo.setPeso(peso);
        JOptionPane.showMessageDialog(null,nuevo.Calcular());
        
    }//GEN-LAST:event_CalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField EdadText;
    private javax.swing.JTextField EstaturaText;
    private javax.swing.JTextField PesoText;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField TiTxr;
    private javax.swing.JTextField TxtNom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
