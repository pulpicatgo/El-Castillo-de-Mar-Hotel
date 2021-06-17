
package registros;


public class CargosExtras extends javax.swing.JFrame {

    int carBar,carSpa,carTintoreria,carServicio,carNiñera;
    int auxBar=0,auxSpa=0,auxTintoreria=0,auxServicio=0,auxNiñera=0,subTotal=0;
    int subBar=110,subSpa=250,subTintoreria=120,subServicio=20,subNiñera=300;
    Altas Altas= new Altas();
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jButtonSpa.setBackground(new java.awt.Color(51, 153, 255));
        jButtonSpa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconospa.jpg"))); // NOI18N
        jButtonSpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpaActionPerformed(evt);
            }
        });

        jTextFieldBar.setEditable(false);
        jTextFieldBar.setText("$110");

        jLabel1.setText("Cargos Extra (Da clic en los servicios que desees cargar a tu cuenta)");

        jButtonBar.setBackground(new java.awt.Color(51, 153, 255));
        jButtonBar.setForeground(new java.awt.Color(0, 153, 255));
        jButtonBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconobar.png"))); // NOI18N
        jButtonBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBarActionPerformed(evt);
            }
        });

        jButtonTintoreria.setBackground(new java.awt.Color(51, 153, 255));
        jButtonTintoreria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconotintoreria.jpg"))); // NOI18N
        jButtonTintoreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTintoreriaActionPerformed(evt);
            }
        });

        jButtonServicioCuarto.setBackground(new java.awt.Color(51, 153, 255));
        jButtonServicioCuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoservicio.png"))); // NOI18N
        jButtonServicioCuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicioCuartoActionPerformed(evt);
            }
        });

        jButtonNiñera.setBackground(new java.awt.Color(51, 153, 255));
        jButtonNiñera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icononiñera.jpg"))); // NOI18N
        jButtonNiñera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNiñeraActionPerformed(evt);
            }
        });

        jTextFieldNiñera.setText("$300");

        jTextFieldSpa.setText("$250");

        jTextFieldTintoreria.setText("$120");

        jTextFieldServicio.setText("$20");

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        jLabel2.setText("Total:");

        jTextFieldTotal.setText("0");

        jButtonCargar.setText("Cargar");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jLabel3.setText("Despues da clic en cargar para mandarlo a la cuenta (al cargar la cuenta la ventana se cerrara)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldBar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSpa, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonTintoreria, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTintoreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonServicioCuarto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNiñera)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNiñera))
                    .addComponent(jButtonCargar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldBar, jTextFieldNiñera, jTextFieldServicio, jTextFieldSpa, jTextFieldTintoreria});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonNiñera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jTextFieldBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTextFieldNiñera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSpa)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButtonTintoreria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldTintoreria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonServicioCuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCargar)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        System.out.println("hola");
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldBar;
    private javax.swing.JTextField jTextFieldNiñera;
    private javax.swing.JTextField jTextFieldServicio;
    private javax.swing.JTextField jTextFieldSpa;
    private javax.swing.JTextField jTextFieldTintoreria;
    public final javax.swing.JTextField jTextFieldTotal = new javax.swing.JTextField();
    // End of variables declaration//GEN-END:variables
}
