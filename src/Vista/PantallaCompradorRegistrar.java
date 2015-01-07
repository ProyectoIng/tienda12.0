/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.DaoUsuarioXml;
import Modelo.Usuario;
import TiendaVirtual.EscribeFichero;
import TiendaVirtual.LeerFichero;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author luis
 */
public class PantallaCompradorRegistrar extends javax.swing.JFrame {

    static Usuario usuario;
    LeerFichero leer =  new LeerFichero();
    EscribeFichero escribe = new EscribeFichero();
    private static String idaux;//Auxiliar del id del usuario
    private static int intIdUsuario;//valor entero para poder sumar el id
    
    DaoUsuarioXml datosUsuario = new DaoUsuarioXml();//Creo el objeto de datosUsuario para insertar el usuario en el xml
    private boolean resultado = false;//un boolean para obtener un resultado de ingreso del usuario
    
    /**
     * Creates new form PantallaCompradorRegistrar
     */
    public PantallaCompradorRegistrar() {
        initComponents();
        JLBID.setVisible(false);
        JLBId.setVisible(false);
        setLocationRelativeTo(null);
        setResizable(false);
        
        try {//obtengo el id desde el archivo idUsuario
            idaux = leer.obtenerId("idUsuario.txt");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(PantallaAdminAgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JLBId.setText(idaux);//Le asigno al jlblid el id del archivo
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JTFCorreo = new javax.swing.JTextField();
        JTFPassword = new javax.swing.JTextField();
        JTFNombre = new javax.swing.JTextField();
        JTFApellido = new javax.swing.JTextField();
        JTFCedula = new javax.swing.JTextField();
        JTFUsername = new javax.swing.JTextField();
        JBAgregarUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JTFDireccion = new javax.swing.JTextField();
        JTFMetodoDePago = new javax.swing.JTextField();
        JLBId = new javax.swing.JLabel();
        JLBID = new javax.swing.JLabel();
        jDFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jDFechaRegistro = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        Logo5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(639, 450));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        JTFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPasswordActionPerformed(evt);
            }
        });

        JTFApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFApellidoActionPerformed(evt);
            }
        });

        JTFUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFUsernameActionPerformed(evt);
            }
        });

        JBAgregarUsuario.setText("Registrarme");
        JBAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("CI/Pasaporte");

        jLabel6.setText("Username");

        jLabel7.setText("Correo");

        jLabel8.setText("Dirección Física");

        jLabel9.setText("Password");

        jLabel10.setText("Fecha de Nacimiento");

        jLabel12.setText("Método de Pago");

        jLabel13.setText("Fecha de Registro");

        JLBID.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTFPassword)
                            .addComponent(JTFApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(JTFCorreo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(JLBId, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFMetodoDePago, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(JTFDireccion)
                                    .addComponent(jDFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jDFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLBID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(JTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel10))
                    .addComponent(jDFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTFMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jDFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JBAgregarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLBID)
                .addGap(20, 20, 20)
                .addComponent(JLBId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        Logo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-onlineStore_opt (1).jpg"))); // NOI18N
        Logo5.setText("                      ");
        Logo5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logo5MouseClicked(evt);
            }
        });

        jLabel11.setText("Salir");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel1.setText("Ingresa");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Logo5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPasswordActionPerformed

    private void JTFApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFApellidoActionPerformed

    private void JTFUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFUsernameActionPerformed

    private void JBAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarUsuarioActionPerformed

        String nombre,apellido,cedula,username,password,correo,direccionFisica,fechaDeNacimiento,metodoDePago,fechaDeRegistro,rol,idUsuario,estadoUsuario;

        //asignación de valores al objeto
        nombre = JTFNombre.getText();
        apellido = JTFApellido.getText();
        cedula = JTFCedula.getText();
        username = JTFUsername.getText();
        password = JTFPassword.getText();
        correo = JTFCorreo.getText();
        direccionFisica = JTFDireccion.getText();
        fechaDeNacimiento = String.valueOf(jDFechaNacimiento.getCalendar().get(Calendar.DATE)) +"/"+ String.valueOf(jDFechaNacimiento.getCalendar().get(Calendar.MONTH)) +"/"+ String.valueOf(jDFechaNacimiento.getCalendar().get(Calendar.YEAR));
        metodoDePago = JTFMetodoDePago.getText();
        fechaDeRegistro = String.valueOf(jDFechaRegistro.getCalendar().get(Calendar.DATE)) +"/"+ String.valueOf(jDFechaRegistro.getCalendar().get(Calendar.MONTH)) +"/"+ String.valueOf(jDFechaRegistro.getCalendar().get(Calendar.YEAR));
        
        rol = "Comprador";
        idUsuario = JLBId.getText();
        estadoUsuario = "Activo";//asigno los valores de los campos de texto a las variables

        //Creo un objeto de tipo usuario
        Usuario user = new Usuario(nombre, apellido, cedula, username, password, correo, direccionFisica, fechaDeNacimiento, metodoDePago, fechaDeRegistro, rol, idUsuario, estadoUsuario);

        //Verifico que los campos no estén vacíos
        if(JTFNombre.getText().isEmpty() || JTFApellido.getText().isEmpty() || JTFCedula.getText().isEmpty() || JTFUsername.getText().isEmpty() || JTFPassword.getText().isEmpty() || JTFCorreo.getText().isEmpty() || JTFDireccion.getText().isEmpty()   || jDFechaNacimiento.getDateFormatString().isEmpty() ||  JTFMetodoDePago.getText().isEmpty() || jDFechaRegistro.getDateFormatString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "Error al Agregar Categoria", JOptionPane.ERROR_MESSAGE);

            //log4j
            Logger log = Logger.getLogger("Logger de Ejemplo");
            
        }
        else{

            resultado = datosUsuario.agregarUsuario(user);//Llamo a la funcion agregar dentro del daousuario
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Usuario agregado con exito!", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                //limpia();
                java.awt.EventQueue.invokeLater(new Runnable() {
                   
                   public void run() {
                   new PantallaInicialComprador(usuario).setVisible(true);
                   }
                   });
                   this.setVisible(false);
                //log4j
                Logger log = Logger.getLogger("Logger de Ejemplo");
                log.info("usuario añadido satisfactoriamente");

                //GESTIÓN DEL ID
                intIdUsuario = Integer.parseInt(idaux);//parseo a int el id
                intIdUsuario++;//le sumo uno al id
                idaux = Integer.toString(intIdUsuario);//Parseo a string el id
                escribe.Escribir("idUsuario.txt", idaux);//escribo el id en el archivo

            } else {
                JOptionPane.showMessageDialog(null, "Operacion Fallida", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
    }//GEN-LAST:event_JBAgregarUsuarioActionPerformed

    private void Logo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo5MouseClicked
        // TODO add your handling code here:

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaInicialComprador(usuario).setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_Logo5MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaInicialComprador(null).setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
                   
                   public void run() {
                   new PantallaIngresar().setVisible(true);
                   }
                   });
                   this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(PantallaCompradorRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCompradorRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCompradorRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCompradorRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCompradorRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregarUsuario;
    private javax.swing.JLabel JLBID;
    private javax.swing.JLabel JLBId;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFCedula;
    private javax.swing.JTextField JTFCorreo;
    private javax.swing.JTextField JTFDireccion;
    private javax.swing.JTextField JTFMetodoDePago;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFPassword;
    private javax.swing.JTextField JTFUsername;
    private javax.swing.JLabel Logo5;
    private com.toedter.calendar.JDateChooser jDFechaNacimiento;
    private com.toedter.calendar.JDateChooser jDFechaRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}