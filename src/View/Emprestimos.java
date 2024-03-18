package View;

import Controller.EmprestimoController;
import Controller.LivroController;
import Controller.UsuarioController;
import Model.EmprestimoModel;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Emprestimos extends javax.swing.JFrame {

    Home tela_principal;
    Usuarios pes_user;
    CadastrarEmprestimo new_empr;
    Livros books;
    RenovarEmprestimo renovar;
    Autor autor;

    public Emprestimos() {
        initComponents();
        listarEmprestimosView();
        txtIDB.setVisible(false);
        txtIDU.setVisible(false);
        txtDevolucao.setVisible(false);
        txtLocacao.setVisible(false);

        JLabel background;
        ImageIcon img = new ImageIcon("Biblioteca_12.png");

        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(200, -25, 1080, 720);
        add(background);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnTelaPrincipal = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        btnEmprestimo = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        PainelEmprestimos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPesquisarIdUser = new javax.swing.JTextField();
        btnPesquisarIdUser = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableListaEmprestimos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisarIdBook = new javax.swing.JTextField();
        btnPesquisarIdBook = new javax.swing.JButton();
        PainelAcoes = new javax.swing.JPanel();
        btnNovo1 = new javax.swing.JButton();
        btnDevolver = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        lblID1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblStatus1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtStatus = new javax.swing.JTextField();
        txtTempoRestante = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtIDB = new javax.swing.JLabel();
        txtDevolucao = new javax.swing.JLabel();
        txtLocacao = new javax.swing.JLabel();
        txtIDU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 685));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 660));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnTelaPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTelaPrincipal.setForeground(new java.awt.Color(51, 102, 255));
        btnTelaPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Home.png"))); // NOI18N
        btnTelaPrincipal.setText("Pagina Inicial");
        btnTelaPrincipal.setAlignmentY(0.0F);
        btnTelaPrincipal.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnTelaPrincipal.setBorderPainted(false);
        btnTelaPrincipal.setContentAreaFilled(false);
        btnTelaPrincipal.setFocusPainted(false);
        btnTelaPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnTelaPrincipal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnTelaPrincipal)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnTelaPrincipal)
                .addGap(18, 18, 18))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 102, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Author.png"))); // NOI18N
        jButton4.setText("Autores");
        jButton4.setAlignmentY(0.0F);
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 102, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/User.jpg"))); // NOI18N
        jButton5.setText("Usuários");
        jButton5.setAlignmentY(0.0F);
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(51, 102, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Book.jpg"))); // NOI18N
        jButton10.setText("Livros");
        jButton10.setAlignmentY(0.0F);
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(18, 18, 18))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        btnEmprestimo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEmprestimo.setForeground(new java.awt.Color(51, 102, 255));
        btnEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lend.jpg"))); // NOI18N
        btnEmprestimo.setText("Empréstimo");
        btnEmprestimo.setAlignmentY(0.0F);
        btnEmprestimo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        btnEmprestimo.setBorderPainted(false);
        btnEmprestimo.setContentAreaFilled(false);
        btnEmprestimo.setFocusPainted(false);
        btnEmprestimo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEmprestimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnEmprestimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnEmprestimo)
                .addGap(18, 18, 18))
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo2.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel21.setIconTextGap(8);
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        PainelEmprestimos.setBackground(new java.awt.Color(102, 102, 102, 70));
        PainelEmprestimos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Relação de Empréstimos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pesquisar ID Usuário:");

        txtPesquisarIdUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarIdUserActionPerformed(evt);
            }
        });

        btnPesquisarIdUser.setText("PESQUISAR");
        btnPesquisarIdUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarIdUserActionPerformed(evt);
            }
        });

        jTableListaEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID Usuário", "ID Livro", "Data de Locação", "Data de Devolução", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaEmprestimos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableListaEmprestimosKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTableListaEmprestimos);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pesquisar ID Livro:");

        txtPesquisarIdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarIdBookActionPerformed(evt);
            }
        });

        btnPesquisarIdBook.setText("PESQUISAR");
        btnPesquisarIdBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarIdBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelEmprestimosLayout = new javax.swing.GroupLayout(PainelEmprestimos);
        PainelEmprestimos.setLayout(PainelEmprestimosLayout);
        PainelEmprestimosLayout.setHorizontalGroup(
            PainelEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEmprestimosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                    .addGroup(PainelEmprestimosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisarIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarIdUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtPesquisarIdBook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarIdBook)))
                .addGap(10, 10, 10))
        );
        PainelEmprestimosLayout.setVerticalGroup(
            PainelEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEmprestimosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesquisarIdBook)
                        .addComponent(txtPesquisarIdBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(PainelEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPesquisarIdUser)
                        .addComponent(txtPesquisarIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelAcoes.setBackground(new java.awt.Color(255, 255, 255, 70));
        PainelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações de Empréstimo"));
        PainelAcoes.setName(""); // NOI18N

        btnNovo1.setText("Novo");
        btnNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo1ActionPerformed(evt);
            }
        });

        btnDevolver.setText("Finalizar");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        lblID1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblID1.setText("ID:");

        lblNome1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome1.setText("Tempo restante:");

        lblStatus1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStatus1.setText("Status:");

        jButton1.setText("Renovar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtStatus.setEditable(false);
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        txtTempoRestante.setEditable(false);

        txtID.setEditable(false);

        javax.swing.GroupLayout PainelAcoesLayout = new javax.swing.GroupLayout(PainelAcoes);
        PainelAcoes.setLayout(PainelAcoesLayout);
        PainelAcoesLayout.setHorizontalGroup(
            PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAcoesLayout.createSequentialGroup()
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelAcoesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(PainelAcoesLayout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(btnNovo1)))
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAcoesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1)
                        .addGap(50, 50, 50)
                        .addComponent(btnDetalhes)
                        .addGap(50, 50, 50)
                        .addComponent(btnDevolver))
                    .addGroup(PainelAcoesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTempoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStatus1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus)))
                .addGap(30, 30, 30))
        );
        PainelAcoesLayout.setVerticalGroup(
            PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo1)
                    .addComponent(btnDevolver)
                    .addComponent(btnDetalhes)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addGroup(PainelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(lblStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblID1)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempoRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)
                                .addComponent(txtDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155)
                                .addComponent(txtLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PainelEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PainelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PainelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDevolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLocacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIDU, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaPrincipalActionPerformed
        tela_principal.listarUsers();
        this.dispose();
    }//GEN-LAST:event_btnTelaPrincipalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            autor = new Autor();
        } catch (SQLException ex) {
            Logger.getLogger(Emprestimos.class.getName()).log(Level.SEVERE, null, ex);
        }
        autor.emprestimo = this;
        autor.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pes_user = new Usuarios();
        pes_user.emprestimo = this;
        pes_user.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            books = new Livros();
        } catch (SQLException ex) {
            Logger.getLogger(Emprestimos.class.getName()).log(Level.SEVERE, null, ex);
        }
        books.emprestimo = this;
        books.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void txtPesquisarIdUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarIdUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarIdUserActionPerformed

    private void btnPesquisarIdUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarIdUserActionPerformed
        if (!"".equals(txtPesquisarIdUser.getText())) {
            String itemPesquisa = txtPesquisarIdUser.getText();
            Integer id = Integer.valueOf(itemPesquisa);

            try {
                DefaultTableModel dtm = (DefaultTableModel) jTableListaEmprestimos.getModel();
                dtm.setRowCount(0);
                EmprestimoController EmprestimoIdUser = new EmprestimoController();
                ArrayList<EmprestimoModel> listaEmprestimos
                        = EmprestimoIdUser.buscarEmprestimoIdUser(id);

                for (EmprestimoModel Emprestimo : listaEmprestimos) {
                    dtm.addRow(new Object[]{
                        Emprestimo.getId(),
                        Emprestimo.getIdUser(),
                        Emprestimo.getIdBook(),
                        Emprestimo.getDataLocacao(),
                        Emprestimo.getDataDevolucao(),
                        Emprestimo.getStatus(),});
                }

            } catch (Exception e) {
            }
        } else {
            listarEmprestimosView();
        }
    }//GEN-LAST:event_btnPesquisarIdUserActionPerformed

    private void btnNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo1ActionPerformed
        new_empr = new CadastrarEmprestimo();
        new_empr.emprestimo = this;
        new_empr.setVisible(true);
    }//GEN-LAST:event_btnNovo1ActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        if (txtID.getText() != "") {
            String idAuxiliar = txtID.getText();
            Integer id = Integer.valueOf(idAuxiliar);

            EmprestimoController excluirEmprestimo = new EmprestimoController();
            excluirEmprestimo.finalizarEmprestimo(id);

            String idB = txtIDB.getText();
            Integer idBook = Integer.valueOf(idB);

            LivroController ajustarStatus = new LivroController();
            ajustarStatus.alterarStatus(idBook, "Disponivel");
            listarEmprestimosView();

            txtID.setText("");
            txtTempoRestante.setText("");
            txtStatus.setText("");
            txtIDB.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Empréstimo primeiro");
        }
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        if (!"".equals(txtID.getText())) {
            String idauxB = txtIDB.getText();
            Integer idB = Integer.valueOf(idauxB);
            LivroController Livro = new LivroController();
            String nomelivro = null;
            try {
                nomelivro = Livro.puxarDadosLivro(idB).getTitulo();
            } catch (SQLException ex) {
                Logger.getLogger(Emprestimos.class.getName()).log(Level.SEVERE, null, ex);
            }
            String idauxU = txtIDU.getText();
            Integer idU = Integer.valueOf(idauxU);
            UsuarioController Usuario = new UsuarioController();
            String nomeusuario = null;
            try {
                nomeusuario = Usuario.puxarDadosUsuario(idU).getNome();
            } catch (SQLException ex) {
                Logger.getLogger(Emprestimos.class.getName()).log(Level.SEVERE, null, ex);
            }

            String id = txtID.getText();
            String datalocacao = txtLocacao.getText();
            String datadevolucao = txtDevolucao.getText();
            String status = txtStatus.getText();

            JOptionPane.showMessageDialog(null,
                    "ID do empréstimo: " + id + "\n"
                    + "Nome do Leitor: " + nomeusuario + "\n"
                    + "Nome do Livro Retirado: " + nomelivro + "\n"
                    + "Data de Retirada do Livro: " + datalocacao + "\n"
                    + "Data prevista para devolucao do Livro: " + datadevolucao + "\n"
                    + "Status do Emprestimo: " + status);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Empréstimo primeiro");
        }
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void jTableListaEmprestimosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableListaEmprestimosKeyPressed
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String id = jTableListaEmprestimos.getModel().
                getValueAt(jTableListaEmprestimos.getSelectedRow(), 0).toString();

        String id_user = jTableListaEmprestimos.getModel().
                getValueAt(jTableListaEmprestimos.getSelectedRow(), 1).toString();

        String id_book = jTableListaEmprestimos.getModel().
                getValueAt(jTableListaEmprestimos.getSelectedRow(), 2).toString();

        String datalocacao = jTableListaEmprestimos.getModel().
                getValueAt(jTableListaEmprestimos.getSelectedRow(), 3).toString();

        String datadevolucao = jTableListaEmprestimos.getModel().
                getValueAt(jTableListaEmprestimos.getSelectedRow(), 4).toString();

        LocalDate dataAtual = LocalDate.now();
        String datahoje = dataAtual.format(formatter);
        LocalDate dateAtual = LocalDate.parse(datahoje, formatter);
        LocalDate dateDevolucao = LocalDate.parse(datadevolucao, formatter);

        long diferencaDias = ChronoUnit.DAYS.between(dateAtual, dateDevolucao);

        String tempo = Long.toString(diferencaDias);

        String status = jTableListaEmprestimos.getModel().
                getValueAt(jTableListaEmprestimos.getSelectedRow(), 5).toString();

        txtID.setText(id);
        txtTempoRestante.setText(tempo + " dias restantes");
        txtStatus.setText(status);
        txtIDB.setText(id_book);
        txtDevolucao.setText(datadevolucao);
        txtLocacao.setText(datalocacao);
        txtIDU.setText(id_user);
    }//GEN-LAST:event_jTableListaEmprestimosKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtID.getText() != "") {
            String idAux = txtID.getText();
            String devolucao = txtDevolucao.getText();
            txtID.setText("");
            txtDevolucao.setText("");
            txtTempoRestante.setText("");
            txtStatus.setText("");
            renovar = new RenovarEmprestimo();
            renovar.setId(idAux);
            System.out.println(devolucao);
            renovar.emprestimo = this;
            renovar.setVisible(true);
