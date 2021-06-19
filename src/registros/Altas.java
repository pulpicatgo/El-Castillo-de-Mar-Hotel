
package registros;

import controlMySql.MySqlConn;
import java.applet.AudioClip;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class Altas extends javax.swing.JFrame {
    
    String auxfecha,auxmusica,Dianuevo,Valor2;
    int auxdias,auxhab,auxpiso;
    int valor, valor2, valor3;
    AudioClip Sound;
    
    int vecDispPiso1[]= new int[15];
    int vecDispPiso2[]= new int[15];
   
    MySqlConn conn=new MySqlConn();
    
    
    
    public Altas(MySqlConn conn) {
        this.conn=conn;
        initComponents();
    }

    Altas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabelCargosExtra = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextFieldTotalPers = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jButtonSeleccHab = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 94, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total de personas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 212, -1, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total de Dias:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 255, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ciudad de Origen:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 175, -1, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(0, 51, 51));
        jTextFieldNombre.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 91, 144, 30));

        jTextFieldCiudad.setBackground(new java.awt.Color(0, 51, 51));
        jTextFieldCiudad.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jTextFieldCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 171, 144, 30));

        jTextFieldTotalDias.setBackground(new java.awt.Color(0, 51, 51));
        jTextFieldTotalDias.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jTextFieldTotalDias.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldTotalDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 252, 143, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("¿Personas extra? (Max. 2)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 212, -1, -1));

        JDateChooser_Fecha.setBackground(new java.awt.Color(0, 51, 51));
        JDateChooser_Fecha.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(JDateChooser_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 327, 127, 29));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("al");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Del");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 327, -1, 29));

        jTextFieldFechaNueva.setEditable(false);
        jTextFieldFechaNueva.setBackground(new java.awt.Color(0, 51, 51));
        jTextFieldFechaNueva.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jTextFieldFechaNueva.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldFechaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 327, 106, -1));

        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 137, -1));

        jButton2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 390, -1, -1));

        jButton3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 390, 98, -1));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("REGISTRO DE HUESPEDES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 24, -1, -1));

        jLabelCargosExtra.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabelCargosExtra.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCargosExtra.setText("Cargos Extra:");
        jPanel1.add(jLabelCargosExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 295, -1, -1));

        jTextFieldCargosExtra.setBackground(new java.awt.Color(0, 51, 51));
        jTextFieldCargosExtra.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jTextFieldCargosExtra.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCargosExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCargosExtraActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCargosExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 292, 143, -1));

        jButton4.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Cargos Extra");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 390, -1, -1));

        jTextFieldTotalPers.setBackground(new java.awt.Color(0, 51, 51));
        jTextFieldTotalPers.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jTextFieldTotalPers.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextFieldTotalPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 130, 30));

        jTextFieldTipoHab.setBackground(new java.awt.Color(0, 51, 51));
        jTextFieldTipoHab.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jTextFieldTipoHab.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTipoHab.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldTipoHabMouseMoved(evt);
            }
        });
        jPanel1.add(jTextFieldTipoHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 140, 30));

        jList3.setBackground(new java.awt.Color(0, 51, 51));
        jList3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jList3.setForeground(new java.awt.Color(255, 255, 255));
        jList3.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "0", "1", "2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 212, 87, 34));

        jButtonSeleccHab.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jButtonSeleccHab.setText("Selecciona Habitacion:");
        jButtonSeleccHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccHabActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSeleccHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Registro.jpeg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    String nombre, tipoHab, ciudad, totalPer, totalDias, fechasalida, totalper, perextra, cargosextra;
     
     nombre=this.jTextFieldNombre.getText().trim(); 
     tipoHab=this.jTextFieldTipoHab.getText().trim();
     ciudad=this.jTextFieldCiudad.getText().trim();
     totalPer=this.jTextFieldTotalPers.getText().trim();
     totalDias=this.jTextFieldTotalDias.getText().trim();
     fechasalida=this.jTextFieldFechaNueva.getText().trim();
     totalper=this.jTextFieldTotalPers.getText().trim();
     perextra=this.jList3.getSelectedValue().toString();
     cargosextra=this.jTextFieldCargosExtra.getText().trim();
     
     SimpleDateFormat fom=new SimpleDateFormat("yyyy/MM/dd");
     auxfecha= fom.format(this.JDateChooser_Fecha.getDate());       
     auxdias=Integer.parseInt(this.jTextFieldTotalDias.getText().trim());  
     Dianuevo = sumarDiasAFecha(auxfecha,auxdias);   
     this.jTextFieldFechaNueva.setText(Dianuevo);
     
     if("Sencilla".equals(tipoHab)){
        valor=1;
        valor2=0;
        valor3=0;
     }
     if("Doble".equals(tipoHab)){
        valor2=1;
        valor=0;
        valor3=0;
     }
     if("Triple".equals(tipoHab)){
        valor3=1;
        valor=0;
        valor2=0;
     }
     
     String parte1="INSERT INTO `huespedes` (`nombre`, `tipohab`, `ciudadorigen`, `totalpersonas`, `totaldias`, `perExt`, `FInicial`, `FFinal`, `cargosExt`, `piso`, `hab`, `sencilla`, `doble`, `triple`) VALUES (";
     String parte2="'"+nombre+"'"+","+"'"+tipoHab+"'"+","+"'"+ciudad+"'"+","+"'"+totalPer+"'"+","+"'"+totalDias+"'"+","+"'"+perextra+"'"+","+"'"+auxfecha+"'"+","+"'"+Dianuevo+"'"+","+"'"+cargosextra+"'"+","+"'"+auxpiso+"'"+","+"'"+auxhab+"'"+","+"'"+valor+"'"+","+"'"+valor2+"'"+","+"'"+valor3+"')";
     
     String query=parte1+parte2;
     
     int j=this.conn.Update(query);

     Sound=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Check.wav"));
     Sound.play();
     
     JOptionPane.showMessageDialog(this, "Usuario Registrado");
     //Codigo Angel
     Ticket ticket = new Ticket();
     ticket.setVisible(true);
     String Cargos = this.jTextFieldCargosExtra.getText();
     ticket.jTextAreaTicket.setText("Nombre Del huesped:"+nombre+"\n"
     +"Ciudad de Origen: "+ciudad+"\n"
     +"Fecha de ingreso: "+auxfecha+"\n"
     +"Fecha de salida: "+jTextFieldFechaNueva.getText()+"\n"
     +"Numero de Habitacion: "+auxhab+"   "+"piso: "+auxpiso+"    \n"
     +"Tipo de habitacion: "+tipoHab+"\n"
     +"Total de ocupantes en la habitacion: "+jTextFieldTotalPers.getText()+"\n"
     +"Personas extra en la habitacion: "+jList3.getSelectedValue().toString()+"\n"
     +"Total de cargos Extra: "+Cargos+"\n"        
     +"*********Registro Completado*************\n");
     

     System.out.println("Numero de registros afectados por la accion:"+j);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu al = new Menu();
        al.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jTextFieldCiudad.setText("");
        this.jTextFieldFechaNueva.setText("");
        this.jTextFieldNombre.setText("");
        this.jTextFieldTotalDias.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CargosExtras cargo = new CargosExtras();
        for (int i = 0; i < 15; i++) {
                cargo.vecDispPiso1[i]=vecDispPiso1[i];
                cargo.vecDispPiso2[i]=vecDispPiso2[i];
        }
        cargo.auxhab = auxhab;
        cargo.auxpiso = auxpiso;
        cargo.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonSeleccHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccHabActionPerformed
        Habitaciones hab=new Habitaciones();
        for (int i = 0; i < 15; i++) {
                hab.vecDispPiso1[i]=vecDispPiso1[i];
                hab.vecDispPiso2[i]=vecDispPiso2[i];
        }
        hab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSeleccHabActionPerformed

    private void jTextFieldTipoHabMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldTipoHabMouseMoved
         if(auxhab<=6&&auxpiso==1){
            jTextFieldTipoHab.setText("Sencilla");
            jTextFieldTotalPers.setText("1");
        }else if( auxhab<=11 && auxpiso==1){
            jTextFieldTipoHab.setText("Doble");
            jTextFieldTotalPers.setText("2");
        }else if(auxhab<=15&&auxpiso==1){
            jTextFieldTipoHab.setText("Triple");
            jTextFieldTotalPers.setText("3");
        }else if(auxhab<=3 && auxpiso==2){
            jTextFieldTipoHab.setText("Sencilla");
            jTextFieldTotalPers.setText("1");
        }else if(auxhab<=8 && auxpiso==2){
            jTextFieldTipoHab.setText("Doble");
            jTextFieldTotalPers.setText("2");
        }else if(auxhab<=15 && auxpiso==2){
            jTextFieldTipoHab.setText("Triple");
            jTextFieldTotalPers.setText("3");
        }else{
            jTextFieldTipoHab.setText("");
            jTextFieldTotalPers.setText("");
        }
    }//GEN-LAST:event_jTextFieldTipoHabMouseMoved

    private void jTextFieldCargosExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCargosExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCargosExtraActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Altas().setVisible(true); 
            }
        });
    }

    public static String sumarDiasAFecha(String fecha, int dias) {
        if(dias == 0){
            return fecha;
        }

        String[] f = fecha.split("/");
        Calendar calendar = Calendar.getInstance();

        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1])-1, Integer.parseInt(f[2]));

        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat fe = new SimpleDateFormat("dd/MM/YYYY");
        return fe.format(calendar.getTime());

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public final com.toedter.calendar.JDateChooser JDateChooser_Fecha = new com.toedter.calendar.JDateChooser();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonSeleccHab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCargosExtra;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    public final javax.swing.JTextField jTextFieldCargosExtra = new javax.swing.JTextField();
    public final javax.swing.JTextField jTextFieldCiudad = new javax.swing.JTextField();
    public final javax.swing.JTextField jTextFieldFechaNueva = new javax.swing.JTextField();
    public final javax.swing.JTextField jTextFieldNombre = new javax.swing.JTextField();
    public final javax.swing.JTextField jTextFieldTipoHab = new javax.swing.JTextField();
    public final javax.swing.JTextField jTextFieldTotalDias = new javax.swing.JTextField();
    private javax.swing.JTextField jTextFieldTotalPers;
    // End of variables declaration//GEN-END:variables
}
