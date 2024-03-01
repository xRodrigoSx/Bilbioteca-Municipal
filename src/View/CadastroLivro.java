package View;

import Controller.LivroController;
import Model.LivroModel;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroLivro extends javax.swing.JFrame {

    Home tela_principal;
    PesquisarUsuario pes_user;

    public CadastroLivro() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setBackground(new java.awt.Color(0, 153, 255));

        txtTitulo.setEnabled(false);
        txtGenero.setEnabled(false);
        txtNumPaginas.setEnabled(false);
        txtResumo.setEnabled(false);

        listarLivrosView();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabelGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        txtNumPaginas = new javax.swing.JFormattedTextField();
        jLabelNumPaginas = new javax.swing.JLabel();
        jLabelResumo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResumo = new javax.swing.JTextArea();
        jButtonsSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaLivros = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        jLabelPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO LIVRO");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setSize(new java.awt.Dimension(1080, 720));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE LIVROS");

        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("TÍTULO");

        jLabelGenero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenero.setText("GÊNERO");

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        txtNumPaginas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabelNumPaginas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumPaginas.setText("NÚMERO DE PÁGINAS");

        jLabelResumo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResumo.setText("RESUMO");

        txtResumo.setColumns(20);
        txtResumo.setRows(5);
        jScrollPane1.setViewportView(txtResumo);

        jButtonsSalvar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonsSalvar.setText("SALVAR");
        jButtonsSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsSalvarActionPerformed(evt);
            }
        });

        jTableListaLivros.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null},
                    {null, null, null, null, null}
                },
                new String[]{
                    "ID", "Titulo", "Genero", "Número de páginas", "Resumo"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableListaLivros);

        jButtonNovo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonNovo.setText("NOVO");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID: ");

        jLabelPesquisar.setText("PESQUISAR");

        jButton1.setText("PESQUISAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtTitulo)
                                                        .addComponent(txtGenero)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelTitulo)
                                                                        .addComponent(jLabelGenero)
                                                                        .addComponent(jLabelNumPaginas)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(txtNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(27, 27, 27)
                                                                                .addComponent(lblId)))
                                                                .addGap(0, 467, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelResumo)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(220, 220, 220)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonsSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelPesquisar)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton1)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelTitulo)
                                        .addComponent(jLabelResumo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelGenero)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabelNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonsSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelPesquisar)
                                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void jButtonsSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsSalvarActionPerformed
        String titulo = txtTitulo.getText();
        String genero = txtGenero.getText();
        String numPaginas = txtNumPaginas.getText();
        String resumo = txtResumo.getText();

        LivroController novoLivro = new LivroController();
        novoLivro.cadastrarLivroController(titulo, genero, numPaginas, resumo);

        txtTitulo.setText("");
        txtGenero.setText("");
        txtNumPaginas.setText("");
        txtResumo.setText("");
        listarLivrosView();
    }//GEN-LAST:event_jButtonsSalvarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        txtTitulo.setEnabled(true);
        txtGenero.setEnabled(true);
        txtNumPaginas.setEnabled(true);
        txtResumo.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null,
                "Deseja realmente cancelar?",
                "Confirmação de cancelamento!",
                JOptionPane.YES_NO_OPTION);

        if (resposta == 0) {
            txtTitulo.setText("");
            txtGenero.setText("");
            txtNumPaginas.setText("");
            txtResumo.setText("");
            lblId.setText("");
            txtTitulo.setEnabled(false);
            txtGenero.setEnabled(false);
            txtNumPaginas.setEnabled(false);
            txtResumo.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    void listarLivrosView() {

        try {

            DefaultTableModel dtm = (DefaultTableModel) jTableListaLivros.getModel();
            dtm.setRowCount(0);
            LivroController livroControler = new LivroController();
            ArrayList<LivroModel> listaLivros = livroControler.listarLivrosController();

            Iterator<LivroModel> iterator = listaLivros.iterator();

            while (iterator.hasNext()) {
                LivroModel livro = iterator.next();
                dtm.addRow(new Object[]{
                    livro.getId(),
                    livro.getTitulo(),
                    livro.getGenero(),
                    livro.getNumeroPaginas(),
                    livro.getResumo()
                });
            }

        } catch (Exception e) {
        }

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
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonsSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNumPaginas;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelResumo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListaLivros;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JFormattedTextField txtNumPaginas;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextArea txtResumo;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
