import javax.swing.JOptionPane;


public class InternalNotas extends javax.swing.JInternalFrame {

  
    public InternalNotas() {
        initComponents();
    }
    Notas Notasfs = new Notas();
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        Taller1 = new javax.swing.JTextField();
        Taller2 = new javax.swing.JTextField();
        Taller3 = new javax.swing.JTextField();
        Taller4 = new javax.swing.JTextField();
        Parcial1 = new javax.swing.JTextField();
        Parcial2 = new javax.swing.JTextField();
        CalcularNotas = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre Completo ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabel2.setText("Taller 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel3.setText("Taller 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jLabel4.setText("Taller 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel5.setText("Taller 4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel6.setText("Parcial");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel7.setText("Parcial 2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });
        getContentPane().add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 120, -1));
        getContentPane().add(Taller1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 57, -1));
        getContentPane().add(Taller2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 57, -1));
        getContentPane().add(Taller3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 57, -1));
        getContentPane().add(Taller4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 57, -1));
        getContentPane().add(Parcial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 57, -1));
        getContentPane().add(Parcial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 57, -1));

        CalcularNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Calculator_31111.png"))); // NOI18N
        CalcularNotas.setText("Calcular");
        CalcularNotas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        CalcularNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CalcularNotasMouseReleased(evt);
            }
        });
        CalcularNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularNotasActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exit.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 113, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularNotasActionPerformed
        Notasfs = new Notas(Nom.getText(),Double.parseDouble(Taller1.getText()),Double.parseDouble(Taller2.getText()),Double.parseDouble(Taller3.getText()),Double.parseDouble(Taller4.getText()),Double.parseDouble(Parcial1.getText()),Double.parseDouble(Parcial2.getText()));
        double Verificacion = Notasfs.getDF();         
        if(Verificacion >= 3.5)
        {
         JOptionPane.showMessageDialog(rootPane, Notasfs.Calcular() + " Pasaste la materia de la mejor forma ");   
        }
        else if(Verificacion >= 2.6)
        {
           JOptionPane.showMessageDialog(rootPane, Notasfs.Calcular() + " estas raspado Xd");   
        }
        else
        {
           JOptionPane.showMessageDialog(rootPane, Notasfs.Calcular() + " Perdiste la materia :c ");  
        }
    }//GEN-LAST:event_CalcularNotasActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void CalcularNotasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcularNotasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CalcularNotasMouseReleased

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularNotas;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Parcial1;
    private javax.swing.JTextField Parcial2;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField Taller1;
    private javax.swing.JTextField Taller2;
    private javax.swing.JTextField Taller3;
    private javax.swing.JTextField Taller4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
