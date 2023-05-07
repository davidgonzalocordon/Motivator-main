/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

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
public class NewLogin extends javax.swing.JFrame {

    int mouseX, mouseY;
    private Usuario usuario;
    private InicioAdmin inicioAdmin;
    private InicioUsuario inicioUsuario;
    private NewRegistrarUser registrarUsuario;
    private EntrarEmpresa entrarEmpresa;
    public static int level;
    public static int ID;
    
    public NewLogin() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.usuario = new Usuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        NombreApp = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        ImgFondo = new javax.swing.JLabel();
        TextoLogin = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Pass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegistrar1 = new javax.swing.JPanel();
        Empresa = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JPanel();
        Registrarse = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        IniciarSesion = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        NavBar = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreApp.setBackground(new java.awt.Color(0, 0, 0));
        NombreApp.setFont(new java.awt.Font("Quicksand Medium", 1, 36)); // NOI18N
        NombreApp.setForeground(new java.awt.Color(51, 51, 0));
        NombreApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreApp.setText("MOTIVIATOR");
        Fondo.add(NombreApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 330, -1));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LogoNew.png"))); // NOI18N
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Fondo.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 330, 180));

        ImgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/FondoNewLogin.jpg"))); // NOI18N
        Fondo.add(ImgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 560));

        TextoLogin.setBackground(new java.awt.Color(0, 0, 0));
        TextoLogin.setFont(new java.awt.Font("Quicksand", 0, 24)); // NOI18N
        TextoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoLogin.setText("Iniciar Sesión");
        Fondo.add(TextoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 160, 40));

        User.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        User.setText("Usuario");
        Fondo.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setText("Ingresar usuario");
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
        Fondo.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 330, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 330, 10));

        Pass.setFont(new java.awt.Font("Quicksand Medium", 0, 18)); // NOI18N
        Pass.setText("Contraseña");
        Fondo.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 120, -1));

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
        Fondo.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 330, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 410, 30));

        btnRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Empresa.setFont(new java.awt.Font("Quicksand Light", 1, 18)); // NOI18N
        Empresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Empresa.setText("Ingresar");
        Empresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpresaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrar1Layout = new javax.swing.GroupLayout(btnRegistrar1);
        btnRegistrar1.setLayout(btnRegistrar1Layout);
        btnRegistrar1Layout.setHorizontalGroup(
            btnRegistrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Empresa, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnRegistrar1Layout.setVerticalGroup(
            btnRegistrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Empresa, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Fondo.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 130, 50));

        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Registrarse.setFont(new java.awt.Font("Quicksand Light", 1, 18)); // NOI18N
        Registrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Registrarse.setText("Registrarse");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Fondo.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 130, 50));

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
            .addComponent(IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLoginLayout.createSequentialGroup()
                .addComponent(IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        Fondo.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 130, 50));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 330, 30));

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
        Fondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 410, 30));

        jLabel2.setFont(new java.awt.Font("Quicksand", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("¿Aún no tienes cuenta?\n     \nRegistrate Aqui");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 360, 30));

        jLabel3.setFont(new java.awt.Font("Quicksand", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿Eres una empresa de turismo? ");
        jLabel3.setToolTipText("");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 380, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            
            String id = usuario.getId(user, pass);
            
            if(id.equals("No existente")){
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
            }
            else{
               int lvl = usuario.getLevel(id);
               
               if (lvl == 3){
                   level = lvl;
                   ID=(int)(Double.parseDouble(id));
                   this.inicioAdmin = new InicioAdmin();
                   inicioAdmin.setVisible(true);
                   this.setVisible(false);
               }
               else{
                   level = lvl;
                   ID=(int)(Double.parseDouble(id));
                   this.inicioUsuario = new InicioUsuario();
                   inicioUsuario.setVisible(true);
                   this.setVisible(false);
               }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(NewLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IniciarSesionMouseClicked

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        this.registrarUsuario = new NewRegistrarUser();
        registrarUsuario.setVisible(true);
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

    private void EmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpresaMouseClicked
        this.entrarEmpresa = new EntrarEmpresa();
        entrarEmpresa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpresaMouseClicked

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
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empresa;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel ImgFondo;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel NavBar;
    private javax.swing.JLabel NombreApp;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
