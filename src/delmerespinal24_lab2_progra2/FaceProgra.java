/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delmerespinal24_lab2_progra2;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class FaceProgra extends javax.swing.JFrame {

    /**
     * Creates new form FaceProgra
     */
    public FaceProgra(ArrayList<Usuario> ListUsers, Usuario miUsuario) {

        for (Usuario LU : ListUsers) {
            if (LU.equals(miUsuario)) {
                this.miUsuario = LU;
            }
        }

        this.ListUsers = ListUsers;

        initComponents();
    }

    private ArrayList<Usuario> ListUsers;
    private Usuario miUsuario;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_buscaramigos = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_usuarios = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        enviar_solicitud = new javax.swing.JButton();
        jd_solicitudes = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_solicitudes = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        aceptar_solicitud = new javax.swing.JButton();
        nuevo_mensaje = new javax.swing.JDialog();
        cb_destinatarios = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_texto = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        Buzon = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_buzon = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jd_Mensaje = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_emisor = new javax.swing.JTextField();
        tf_receptor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tf_texto = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        tf_fecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jmi_agregar = new javax.swing.JMenuItem();
        jmi_solicitudes = new javax.swing.JMenuItem();
        Lista_Amigos = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        entrada = new javax.swing.JMenuItem();
        salida = new javax.swing.JMenuItem();

        jl_usuarios.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_usuarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Añadir amigos");

        enviar_solicitud.setText("Enviar solicitud de amistad");
        enviar_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_solicitudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_buscaramigosLayout = new javax.swing.GroupLayout(jd_buscaramigos.getContentPane());
        jd_buscaramigos.getContentPane().setLayout(jd_buscaramigosLayout);
        jd_buscaramigosLayout.setHorizontalGroup(
            jd_buscaramigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_buscaramigosLayout.createSequentialGroup()
                .addGroup(jd_buscaramigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_buscaramigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(enviar_solicitud)
                        .addGroup(jd_buscaramigosLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_buscaramigosLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jd_buscaramigosLayout.setVerticalGroup(
            jd_buscaramigosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_buscaramigosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(enviar_solicitud)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jl_solicitudes.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_solicitudes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Solicitudes de amistad");

        aceptar_solicitud.setText("Aceptar solicitud");
        aceptar_solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_solicitudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_solicitudesLayout = new javax.swing.GroupLayout(jd_solicitudes.getContentPane());
        jd_solicitudes.getContentPane().setLayout(jd_solicitudesLayout);
        jd_solicitudesLayout.setHorizontalGroup(
            jd_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_solicitudesLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jd_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_solicitudesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_solicitudesLayout.createSequentialGroup()
                        .addGroup(jd_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aceptar_solicitud)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))))
        );
        jd_solicitudesLayout.setVerticalGroup(
            jd_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_solicitudesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aceptar_solicitud)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        cb_destinatarios.setModel(new DefaultComboBoxModel());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Destinatario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Texto");

        ta_texto.setColumns(20);
        ta_texto.setRows(5);
        jScrollPane3.setViewportView(ta_texto);

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nuevo_mensajeLayout = new javax.swing.GroupLayout(nuevo_mensaje.getContentPane());
        nuevo_mensaje.getContentPane().setLayout(nuevo_mensajeLayout);
        nuevo_mensajeLayout.setHorizontalGroup(
            nuevo_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevo_mensajeLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(nuevo_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(nuevo_mensajeLayout.createSequentialGroup()
                        .addGroup(nuevo_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(nuevo_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_destinatarios, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        nuevo_mensajeLayout.setVerticalGroup(
            nuevo_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevo_mensajeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(nuevo_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_destinatarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(nuevo_mensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jl_buzon.setModel(new DefaultListModel());
        jl_buzon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_buzonMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_buzon);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Mensajes");

        javax.swing.GroupLayout BuzonLayout = new javax.swing.GroupLayout(Buzon.getContentPane());
        Buzon.getContentPane().setLayout(BuzonLayout);
        BuzonLayout.setHorizontalGroup(
            BuzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuzonLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(BuzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        BuzonLayout.setVerticalGroup(
            BuzonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BuzonLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Emisor");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Receptor");

        tf_emisor.setEditable(false);

        tf_receptor.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Texto");

        tf_texto.setEditable(false);
        tf_texto.setColumns(20);
        tf_texto.setRows(5);
        jScrollPane5.setViewportView(tf_texto);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Fecha:");

        tf_fecha.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Mensaje:");

        javax.swing.GroupLayout jd_MensajeLayout = new javax.swing.GroupLayout(jd_Mensaje.getContentPane());
        jd_Mensaje.getContentPane().setLayout(jd_MensajeLayout);
        jd_MensajeLayout.setHorizontalGroup(
            jd_MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_MensajeLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_MensajeLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_MensajeLayout.createSequentialGroup()
                        .addGroup(jd_MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jd_MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jd_MensajeLayout.createSequentialGroup()
                                .addComponent(tf_emisor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(tf_receptor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_MensajeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(272, 272, 272))
        );
        jd_MensajeLayout.setVerticalGroup(
            jd_MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_MensajeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addGroup(jd_MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(tf_emisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_receptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jd_MensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        jMenu3.setText("Inicio");

        jmi_agregar.setText("Agregar amigos");
        jmi_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_agregarActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_agregar);

        jmi_solicitudes.setText("Solicitudes");
        jmi_solicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_solicitudesActionPerformed(evt);
            }
        });
        jMenu3.add(jmi_solicitudes);

        Lista_Amigos.setText("Lista de amigos");
        Lista_Amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_AmigosActionPerformed(evt);
            }
        });
        jMenu3.add(Lista_Amigos);

        Eliminar.setText("Eliminar a un amigo");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jMenu3.add(Eliminar);

        jMenuItem1.setText("Cerrar sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Mensajes");

        jMenuItem3.setText("Enviar mensaje");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        entrada.setText("Buzon de entrada");
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });
        jMenu4.add(entrada);

        salida.setText("Buzon de salida");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        jMenu4.add(salida);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

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

    private void jmi_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_agregarActionPerformed
        DefaultListModel lista = (DefaultListModel) jl_usuarios.getModel();
        lista.removeAllElements();
        for (Usuario LU : ListUsers) {
            if (!LU.equals(miUsuario)) {
                if (!miUsuario.getListaAmigos().contains(LU)) {
                    lista.addElement(LU);
                }
            }
        }

        jd_buscaramigos.setModal(true);
        jd_buscaramigos.pack();
        jd_buscaramigos.setLocationRelativeTo(this);
        jd_buscaramigos.setVisible(true);
    }//GEN-LAST:event_jmi_agregarActionPerformed

    private void enviar_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_solicitudActionPerformed
        DefaultListModel lista = (DefaultListModel) jl_usuarios.getModel();
        int pos = jl_usuarios.getSelectedIndex();
        Usuario Receptor = (Usuario) lista.get(pos);
        for (Usuario LS : ListUsers) {
            if (LS.equals(Receptor)) {
                LS.getListaSolicitudes().add(miUsuario);
                lista.remove(pos);
            }
        }
        JOptionPane.showMessageDialog(this, "Solicitud enviada correctamente");
    }//GEN-LAST:event_enviar_solicitudActionPerformed

    private void jmi_solicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_solicitudesActionPerformed

        DefaultListModel lista = (DefaultListModel) jl_solicitudes.getModel();
        lista.removeAllElements();
        for (Usuario lS : miUsuario.getListaSolicitudes()) {
            lista.addElement(lS);
        }
        jd_solicitudes.setModal(true);
        jd_solicitudes.pack();
        jd_solicitudes.setLocationRelativeTo(this);
        jd_solicitudes.setVisible(true);
    }//GEN-LAST:event_jmi_solicitudesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Principal(ListUsers).setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void aceptar_solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_solicitudActionPerformed
        DefaultListModel lista = (DefaultListModel) jl_solicitudes.getModel();
        int pos = jl_solicitudes.getSelectedIndex();
        for (Usuario LU : ListUsers) {
            if (LU.equals(lista.get(pos))) {
                miUsuario.getListaAmigos().add(LU);
                LU.getListaAmigos().add(miUsuario);
                miUsuario.getListaSolicitudes().remove(LU);
            }
        }

        JOptionPane.showMessageDialog(this, "Ha agregado un nuevo amigo");
        lista.remove(pos);

    }//GEN-LAST:event_aceptar_solicitudActionPerformed

    private void Lista_AmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_AmigosActionPerformed
        String Amigos = "Lista de amigos: \n";
        for (Usuario LU : miUsuario.getListaAmigos()) {
            Amigos += miUsuario.getListaAmigos().indexOf(LU) + ") " + LU.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, Amigos);

    }//GEN-LAST:event_Lista_AmigosActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        String Amigos = "Seleccione posicion a eliminar: \n";
        for (Usuario LU : miUsuario.getListaAmigos()) {
            Amigos += miUsuario.getListaAmigos().indexOf(LU) + ") " + LU.toString() + "\n";
        }
        int pos = Integer.parseInt(JOptionPane.showInputDialog(Amigos));
        for (Usuario LU : miUsuario.getListaAmigos()) {
            if (LU.equals(miUsuario.getListaAmigos().get(pos))) {
                LU.getListaAmigos().remove(miUsuario);
            }
        }

        miUsuario.getListaAmigos().remove(pos);

    }//GEN-LAST:event_EliminarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        if (!miUsuario.getListaAmigos().isEmpty()) {

            DefaultComboBoxModel Lista = (DefaultComboBoxModel) cb_destinatarios.getModel();
            Lista.removeAllElements();
            for (Usuario LU : miUsuario.getListaAmigos()) {
                Lista.addElement(LU);
            }
            
            nuevo_mensaje.setModal(true);
            nuevo_mensaje.pack();
            nuevo_mensaje.setLocationRelativeTo(this);
            nuevo_mensaje.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "No tiene ningun amigo agregado, debe agregar mas amigos");
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String texto = ta_texto.getText();
        Usuario Destinatario = (Usuario) cb_destinatarios.getSelectedItem();
        Mensaje nuevo = new Mensaje(texto, miUsuario, Destinatario, new Date());

        miUsuario.getBandejaSalida().add(nuevo);
        for (Usuario LU : ListUsers) {
            if (LU.equals(Destinatario)) {
                LU.getBandejaEntrada().add(nuevo);
            }
        }
        
        JOptionPane.showMessageDialog(nuevo_mensaje, "Mensaje enviado");
        ta_texto.setText("");
        nuevo_mensaje.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jl_buzonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_buzonMouseClicked
        DefaultListModel Lista = (DefaultListModel) jl_buzon.getModel();
        if (jl_buzon.getSelectedIndex() >= 0) {
            MostrarMensaje((Mensaje) Lista.get(jl_buzon.getSelectedIndex()));

        }

    }//GEN-LAST:event_jl_buzonMouseClicked

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed

        DefaultListModel Lista = (DefaultListModel) jl_buzon.getModel();
        Lista.removeAllElements();
        for (Mensaje mensaje : miUsuario.getBandejaEntrada()) {
            Lista.addElement(mensaje);

        }
        Buzon.setModal(true);
        Buzon.pack();
        Buzon.setLocationRelativeTo(this);
        Buzon.setVisible(true);
    }//GEN-LAST:event_entradaActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        DefaultListModel Lista = (DefaultListModel) jl_buzon.getModel();
        Lista.removeAllElements();
        for (Mensaje mensaje : miUsuario.getBandejaSalida()) {
            Lista.addElement(mensaje);

        }
        Buzon.setModal(true);
        Buzon.pack();
        Buzon.setLocationRelativeTo(this);
        Buzon.setVisible(true);
    }//GEN-LAST:event_salidaActionPerformed

    public void MostrarMensaje(Mensaje mensaje) {

        tf_emisor.setText(mensaje.getEmisor().toString());
        tf_receptor.setText(mensaje.getReceptor().toString());
        tf_texto.setText(mensaje.getTexto());
        tf_fecha.setText(mensaje.getFecha().toString());

        jd_Mensaje.setModal(true);
        jd_Mensaje.pack();
        jd_Mensaje.setLocationRelativeTo(this);
        jd_Mensaje.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Buzon;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Lista_Amigos;
    private javax.swing.JButton aceptar_solicitud;
    private javax.swing.JComboBox<String> cb_destinatarios;
    private javax.swing.JMenuItem entrada;
    private javax.swing.JButton enviar_solicitud;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JDialog jd_Mensaje;
    private javax.swing.JDialog jd_buscaramigos;
    private javax.swing.JDialog jd_solicitudes;
    private javax.swing.JList<String> jl_buzon;
    private javax.swing.JList<String> jl_solicitudes;
    private javax.swing.JList<String> jl_usuarios;
    private javax.swing.JMenuItem jmi_agregar;
    private javax.swing.JMenuItem jmi_solicitudes;
    private javax.swing.JDialog nuevo_mensaje;
    private javax.swing.JMenuItem salida;
    private javax.swing.JTextArea ta_texto;
    private javax.swing.JTextField tf_emisor;
    private javax.swing.JTextField tf_fecha;
    private javax.swing.JTextField tf_receptor;
    private javax.swing.JTextArea tf_texto;
    // End of variables declaration//GEN-END:variables
}
