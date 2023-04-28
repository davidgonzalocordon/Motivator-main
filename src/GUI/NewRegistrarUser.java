/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;

/**
 *
 * @author josem
 */
public class NewRegistrarUser extends javax.swing.JFrame {
    
    int mousex, mousey;
    public NewRegistrarUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Condiciones = new javax.swing.ButtonGroup();
        BackGround = new javax.swing.JPanel();
        PanelRegistro = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        TextoTerminos = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jSeparatorName = new javax.swing.JSeparator();
        labelUsuario = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jSeparatorUser = new javax.swing.JSeparator();
        txtedad = new javax.swing.JTextField();
        labelEdad = new javax.swing.JLabel();
        jSeparatorEdad = new javax.swing.JSeparator();
        labelClave = new javax.swing.JLabel();
        jSeparatorClave = new javax.swing.JSeparator();
        labelConfirClave = new javax.swing.JLabel();
        jSeparatorConfiClave = new javax.swing.JSeparator();
        labelEmail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jSeparatorEmail = new javax.swing.JSeparator();
        TextoRegistro = new javax.swing.JLabel();
        RBsi = new javax.swing.JRadioButton();
        RBno = new javax.swing.JRadioButton();
        jPanelRegistrar = new javax.swing.JPanel();
        jLabelRegistrar = new javax.swing.JLabel();
        labelConfiEmail = new javax.swing.JLabel();
        txtconfiemail = new javax.swing.JTextField();
        jSeparatorConfiEmail = new javax.swing.JSeparator();
        txtclave = new javax.swing.JPasswordField();
        txtconficlave = new javax.swing.JPasswordField();
        img1 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BackGround.setBackground(new java.awt.Color(255, 255, 255));
        BackGround.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelRegistro.setBackground(new java.awt.Color(255, 255, 255));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCerrar)
        );

        TextoTerminos.setBackground(new java.awt.Color(0, 0, 0));
        TextoTerminos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TextoTerminos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoTerminos.setText("Acepta los terminos y condiciones de MOTIVIATOR:");

        labelNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombre.setText("Nombre");

        txtname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtname.setForeground(new java.awt.Color(204, 204, 204));
        txtname.setText("Ingrese Nombre");
        txtname.setBorder(null);
        txtname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtnameMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnameMouseClicked(evt);
            }
        });

        jSeparatorName.setForeground(new java.awt.Color(0, 0, 0));

        labelUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuario.setText("Usuario");

        txtuser.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtuser.setForeground(new java.awt.Color(204, 204, 204));
        txtuser.setText("Ingrese Usuario");
        txtuser.setBorder(null);
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtuserMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserMouseClicked(evt);
            }
        });

        jSeparatorUser.setForeground(new java.awt.Color(0, 0, 0));

        txtedad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtedad.setForeground(new java.awt.Color(204, 204, 204));
        txtedad.setText("Ingrese Edad");
        txtedad.setBorder(null);
        txtedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtedadMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtedadMouseClicked(evt);
            }
        });

        labelEdad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelEdad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEdad.setText("Edad");

        jSeparatorEdad.setForeground(new java.awt.Color(0, 0, 0));

        labelClave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClave.setText("Clave");

        jSeparatorClave.setForeground(new java.awt.Color(0, 0, 0));

        labelConfirClave.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelConfirClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConfirClave.setText("Confirmar Clave");

        jSeparatorConfiClave.setForeground(new java.awt.Color(0, 0, 0));

        labelEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmail.setText("Email");

        txtemail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtemail.setForeground(new java.awt.Color(204, 204, 204));
        txtemail.setText("Ingrese Email");
        txtemail.setBorder(null);
        txtemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtemailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtemailMouseClicked(evt);
            }
        });

        jSeparatorEmail.setForeground(new java.awt.Color(0, 0, 0));

        TextoRegistro.setBackground(new java.awt.Color(0, 0, 0));
        TextoRegistro.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        TextoRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoRegistro.setText("Registro");

        Condiciones.add(RBsi);
        RBsi.setText("SI");

        Condiciones.add(RBno);
        RBno.setText("NO");

        jPanelRegistrar.setBackground(new java.awt.Color(204, 204, 204));

        jLabelRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        jLabelRegistrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistrar.setText("Registrar");
        jLabelRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistrarLayout = new javax.swing.GroupLayout(jPanelRegistrar);
        jPanelRegistrar.setLayout(jPanelRegistrarLayout);
        jPanelRegistrarLayout.setHorizontalGroup(
            jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
        );
        jPanelRegistrarLayout.setVerticalGroup(
            jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        labelConfiEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelConfiEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConfiEmail.setText("Confirmar Email");

        txtconfiemail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtconfiemail.setForeground(new java.awt.Color(204, 204, 204));
        txtconfiemail.setText("Ingrese Email");
        txtconfiemail.setBorder(null);
        txtconfiemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtconfiemailMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtconfiemailMouseClicked(evt);
            }
        });

        jSeparatorConfiEmail.setForeground(new java.awt.Color(0, 0, 0));

        txtclave.setForeground(new java.awt.Color(204, 204, 204));
        txtclave.setText("******");
        txtclave.setBorder(null);
        txtclave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtclaveMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtclaveMouseClicked(evt);
            }
        });

        txtconficlave.setForeground(new java.awt.Color(204, 204, 204));
        txtconficlave.setText("******");
        txtconficlave.setBorder(null);
        txtconficlave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtconficlaveMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtconficlaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelRegistroLayout = new javax.swing.GroupLayout(PanelRegistro);
        PanelRegistro.setLayout(PanelRegistroLayout);
        PanelRegistroLayout.setHorizontalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jPanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(RBsi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(RBno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEmail)
                    .addComponent(labelConfirClave)
                    .addComponent(labelClave)
                    .addComponent(labelEdad)
                    .addComponent(labelUsuario)
                    .addComponent(txtconfiemail)
                    .addComponent(jSeparatorConfiEmail)
                    .addComponent(txtuser)
                    .addComponent(txtedad)
                    .addComponent(txtemail)
                    .addComponent(jSeparatorConfiClave)
                    .addComponent(jSeparatorEdad)
                    .addComponent(jSeparatorUser)
                    .addComponent(TextoTerminos, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(labelConfiEmail)
                    .addComponent(jSeparatorEmail)
                    .addComponent(jSeparatorName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre)
                    .addComponent(txtname)
                    .addComponent(jSeparatorClave)
                    .addComponent(txtclave)
                    .addComponent(txtconficlave))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRegistroLayout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addComponent(TextoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(144, Short.MAX_VALUE)))
        );
        PanelRegistroLayout.setVerticalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(labelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEdad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorClave, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelConfirClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconficlave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorConfiClave, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelConfiEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtconfiemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorConfiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoTerminos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBsi)
                    .addComponent(RBno))
                .addGap(18, 18, 18)
                .addComponent(jPanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRegistroLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(TextoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(608, Short.MAX_VALUE)))
        );

        BackGround.add(PanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 440, 660));

        img1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/100%cucutaF.jpg"))); // NOI18N
        BackGround.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 660));

        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BackGround.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGround, javax.swing.GroupLayout.PREFERRED_SIZE, 651, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtCerrarMouseClicked

    private void txtCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseEntered
        btnClose.setBackground(Color.red);
    }//GEN-LAST:event_txtCerrarMouseEntered

    private void txtCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseExited
        btnClose.setBackground(Color.white);
    }//GEN-LAST:event_txtCerrarMouseExited

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        mousex = evt.getX();
        mousey=evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jLabelRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegistrarMouseClicked
        System.out.println("CODIGO DEL REGISTRAR USUARIO");
    }//GEN-LAST:event_jLabelRegistrarMouseClicked

    private void txtclaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtclaveMouseClicked
       if(String.valueOf(txtname.getText()).isEmpty()){    
            txtname.setText("Ingrese Nombre");
            txtname.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtuser.getText()).isEmpty()){
            txtuser.setText("Ingrese Usuario");
            txtuser.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtedad.getText()).isEmpty()){
            txtedad.setText("Ingrese Edad");
            txtedad.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtclave.getPassword()).equals("******")){
            txtclave.setText("");
            txtclave.setForeground(Color.BLACK);
        }
        if(String.valueOf(txtconficlave.getPassword()).isEmpty()){
            txtconficlave.setText("******");
            txtconficlave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtemail.getText()).isEmpty()){
            txtemail.setText("Ingrese Email");
            txtemail.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconfiemail.getText()).isEmpty()){
            txtconfiemail.setText("Ingrese Email");
            txtconfiemail.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtclaveMouseClicked

    private void txtconficlaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtconficlaveMouseClicked
        if(String.valueOf(txtname.getText()).isEmpty()){    
            txtname.setText("Ingrese Nombre");
            txtname.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtuser.getText()).isEmpty()){
            txtuser.setText("Ingrese Usuario");
            txtuser.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtedad.getText()).isEmpty()){
            txtedad.setText("Ingrese Edad");
            txtedad.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtclave.getPassword()).isEmpty()){
            txtclave.setText("******");
            txtclave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconficlave.getPassword()).equals("******")){
            txtconficlave.setText("");
            txtconficlave.setForeground(Color.BLACK);
        }
        if(String.valueOf(txtemail.getText()).isEmpty()){
            txtemail.setText("Ingrese Email");
            txtemail.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconfiemail.getText()).isEmpty()){
            txtconfiemail.setText("Ingrese Email");
            txtconfiemail.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtconficlaveMouseClicked

    private void txtnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnameMouseClicked
        if(txtname.getText().equals("Ingrese Nombre")){    
            txtname.setText("");
            txtname.setForeground(Color.BLACK);
        }
        if(String.valueOf(txtuser.getText()).isEmpty()){
            txtuser.setText("Ingrese Usuario");
            txtuser.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtedad.getText()).isEmpty()){
            txtedad.setText("Ingrese Edad");
            txtedad.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtclave.getPassword()).isEmpty()){
            txtclave.setText("******");
            txtclave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconficlave.getPassword()).isEmpty()){
            txtconficlave.setText("******");
            txtconficlave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtemail.getText()).isEmpty()){
            txtemail.setText("Ingrese Email");
            txtemail.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconfiemail.getText()).isEmpty()){
            txtconfiemail.setText("Ingrese Email");
            txtconfiemail.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtnameMouseClicked

    private void txtuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMouseClicked
        if(String.valueOf(txtname.getText()).isEmpty()){
            txtname.setText("Ingrese Nombre");
            txtname.setForeground(Color.GRAY);
        }
        if(txtuser.getText().equals("Ingrese Usuario")){
            txtuser.setText("");
            txtuser.setForeground(Color.BLACK);
        }
        if(String.valueOf(txtedad.getText()).isEmpty()){
            txtedad.setText("Ingrese Edad");
            txtedad.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtclave.getPassword()).isEmpty()){
            txtclave.setText("******");
            txtclave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconficlave.getPassword()).isEmpty()){
            txtconficlave.setText("******");
            txtconficlave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtemail.getText()).isEmpty()){
            txtemail.setText("Ingrese Email");
            txtemail.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconfiemail.getText()).isEmpty()){
            txtconfiemail.setText("Ingrese Email");
            txtconfiemail.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtuserMouseClicked

    private void txtedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtedadMouseClicked
        if(String.valueOf(txtname.getText()).isEmpty()){    
            txtname.setText("Ingrese Nombre");
            txtname.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtuser.getText()).isEmpty()){
            txtuser.setText("Ingrese Usuario");
            txtuser.setForeground(Color.GRAY);
        }
        if(txtedad.getText().equals("Ingrese Edad")){
            txtedad.setText("");
            txtedad.setForeground(Color.BLACK);
        }
        if(String.valueOf(txtclave.getPassword()).isEmpty()){
            txtclave.setText("******");
            txtclave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconficlave.getPassword()).isEmpty()){
            txtconficlave.setText("******");
            txtconficlave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtemail.getText()).isEmpty()){
            txtemail.setText("Ingrese Email");
            txtemail.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconfiemail.getText()).isEmpty()){
            txtconfiemail.setText("Ingrese Email");
            txtconfiemail.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtedadMouseClicked

    private void txtemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMouseClicked
        if(String.valueOf(txtname.getText()).isEmpty()){
            txtname.setText("Ingrese Nombre");
            txtname.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtuser.getText()).isEmpty()){
            txtuser.setText("Ingrese Usuario");
            txtuser.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtedad.getText()).isEmpty()){
            txtedad.setText("Ingrese Edad");
            txtedad.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtclave.getPassword()).isEmpty()){
            txtclave.setText("******");
            txtclave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconficlave.getPassword()).isEmpty()){
            txtconficlave.setText("******");
            txtconficlave.setForeground(Color.GRAY);
        }
        if(txtemail.getText().equals("Ingrese Email")){
            txtemail.setText("");
            txtemail.setForeground(Color.BLACK);
        }
        if(String.valueOf(txtconfiemail.getText()).isEmpty()){
            txtconfiemail.setText("Ingrese Email");
            txtconfiemail.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtemailMouseClicked

    private void txtconfiemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtconfiemailMouseClicked
        if(String.valueOf(txtname.getText()).isEmpty()){    
            txtname.setText("Ingrese Nombre");
            txtname.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtuser.getText()).isEmpty()){
            txtuser.setText("Ingrese Usuario");
            txtuser.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtedad.getText()).isEmpty()){
            txtedad.setText("Ingrese Edad");
            txtedad.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtclave.getPassword()).isEmpty()){
            txtclave.setText("******");
            txtclave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtconficlave.getPassword()).isEmpty()){
            txtconficlave.setText("******");
            txtconficlave.setForeground(Color.GRAY);
        }
        if(String.valueOf(txtemail.getText()).isEmpty()){
            txtemail.setText("Ingrese Email");
            txtemail.setForeground(Color.GRAY);
        }
        if(txtconfiemail.getText().equals("Ingrese Email")){
            txtconfiemail.setText("");
            txtconfiemail.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtconfiemailMouseClicked

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
            java.util.logging.Logger.getLogger(NewRegistrarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRegistrarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRegistrarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRegistrarUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewRegistrarUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGround;
    private javax.swing.ButtonGroup Condiciones;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JRadioButton RBno;
    private javax.swing.JRadioButton RBsi;
    private javax.swing.JLabel TextoRegistro;
    private javax.swing.JLabel TextoTerminos;
    private javax.swing.JPanel btnClose;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel jLabelRegistrar;
    private javax.swing.JPanel jPanelRegistrar;
    private javax.swing.JSeparator jSeparatorClave;
    private javax.swing.JSeparator jSeparatorConfiClave;
    private javax.swing.JSeparator jSeparatorConfiEmail;
    private javax.swing.JSeparator jSeparatorEdad;
    private javax.swing.JSeparator jSeparatorEmail;
    private javax.swing.JSeparator jSeparatorName;
    private javax.swing.JSeparator jSeparatorUser;
    private javax.swing.JLabel labelClave;
    private javax.swing.JLabel labelConfiEmail;
    private javax.swing.JLabel labelConfirClave;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JPasswordField txtconficlave;
    private javax.swing.JTextField txtconfiemail;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
