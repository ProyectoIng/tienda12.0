/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.DaoProductoXml;
import Modelo.Producto;
import Modelo.Usuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author luis
 */
public class PantallaInicialCompradorUsuario extends javax.swing.JFrame {

     static String idaux;
    static Usuario usuario;
    DefaultTableModel modelo;
     private boolean resultado = false;
    
     DaoProductoXml datosProducto = new DaoProductoXml();//Creo objeto del controlador del producto
    
     private TableRowSorter trsfiltro;
    
    public PantallaInicialCompradorUsuario(Usuario user) {
        initComponents();
        usuario =  user;
         modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Imagen");
        modelo.addColumn("Categoria");
        modelo.addColumn("Proveedor");
        modelo.addColumn("Id");
        modelo.addColumn("Estado");
        modelo.addColumn("Cant.Mínima");
        modelo.addColumn("Cant.Actual");
        
        this.jTable1.setModel(modelo);//a mi tabla table le asigno el tipo modelo que cree ahora
        
        llenaTabla();//Lleno la tabla
        
        setLocationRelativeTo(null);
        setResizable(false);
        
        //muestro el nombre del usuario en pantalla
        JLUsuario.setText(user.getNombre()+"  "+user.getApellido());
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
        jTextField1 = new javax.swing.JTextField();
        Logo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JLUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon-onlineStore_opt (1).jpg"))); // NOI18N
        Logo1.setText("                      ");
        Logo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logo1MouseClicked(evt);
            }
        });

        jLabel1.setText("Inscríbete");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel1FocusGained(evt);
            }
        });

        jLabel4.setText("Salir");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Bienvenido");

        JLUsuario.setText("    ");
        JLUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JLUsuario))))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Ver Información del Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void filtro() {
   trsfiltro.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 0));
   }
    
     private void llenaTabla()
    {   
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        
        ArrayList<Producto> Lista = datosProducto.todosLosProductos();
        

        for (Producto pro : Lista)
        {
           

             if (pro != null) {
               String[] row = {pro.getNombre(),pro.getDescripcion(),pro.getPrecio(),pro.getImagen(),pro.getCategoria(),pro.getProveedor(),pro.getIdProducto(),pro.getEstadoProducto(),pro.getCantidadMinima(),pro.getCantidadActual()};
               modelo.addRow(row);
             }
            
            
        jTable1.setModel(modelo);
            
            
            
        }
            
     }   
    
    private void Logo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo1MouseClicked
        // TODO add your handling code here:

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaInicialComprador(usuario).setVisible(true);
            }
        });
        this.setVisible(false);

    }//GEN-LAST:event_Logo1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaCompradorRegistrar().setVisible(true);
            }
        });
        this.setVisible(false);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1FocusGained

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaInicialComprador(null).setVisible(true);
            }
        });
        this.setVisible(false);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void JLUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLUsuarioMouseClicked
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaPerfilUsuario(usuario).setVisible(true);
            }
        });
        this.setVisible(false);
        
    }//GEN-LAST:event_JLUsuarioMouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        jTextField1.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (jTextField1.getText());
                jTextField1.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsfiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsfiltro);
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         int filaSeleccionada = jTable1.getSelectedRow();//Obtengo la fila seleccionada
        String nombre,descripcion,precio,imagen,categoria,proveedor,id,estado,cantidadMinima,cantidadActual;
        //meto los valores de la fila seleccionada en las variables
        
        if (filaSeleccionada >= 0 ){
        nombre = jTable1.getValueAt(filaSeleccionada, 0).toString();
        descripcion = jTable1.getValueAt(filaSeleccionada, 1).toString();
        precio = jTable1.getValueAt(filaSeleccionada, 2).toString();
        imagen = jTable1.getValueAt(filaSeleccionada, 3).toString();
        categoria = jTable1.getValueAt(filaSeleccionada, 4).toString();
        proveedor = jTable1.getValueAt(filaSeleccionada, 5).toString();
        id = jTable1.getValueAt(filaSeleccionada, 6).toString();
        estado = jTable1.getValueAt(filaSeleccionada, 7).toString();
        cantidadMinima = jTable1.getValueAt(filaSeleccionada, 8).toString();
        cantidadActual = jTable1.getValueAt(filaSeleccionada, 9).toString();
        
        //creo objeto producto
        Producto pro = new Producto(nombre, descripcion, precio, imagen, categoria, proveedor, id, estado, cantidadMinima, cantidadActual);
        PantallaInformacionProducto pantalla = new PantallaInformacionProducto(pro);
        pantalla.setVisible(true);
        this.setVisible(false);
         //log4j
        Logger log = Logger.getLogger("Logger de Ejemplo");
        log.info("admin producto satisfactorio");
        }else{
        
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun producto");
          //log4j
           Logger log = Logger.getLogger("Logger de Ejemplo");
            log.warning("error no se encontro ninguna seleccion");   
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaInicialCompradorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicialCompradorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicialCompradorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicialCompradorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicialCompradorUsuario(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLUsuario;
    private javax.swing.JLabel Logo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
