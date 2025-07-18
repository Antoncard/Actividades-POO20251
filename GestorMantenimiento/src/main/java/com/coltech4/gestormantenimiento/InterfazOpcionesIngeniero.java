
package com.coltech4.gestormantenimiento;
import java.awt.Color;
import javax.swing.JOptionPane;

public class InterfazOpcionesIngeniero extends javax.swing.JFrame {
       private BaseDeDatos BaseDatos;
       private Administrador admin;
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(InterfazOpcionesAdministrador.class.getName());

   
    public InterfazOpcionesIngeniero() {
        // Inicializa los componentes de la interfaz gráfica
        initComponents();
        
    }

    public void setBaseDeDatos(BaseDeDatos bd){  
           this.BaseDatos = bd;
    }
    
    public void setAdministrador(Administrador admin) {
    this.admin = admin;
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        xExit = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Txt1 = new javax.swing.JLabel();
        Txt2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtOpcionesIng = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        Separator1 = new javax.swing.JSeparator();
        FondoInterfazIngeniero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xExit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        xExit.setForeground(new java.awt.Color(255, 255, 255));
        xExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xExit.setText("X");
        xExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xExitMouseExited(evt);
            }
        });
        jPanel1.add(xExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 40));

        jButton6.setBackground(new java.awt.Color(3, 155, 215));
        jButton6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 500, 140, 50));

        jButton5.setBackground(new java.awt.Color(3, 155, 215));
        jButton5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Asignar Fecha de Mantenimiento");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 309, 50));

        jButton4.setBackground(new java.awt.Color(3, 155, 215));
        jButton4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Modificar Estado de Equipo");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 309, 50));

        jButton3.setBackground(new java.awt.Color(3, 155, 215));
        jButton3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Visualizar Datos de Equipo");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 309, 50));

        jButton2.setBackground(new java.awt.Color(3, 155, 215));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar Equipo");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 309, 50));

        jButton1.setBackground(new java.awt.Color(3, 155, 215));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Visualizar Datos");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 309, 50));

        Txt1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt1.setText("Médicos");
        jPanel1.add(Txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 410, 70));

        Txt2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Txt2.setText("Sistema de Gestión de Mantenimiento de Equipos");
        jPanel1.add(Txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 410, 70));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 210, 190));

        TxtOpcionesIng.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        TxtOpcionesIng.setForeground(new java.awt.Color(3, 155, 215));
        TxtOpcionesIng.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TxtOpcionesIng.setText("Opciones Ingeniero");
        jPanel1.add(TxtOpcionesIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 310, 70));

        Separator2.setBackground(new java.awt.Color(58, 128, 177));
        Separator2.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 430, 20));

        Separator1.setBackground(new java.awt.Color(58, 128, 177));
        Separator1.setForeground(new java.awt.Color(58, 128, 177));
        jPanel1.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 310, 10));

        FondoInterfazIngeniero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.jpg"))); // NOI18N
        jPanel1.add(FondoInterfazIngeniero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void xExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseEntered
        xExit.setForeground(Color.black);
    }//GEN-LAST:event_xExitMouseEntered

    private void xExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseExited
        xExit.setForeground(Color.white);
    }//GEN-LAST:event_xExitMouseExited

    private void xExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xExitMouseClicked
        int opcion = JOptionPane.showConfirmDialog(
            rootPane, // Componente raíz de la ventana actual
            "¿Estás seguro de que deseas salir?", // Mensaje que se mostrará
            "Confirmar salida", // Título del cuadro de diálogo
            JOptionPane.YES_NO_OPTION, // Opciones: Sí / No
            JOptionPane.QUESTION_MESSAGE// Ícono de signo de pregunta
            );

        // Si el usuario elige "Sí", se cierra la aplicación
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_xExitMouseClicked

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoInterfazIngeniero;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JLabel Txt1;
    private javax.swing.JLabel Txt2;
    private javax.swing.JLabel TxtOpcionesIng;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel xExit;
    // End of variables declaration//GEN-END:variables
}
