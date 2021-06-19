
package registros;

import javax.swing.JOptionPane;


public class Habitaciones extends javax.swing.JFrame {

    
    int vecDispPiso1[]= new int[15];
    int vecDispPiso2[]= new int[15];
    int aux,auxPiso;
    Altas alta = new Altas();
        
        
    public Habitaciones() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroupHabitaciones = new javax.swing.ButtonGroup();
        jLabel38 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldEstatus = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();
        jButtonRegistroHab = new javax.swing.JButton();
        jRadioButtonhab1 = new javax.swing.JRadioButton();
        jRadioButtonhab2 = new javax.swing.JRadioButton();
        jRadioButtonhab3 = new javax.swing.JRadioButton();
        jRadioButtonhab4 = new javax.swing.JRadioButton();
        jRadioButtonhab5 = new javax.swing.JRadioButton();
        jRadioButtonhab6 = new javax.swing.JRadioButton();
        jRadioButtonhab7 = new javax.swing.JRadioButton();
        jRadioButtonhab8 = new javax.swing.JRadioButton();
        jRadioButtonhab9 = new javax.swing.JRadioButton();
        jRadioButtonhab10 = new javax.swing.JRadioButton();
        jRadioButtonhab11 = new javax.swing.JRadioButton();
        jRadioButtonhab12 = new javax.swing.JRadioButton();
        jRadioButtonhab13 = new javax.swing.JRadioButton();
        jRadioButtonhab14 = new javax.swing.JRadioButton();
        jRadioButtonhab15 = new javax.swing.JRadioButton();
        jRadioButtonhab16 = new javax.swing.JRadioButton();
        jRadioButtonhab17 = new javax.swing.JRadioButton();
        jRadioButtonhab18 = new javax.swing.JRadioButton();
        jRadioButtonhab19 = new javax.swing.JRadioButton();
        jRadioButtonhab20 = new javax.swing.JRadioButton();
        jRadioButtonhab21 = new javax.swing.JRadioButton();
        jRadioButtonhab22 = new javax.swing.JRadioButton();
        jRadioButtonhab23 = new javax.swing.JRadioButton();
        jRadioButtonhab24 = new javax.swing.JRadioButton();
        jRadioButtonhab25 = new javax.swing.JRadioButton();
        jRadioButtonhab26 = new javax.swing.JRadioButton();
        jRadioButtonhab27 = new javax.swing.JRadioButton();
        jRadioButtonhab28 = new javax.swing.JRadioButton();
        jRadioButtonhab29 = new javax.swing.JRadioButton();
        jRadioButtonhab30 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setText("17");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel21.setText("14");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, -1));

        jLabel7.setText("2");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 10, 20));

        jLabel17.setText("12");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jLabel14.setText("8");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 10, 20));

        jLabel16.setText("10");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, -1, -1));

        jLabel13.setText("7");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 20, 20));

        jLabel11.setText("5");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 20, 20));

        jLabel15.setText("9");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 640, 20, 20));

        jLabel20.setText("16");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setText("4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 10, -1));

        jLabel19.setText("13");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        jLabel12.setText("6");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 10, 20));

        jLabel18.setText("11");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, -1, -1));

        jLabel23.setText("19");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jLabel22.setText("15");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, -1, -1));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 30, -1));

        jLabel25.setText("18");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel26.setText("20");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 30, 20));

        jLabel27.setText("21");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel28.setText("22");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel30.setText("24");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel31.setText("25");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel29.setText("23");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel32.setText("26");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel33.setText("27");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLabel34.setText("29");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel35.setText("28");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jLabel36.setText("30");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        jLabel37.setText("3");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 640, -1, -1));

        jLabel5.setText("1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 10, -1));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Dobles");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 60));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 0));
        jLabel9.setText("Sencillas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("Triples");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hotel.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 630, 360));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel2.setText("Selecciona tu Habitacion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hotel2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 400, 610, 350));

        jTextFieldEstatus.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTextFieldEstatusMouseMoved(evt);
            }
        });
        jTextFieldEstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstatusActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 120, 30));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 600, 760));

        jButtonRegistroHab.setText("Registrar");
        jButtonRegistroHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroHabActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistroHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 760, 100, 30));

        buttonGroupHabitaciones.add(jRadioButtonhab1);
        jRadioButtonhab1.setText("1");
        jRadioButtonhab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab2);
        jRadioButtonhab2.setText("2");
        jRadioButtonhab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab3);
        jRadioButtonhab3.setText("3");
        jRadioButtonhab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab4);
        jRadioButtonhab4.setText("4");
        jRadioButtonhab4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab5);
        jRadioButtonhab5.setText("5");
        jRadioButtonhab5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab6);
        jRadioButtonhab6.setText("6");
        jRadioButtonhab6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab7);
        jRadioButtonhab7.setText("7");
        jRadioButtonhab7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab7ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab8);
        jRadioButtonhab8.setText("8");
        jRadioButtonhab8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab8ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab9);
        jRadioButtonhab9.setText("9");
        jRadioButtonhab9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab9ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab10);
        jRadioButtonhab10.setText("10");
        jRadioButtonhab10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab10ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab11);
        jRadioButtonhab11.setText("11");
        jRadioButtonhab11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab11ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab12);
        jRadioButtonhab12.setText("12");
        jRadioButtonhab12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab12ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab13);
        jRadioButtonhab13.setText("13");
        jRadioButtonhab13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab13ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab14);
        jRadioButtonhab14.setText("14");
        jRadioButtonhab14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab14ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab15);
        jRadioButtonhab15.setText("15");
        jRadioButtonhab15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab15ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab16);
        jRadioButtonhab16.setText("16");
        jRadioButtonhab16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab16ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab17);
        jRadioButtonhab17.setText("17");
        jRadioButtonhab17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab17ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab18);
        jRadioButtonhab18.setText("18");
        jRadioButtonhab18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab18ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab18, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab19);
        jRadioButtonhab19.setText("19");
        jRadioButtonhab19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab19ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab20);
        jRadioButtonhab20.setText("20");
        jRadioButtonhab20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab20ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab21);
        jRadioButtonhab21.setText("21");
        jRadioButtonhab21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab21ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab22);
        jRadioButtonhab22.setText("22");
        jRadioButtonhab22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab22ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab23);
        jRadioButtonhab23.setText("23");
        jRadioButtonhab23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab23ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab24);
        jRadioButtonhab24.setText("24");
        jRadioButtonhab24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab24ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab24, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab25);
        jRadioButtonhab25.setText("25");
        jRadioButtonhab25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab25ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab25, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab26);
        jRadioButtonhab26.setText("26");
        jRadioButtonhab26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab26ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab27);
        jRadioButtonhab27.setText("27");
        jRadioButtonhab27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab27ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 560, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab28);
        jRadioButtonhab28.setText("28");
        jRadioButtonhab28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab28ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab28, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab29);
        jRadioButtonhab29.setText("29");
        jRadioButtonhab29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab29ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab29, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, -1, -1));

        buttonGroupHabitaciones.add(jRadioButtonhab30);
        jRadioButtonhab30.setText("30");
        jRadioButtonhab30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonhab30ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonhab30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, -1, -1));

        jButton2.setText("Volver al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 760, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonhab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab1ActionPerformed
        if(vecDispPiso1[0]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=0;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
        
    }//GEN-LAST:event_jRadioButtonhab1ActionPerformed

    private void jRadioButtonhab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab2ActionPerformed
        if(vecDispPiso1[1]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=1;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab2ActionPerformed

    private void jRadioButtonhab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab3ActionPerformed
        if(vecDispPiso1[2]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=2;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab3ActionPerformed

    private void jRadioButtonhab4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab4ActionPerformed
        if(vecDispPiso1[3]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=3;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab4ActionPerformed

    private void jRadioButtonhab5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab5ActionPerformed
        if(vecDispPiso1[4]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=4;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab5ActionPerformed

    private void jRadioButtonhab6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab6ActionPerformed
        if(vecDispPiso1[5]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=5;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab6ActionPerformed

    private void jRadioButtonhab7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab7ActionPerformed
        if(vecDispPiso1[6]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=6;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab7ActionPerformed

    private void jRadioButtonhab8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab8ActionPerformed
        if(vecDispPiso1[7]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=7;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab8ActionPerformed

    private void jRadioButtonhab9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab9ActionPerformed
        if(vecDispPiso1[8]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=8;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab9ActionPerformed

    private void jRadioButtonhab10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab10ActionPerformed
        if(vecDispPiso1[9]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=9;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab10ActionPerformed

    private void jRadioButtonhab11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab11ActionPerformed
        if(vecDispPiso1[10]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=10;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab11ActionPerformed

    private void jRadioButtonhab12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab12ActionPerformed
        if(vecDispPiso1[11]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=11;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab12ActionPerformed

    private void jRadioButtonhab13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab13ActionPerformed
        if(vecDispPiso1[12]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=12;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab13ActionPerformed

    private void jRadioButtonhab14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab14ActionPerformed
        if(vecDispPiso1[13]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=13;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab14ActionPerformed

    private void jRadioButtonhab15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab15ActionPerformed
        if(vecDispPiso1[14]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=14;
            auxPiso=1;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab15ActionPerformed

    private void jRadioButtonhab16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab16ActionPerformed
        if(vecDispPiso2[0]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=0;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab16ActionPerformed

    private void jRadioButtonhab17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab17ActionPerformed
        if(vecDispPiso2[1]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=1;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab17ActionPerformed

    private void jRadioButtonhab18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab18ActionPerformed
        if(vecDispPiso2[2]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=2;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab18ActionPerformed

    private void jRadioButtonhab19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab19ActionPerformed
        if(vecDispPiso2[3]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=3;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab19ActionPerformed

    private void jRadioButtonhab20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab20ActionPerformed
        if(vecDispPiso2[4]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=4;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab20ActionPerformed

    private void jRadioButtonhab21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab21ActionPerformed
        if(vecDispPiso2[5]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=5;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab21ActionPerformed

    private void jRadioButtonhab22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab22ActionPerformed
        if(vecDispPiso2[6]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=6;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab22ActionPerformed

    private void jRadioButtonhab23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab23ActionPerformed
        if(vecDispPiso2[7]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=7;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab23ActionPerformed

    private void jRadioButtonhab24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab24ActionPerformed
        if(vecDispPiso2[8]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=8;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab24ActionPerformed

    private void jRadioButtonhab25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab25ActionPerformed
        if(vecDispPiso2[9]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=9;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab25ActionPerformed

    private void jRadioButtonhab26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab26ActionPerformed
        if(vecDispPiso2[10]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=10;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab26ActionPerformed

    private void jRadioButtonhab27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab27ActionPerformed
        if(vecDispPiso2[11]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=11;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab27ActionPerformed

    private void jRadioButtonhab28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab28ActionPerformed
        if(vecDispPiso2[12]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=12;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab28ActionPerformed

    private void jRadioButtonhab29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab29ActionPerformed
        if(vecDispPiso2[13]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=13;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab29ActionPerformed

    private void jRadioButtonhab30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonhab30ActionPerformed
        if(vecDispPiso2[14]==0){
            jTextFieldEstatus.setText("Disponible");
            aux=14;
            auxPiso=2;
        }else{
            jTextFieldEstatus.setText("NO Disponible");
        }
    }//GEN-LAST:event_jRadioButtonhab30ActionPerformed

    private void jButtonRegistroHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroHabActionPerformed
        int auxcap = 0;
        int auxcap2 = 0;
        for (int i = 0; i < 15; i++) {
            auxcap=auxcap+vecDispPiso1[i];
            auxcap2=auxcap2+vecDispPiso1[i];
        }
        if(auxcap==15&&auxcap2==15){
            JOptionPane.showMessageDialog(this, "No se puede realizar el registro");
            this.setVisible(false);
             Menu al = new Menu();
                for (int i = 0; i < 15; i++) {
                alta.vecDispPiso1[i]=vecDispPiso1[i];
                alta.vecDispPiso2[i]=vecDispPiso2[i];   
            }
        alta.auxhab=aux;
        al.setVisible(true);
        }else{
        if(auxPiso==1){
            vecDispPiso1[aux]=1;
            for (int i = 0; i < 15; i++) {
                alta.vecDispPiso1[i]=vecDispPiso1[i];
                alta.vecDispPiso2[i]=vecDispPiso2[i];
                
            }
            alta.auxhab=aux;
            System.out.println(aux);
            alta.auxpiso=1;
            alta.setVisible(true);
            dispose();
        }else{
            vecDispPiso2[aux]=1;
            for (int i = 0; i < 15; i++) {
                alta.vecDispPiso1[i]=vecDispPiso1[i];
                alta.vecDispPiso2[i]=vecDispPiso2[i];
                
            }
            alta.auxhab=aux;
            System.out.println(aux);
            alta.auxpiso=1;
            alta.setVisible(true);
            dispose();
        }
        jTextFieldEstatus.setText("ERROR");
        } 
    }//GEN-LAST:event_jButtonRegistroHabActionPerformed

    private void jTextFieldEstatusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldEstatusMouseMoved
        // TODO add your handling code here:
        int auxcap = 0;
        int auxcap2 = 0;
        for (int i = 0; i < 15; i++) {
            auxcap=auxcap+vecDispPiso1[i];
            auxcap2=auxcap2+vecDispPiso1[i];
        }
        
        if(auxcap==15&&auxcap2==15){
            JOptionPane.showMessageDialog(this, "Hotel lleno");
        }
    }//GEN-LAST:event_jTextFieldEstatusMouseMoved

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu al = new Menu();
        for (int i = 0; i < 15; i++) {
                alta.vecDispPiso1[i]=vecDispPiso1[i];
                alta.vecDispPiso2[i]=vecDispPiso2[i];   
            }
        alta.auxhab=aux;
        al.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldEstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstatusActionPerformed

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
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHabitaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonRegistroHab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JRadioButton jRadioButtonhab1;
    private javax.swing.JRadioButton jRadioButtonhab10;
    private javax.swing.JRadioButton jRadioButtonhab11;
    private javax.swing.JRadioButton jRadioButtonhab12;
    private javax.swing.JRadioButton jRadioButtonhab13;
    private javax.swing.JRadioButton jRadioButtonhab14;
    private javax.swing.JRadioButton jRadioButtonhab15;
    private javax.swing.JRadioButton jRadioButtonhab16;
    private javax.swing.JRadioButton jRadioButtonhab17;
    private javax.swing.JRadioButton jRadioButtonhab18;
    private javax.swing.JRadioButton jRadioButtonhab19;
    private javax.swing.JRadioButton jRadioButtonhab2;
    private javax.swing.JRadioButton jRadioButtonhab20;
    private javax.swing.JRadioButton jRadioButtonhab21;
    private javax.swing.JRadioButton jRadioButtonhab22;
    private javax.swing.JRadioButton jRadioButtonhab23;
    private javax.swing.JRadioButton jRadioButtonhab24;
    private javax.swing.JRadioButton jRadioButtonhab25;
    private javax.swing.JRadioButton jRadioButtonhab26;
    private javax.swing.JRadioButton jRadioButtonhab27;
    private javax.swing.JRadioButton jRadioButtonhab28;
    private javax.swing.JRadioButton jRadioButtonhab29;
    private javax.swing.JRadioButton jRadioButtonhab3;
    private javax.swing.JRadioButton jRadioButtonhab30;
    private javax.swing.JRadioButton jRadioButtonhab4;
    private javax.swing.JRadioButton jRadioButtonhab5;
    private javax.swing.JRadioButton jRadioButtonhab6;
    private javax.swing.JRadioButton jRadioButtonhab7;
    private javax.swing.JRadioButton jRadioButtonhab8;
    private javax.swing.JRadioButton jRadioButtonhab9;
    private javax.swing.JTextField jTextFieldEstatus;
    // End of variables declaration//GEN-END:variables
}