//        renovar.setDevolucao(devolucao);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Empréstimo primeiro");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPesquisarIdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarIdBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarIdBookActionPerformed

    private void btnPesquisarIdBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarIdBookActionPerformed
        if (!"".equals(txtPesquisarIdBook.getText())) {
            String itemPesquisa = txtPesquisarIdBook.getText();
            Integer id = Integer.valueOf(itemPesquisa);

            try {
                DefaultTableModel dtm = (DefaultTableModel) jTableListaEmprestimos.getModel();
                dtm.setRowCount(0);
                EmprestimoController EmprestimoIdBook = new EmprestimoController();
                ArrayList<EmprestimoModel> listaEmprestimos = EmprestimoIdBook.buscarEmprestimoIdBook(id);

                for (EmprestimoModel Emprestimo : listaEmprestimos) {
                    dtm.addRow(new Object[]{
                        Emprestimo.getId(),
                        Emprestimo.getIdUser(),
                        Emprestimo.getIdBook(),
                        Emprestimo.getDataLocacao(),
                        Emprestimo.getDataDevolucao(),
                        Emprestimo.getStatus(),});
                }

            } catch (Exception e) {
            }
        } else {
            listarEmprestimosView();
        }
    }//GEN-LAST:event_btnPesquisarIdBookActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

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
            java.util.logging.Logger.getLogger(Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emprestimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAcoes;
    private javax.swing.JPanel PainelEmprestimos;
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnNovo1;
    private javax.swing.JButton btnPesquisarIdBook;
    private javax.swing.JButton btnPesquisarIdUser;
    private javax.swing.JButton btnTelaPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableListaEmprestimos;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JLabel txtDevolucao;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtIDB;
    private javax.swing.JLabel txtIDU;
    private javax.swing.JLabel txtLocacao;
    private javax.swing.JTextField txtPesquisarIdBook;
    private javax.swing.JTextField txtPesquisarIdUser;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTempoRestante;
    // End of variables declaration//GEN-END:variables

    void listarEmprestimosView() {

        try {
            DefaultTableModel dtm = (DefaultTableModel) jTableListaEmprestimos.getModel();
            dtm.setRowCount(0);
            EmprestimoController EmprestimoControler = new EmprestimoController();
            ArrayList<EmprestimoModel> listaEmprestimos = EmprestimoControler.listarEmprestimosController();

            Iterator<EmprestimoModel> iterator = listaEmprestimos.iterator();

            while (iterator.hasNext()) {
                EmprestimoModel Emprestimo = iterator.next();
                dtm.addRow(new Object[]{
                    Emprestimo.getId(),
                    Emprestimo.getIdUser(),
                    Emprestimo.getIdBook(),
                    Emprestimo.getDataLocacao(),
                    Emprestimo.getDataDevolucao(),
                    Emprestimo.getStatus(),});
            }

        } catch (Exception e) {
        }

    }
}
