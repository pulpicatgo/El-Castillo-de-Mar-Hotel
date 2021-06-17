package ventanas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import controlMySql.MySqlConn;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

import registros.Menu;

/**
 *
 * @author regina
 */
public class Login extends javax.swing.JFrame {
    //variables para enviar datos a interfaces
    public static String user="";
    String pass = "";
    MySqlConn conn=new MySqlConn();
    
    public Login(MySqlConn conn) {
        this.conn=conn;
        initComponents();
    }

    
    
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(956,507);
        //para evitar que el usuario modifique las dimenciones
        setResizable(false);
        setTitle("Login de acceso");
        setLocationRelativeTo(null);
        
        //crear objeto de la clase imagen icon
        ImageIcon wallpaper = new ImageIcon("src/images/playa.jpg");
        Icon icono= new ImageIcon(wallpaper.getImage().getScaledInstance(jLabelWallpaper.getWidth(), jLabelWallpaper.getHeight(),Image.SCALE_DEFAULT));  
        jLabelWallpaper.setIcon(icono);
       //asegurar que actualice la imagen
        this.repaint();
        
        
        //crear objeto
        ImageIcon wallpaperLogo=new ImageIcon("src/images/LogoHotel.png");
        Icon iconoLogo=new ImageIcon(wallpaperLogo.getImage().getScaledInstance(jLabelLogo.getWidth(), jLabelLogo.getHeight(), Image.SCALE_DEFAULT));
        jLabelLogo.setIcon(iconoLogo);
        this.repaint();
        
             
        
    }//cierre del constructor
    //vamos a sobre escribir un metodo , colocamos @override 
 @Override
        public Image getIconImage(){
        //objeto
        Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icono.jpeg"));
        return retValue;
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jTextFieldRegistro = new javax.swing.JTextField();
        jPasswordCuentaRegistro = new javax.swing.JPasswordField();
        jButtonAcceder = new javax.swing.JButton();
        jLabelFooter = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCuenta = new javax.swing.JTextField();
        jButtonRegistro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordFieldCuentaLogin = new javax.swing.JPasswordField();
        jLabelWallpaper = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 250));

        jTextFieldRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldRegistro.setFont(new java.awt.Font("C059", 0, 24)); // NOI18N
        jTextFieldRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldRegistro.setToolTipText("");
        getContentPane().add(jTextFieldRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 240, 50));

        jPasswordCuentaRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordCuentaRegistro.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jPasswordCuentaRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordCuentaRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        getContentPane().add(jPasswordCuentaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 240, 60));

        jButtonAcceder.setBackground(new java.awt.Color(51, 51, 51));
        jButtonAcceder.setFont(new java.awt.Font("FreeMono", 0, 24)); // NOI18N
        jButtonAcceder.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAcceder.setText("Acceder");
        jButtonAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccederActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 150, 50));

        jLabelFooter.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        jLabelFooter.setForeground(new java.awt.Color(153, 153, 153));
        jLabelFooter.setText("Creado por grupo mar derechos reservados");
        getContentPane().add(jLabelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 460, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 100, 60));

        jTextFieldCuenta.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldCuenta.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 240, 50));

        jButtonRegistro.setBackground(new java.awt.Color(102, 102, 102));
        jButtonRegistro.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jButtonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistro.setText("Registro");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 170, 50));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, -1, -1));

        jPasswordFieldCuentaLogin.setBackground(new java.awt.Color(0, 0, 0));
        jPasswordFieldCuentaLogin.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordFieldCuentaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 240, 240, 50));

        jLabelWallpaper.setBackground(new java.awt.Color(0, 0, 0));
        jLabelWallpaper.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccederActionPerformed
   //para acceder
        String cuenta, contraseña, query;
        cuenta=this.jTextFieldRegistro.getText().trim();
        query= "select * from login where cuenta = " + "'" + cuenta + "'";
        this.conn.Consult(query);
        try{
            String contraseñaMySql=this.conn.rs.getString(2);
            char[] passw = this.jPasswordCuentaRegistro.getPassword();
            contraseña = new String(passw);
            String contraseñaencriptada = DigestUtils.md5Hex(contraseña);
            if (contraseñaMySql.equals(contraseñaencriptada)){ 
                JOptionPane.showMessageDialog(this, "Bienvenido " + 
                        this.conn.rs.getString(1)+" al sistema");
            this.setVisible(false);
            Menu al=new Menu();
            al.setVisible(true);
            }else
                JOptionPane.showMessageDialog(this, "Error en la contraseña");
        }catch (SQLException ex){     
            JOptionPane.showMessageDialog(this, "No existe la cuenta");
            System.out.println("No existe la cuenta");    
        
    }
    }//GEN-LAST:event_jButtonAccederActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jTextFieldCuenta.setText("");
        this.jTextFieldRegistro.setText("");
        this.jPasswordFieldCuentaLogin.setText("");
        this.jPasswordCuentaRegistro.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        // TODO add your handling code here:
        //convertimos contraseña a string
        
        String cuenta, contraseña, parte1, parte2, query;
        cuenta=this.jTextFieldCuenta.getText().trim();
        char[] passw = this.jPasswordFieldCuentaLogin.getPassword();
        
        contraseña = new String(passw);
        //insertartando los datos de usuario para encriptar
        parte1="insert into login values (";
        parte2="'" + cuenta + "'," + " MD5('" + contraseña + "'))";
        query= parte1+parte2;
        System.out.println(query);
        int j = this.conn.Update(query);
        if (j > 0) {
            JOptionPane.showMessageDialog(this, "Cuenta Registrada...");
        }
    }//GEN-LAST:event_jButtonRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAcceder;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFooter;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JPasswordField jPasswordCuentaRegistro;
    private javax.swing.JPasswordField jPasswordFieldCuentaLogin;
    private javax.swing.JTextField jTextFieldCuenta;
    private javax.swing.JTextField jTextFieldRegistro;
    // End of variables declaration//GEN-END:variables
}