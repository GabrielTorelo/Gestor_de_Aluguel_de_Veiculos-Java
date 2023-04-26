package Form;

import Util.Util;
import DataBase.BDcliente;
import Exception.AnoNegException;
import Exception.CnhNegException;
import Model.Cliente;
import Service.ServiceCliente;
import java.awt.HeadlessException;
import java.io.UnsupportedEncodingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GerenciarCli extends javax.swing.JFrame {

    private Cliente cliente;
    private static BDcliente bdCli = ServiceCliente.verClientes();
    private static GerenciarCli unicoGerCli;

    private GerenciarCli() {
        initComponents();
    }

    //Singleton para não duplicar a abertura da janela GerenciarCli
    public static GerenciarCli getGerenciarCli() {

        if (unicoGerCli == null) {
            unicoGerCli = new GerenciarCli();
        }
        return unicoGerCli;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCNH = new javax.swing.JLabel();
        ctCNH = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        lblAno = new javax.swing.JLabel();
        ctAno = new javax.swing.JTextField();
        lblLog = new javax.swing.JLabel();
        ctLog = new javax.swing.JTextField();
        btCadCli = new javax.swing.JButton();
        btConsCliCnh = new javax.swing.JButton();
        btExcCliCnh = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCli = new javax.swing.JTable();
        lblCidade = new javax.swing.JLabel();
        ctCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        ctEstado = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        ctTel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setSize(new java.awt.Dimension(1103, 829));

        lblCNH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCNH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCNH.setText("CNH:");

        ctCNH.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ctCNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCNHActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome:");

        ctNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblAno.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblAno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAno.setText("Data de Nascimento (DD/MM/YYYY):");

        ctAno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblLog.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblLog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLog.setText("Logradouro (Rua, número):");

        ctLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btCadCli.setText("Cadastar");
        btCadCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCliActionPerformed(evt);
            }
        });

        btConsCliCnh.setText("Consultar pela CNH");
        btConsCliCnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsCliCnhActionPerformed(evt);
            }
        });

        btExcCliCnh.setText("Excluir pela CNH");
        btExcCliCnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcCliCnhActionPerformed(evt);
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

        tabCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Ano de nascimento", "CNH", "Logradouro", "Cidade", "Estado", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabCli.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabCli.setSurrendersFocusOnKeystroke(true);
        tabCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCli);

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCidade.setText("Cidade: ");

        ctCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblEstado.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Estado: ");

        ctEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblTel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTel.setText("Telefone ( (xx) xxxxx-xxxx ):");

        ctTel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblAno, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(lblCNH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ctEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(ctCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctLog)
                            .addComponent(ctCNH)
                            .addComponent(ctAno)
                            .addComponent(ctTel)
                            .addComponent(ctNome))
                        .addGap(12, 12, 12)
                        .addComponent(btCadCli, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btConsCliCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcCliCnh, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAno)
                    .addComponent(ctAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCNH)
                    .addComponent(ctCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLog))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(ctEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(ctTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadCli)
                    .addComponent(btExcCliCnh)
                    .addComponent(btLimpar)
                    .addComponent(btSair)
                    .addComponent(btConsCliCnh))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCliActionPerformed
        cadCli();
        listarTabCli();
    }//GEN-LAST:event_btCadCliActionPerformed

    private void btConsCliCnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsCliCnhActionPerformed
        consCli();
    }//GEN-LAST:event_btConsCliCnhActionPerformed

    private void btExcCliCnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcCliCnhActionPerformed
        excluiCli();
        listarTabCli();
    }//GEN-LAST:event_btExcCliCnhActionPerformed

    private void tabCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCliMouseClicked
        selectTabCli();
    }//GEN-LAST:event_tabCliMouseClicked

    private void ctCNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCNHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCNHActionPerformed

    //Cadastrar cliente - FALTA FAZER AINDA!!!!
    public void cadCli() {
        cliente = new Cliente();
        String respostaAPI;

        if (!ctNome.getText().isEmpty()) {
            if (!ctAno.getText().isEmpty()) {
                if (!ctCNH.getText().isEmpty() && !Util.checarEspacoVazio(ctCNH.getText())) {
                    if (!ctLog.getText().isEmpty()) {
                        if (!ctCidade.getText().isEmpty()) {
                            if (!ctEstado.getText().isEmpty()) {
                                if (!ctTel.getText().isEmpty()) {
                                    try {
                                        cliente.setCnh(ctCNH.getText());
                                        cliente = bdCli.Cons_ClienteCNH(cliente);

                                        if (cliente == null) {
                                            cliente = new Cliente();

                                            cliente.setNome(ctNome.getText());
                                            cliente.setAno_nasc(ctAno.getText());
                                            cliente.setCnh(ctCNH.getText());
                                            cliente.setLogradouro(ctLog.getText());
                                            cliente.setCidade(ctCidade.getText());
                                            cliente.setEstado(ctEstado.getText());
                                            cliente.setTel(ctTel.getText());

                                            respostaAPI = ServiceCliente.criaCliente(cliente);

                                            System.out.println(respostaAPI);

                                            mensagemRetornoAPI(respostaAPI);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Já existe um cliente com essa CNH!", "ERRO de Cadastro", 0);
                                            ctCNH.setText("");
                                            ctCNH.requestFocus();
                                        }
                                    } catch (AnoNegException ane) {
                                        ane.impAnoNeg();
                                        ctAno.setText("");
                                        ctAno.requestFocus();
                                    } catch (CnhNegException cne) {
                                        cne.impCnhNeg();
                                        ctCNH.setText("");
                                        ctCNH.requestFocus();
                                    } catch (UnsupportedEncodingException uee) {
                                        JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "O campo de Telefone não pode ser nulo!", "Campo Telefone nulo", 0);
                                    ctTel.setText("");
                                    ctTel.requestFocus();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "O campo de Estado não pode ser nulo!", "Campo Estado nulo", 0);
                                ctEstado.setText("");
                                ctEstado.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "O campo de Cidade não pode ser nulo!", "Campo Cidade nulo", 0);
                            ctCidade.setText("");
                            ctCidade.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "O campo de Logradouro não pode ser nulo!", "Campo Logradouro nulo", 0);
                        ctLog.setText("");
                        ctLog.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "O campo de CNH não pode ser nulo ou conter espaços!", "Campo CNH nulo", 0);
                    ctCNH.setText("");
                    ctCNH.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, "O campo de Data de Nascimento não pode ser nulo!", "Campo Data de Nascimento nulo", 0);
                ctAno.setText("");
                ctAno.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de Nome não pode ser nulo!", "Campo Nome nulo", 0);
            ctNome.setText("");
            ctNome.requestFocus();
        }
    }
    
    //Recebe e trata o retorno do EndPoint "customer"
    private void mensagemRetornoAPI(String string) {
        if (string == null) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
        } else {
            switch (string) {
                case "Create Customer Success!":
                    bdCli.cad_Cliente(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro OK", 1);
                    limpar();
                    break;
                case "Error: \"name\" length must be at least 10 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de Nome deve ter pelo menos 10 caracteres!", "Erro no Cadastro", 0);
                    ctNome.setText("");
                    ctNome.requestFocus();
                    break;
                case "Error: \"name\" length must be less than or equal to 150 characters long":
                    JOptionPane.showMessageDialog(null, "O campo de Nome não pode conter mais de 150 caracteres!", "Erro no Cadastro", 0);
                    ctNome.setText("");
                    ctNome.requestFocus();
                    break;
                default:
                    String[] procura = {"birth", "driverLicense", "phone"};
                    String correspondente = "";

                    for (String pro : procura) {
                        if (string.contains(pro)) {
                            correspondente = pro;
                            break;
                        }
                    }

                    switch (correspondente) {
                        case "birth":
                            JOptionPane.showMessageDialog(null, "O campo de Data de Nascimento deve conter uma data válida!", "Erro no Cadastro", 0);
                            ctAno.setText("");
                            ctAno.requestFocus();
                            break;
                        case "driverLicense":
                            JOptionPane.showMessageDialog(null, "O campo de CNH deve conter uma CNH válida!", "Erro no Cadastro", 0);
                            ctCNH.setText("");
                            ctCNH.requestFocus();
                            break;
                        case "phone":
                            JOptionPane.showMessageDialog(null, "O campo de Telefone deve conter um Telefone válido!", "Erro no Cadastro", 0);
                            ctTel.setText("");
                            ctTel.requestFocus();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Tente novamente!", "Ocorreu um erro", 0);
                            break;
                    }
                    break;
            }
        }
    }

    //Consultar cliente pela cnh
    public void consCli() {
        if (!ctCNH.getText().isEmpty() && !Util.checarEspacoVazio(ctCNH.getText())) {
            JSONArray jsonArr = new JSONArray(ServiceCliente.consClienteCNH(ctCNH.getText()));

            try {
                JSONObject jsonObj = jsonArr.getJSONObject(0);

                ctNome.setText(jsonObj.getString("name"));
                ctAno.setText(jsonObj.getString("birth"));
                ctCNH.setText(jsonObj.getString("driverLicense"));
                ctLog.setText(jsonObj.getString("street"));
                ctCidade.setText(jsonObj.getString("city"));
                ctEstado.setText(jsonObj.getString("district"));
                ctTel.setText(jsonObj.getString("phone"));

                JOptionPane.showMessageDialog(null, "Confirme os dados do cliente", "Confirmação de dados", 1);
            } catch (HeadlessException | JSONException e) {
                JOptionPane.showMessageDialog(null, "Não existe cliente com essa CNH", "CNH inexistente", 0);
                limpar();
                ctCNH.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de CNH não pode ser nulo ou conter espaços!", "Campo de CNH nulo", 0);
            limpar();
            ctCNH.requestFocus();
        }
    }

    //Excluir cliente pela CNH
    public void excluiCli() {
        if (!ctCNH.getText().isEmpty() && !Util.checarEspacoVazio(ctCNH.getText())) {
            JSONArray jsonArr = new JSONArray(ServiceCliente.consClienteCNH(ctCNH.getText()));

            try {
                jsonArr.getJSONObject(0);
                int x = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse cliente?", "Confirmação de exclusão", JOptionPane.YES_NO_CANCEL_OPTION);

                switch (x) {
                    case 0:
                        removeClienteArrayList();
                        ServiceCliente.excluiClienteCNH(ctCNH.getText());
                        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "Exclusão de Cliente", 1);
                        limpar();
                        ctCNH.requestFocus();
                        break;
                    case 1:
                        limpar();
                        ctCNH.requestFocus();
                        break;
                    case 2:
                        limpar();
                        ctCNH.requestFocus();
                        break;
                    default:
                        break;
                }
            } catch (HeadlessException | JSONException e) {
                JOptionPane.showMessageDialog(null, "Não existe cliente com essa CNH", "CNH inexistente", 0);
                limpar();
                ctCNH.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo de CNH não pode ser nulo ou conter espaços!", "Campo de CNH nulo", 0);
            limpar();
            ctCNH.requestFocus();
        }
    }

    //Remove cliente do ArrayList "BDcliente"
    public void removeClienteArrayList() {
        cliente = new Cliente();

        try {
            cliente.setCnh(ctCNH.getText());
            cliente = bdCli.Cons_ClienteCNH(cliente);

            bdCli.Exclui_Cliente(cliente);
        } catch (CnhNegException cne) {
            cne.impCnhNeg();
            ctCNH.setText("");
            ctCNH.requestFocus();
        }
    }

    //Listar tabela dos clientes cadastrados
    public void listarTabCli() {
        DefaultTableModel modelo = (DefaultTableModel) tabCli.getModel();
        int posLin = 0;

        modelo.setRowCount(posLin);

        for (Cliente cli : bdCli.getBdCli()) {
            modelo.insertRow(posLin, new Object[]{
                cli.getNome(),
                cli.getAno_nasc(),
                cli.getCnh(),
                cli.getLogradouro(),
                cli.getCidade(),
                cli.getEstado(),
                cli.getTel()
            });
            posLin++;
        }
    }

    //Selecionar linha na tabela dos clientes cadastrados
    public void selectTabCli() {
        String valLinTab = "";
        int posLin = tabCli.getSelectedRow();

        for (int coluna = 0; coluna < tabCli.getColumnCount(); coluna++) {

            valLinTab = valLinTab + "      |" + tabCli.getModel().getValueAt(posLin, coluna).toString() + "|";
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
        ctNome.setText("");
        ctAno.setText("");
        ctCNH.setText("");
        ctLog.setText("");
        ctCidade.setText("");
        ctEstado.setText("");
        ctTel.setText("");
        ctNome.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GerenciarCli().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadCli;
    private javax.swing.JButton btConsCliCnh;
    private javax.swing.JButton btExcCliCnh;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField ctAno;
    private javax.swing.JTextField ctCNH;
    private javax.swing.JTextField ctCidade;
    private javax.swing.JTextField ctEstado;
    private javax.swing.JTextField ctLog;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctTel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCNH;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLog;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTable tabCli;
    // End of variables declaration//GEN-END:variables
}
