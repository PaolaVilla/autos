/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.Autos;
import ec.edu.ister.modelo.Conexion;
import ec.edu.ister.modelo.Validaciones;
import ec.edu.ister.modelo.Vehiculo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexandra
 */
public class registroAutos extends javax.swing.JFrame {

    /**
     * Creates new form registroAutos
     */
    Autos autos = new Autos();
    Vehiculo vehiculo = new Vehiculo();
    Conexion conexion = new Conexion();
    Connection connection = conexion.getConexion();
    Validaciones validaciones = new Validaciones();
    Statement satements;
    ResultSet resultSet;

    public registroAutos() {
        initComponents();
        tabla("");
    }
   
    void btnRegistrar() {                                             
        autos.setRegistrarAutos(txtCodigo.getText(), cbxGrupo.getSelectedItem().toString(), txtModelo.getText(), Integer.parseInt(txtCantidad.getText()), txtColor.getText(), txtMotor.getText(), Double.parseDouble(txtPrecio.getText()), Integer.parseInt((cbxAnio.getSelectedItem().toString())), txtPotencia.getText(), cbxGasolina.getSelectedItem().toString());
        tabla("");
        limpiar();
    }  
    
    void btnActualizar() {                                             
        autos.setModificarAutos(txtCodigo.getText(), cbxGrupo.getSelectedItem().toString(), txtModelo.getText(), Integer.parseInt(txtCantidad.getText()), txtColor.getText(), txtMotor.getText(), Double.parseDouble(txtPrecio.getText()), Integer.parseInt((cbxAnio.getSelectedItem().toString())), txtPotencia.getText(), cbxGasolina.getSelectedItem().toString());
        tabla("");
        limpiar();
    }    
    
    void btnBorrar() {                                          
        autos.setEliminarAutos(txtCodigo.getText());
        tabla("");
        limpiar();
    }  
    
    void btnBuscar(){
        tabla(txtBuscar.getText());
    }
    
