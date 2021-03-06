/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Registro.Cliente;
import Registro.Factura;

/**
 *
 * @author danie
 */
public class FrameGenerarFactura extends javax.swing.JInternalFrame {

    static Principal principal;
    Cliente cliente = new Cliente();

    /**
     * Creates new form FrameRegistrarVenta
     */
    public FrameGenerarFactura() {
        initComponents();
        lblNombreCliente.setText("");
        lblCedula.setText("");
        lblDireccion.setText("");
        lblTelefono.setText("");
    }

    public FrameGenerarFactura(Principal principal) {
        this.principal = principal;
        initComponents();
    }

    public void mostrarDatos() {
        lblNombreCliente.setText(principal.registrarCliente.nombreCompleto);
        lblCedula.setText(principal.registrarCliente.ci);
        lblDireccion.setText(principal.registrarCliente.direccion);
        lblTelefono.setText(principal.registrarCliente.telefono);
        lblPrecioFinal.setText(String.valueOf(principal.compra.precioFinal));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGenerarFactura = new javax.swing.JLabel();
        lblNombreEmpresa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCine = new javax.swing.JLabel();
        lblRuc2 = new javax.swing.JLabel();
        lblRuc = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        Cedula1 = new javax.swing.JLabel();
        Cedula2 = new javax.swing.JLabel();
        Cedula3 = new javax.swing.JLabel();
        lblPrecioFinal = new javax.swing.JLabel();

        lblGenerarFactura.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        lblGenerarFactura.setText("FACTURA");

        lblNombreEmpresa.setText("Empresa");

        jLabel2.setText("Cliente");

        lblCine.setText("Star Cines");

        lblRuc2.setText("1768156470004");

        lblRuc.setText("RUC");

        lblNombreCliente.setText("jLabel4");

        lblCedula.setText("jLabel5");

        lblDireccion.setText("jLabel6");

        lblTelefono.setText("jLabel7");

        Cedula.setText("Cedula");

        Cedula1.setText("Direccion");

        Cedula2.setText("Telefono");

        Cedula3.setText("Precio Final");

        lblPrecioFinal.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreEmpresa)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblRuc))
                            .addComponent(jLabel2)
                            .addComponent(Cedula)
                            .addComponent(Cedula1)
                            .addComponent(Cedula2))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRuc2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(lblCine))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCedula)
                                    .addComponent(lblNombreCliente)
                                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblPrecioFinal))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cedula3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGenerarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblGenerarFactura)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEmpresa)
                    .addComponent(lblCine))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRuc)
                    .addComponent(lblRuc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNombreCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(Cedula))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(Cedula1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(Cedula2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cedula3)
                    .addComponent(lblPrecioFinal))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Cedula1;
    private javax.swing.JLabel Cedula2;
    private javax.swing.JLabel Cedula3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCine;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblGenerarFactura;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JLabel lblPrecioFinal;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblRuc2;
    private javax.swing.JLabel lblTelefono;
    // End of variables declaration//GEN-END:variables
}
