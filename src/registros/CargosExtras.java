
package registros;


public class CargosExtras extends javax.swing.JFrame {

    int carBar,carSpa,carTintoreria,carServicio,carNiñera;
    int auxBar=0,auxSpa=0,auxTintoreria=0,auxServicio=0,auxNiñera=0,subTotal=0;
    int subBar=110,subSpa=250,subTintoreria=120,subServicio=20,subNiñera=300;
    Altas Altas= new Altas();
    int vecDispPiso1[]= new int[15];
    int vecDispPiso2[]= new int[15];
    int auxhab, auxpiso;
    
    public CargosExtras() {
        initComponents();
        
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSpa = new javax.swing.JButton();
        jTextFieldBar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonBar = new javax.swing.JButton();
        jButtonTintoreria = new javax.swing.JButton();
        jButtonServicioCuarto = new javax.swing.JButton();
        jButtonNiñera = new javax.swing.JButton();
        jTextFieldNiñera = new javax.swing.JTextField();
        jTextFieldSpa = new javax.swing.JTextField();
        jTextFieldTintoreria = new javax.swing.JTextField();
        jTextFieldServicio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonCargar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSpa.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSpa.setForeground(new java.awt.Color(204, 204, 255));
        jButtonSpa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconospa.jpg"))); // NOI18N
        jButtonSpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 69, -1));

        jTextFieldBar.setEditable(false);
        jTextFieldBar.setText("$110");
        jPanel1.add(jTextFieldBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 125, -1));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargos Extra (Da clic en los servicios que desees cargar a tu cuenta)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 25));

        jButtonBar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonBar.setForeground(new java.awt.Color(204, 204, 255));
        jButtonBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconobar.png"))); // NOI18N
        jButtonBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 69, -1));

        jButtonTintoreria.setBackground(new java.awt.Color(204, 204, 255));
        jButtonTintoreria.setForeground(new java.awt.Color(204, 204, 255));
        jButtonTintoreria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconotintoreria.jpg"))); // NOI18N
        jButtonTintoreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTintoreriaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTintoreria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 42));

        jButtonServicioCuarto.setBackground(new java.awt.Color(204, 204, 255));
        jButtonServicioCuarto.setForeground(new java.awt.Color(204, 204, 255));
        jButtonServicioCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoservicio.png"))); // NOI18N
        jButtonServicioCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicioCuartoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonServicioCuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 70, 43));

        jButtonNiñera.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNiñera.setForeground(new java.awt.Color(204, 204, 255));
        jButtonNiñera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icononiñera.jpg"))); // NOI18N
        jButtonNiñera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNiñeraActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNiñera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 70, -1));

        jTextFieldNiñera.setText("$300");
        jPanel1.add(jTextFieldNiñera, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 125, -1));

        jTextFieldSpa.setText("$250");
        jPanel1.add(jTextFieldSpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 125, -1));

        jTextFieldTintoreria.setText("$120");
        jPanel1.add(jTextFieldTintoreria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 125, -1));

        jTextFieldServicio.setText("$20");
        jPanel1.add(jTextFieldServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 125, -1));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 50, 20));

        jTextFieldTotal.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jTextFieldTotal.setText("0");
        jPanel1.add(jTextFieldTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 83, -1));

        jButtonCargar.setText("Cargar");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Despues da clic en cargar para mandarlo a la cuenta ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("De no querer ningun cargo extra dar Cargar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(al cargar la cuenta la ventana se cerrara)");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CargosExtra.jpeg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBarActionPerformed
        if(auxBar==0){
            jTextFieldBar.setText("$110 Agregado");
            auxBar=1;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal+subBar;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }else{
            jTextFieldBar.setText("$110 ");
            auxBar=0;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal-subBar;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }
        
    }//GEN-LAST:event_jButtonBarActionPerformed

    private void jButtonSpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpaActionPerformed
         if(auxSpa==0){
            jTextFieldSpa.setText("$250 Agregado");
            auxSpa=1;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal+subSpa;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }else{
            jTextFieldSpa.setText("$250");
            auxSpa=0;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal-subSpa;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }
    }//GEN-LAST:event_jButtonSpaActionPerformed

    private void jButtonTintoreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTintoreriaActionPerformed
         if(auxTintoreria==0){
            jTextFieldTintoreria.setText("$120 Agregado");
            auxTintoreria=1;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal+subTintoreria;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }else{
            jTextFieldTintoreria.setText("$120");
            auxTintoreria=0;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal-subTintoreria;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }
    }//GEN-LAST:event_jButtonTintoreriaActionPerformed

    private void jButtonServicioCuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicioCuartoActionPerformed
        if(auxServicio==0){
            jTextFieldServicio.setText("$20 Agregado");
            auxServicio=1;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal+subServicio;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }else{
            jTextFieldServicio.setText("$20");
            auxServicio=0;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal-subServicio;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }
    }//GEN-LAST:event_jButtonServicioCuartoActionPerformed

    private void jButtonNiñeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNiñeraActionPerformed
        if(auxNiñera==0){
            jTextFieldNiñera.setText("$300 Agregado");
            auxNiñera=1;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal+subNiñera;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }else{
            jTextFieldNiñera.setText("$300");
            auxNiñera=0;
            subTotal=Integer.parseInt(this.jTextFieldTotal.getText());
            subTotal=subTotal-subNiñera;
            jTextFieldTotal.setText(String.valueOf(subTotal));
        }
    }//GEN-LAST:event_jButtonNiñeraActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        Altas.setVisible(true);
        String Total=this.jTextFieldTotal.getText();
        Altas.jTextFieldCargosExtra.setText(Total);
        for (int i = 0; i < 15; i++) {
            Altas.vecDispPiso1[i]=vecDispPiso1[i];
            Altas.vecDispPiso2[i]=vecDispPiso2[i];
        }
        Altas.auxhab = auxhab;
        Altas.auxpiso =auxpiso;
        dispose();
    }//GEN-LAST:event_jButtonCargarActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CargosExtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargosExtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargosExtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargosExtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargosExtras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBar;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonNiñera;
    private javax.swing.JButton jButtonServicioCuarto;
    private javax.swing.JButton jButtonSpa;
    private javax.swing.JButton jButtonTintoreria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBar;
    private javax.swing.JTextField jTextFieldNiñera;
    private javax.swing.JTextField jTextFieldServicio;
    private javax.swing.JTextField jTextFieldSpa;
    private javax.swing.JTextField jTextFieldTintoreria;
    public final javax.swing.JTextField jTextFieldTotal = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
