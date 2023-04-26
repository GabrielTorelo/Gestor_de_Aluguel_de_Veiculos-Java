package Form;

import Util.Util;
import DataBase.BDveiculo;
import Exception.PlacaNegException;
import Exception.AnoNegException;
import Exception.PrecoNegException;
import Service.ServiceVeiculo;
import Model.Veiculo;
import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GerenciarVei extends javax.swing.JFrame {

    private Veiculo veiculo;
    private static BDveiculo bdVei = ServiceVeiculo.verVeiculos();
    private static GerenciarVei unicoGerVei;

    private GerenciarVei() {
        initComponents();
    }

    //Singleton para não duplicar a abertura da janela GerenciarVei
    public static GerenciarVei getGerenciarVei() {

        if (unicoGerVei == null) {
            unicoGerVei = new GerenciarVei();
        }
        return unicoGerVei;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPreco = new javax.swing.JLabel();
        ctPreco = new javax.swing.JTextField();
        lblModelo = new javax.swing.JLabel();
        ctModelo = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        ctAno = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        ctPlaca = new javax.swing.JTextField();
        btCadCar = new javax.swing.JButton();
        btConsCarPlaca = new javax.swing.JButton();
        btExcCarPlaca = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabVei = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Veículos");
        setSize(new java.awt.Dimension(1103, 829));

        lblPreco.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPreco.setText("Preço (Valor inteiro): ");
        lblPreco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ctPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPrecoActionPerformed(evt);
            }
        });

        lblModelo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblModelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblModelo.setText("Modelo: ");
        lblModelo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblAno.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAno.setText("Ano (ANO/ANO): ");
        lblAno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblPlaca.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaca.setText("Placa: ");
        lblPlaca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btCadCar.setText("Cadastar");
        btCadCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCarActionPerformed(evt);
            }
        });

        btConsCarPlaca.setText("Consultar pela placa");
        btConsCarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsCarPlacaActionPerformed(evt);
            }
        });

        btExcCarPlaca.setText("Excluir pela placa");
        btExcCarPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcCarPlacaActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tabVei.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Modelo", "Ano", "Preço", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabVei.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabVei.setSurrendersFocusOnKeystroke(true);
        tabVei.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabVeiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabVei);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ctAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(ctPreco)
                            .addComponent(ctModelo)
                            .addComponent(ctPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addComponent(btCadCar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btConsCarPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcCarPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(ctModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(ctPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(ctPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadCar)
                    .addComponent(btConsCarPlaca)
                    .addComponent(btExcCarPlaca)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCarActionPerformed
        cadVei();
        listarTabVei();
    }//GEN-LAST:event_btCadCarActionPerformed

    private void btConsCarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsCarPlacaActionPerformed
        consVei();
    }//GEN-LAST:event_btConsCarPlacaActionPerformed

    private void btExcCarPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcCarPlacaActionPerformed
        excluiVei();
        listarTabVei();
    }//GEN-LAST:event_btExcCarPlacaActionPerformed

    private void tabVeiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabVeiMouseClicked
        selectTabVei();
    }//GEN-LAST:event_tabVeiMouseClicked

    private void ctPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPrecoActionPerformed

    //Cadastrar veículo - FALTA FAZER AINDA!!!!
    public void cadVei() {
        veiculo = new Veiculo();
        String respostaAPI;

        if (!ctModelo.getText().isEmpty()) {
            if (!ctAno.getText().isEmpty()) {
                if (!ctPreco.getText().isEmpty()) {
                    if (!ctPlaca.getText().isEmpty() && !Util.checarEspacoVazio(ctPlaca.getText())) {
                        try {
                            veiculo.setPlaca(ctPlaca.getText());
                            veiculo = bdVei.cons_Vei(veiculo);

                            if (veiculo == null) {
                                veiculo = new Veiculo();
                                
                                veiculo.setModelo(ctModelo.getText());
                                veiculo.setAno(ctAno.getText());
                                veiculo.setPreco(Integer.parseInt(ctPreco.getText()));
                                veiculo.setPlaca(ctPlaca.getText());
                                
                                respostaAPI = ServiceVeiculo.criaVeiculo(veiculo);
                                
                                mensagemRetornoAPI(respostaAPI);
                            } else {
                                JOptionPane.showMessageDialog(null, "Já existe um veículo com essa placa!", "Placa existente", 0);
                                ctPlaca.setText("");
                                ctPlaca.requestFocus();
                            }
                        } catch (NumberFormatException nfe) {
                            JOptionPane.showMessageDialog(null, "O preço deve ser um número inteiro!", "ERRO no preço", 0);
                            ctPreco.setText("");
                            ctPreco.requestFocus();
                        } catch (AnoNegException ane) {
                            ane.impAnoNeg();
                            ctAno.setText("");
                            ctAno.requestFocus();
                        } catch (PlacaNegException pe) {
                            pe.impPlaca();
                            ctPlaca.setText("");
                            ctPlaca.requestFocus();
                        } catch (PrecoNegException pne) {
                            pne.impPrecoNeg();
                            ctPreco.setText("");
                            ctPreco.requestFocus();
                        } catch (UnsupportedEncodingException uee) {
                            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "O campo de Placa não pode ser nulo!", "Campo Placa nulo", 0);
                        ctPlaca.setText("");
                        ctPlaca.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O campo de Preço não pode ser nulo!", "Campo Preço nulo", 0);
                    ctPreco.setText("");
                    ctPreco.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "O campo de Ano não pode ser nulo!", "Campo Ano nulo", 0);
                ctAno.setText("");
                ctAno.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de Modelo não pode ser nulo!", "Campo Modelo nulo", 0);
            ctModelo.setText("");
            ctModelo.requestFocus();
        }
    }

    //Recebe e trata o retorno do EndPoint "vehicle"
    private void mensagemRetornoAPI(String string) {
        if (string == null) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
        } else {
            switch (string) {
                case "Create Vehicle Success!":
                    bdVei.cad_Vei(veiculo);
                    JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!", "Cadastro OK", 1);
                    limpar();
                    break;
                case "Error: \"model\" length must be at least 5 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de Modelo deve ter pelo menos 5 caracteres!", "Erro no Cadastro", 0);
                    ctModelo.setText("");
                    ctModelo.requestFocus();
                    break;
                case "Error: \"model\" length must be less than or equal to 50 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de Modelo não pode conter mais de 50 caracteres!", "Erro no Cadastro", 0);
                    ctModelo.setText("");
                    ctModelo.requestFocus();
                    break;
                case "Error: \"price\" must be greater than or equal to 50":
                    JOptionPane.showMessageDialog(null, "O campo de Preço deve ser maior ou igual á 50!", "Erro no Cadastro", 0);
                    ctPreco.setText("");
                    ctPreco.requestFocus();
                    break;
                case "Error: \"price\" must be less than or equal to 99999":
                    JOptionPane.showMessageDialog(null, "O campo de Preço deve ser menor ou igual á 99999!", "Erro no Cadastro", 0);
                    ctPreco.setText("");
                    ctPreco.requestFocus();
                    break;
                default:
                    String[] procura = {"year", "plate"};
                    String correspondente = "";

                    for (String pro : procura) {
                        if (string.contains(pro)) {
                            correspondente = pro;
                            break;
                        }
                    }

                    switch (correspondente) {
                        case "year":
                            JOptionPane.showMessageDialog(null, "O campo de Ano deve conter uma Ano válido (ANO/ANO)!", "Erro no Cadastro", 0);
                            ctAno.setText("");
                            ctAno.requestFocus();
                            break;
                        case "plate":
                            JOptionPane.showMessageDialog(null, "O campo de Placa deve conter uma Placa válida!", "Erro no Cadastro", 0);
                            ctPlaca.setText("");
                            ctPlaca.requestFocus();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
                            break;
                    }
                    break;
            }
        }
    }

    //Consultar veículo pela placa
    public void consVei() {
        if (!ctPlaca.getText().isEmpty() && !Util.checarEspacoVazio(ctPlaca.getText())) {
            JSONArray jsonArr = new JSONArray(ServiceVeiculo.consVeiculoPlaca(ctPlaca.getText()));

            try {
                JSONObject jsonObj = jsonArr.getJSONObject(0);

                ctPreco.setText(String.valueOf(jsonObj.getInt("price")));
                ctPlaca.setText(jsonObj.getString("plate"));
                ctAno.setText(jsonObj.getString("year"));
                ctModelo.setText(jsonObj.getString("model"));

                JOptionPane.showMessageDialog(null, "Confirme os dados do veículo", "Confirmação de dados", 1);
            } catch (HeadlessException | JSONException e) {
                JOptionPane.showMessageDialog(null, "Não existe veículo com essa placa", "Placa inexistente", 0);
                limpar();
                ctPlaca.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de placa não pode ser nulo ou conter espaços!", "Campo de Placa nulo", 0);
            limpar();
            ctPlaca.requestFocus();
        }
    }

    //Excluir veículo pela placa
    public void excluiVei() {
        if (!ctPlaca.getText().isEmpty() && !Util.checarEspacoVazio(ctPlaca.getText())) {
            JSONArray jsonArr = new JSONArray(ServiceVeiculo.consVeiculoPlaca(ctPlaca.getText()));

            try {
                jsonArr.getJSONObject(0);
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse veículo?", "Confirmação de exclusão", JOptionPane.YES_NO_CANCEL_OPTION);

                switch (x) {
                    case 0:
                        removeVeiculoArrayList();
                        ServiceVeiculo.excluiVeiculoPlaca(ctPlaca.getText());
                        JOptionPane.showMessageDialog(null, "Veículo excluído com sucesso", "Exclusão de Veículo", 1);
                        limpar();
                        break;
                    case 1:
                        limpar();
                        ctPlaca.requestFocus();
                        break;
                    case 2:
                        limpar();
                        ctPlaca.requestFocus();
                        break;
                    default:
                        break;
                }
            } catch (HeadlessException | JSONException e) {
                JOptionPane.showMessageDialog(null, "Não existe veículo com essa placa", "Placa inexistente", 0);
                limpar();
                ctPlaca.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de placa não pode ser nulo ou conter espaços!", "Campo de Placa nulo", 0);
            limpar();
            ctPlaca.requestFocus();
        }
    }

    //Remove veículo do ArrayList "BDveiculo"
    public void removeVeiculoArrayList() {
        veiculo = new Veiculo();

        try {
            veiculo.setPlaca(ctPlaca.getText());
            veiculo = bdVei.cons_Vei(veiculo);

            bdVei.exclui_Vei(veiculo);
        } catch (PlacaNegException pe) {
            pe.impPlaca();
            ctPlaca.setText("");
            ctPlaca.requestFocus();
        }
    }

    //Listar tabela dos veículos cadastrados
    public void listarTabVei() {
        DefaultTableModel modelo = (DefaultTableModel) tabVei.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Veiculo vei : bdVei.getBdVei()) {
            modelo.insertRow(posLin, new Object[]{
                vei.getModelo(),
                vei.getAno(),
                Util.formataReal(String.valueOf(vei.getPreco())),
                vei.getPlaca(),});
            posLin++;
        }
    }

    //Selecionar linha na tabela dos carros cadastrados
    public void selectTabVei() {
        String valLinTab = "";
        int posLin = tabVei.getSelectedRow();

        for (int coluna = 0; coluna < tabVei.getColumnCount(); coluna++) {

            valLinTab = valLinTab + "      |" + tabVei.getModel().getValueAt(posLin, coluna).toString() + "|";
        }

        JOptionPane.showMessageDialog(null, "Valor escolhido: " + valLinTab, "Seleção na tabela", 1);
    }

    public void sair() {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Saída", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            dispose();
        }
    }

    public void limpar() {
        ctPreco.setText("");
        ctModelo.setText("");
        ctAno.setText("");
        ctPlaca.setText("");
        ctModelo.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(GerenciarVei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarVei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarVei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarVei.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GerenciarVei().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadCar;
    private javax.swing.JButton btConsCarPlaca;
    private javax.swing.JButton btExcCarPlaca;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctAno;
    private javax.swing.JTextField ctModelo;
    private javax.swing.JTextField ctPlaca;
    private javax.swing.JTextField ctPreco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTable tabVei;
    // End of variables declaration//GEN-END:variables
}
