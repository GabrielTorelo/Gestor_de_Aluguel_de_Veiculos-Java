package Form;

import Util.Util;
import DataBase.BDpedido;
import Exception.CnhNegException;
import Exception.DiasNegException;
import Exception.PlacaNegException;
import Model.Pedido;
import Service.ServicePedido;
import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GerenciarPed extends javax.swing.JFrame {

    private Pedido pedido;
    private static BDpedido bdPed = ServicePedido.verPedidos();
    private static GerenciarPed unicoGerPed;

    private GerenciarPed() {
        initComponents();
    }

    //Singleton para não duplicar a abertura da janela GerenciarPed
    public static GerenciarPed getGerenciarPed() {

        if (unicoGerPed == null) {
            unicoGerPed = new GerenciarPed();
        }
        return unicoGerPed;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlaca = new javax.swing.JLabel();
        ctPlaca = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        lblCNH = new javax.swing.JLabel();
        ctCNH = new javax.swing.JTextField();
        lblDuracao = new javax.swing.JLabel();
        ctDuracao = new javax.swing.JTextField();
        btCadPed = new javax.swing.JButton();
        btExcPedPlaca = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabPed = new javax.swing.JTable();
        lblValor = new javax.swing.JLabel();
        ctValor = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        ctID = new javax.swing.JTextField();
        btRecibo = new javax.swing.JButton();
        lblMetPag = new javax.swing.JLabel();
        ctMetPag = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pedidos");
        setSize(new java.awt.Dimension(1103, 829));

        lblPlaca.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaca.setText("Placa do Veículo: ");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome do Cliente: ");

        ctNome.setEnabled(false);

        lblCNH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCNH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCNH.setText("CNH do Cliente:");

        lblDuracao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblDuracao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDuracao.setText("Data Fim (DD/MM/AAAA): ");

        btCadPed.setText("Cadastar Pedido");
        btCadPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPedActionPerformed(evt);
            }
        });

        btExcPedPlaca.setText("Excluir pedido pelo ID ");
        btExcPedPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcPedPlacaActionPerformed(evt);
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

        tabPed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID do Pedido", "Nome do Cliente", "CNH do Cliente", "Placa do Veículo", "Duração (dias)", "Valor", "Método de Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPed.setToolTipText("");
        tabPed.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabPed.setSurrendersFocusOnKeystroke(true);
        tabPed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabPed);

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("Valor (R$ 000,00): ");

        ctValor.setEnabled(false);

        lblID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblID.setText("ID do Pedido: ");

        ctID.setEnabled(false);

        btRecibo.setText("Emitir Recibo");
        btRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReciboActionPerformed(evt);
            }
        });

        lblMetPag.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblMetPag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMetPag.setText("Método de Pagamento: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMetPag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(lblID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ctMetPag)
                            .addComponent(ctValor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctDuracao)
                            .addComponent(ctPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(ctCNH, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctID))
                        .addGap(12, 12, 12)
                        .addComponent(btCadPed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRecibo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcPedPlaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblID)
                    .addComponent(ctID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNH)
                    .addComponent(ctCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(ctPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuracao)
                    .addComponent(ctDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMetPag)
                    .addComponent(ctMetPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadPed)
                    .addComponent(btRecibo)
                    .addComponent(btLimpar)
                    .addComponent(btSair)
                    .addComponent(btExcPedPlaca)
                    .addComponent(lblValor)
                    .addComponent(ctValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btCadPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPedActionPerformed
        cadPed();
        listarTabPed();
    }//GEN-LAST:event_btCadPedActionPerformed

    private void btExcPedPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcPedPlacaActionPerformed
        excluiPed();
        listarTabPed();
    }//GEN-LAST:event_btExcPedPlacaActionPerformed

    private void tabPedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPedMouseClicked
        selectTabPed();
    }//GEN-LAST:event_tabPedMouseClicked

    private void btReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReciboActionPerformed
        emitir_recibo();
    }//GEN-LAST:event_btReciboActionPerformed

    //Cadastrar pedido
    public void cadPed() {
        Random rand = new Random();
        pedido = new Pedido();
        String numRand = String.valueOf(rand.nextInt(99999 - 10000) + 10000);
        String respostaAPI;
        String erro = "";

        ctID.setText(numRand);

        if (!ctCNH.getText().isEmpty() && !Util.checarEspacoVazio(ctPlaca.getText())) {
            if (!ctPlaca.getText().isEmpty() && !Util.checarEspacoVazio(ctPlaca.getText())) {
                JSONArray jsonArrCli = new JSONArray(Service.ServiceCliente.consClienteCNH(ctCNH.getText()));
                JSONArray jsonArrVei = new JSONArray(Service.ServiceVeiculo.consVeiculoPlaca(ctPlaca.getText()));

                if (jsonArrCli.isNull(0)) {
                    erro = "cliente";
                }

                if (!ctDuracao.getText().isEmpty()) {
                    if (!ctMetPag.getText().isEmpty()) {
                        try {
                            JSONObject jsonObjVei = jsonArrVei.getJSONObject(0);
                            JSONObject jsonObjCli = jsonArrCli.getJSONObject(0);

                            pedido.setId_pedido(numRand);
                            pedido.getCliente().setNome(jsonObjCli.getString("name"));
                            ctNome.setText(pedido.getCliente().getNome());
                            pedido.getCliente().setCnh(ctCNH.getText());
                            pedido.getVeiculo().setPlaca(ctPlaca.getText());
                            pedido.setDataFim(ctDuracao.getText());
                            pedido.setDias(Util.duracaoEntreDatas(ctDuracao.getText()));
                            pedido.setValor(Util.formataReal(String.valueOf(pedido.calcValor(pedido.getDias(), jsonObjVei.getInt("price")))));
                            ctValor.setText(pedido.getValor());
                            pedido.setForma_pag(ctMetPag.getText());

                            if (bdPed.cons_DiasPed(pedido) == 0) {
                                respostaAPI = ServicePedido.criaPedido(pedido);

                                mensagemRetornoAPI(respostaAPI);
                            } else {
                                JOptionPane.showMessageDialog(null, "Veículo em uso!", "ERRO de Cadastro", 0);
                                ctPlaca.setText("");
                                ctPlaca.requestFocus();
                            }
                        } catch (HeadlessException | JSONException e) {
                            if ("cliente".equals(erro)) {
                                JOptionPane.showMessageDialog(null, "Não existe cliente com essa CNH!", "CNH inexistente", 0);
                                ctCNH.setText("");
                                ctCNH.requestFocus();
                            } else {
                                JOptionPane.showMessageDialog(null, "Não existe veículo com essa Placa!", "Placa inexistente", 0);
                                ctPlaca.setText("");
                                ctPlaca.requestFocus();
                            }
                        } catch (CnhNegException cne) {
                            JOptionPane.showMessageDialog(null, "Erro na CNH do cliente!", "Erro na CNH!", 0);
                            ctCNH.setText("");
                            ctCNH.requestFocus();
                        } catch (PlacaNegException pe) {
                            JOptionPane.showMessageDialog(null, "Erro na placa do veículo!", "Erro na placa!", 0);
                            ctPlaca.setText("");
                            ctPlaca.requestFocus();
                        } catch (DiasNegException dne) {
                            JOptionPane.showMessageDialog(null, "Erro na duração do pedido!", "Erro na duração!", 0);
                            ctDuracao.setText("");
                            ctDuracao.requestFocus();
                        } catch (UnsupportedEncodingException uee) {
                            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "O campo de Método de Pagamento não pode ser nulo!", "Campo de Método de Pagamento nulo", 0);
                        ctMetPag.setText("");
                        ctMetPag.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O campo de Duração não pode ser nulo!", "Campo de Duração nulo", 0);
                    ctDuracao.setText("");
                    ctDuracao.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "O campo de Placa não pode ser nulo ou conter espaços!", "Campo de Placa nulo", 0);
                ctPlaca.setText("");
                ctPlaca.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de CNH não pode ser nulo ou conter espaços!", "Campo CNH nulo", 0);
            ctCNH.setText("");
            ctCNH.requestFocus();
        }

    }

    //Recebe e trata o retorno do EndPoint "order"
    private void mensagemRetornoAPI(String string) {
        if (string == null) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
        } else {
            switch (string) {
                case "Create Order Success!":
                    bdPed.cad_Ped(pedido);
                    JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!", "Cadastro OK", 1);
                    limpar();
                    break;
                case "Error: \"nameCustomer\" length must be at least 10 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de Nome deve ter pelo menos 10 caracteres!", "Erro no Cadastro", 0);
                    ctNome.setText("");
                    ctNome.requestFocus();
                    break;
                case "Error: \"nameCustomer\" length must be less than or equal to 150 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de Nome não pode conter mais de 150 caracteres!", "Erro no Cadastro", 0);
                    ctNome.setText("");
                    ctNome.requestFocus();
                    break;
                case "Error: \"driverLicense\" length must be at least 11 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de CNH deve conter uma CNH válida!", "Erro no Cadastro", 0);
                    ctCNH.setText("");
                    ctCNH.requestFocus();
                    break;
                case "Error: \"driverLicense\" length must be less than or equal to 11 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de CNH deve conter uma CNH válida!", "Erro no Cadastro", 0);
                    ctCNH.setText("");
                    ctCNH.requestFocus();
                    break;
                case "Error: \"paymentMethod\" length must be less than or equal to 7 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de Método de Pagamento não pode conter mais de 7 caracteres!", "Erro no Cadastro", 0);
                    ctMetPag.setText("");
                    ctMetPag.requestFocus();
                    break;
                default:
                    String[] procura = {"driverLicense", "duration"};
                    String correspondente = "";

                    for (String pro : procura) {
                        if (string.contains(pro)) {
                            correspondente = pro;
                            break;
                        }
                    }

                    switch (correspondente) {
                        case "driverLicense":
                            JOptionPane.showMessageDialog(null, "O campo de CNH deve conter uma CNH válida!", "Erro no Cadastro", 0);
                            ctCNH.setText("");
                            ctCNH.requestFocus();
                            break;
                        case "duration":
                            JOptionPane.showMessageDialog(null, "O campo de Duração deve conter uma data válida (DD/MM/AAAA)!", "Erro no Cadastro", 0);
                            ctDuracao.setText("");
                            ctDuracao.requestFocus();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
                            break;
                    }
                    break;
            }
        }
    }

    //Consulta pedido e Emite recibo
    public void emitir_recibo() {
        bdPed.emitir_recibo();
    }

    //Excluir pedido pela placa
    public void excluiPed() {
        pedido = new Pedido();
        String s = JOptionPane.showInputDialog("Informe o ID do pedido a ser excluído: ");
        pedido = bdPed.cons_PedID(s);

        if (s != null || (s == null && ("".equals(s)))) {
            if (pedido != null) {
                ctID.setText(pedido.getId_pedido());
                ctNome.setText(pedido.getCliente().getNome());
                ctCNH.setText(pedido.getCliente().getCnh());
                ctPlaca.setText(pedido.getVeiculo().getPlaca());
                ctDuracao.setText(pedido.getDataFim());
                ctValor.setText(pedido.getValor());
                ctMetPag.setText(pedido.getForma_pag());
            } else {
                JOptionPane.showMessageDialog(null, "Não existe pedido com esse ID!", "Pedido inexistente", 0);
                return;
            }

            if (!ctID.getText().isEmpty() && !Util.checarEspacoVazio(ctID.getText())) {
                JSONArray jsonArr = new JSONArray(ServicePedido.consPedidoID(ctID.getText()));

                try {
                    jsonArr.getJSONObject(0);
                    int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse pedido?", "Confirmação de exclusão", JOptionPane.YES_NO_CANCEL_OPTION);

                    switch (x) {
                        case 0:
                            removePedidoArrayList();
                            ServicePedido.excluiPedidoID(ctID.getText());
                            JOptionPane.showMessageDialog(null, "Pedido excluído com sucesso!", "Exclusão de Pedido", 1);
                            limpar();
                            break;
                        case 1:
                            limpar();
                            break;
                        case 2:
                            limpar();
                            break;
                        default:
                            break;
                    }
                } catch (HeadlessException | JSONException e) {
                    JOptionPane.showMessageDialog(null, "Não existe pedido com esse ID", "ID inexistente", 0);
                    limpar();
                    ctID.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "O campo de ID não pode ser nulo!", "Campo de ID nulo", 0);
                limpar();
                ctID.requestFocus();
            }
        }
    }

    //Remove pedido do ArrayList "BDpedido"
    public void removePedidoArrayList() {
        pedido = new Pedido();
        pedido = bdPed.cons_PedID(ctID.getText());

        bdPed.exclui_Ped(pedido);
        ctID.requestFocus();
    }

    //Listar tabela dos pedidos cadastrados
    public void listarTabPed() {
        DefaultTableModel modelo = (DefaultTableModel) tabPed.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Pedido ped : bdPed.getBdPed()) {
            modelo.insertRow(posLin, new Object[]{
                ped.getId_pedido(),
                ped.getCliente().getNome(),
                ped.getCliente().getCnh(),
                ped.getVeiculo().getPlaca(),
                ped.getDias(),
                ped.getValor(),
                ped.getForma_pag()
            });
            posLin++;
        }
    }

    //Selecionar linha na tabela dos carros cadastrados
    public void selectTabPed() {
        String valLinTab = "";
        int posLin = tabPed.getSelectedRow();

        for (int coluna = 0; coluna < tabPed.getColumnCount(); coluna++) {

            valLinTab = valLinTab + "      |" + tabPed.getModel().getValueAt(posLin, coluna).toString() + "|";
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
        ctID.setText("");
        ctNome.setText("");
        ctCNH.setText("");
        ctPlaca.setText("");
        ctDuracao.setText("");
        ctValor.setText("");
        ctMetPag.setText("");
        ctID.requestFocus();
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
            new GerenciarPed().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadPed;
    private javax.swing.JButton btExcPedPlaca;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRecibo;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctCNH;
    private javax.swing.JTextField ctDuracao;
    private javax.swing.JTextField ctID;
    private javax.swing.JTextField ctMetPag;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctPlaca;
    private javax.swing.JTextField ctValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCNH;
    private javax.swing.JLabel lblDuracao;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMetPag;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tabPed;
    // End of variables declaration//GEN-END:variables
}