    void seleccionar(){
    if (tablaCarros.getSelectedRow() >= 0) {
            txtCodigo.setText(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 0).toString());
            cbxGrupo.setSelectedItem(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 1).toString());
            txtModelo.setText(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 2).toString());
            txtCantidad.setText(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 3).toString());
            txtColor.setText(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 4).toString());
            txtMotor.setText(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 5).toString());
            txtPrecio.setText(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 6).toString());
            cbxAnio.setSelectedItem(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 7).toString());
            txtPotencia.setText(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 8).toString());
            cbxGasolina.setSelectedItem(tablaCarros.getValueAt(tablaCarros.getSelectedRow(), 9).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Debes seleccionar un registro...!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        btnEliminar = new javax.swing.JMenuItem();
        btnSeleccionar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        cbxGrupo = new javax.swing.JComboBox<>();
        cbxAnio = new javax.swing.JComboBox<>();
        cbxGasolina = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtPotencia = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCarros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnEliminar);

        btnSeleccionar.setText("Sleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btnSeleccionar);

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "PATHFINDER", "VERSA", "FRONTIER", "KICKS" }));
        cbxGrupo.setToolTipText("");
        cbxGrupo.setOpaque(false);
        cbxGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGrupoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 150, 20));
        cbxGrupo.getAccessibleContext().setAccessibleName("");

        cbxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988" }));
        cbxAnio.setOpaque(false);
        getContentPane().add(cbxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 150, 20));

        cbxGasolina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Diesel", "Super", "Extra" }));
        cbxGasolina.setOpaque(false);
        getContentPane().add(cbxGasolina, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 150, 20));

        txtCodigo.setBorder(null);
        txtCodigo.setOpaque(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 140, 20));

        txtModelo.setBorder(null);
        txtModelo.setOpaque(false);
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 140, 20));

        txtCantidad.setBorder(null);
        txtCantidad.setOpaque(false);
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 140, 20));

        txtColor.setBorder(null);
        txtColor.setOpaque(false);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        txtColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorKeyTyped(evt);
            }
        });
        getContentPane().add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 140, 20));

        txtMotor.setBorder(null);
        txtMotor.setOpaque(false);
        getContentPane().add(txtMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 140, 20));

        txtPrecio.setBorder(null);
        txtPrecio.setOpaque(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 140, 20));

        txtPotencia.setBorder(null);
        txtPotencia.setOpaque(false);
        getContentPane().add(txtPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 140, 20));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, -1));
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 120, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 970, -1));

        tablaCarros.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCarros.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(tablaCarros);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 920, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ister/imagenes/Autos.png"))); // NOI18N
        jLabel1.setText("as");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 970, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void cbxGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxGrupoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        btnRegistrar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        btnActualizar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminarFila();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        btnBuscar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        seleccionar();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // TODO add your handling code here:
        validaciones.soloNumeros(evt);
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorKeyTyped
        // TODO add your handling code here:
        validaciones.soloLetras(evt);
    }//GEN-LAST:event_txtColorKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        validaciones.soloPrecio(evt);
    }//GEN-LAST:event_txtPrecioKeyTyped

    
    
    void tabla(String codigo) {
        DefaultTableModel objetoTabla = new DefaultTableModel();
        objetoTabla.addColumn("Codigo");
        objetoTabla.addColumn("Grupo");
        objetoTabla.addColumn("Modelo");
        objetoTabla.addColumn("Cantidad");
        objetoTabla.addColumn("Color");
        objetoTabla.addColumn("Motor");
        objetoTabla.addColumn("Precio");
        objetoTabla.addColumn("Año");
        objetoTabla.addColumn("Potencia");
        objetoTabla.addColumn("Combustible");

        tablaCarros.setModel(objetoTabla);
        String sql;
        String tablaBD = "autos";
        if ("".equals(codigo)) {
            sql = "SELECT * FROM autos ";
        } else {
            sql = "SELECT * FROM autos WHERE codigo='" + codigo + "';";
        }
        String[] campoTabla = new String[10];
        try {
            satements = connection.createStatement();
            resultSet = satements.executeQuery(sql);
            while (resultSet.next()) {
                campoTabla[0] = resultSet.getString(1);
                campoTabla[1] = resultSet.getString(2);
                campoTabla[2] = resultSet.getString(3);
                campoTabla[3] = resultSet.getString(4);
                campoTabla[4] = resultSet.getString(5);
                campoTabla[5] = resultSet.getString(6);
                campoTabla[6] = resultSet.getString(7);
                campoTabla[7] = resultSet.getString(8);
                campoTabla[8] = resultSet.getString(9);
                campoTabla[9] = resultSet.getString(10);

                objetoTabla.addRow(campoTabla);
            }
            tablaCarros.setModel(objetoTabla);
        } catch (SQLException ex) {
            ex.toString();
        }
    }

    void limpiar() {
        txtBuscar.setText("");
        txtCodigo.setText("");
        cbxGrupo.setSelectedItem("");
        txtModelo.setText("");
        txtCantidad.setText("");
        txtColor.setText("");
        txtMotor.setText("");
        txtPrecio.setText("");
        cbxAnio.setSelectedItem("");
        txtPotencia.setText("");
        cbxGasolina.setSelectedItem("");
    }

    boolean validar() {
        return txtCodigo.getText().equals("")
                || cbxGrupo.getSelectedItem().equals("")
                || txtModelo.getText().equals("")
                || txtCantidad.getText().equals("")
                || txtColor.getText().equals("")
                || txtMotor.getText().equals("")
                || txtPrecio.getText().equals("")
                || cbxAnio.getSelectedItem().equals("")
                || txtPotencia.getText().equals("")
                || cbxGasolina.getSelectedItem().equals("");
    }
    
    void eliminarFila(){
        if (!validar()) {
            btnBorrar();
        }else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar un registro...!");
        }
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JMenuItem btnSeleccionar;
    private javax.swing.JComboBox<String> cbxAnio;
    private javax.swing.JComboBox<String> cbxGasolina;
    private javax.swing.JComboBox<String> cbxGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaCarros;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
