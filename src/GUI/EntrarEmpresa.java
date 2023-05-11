/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Empresas;
import Classes.Usuario;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian
 */
public class EntrarEmpresa extends javax.swing.JFrame {

    int mouseX, mouseY;
    private Empresas empresa;
    public static int ID;
    public NewLogin myLogin;
    public RegistrarEmpresa registrarEmpresa;
    public InicioEmpresa inicioEmpresa;
    
    public EntrarEmpresa() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        ImgFondo = new javax.swing.JLabel();
        TextoLogin = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Pass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JPanel();
        Ingresar = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        IniciarSesion = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        NavBar = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrar1 = new javax.swing.JPanel();
        Registrarse = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FondoEmpresas.jpg"))); // NOI18N
        Fondo.add(ImgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 600));

        TextoLogin.setBackground(new java.awt.Color(0, 0, 0));
        TextoLogin.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        TextoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoLogin.setText("Iniciar Sesión Empresarial");
        Fondo.add(TextoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 290, 40));

        User.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        User.setText("Nombre");
        Fondo.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setText("Ingresar nombre de la empresa");
        txtUser.setToolTipText("");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        Fondo.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 330, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 330, 10));

        Pass.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        Pass.setText("Contraseña");
        Fondo.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 120, -1));

        txtPass.setForeground(new java.awt.Color(102, 102, 102));
        txtPass.setText("Contraseña");
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });
        Fondo.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 330, -1));

        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Ingresar.setFont(new java.awt.Font("Quicksand Light", 1, 18)); // NOI18N
        Ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ingresar.setText("Ingresar");
        Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 130, 50));

        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        IniciarSesion.setFont(new java.awt.Font("Quicksand Light", 1, 18)); // NOI18N
        IniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IniciarSesion.setText("Iniciar Sesión");
        IniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IniciarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 130, 50));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 330, 10));

        NavBar.setBackground(new java.awt.Color(255, 255, 255));
        NavBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                NavBarMouseDragged(evt);
            }
        });
        NavBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NavBarMousePressed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(255, 255, 255));
        btnClose.setToolTipText("");

        txtCerrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCerrar.setText("X");
        txtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addComponent(txtCerrar)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NavBarLayout = new javax.swing.GroupLayout(NavBar);
        NavBar.setLayout(NavBarLayout);
        NavBarLayout.setHorizontalGroup(
            NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavBarLayout.createSequentialGroup()
                .addGap(0, 750, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NavBarLayout.setVerticalGroup(
            NavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(NavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 50));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 410, 10));

        jLabel2.setFont(new java.awt.Font("Quicksand", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("¿Eres una persona natural?    Ingresa aqui");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 400, 30));

        jLabel3.setFont(new java.awt.Font("Quicksand", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("¿Aún no te haz registrado?     Registrate Aqui");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 400, 30));

        btnRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Registrarse.setFont(new java.awt.Font("Quicksand Light", 1, 18)); // NOI18N
        Registrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registrarse.setText("Registrarse");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrar1Layout = new javax.swing.GroupLayout(btnRegistrar1);
        btnRegistrar1.setLayout(btnRegistrar1Layout);
        btnRegistrar1Layout.setHorizontalGroup(
            btnRegistrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnRegistrar1Layout.setVerticalGroup(
            btnRegistrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 130, 50));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 410, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NavBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavBarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_NavBarMousePressed

    private void NavBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_NavBarMouseDragged

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtCerrarMouseClicked

    private void txtCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseEntered
        btnClose.setBackground(Color.red);
    }//GEN-LAST:event_txtCerrarMouseEntered

    private void txtCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseExited
        btnClose.setBackground(Color.white);
    }//GEN-LAST:event_txtCerrarMouseExited

    private void IniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IniciarSesionMouseClicked
        String user = txtUser.getText();
        String pass = txtPass.getText();
        
        try {
            
            //Al inicio se debe implementar un objeto empresa para llamar a los metodos de este
            String id = empresa.getId(user, pass);
            
            if(id.equals("No existente")){
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
            }
            else{
                ID=(int)(Double.parseDouble(id));
                this.inicioEmpresa = new InicioEmpresa();
                inicioEmpresa.setVisible(true);
                this.setVisible(false);
               
            }
            
        } catch (IOException ex) {
            Logger.getLogger(EntrarEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IniciarSesionMouseClicked

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        this.registrarEmpresa = new RegistrarEmpresa();
        registrarEmpresa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistrarseMouseClicked

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        if (String.valueOf(txtPass.getPassword()).isEmpty()) {
            txtPass.setText("Contraseña");
            txtPass.setForeground(new Color(102,102,102));
        }
        
        if (txtUser.getText().equals("Ingresar usuario")) {
            txtUser.setText("");
            txtUser.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Ingresar usuario");
            txtUser.setForeground(new Color(102,102,102));
        }
        
        if (String.valueOf(txtPass.getPassword()).equals("Contraseña")) {
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPassMouseClicked

    private void IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseClicked
        this.myLogin = new NewLogin();
        myLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IngresarMouseClicked

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
            java.util.logging.Logger.getLogger(EntrarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntrarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntrarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntrarEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntrarEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel ImgFondo;
    private javax.swing.JLabel Ingresar;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JPanel NavBar;
    private javax.swing.JLabel Pass;
    private javax.swing.JLabel Registrarse;
    private javax.swing.JLabel TextoLogin;
    private javax.swing.JLabel User;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JPanel btnRegistrar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
