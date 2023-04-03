/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Lugares;
import static GUI.Login.ID;
import static GUI.Login.level;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class VerLugar extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    public static String nombreLugar;
    public static String descripcionLugar;
    public static String direccionLugar;
    public static String telefonoLugar;
    public static String tipoLugar;
    public static String puntuacionLugar;
    public static String horarioLugar;
    public static String linkLugar;
    private static Lugares lugares = new Lugares();
    private AgregarFotos agregarFotos;
    private InicioUsuario myUsuario = new InicioUsuario();
    private InicioAdmin inicioAdmin;
    
    /**
     * Creates new form VerLugar
     */
    public VerLugar() throws IOException {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        System.out.println(myUsuario.filaExcel);
        setDatos(myUsuario.filaExcel);
        txtNombreLugar.setText(nombreLugar);
        txtDescipcion.setText(descripcionLugar);
        txtDireccion.setText(direccionLugar);
        txtTipo.setText(tipoLugar);
        txtHorario.setText(horarioLugar);
        txtTelefono.setText(telefonoLugar);
        txtPuntuacion.setText(puntuacionLugar);
        setImg(nombreLugar);
    }
    
    public static void setDatos(int filaExcel){
        String info[] = new String[8];
        info = lugares.obtenerSite(filaExcel);
        nombreLugar = info[0];
        direccionLugar = info[1];
        tipoLugar = info[2];
        horarioLugar = info[3];
        puntuacionLugar = info[4];
        linkLugar = info[5];
        telefonoLugar = info[6];
        descripcionLugar = info[7];
    }
    
    public void setImg(String lugar){
        int num = lugares.countImg(lugar);
        String ruta = "IMG\\"+lugar+"\\"+num+".jpg";
        if(num!=0){
            this.mostrarImagen(lblImagen,ruta);
        }else{
            this.mostrarImagen(lblImagen,"src\\IMG\\noimagen.jpg");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnMapa = new javax.swing.JButton();
        txtNombreLugar = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescipcion = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtPuntuacion = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnComentarios = new javax.swing.JButton();
        btnFotos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnPrevImg = new javax.swing.JButton();
        btnNextImg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMinimumSize(new java.awt.Dimension(610, 430));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 228, 196));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Nombre del lugar: ");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Direccion: ");

        btnMapa.setText("Ir a ubicacion");
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        txtNombreLugar.setEditable(false);
        txtNombreLugar.setBackground(new java.awt.Color(255, 255, 255));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Descripcion: ");

        txtDescipcion.setEditable(false);
        txtDescipcion.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtDescipcion);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Telefono: ");

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Tipo: ");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Horario: ");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setText("Puntuacion:");

        txtTipo.setEditable(false);
        txtTipo.setBackground(new java.awt.Color(255, 255, 255));
        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });

        txtHorario.setEditable(false);
        txtHorario.setBackground(new java.awt.Color(255, 255, 255));
        txtHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHorarioKeyTyped(evt);
            }
        });

        txtPuntuacion.setEditable(false);
        txtPuntuacion.setBackground(new java.awt.Color(255, 255, 255));
        txtPuntuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntuacionActionPerformed(evt);
            }
        });
        txtPuntuacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPuntuacionKeyTyped(evt);
            }
        });

        btnCerrar.setText("Volver");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnComentarios.setText("Ver Comentarios");
        btnComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentariosActionPerformed(evt);
            }
        });

        btnFotos.setText("Agregar Fotos");
        btnFotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(203, 203, 203))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(116, 116, 116)))))
                .addGap(11, 11, 11))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnComentarios)
                .addGap(40, 40, 40)
                .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnFotos)
                .addGap(38, 38, 38)
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMapa)
                    .addComponent(btnCerrar)
                    .addComponent(btnComentarios)
                    .addComponent(btnFotos))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 570, 350));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/yo amo cucuta Registro.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 450, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 410, 410));

        btnPrevImg.setText("Anterior");
        jPanel1.add(btnPrevImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        btnNextImg.setText("Siguiente");
        btnNextImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextImgActionPerformed(evt);
            }
        });
        jPanel1.add(btnNextImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();

        if (c < '0' || c > '9')
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHorarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioKeyTyped

    private void txtPuntuacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPuntuacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntuacionKeyTyped

    private void txtPuntuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntuacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntuacionActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        try {
            lugares.link(linkLugar);
        } catch (IOException ex) {
            Logger.getLogger(VerLugar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(VerLugar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        if (level == 3){
            
            try {
                this.inicioAdmin = new InicioAdmin();
            } catch (IOException ex) {
                Logger.getLogger(VerLugar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                   inicioAdmin.setVisible(true);
                   this.dispose();
               }
               else{
                   myUsuario.setVisible(true);
                   this.dispose();
               }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComentariosActionPerformed

    private void btnFotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotosActionPerformed
        agregarFotos = new AgregarFotos();
        agregarFotos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFotosActionPerformed

    private void btnNextImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextImgActionPerformed
        
    }//GEN-LAST:event_btnNextImgActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VerLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VerLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VerLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VerLugar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VerLugar().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VerLugar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private void mostrarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
        lbl.setIcon(icono);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnComentarios;
    private javax.swing.JButton btnFotos;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnNextImg;
    private javax.swing.JButton btnPrevImg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextPane txtDescipcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombreLugar;
    private javax.swing.JTextField txtPuntuacion;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
