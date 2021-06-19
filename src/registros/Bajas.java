
package registros;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controlMySql.MySqlConn;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Bajas extends javax.swing.JFrame {

    MySqlConn conn=new MySqlConn();
    
    
    
    public Bajas(MySqlConn conn) {
        this.conn=conn;
        initComponents();
    }

    Bajas() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel2.setText("CheckOut");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setText("Numero de habitacion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 180, 40));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jButton1.setText("Volver al menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 170, 50));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jButton2.setText("Salida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 100, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salida.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu al = new Menu();
        al.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //generar pdf
        Document documento = new Document();
     try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/recibo.pdf"));
            documento.open();
            
            
            PdfPTable tabla = new PdfPTable(14);
          //incertar titulos de cada columna
            tabla.addCell("nombre");
            tabla.addCell("tipohab");
            tabla.addCell("ciudadorigen");
            tabla.addCell("totalpersonas");
            tabla.addCell("totaldias");
            tabla.addCell("perExt");
            tabla.addCell("FInicial");
            tabla.addCell("FFinal");
            tabla.addCell("cargosExt");
            tabla.addCell("piso");
            tabla.addCell("hab");
            tabla.addCell("sencilla");
            tabla.addCell("doble");
            tabla.addCell("triple");
            
            
            try {
                //crear coneccion agregar ruta con el nombre de la base de datos , nombre de usaurio y la contrasena
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
                //la intruccion selecciona todo de la base de datos nombre de la tabla exactamente igual 
                PreparedStatement pst = cn.prepareStatement("select * from huespedes");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                     //vaciado de valores   primero valor es id en ese caso en el de nosotros tomara el primer valor que encuetre               
                   //numero de columnas
                     do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(8));
                        tabla.addCell(rs.getString(9));
                        tabla.addCell(rs.getString(10));
                        tabla.addCell(rs.getString(11));
                        tabla.addCell(rs.getString(12));
                        tabla.addCell(rs.getString(13));
                        tabla.addCell(rs.getString(14));
                        
                    } while (rs.next());
                    documento.add(tabla);                    
                }
                
            } catch (DocumentException | SQLException e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado.");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        }
        
        
        System.out.println("Entre");
        String nom = this.jTextFieldNombre.getText().trim();
        
        if (nom.isEmpty()){
            JOptionPane.showMessageDialog(this, "Huesped no registrado");
        }
        else{
        
            String query="delete from huespedes where hab ="+"'"+nom+"'";
            
            int j=this.conn.Update(query);
            if(j>0)
                JOptionPane.showMessageDialog(this, "Baja realizada");
            else
                JOptionPane.showMessageDialog(this, "La baja no se pudo realizar ");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bajas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bajas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
