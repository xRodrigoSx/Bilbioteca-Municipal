package View;

import Controller.UsuarioController;
import Model.UsuarioModel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.derby.diag.ContainedRoles;
import org.apache.derby.iapi.types.ConcatableDataValue;

public class CadastroUsuario extends javax.swing.JFrame {

    public CadastroUsuario() {
        initComponents();
        listarUsuariosView();
        txtNome.setEnabled(false);
        txtcpf.setEnabled(false);
        txtEmail.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtStatus.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelAcoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnLiberar = new javax.swing.JButton();
        btnBloquear = new javax.swing.JButton();
        jPanelDadosUsuario = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtID = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        txtNascimento = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        jPanelRelacaoUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaUsuarios = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Tela de Contatos");

        jPanelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações do Cliente"));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLiberar.setText("Liberar");
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });

        btnBloquear.setText("Bloquear");
        btnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAcoesLayout = new javax.swing.GroupLayout(jPanelAcoes);
        jPanelAcoes.setLayout(jPanelAcoesLayout);
        jPanelAcoesLayout.setHorizontalGroup(
            jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcoesLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnNovo)
                .addGap(50, 50, 50)
                .addComponent(btnCancelar)
                .addGap(50, 50, 50)
                .addComponent(btnLiberar)
                .addGap(50, 50, 50)
                .addComponent(btnBloquear)
                .addGap(50, 50, 50)
                .addComponent(btnExcluir)
                .addGap(50, 50, 50)
                .addComponent(btnEditar)
                .addGap(50, 50, 50)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAcoesLayout.setVerticalGroup(
            jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnLiberar)
                    .addComponent(btnBloquear))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanelDadosUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        lblNome.setText("Nome:");

        lblEmail.setText("Email:");

        lblEndereco.setText("Endereço:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblID.setText("ID:");

        lblCpf.setText("CPF:");

        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });

        lblNascimento.setText("Data de nascimento:");

        lblStatus.setText("Status:");

        javax.swing.GroupLayout jPanelDadosUsuarioLayout = new javax.swing.GroupLayout(jPanelDadosUsuario);
        jPanelDadosUsuario.setLayout(jPanelDadosUsuarioLayout);
        jPanelDadosUsuarioLayout.setHorizontalGroup(
            jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosUsuarioLayout.createSequentialGroup()
                        .addComponent(lblNascimento)
                        .addGap(18, 18, 18)
                        .addComponent(txtNascimento))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosUsuarioLayout.createSequentialGroup()
                            .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCpf, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtcpf)
                                .addComponent(txtEmail)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelDadosUsuarioLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(lblID)
                            .addGap(18, 18, 18)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelDadosUsuarioLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelDadosUsuarioLayout.createSequentialGroup()
                                    .addGap(5, 5, 5)
                                    .addComponent(lblStatus)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelDadosUsuarioLayout.createSequentialGroup()
                                    .addComponent(lblNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanelDadosUsuarioLayout.setVerticalGroup(
            jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosUsuarioLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDadosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNascimento)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelRelacaoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Relação de Clientes"));

        jTableListaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Email", "Endereço", "Data de nascimento", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableListaUsuariosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableListaUsuariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListaUsuarios);

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisa:");

        javax.swing.GroupLayout jPanelRelacaoUsuarioLayout = new javax.swing.GroupLayout(jPanelRelacaoUsuario);
        jPanelRelacaoUsuario.setLayout(jPanelRelacaoUsuarioLayout);
        jPanelRelacaoUsuarioLayout.setHorizontalGroup(
            jPanelRelacaoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelacaoUsuarioLayout.createSequentialGroup()
                .addGroup(jPanelRelacaoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelRelacaoUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanelRelacaoUsuarioLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        jPanelRelacaoUsuarioLayout.setVerticalGroup(
            jPanelRelacaoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelacaoUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRelacaoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRelacaoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jPanelDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelDadosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRelacaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelAcoes.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(474, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        String nome = txtNome.getText();
        String cpf = txtcpf.getText();
        String email = txtEmail.getText();
        String endereco = txtEndereco.getText();
        String datanascimento = txtNascimento.getText();
        
        String status = "Apto para Emprestimos";
        
           

        UsuarioController novoUsuario = new UsuarioController();
        novoUsuario.cadastrarUsuario(nome, cpf, email, endereco, datanascimento, status);

        txtNome.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtcpf.setText("");
        txtNascimento.setText("");
        
        listarUsuariosView();

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String itemPesquisa = txtPesquisar.getText();

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTableListaUsuarios.getModel();
            dtm.setRowCount(0);
            UsuarioController UsuarioControler = new UsuarioController();
            ArrayList<UsuarioModel> listaUsuarios
                    = UsuarioControler.listarUsuariosController(itemPesquisa);

            Iterator<UsuarioModel> iterator = listaUsuarios.iterator();

            while (iterator.hasNext()) {
                UsuarioModel Usuario = iterator.next();
                dtm.addRow(new Object[]{
                    Usuario.getId(),
                    Usuario.getNome(),
                    Usuario.getCpf(),
                    Usuario.getEmail(),
                    Usuario.getEndereco(),
                    Usuario.getDatanascimento(),
                    Usuario.getStatus(),
                });
            }

        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String idAuxiliar = txtID.getText();
        String nome = txtNome.getText();
        String cpf = txtcpf.getText();
        String email = txtEmail.getText();
        String endereco = txtEndereco.getText();
        String datanascimento = txtNascimento.getText();
        String status = txtStatus.getText();

        Integer id = Integer.valueOf(idAuxiliar);

        UsuarioController alterarUsuario = new UsuarioController();
        alterarUsuario.alterarUsuario(id, nome, cpf, email, endereco, datanascimento, status);
        listarUsuariosView();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jTableListaUsuariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListaUsuariosKeyPressed

        String nome = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 1).toString();
        
        String cpf = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 2).toString();

        String email = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 3).toString();

        String endereco = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 4).toString();
        
        String datanascimento = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 5).toString();
        
        String status = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 6).toString();

        String idAux = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 0).toString();

        txtID.setText(idAux);
        txtNome.setText(nome);
        txtcpf.setText(cpf);
        txtEmail.setText(email);
        txtEndereco.setText(endereco);
        txtNascimento.setText(datanascimento);
        txtStatus.setText(status);
    }//GEN-LAST:event_jTableListaUsuariosKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente cancelar?", 
                "Confirmação de cancelamento!", 
                JOptionPane.YES_NO_OPTION);
        
        if(resposta == 0){
            txtID.setText("");
            txtNome.setText("");
            txtcpf.setText("");
            txtEmail.setText("");
            txtEndereco.setText("");
            txtNascimento.setText("");
            txtStatus.setText("");
            
        
            txtNome.setEnabled(false);
            txtcpf.setEnabled(false);
            txtEmail.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtStatus.setEnabled(false);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtNome.setEnabled(true);
        txtcpf.setEnabled(true);
        txtEmail.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtNascimento.setEnabled(true);
        txtStatus.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String idAuxiliar = txtID.getText();
        
        Integer id = Integer.valueOf(idAuxiliar);
        
        UsuarioController excluirUsuario = new UsuarioController();
        excluirUsuario.excluirUsuario(id);
        listarUsuariosView();
        
        txtNome.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtcpf.setText("");
        txtNascimento.setText("");
        
        txtStatus.setText("");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jTableListaUsuariosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListaUsuariosKeyReleased
        String nome = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 1).toString();

        String cpf = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 2).toString();
        
        String email = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 3).toString();

        String endereco = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 4).toString();
        
        String datanascimento = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 5).toString();
        
        String status= jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 11).toString();
        
        String idAux = jTableListaUsuarios.getModel().
                getValueAt(jTableListaUsuarios.getSelectedRow(), 0).toString();

        Integer id = Integer.valueOf(idAux);
        
        txtID.setText(idAux);
        txtNome.setText(nome);
        txtEmail.setText(email);
        txtEndereco.setText(endereco);
        txtcpf.setText(cpf);
        txtNascimento.setText(datanascimento);
        
        txtStatus.setText(status);
    }//GEN-LAST:event_jTableListaUsuariosKeyReleased

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        String idAuxiliar = txtID.getText();
        Integer id = Integer.valueOf(idAuxiliar);
        String status = "Apto para Emprestimos";

        UsuarioController alterarStatus = new UsuarioController();
        alterarStatus.alterarStatus(id, status);
        listarUsuariosView();
    }//GEN-LAST:event_btnLiberarActionPerformed

    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed
        String idAuxiliar = txtID.getText();
        Integer id = Integer.valueOf(idAuxiliar);
        String status = "Bloqueado";

        UsuarioController alterarStatus = new UsuarioController();
        alterarStatus.alterarStatus(id, status);
        listarUsuariosView();
    }//GEN-LAST:event_btnBloquearActionPerformed

    void listarUsuariosView() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTableListaUsuarios.getModel();
            dtm.setRowCount(0);
            UsuarioController UsuarioControler = new UsuarioController();
            ArrayList<UsuarioModel> listaUsuarios = UsuarioControler.listarUsuariosController();

            Iterator<UsuarioModel> iterator = listaUsuarios.iterator();

            while (iterator.hasNext()) {
                UsuarioModel Usuario = iterator.next();
                dtm.addRow(new Object[]{
                    Usuario.getId(),
                    Usuario.getNome(),
                    Usuario.getCpf(),
                    Usuario.getEmail(),
                    Usuario.getEndereco(),
                    Usuario.getDatanascimento(),
                    Usuario.getStatus(),
                        
                });
            }

        } catch (Exception e) {
        }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAcoes;
    private javax.swing.JPanel jPanelDadosUsuario;
    private javax.swing.JPanel jPanelRelacaoUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaUsuarios;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JTextField txtcpf;
    // End of variables declaration//GEN-END:variables
}
