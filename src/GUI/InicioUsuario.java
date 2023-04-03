/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Lugares;
import Classes.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ASUS
 */
public class InicioUsuario extends javax.swing.JFrame {
    private RegistrarLugar registrarLugar;
    private DefaultTableModel tabla = new DefaultTableModel();
    private Lugares myLugares = new Lugares();
    private Usuario myUsuario = new Usuario();
    private Login myLogin = new Login();
    
    public InicioUsuario() throws IOException {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        Leer();
        String datos[]= new String[4];
        datos=myUsuario.ObtenerDato(myLogin.ID);
        txtNombre.setText(datos[0]);
        txtUsuario.setText(datos[1]);
        txtPassword.setText(datos[2]);
        txtEmail.setText(datos[3]);
        
        PanelUsuario.setEnabledAt(0,true);
        PanelUsuario.setEnabledAt(1,false);
        
    }
    
    public void Leer() throws IOException{
        
        int filas = myLugares.nfilas();
        tableLugares.setModel(tabla);
        tabla.addColumn("NOMBRE");
        tabla.addColumn("DIRECCION");
        tabla.addColumn("TIPO");
        tabla.addColumn("HORARIO");
        tabla.addColumn("CALIFICACION");
        
        for(int i=1; i<=filas; i++){
            
            
            tabla.addRow(myLugares.ReadSite(i));
            tableLugares.setModel(tabla);
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

        horarioLugar = new javax.swing.ButtonGroup();
        horarioRestaurante = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btConfiguracion = new javax.swing.JButton();
        btBuscadorLugares = new javax.swing.JButton();
        PanelUsuario = new javax.swing.JTabbedPane();
        PanelBuscar = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNombreLugar = new javax.swing.JTextField();
        txtDireccionLugar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableLugares = new javax.swing.JTable();
        cmbCalificacionLugar = new javax.swing.JComboBox<>();
        btnBuscarLugar = new javax.swing.JButton();
        btVerLugares = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        cmdTipoLugar = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        btnAgregarLugar = new javax.swing.JButton();
        PanelConfi = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btActualizar = new javax.swing.JButton();
        btCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(219, 19, 19));

        jPanel2.setBackground(new java.awt.Color(201, 52, 52));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 193, 193));

        btConfiguracion.setBackground(new java.awt.Color(255, 255, 51));
        btConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/config.png"))); // NOI18N
        btConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfiguracionActionPerformed(evt);
            }
        });

        btBuscadorLugares.setBackground(new java.awt.Color(255, 255, 51));
        btBuscadorLugares.setText("Buscar");
        btBuscadorLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscadorLugaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btBuscadorLugares, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btBuscadorLugares)
                .addGap(93, 93, 93)
                .addComponent(btConfiguracion)
                .addGap(76, 76, 76))
        );

        PanelUsuario.setBackground(new java.awt.Color(255, 255, 255));

        PanelBuscar.setBackground(new java.awt.Color(102, 193, 193));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("NOMBRE: ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("DIRECCION:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("CALIFICACION");

        tableLugares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "DIRECCION", " TIPO", "HORARIO", "CALIFICACCION"
            }
        ));
        jScrollPane3.setViewportView(tableLugares);

        cmbCalificacionLugar.setBackground(new java.awt.Color(255, 255, 51));
        cmbCalificacionLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "☆1", "☆2", "☆3", "☆4", "☆5" }));

        btnBuscarLugar.setBackground(new java.awt.Color(255, 255, 51));
        btnBuscarLugar.setText("BUSCAR");

        btVerLugares.setBackground(new java.awt.Color(255, 255, 51));
        btVerLugares.setText("VER");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("TIPO:");

        cmdTipoLugar.setBackground(new java.awt.Color(255, 255, 51));
        cmdTipoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centro Comercial", "Parque", "Monumento", "Museo", "Restaurante", "otros" }));

        jRadioButton1.setBackground(new java.awt.Color(102, 193, 193));
        horarioLugar.add(jRadioButton1);
        jRadioButton1.setText("Diurno");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Horario: ");

        jRadioButton2.setBackground(new java.awt.Color(102, 193, 193));
        horarioLugar.add(jRadioButton2);
        jRadioButton2.setText("Nocturno");

        jRadioButton3.setBackground(new java.awt.Color(102, 193, 193));
        horarioLugar.add(jRadioButton3);
        jRadioButton3.setText("Ambos");

        btnAgregarLugar.setBackground(new java.awt.Color(255, 255, 51));
        btnAgregarLugar.setText("AGREGAR");
        btnAgregarLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(PanelBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdTipoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                                        .addComponent(txtNombreLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDireccionLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbCalificacionLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 85, Short.MAX_VALUE))))
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btnBuscarLugar)
                        .addGap(28, 28, 28)
                        .addComponent(btnAgregarLugar)
                        .addGap(18, 18, 18)
                        .addComponent(btVerLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtDireccionLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cmbCalificacionLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton2))
                    .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(cmdTipoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btVerLugares)
                        .addComponent(btnAgregarLugar))
                    .addComponent(btnBuscarLugar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelUsuario.addTab("Buscar", PanelBuscar);

        PanelConfi.setBackground(new java.awt.Color(102, 193, 193));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("CLAVE: ");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setText("NOMBRE:");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("USUARIO:");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setText("EMAIL: ");

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setText("DATOS DEL USUARIO ");

        btActualizar.setBackground(new java.awt.Color(255, 255, 51));
        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        btCerrarSesion.setBackground(new java.awt.Color(255, 255, 51));
        btCerrarSesion.setText("Cerrar Sesion");
        btCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelConfiLayout = new javax.swing.GroupLayout(PanelConfi);
        PanelConfi.setLayout(PanelConfiLayout);
        PanelConfiLayout.setHorizontalGroup(
            PanelConfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfiLayout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel32)
                .addGap(0, 267, Short.MAX_VALUE))
            .addGroup(PanelConfiLayout.createSequentialGroup()
                .addGroup(PanelConfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConfiLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(PanelConfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelConfiLayout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelConfiLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelConfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PanelConfiLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelConfiLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword))))
                    .addGroup(PanelConfiLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btActualizar)
                        .addGap(97, 97, 97)
                        .addComponent(btCerrarSesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelConfiLayout.setVerticalGroup(
            PanelConfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConfiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(31, 31, 31)
                .addGroup(PanelConfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(PanelConfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(PanelConfiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btActualizar)
                    .addComponent(btCerrarSesion))
                .addGap(73, 73, 73))
        );

        PanelUsuario.addTab("Configuracion", PanelConfi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap())
        );

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

    private void btnAgregarLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLugarActionPerformed
        
        if(myLogin.level!=1){
            registrarLugar = new RegistrarLugar();
            registrarLugar.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "NO TIENE PERMISOS SUFICIENTES");
        }
    }//GEN-LAST:event_btnAgregarLugarActionPerformed

    private void btCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarSesionActionPerformed
        myLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btCerrarSesionActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        String nombre = txtNombre.getText(); 
        String usuario = txtUsuario.getText();
        String email = txtEmail.getText();
        String contra= txtPassword.getText();
        
        try {
            myUsuario.EditUser(nombre, email, contra, usuario, myLogin.ID, 1);
        } catch (IOException ex) {
            Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btBuscadorLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscadorLugaresActionPerformed
        PanelUsuario.setEnabledAt(0,true);
        PanelUsuario.setEnabledAt(1,false);
    }//GEN-LAST:event_btBuscadorLugaresActionPerformed

    private void btConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfiguracionActionPerformed
        PanelUsuario.setEnabledAt(0,false);
        PanelUsuario.setEnabledAt(1,true);
    }//GEN-LAST:event_btConfiguracionActionPerformed

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
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(InicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new InicioUsuario().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InicioUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JPanel PanelConfi;
    private javax.swing.JTabbedPane PanelUsuario;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBuscadorLugares;
    private javax.swing.JButton btCerrarSesion;
    private javax.swing.JButton btConfiguracion;
    private javax.swing.JButton btVerLugares;
    private javax.swing.JButton btnAgregarLugar;
    private javax.swing.JButton btnBuscarLugar;
    private javax.swing.JComboBox<String> cmbCalificacionLugar;
    private javax.swing.JComboBox<String> cmdTipoLugar;
    private javax.swing.ButtonGroup horarioLugar;
    private javax.swing.ButtonGroup horarioRestaurante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableLugares;
    private javax.swing.JTextField txtDireccionLugar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreLugar;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
