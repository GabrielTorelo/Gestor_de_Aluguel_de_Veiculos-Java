package Form;

public class Principal extends javax.swing.JFrame {
    private final GerenciarCli gerenciarCli = GerenciarCli.getGerenciarCli();
    private final GerenciarVei gerenciarVei = GerenciarVei.getGerenciarVei();
    private final GerenciarPed gerenciarPed = GerenciarPed.getGerenciarPed();
    
    public Principal() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barMenuPrincipal = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();
        subMenuGerenciar = new javax.swing.JMenu();
        itemMenuVeiculos = new javax.swing.JMenuItem();
        itemMenuClientes = new javax.swing.JMenuItem();
        itemMenuPedidos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPrincipal.setText("Principal");

        subMenuGerenciar.setText("Gerenciar");

        itemMenuVeiculos.setText("Veículos...");
        itemMenuVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVeiculosActionPerformed(evt);
            }
        });
        subMenuGerenciar.add(itemMenuVeiculos);

        itemMenuClientes.setText("Clientes...");
        itemMenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuClientesActionPerformed(evt);
            }
        });
        subMenuGerenciar.add(itemMenuClientes);

        itemMenuPedidos.setText("Pedidos...");
        itemMenuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuPedidosActionPerformed(evt);
            }
        });
        subMenuGerenciar.add(itemMenuPedidos);

        menuPrincipal.add(subMenuGerenciar);

        barMenuPrincipal.add(menuPrincipal);

        setJMenuBar(barMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVeiculosActionPerformed
        abreVeiculo();
    }//GEN-LAST:event_itemMenuVeiculosActionPerformed

    private void itemMenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuClientesActionPerformed
        abreCliente();
    }//GEN-LAST:event_itemMenuClientesActionPerformed

    private void itemMenuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuPedidosActionPerformed
        abrePedido();
    }//GEN-LAST:event_itemMenuPedidosActionPerformed
    
    //Abrir o Gerenciamento de Veículos
    public void abreVeiculo(){
        gerenciarVei.setVisible(true);  
        gerenciarVei.listarTabVei();
    }
    
    //Abrir o Gerenciamento de Clientes
    public void abreCliente(){
        gerenciarCli.setVisible(true); 
        gerenciarCli.listarTabCli();
    }
    
    //Abrir o gerenciamento de Pedidos
    public void abrePedido(){
        gerenciarPed.setVisible(true);
        gerenciarPed.listarTabPed();
    }
   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barMenuPrincipal;
    private javax.swing.JMenuItem itemMenuClientes;
    private javax.swing.JMenuItem itemMenuPedidos;
    private javax.swing.JMenuItem itemMenuVeiculos;
    private javax.swing.JMenu menuPrincipal;
    private javax.swing.JMenu subMenuGerenciar;
    // End of variables declaration//GEN-END:variables
}
