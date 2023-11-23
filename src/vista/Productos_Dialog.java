/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author User
 */
public class Productos_Dialog extends javax.swing.JFrame {

    public Productos_Dialog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        lbl_sueldo = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        btnExaminar = new javax.swing.JButton();
        lbl_foto = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        lbl_sueldo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTitulo.setBackground(new java.awt.Color(76, 179, 255));

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("AGREGAR PRODUCTOS");
        jLabelTitulo.setFocusCycleRoot(true);
        jLabelTitulo.setPreferredSize(new java.awt.Dimension(340, 35));
        jPanelTitulo.add(jLabelTitulo);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");
        jPanel1.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lbl_apellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_apellido.setText("Descripción:");
        jPanel1.add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 70));

        lbl_telefono.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_telefono.setText("Precio:");
        jPanel1.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        lbl_sexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sexo.setText("Categoria");
        jPanel1.add(lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lbl_sueldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sueldo.setText("FOTO DEL PRODUCTO");
        jPanel1.add(lbl_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 120, -1));
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 200, 100));

        btnExaminar.setBackground(new java.awt.Color(255, 153, 0));
        btnExaminar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnExaminar.setForeground(new java.awt.Color(255, 255, 255));
        btnExaminar.setText("Examinar");
        jPanel1.add(btnExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, 30));

        lbl_foto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(lbl_foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 90, 120));

        btnAceptar.setBackground(new java.awt.Color(86, 148, 229));
        btnAceptar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 263, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(72, 169, 72));
        btnCancelar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 263, 130, 40));

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ropa", "Tecnologia", "Hogar" }));
        jPanel1.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 120, -1));

        lbl_sueldo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_sueldo1.setText("Atributos Adicionales:");
        jPanel1.add(lbl_sueldo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 335, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Productos_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos_Dialog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExaminar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sueldo;
    private javax.swing.JLabel lbl_sueldo1;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
