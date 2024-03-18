package DAO;

import Model.EmprestimoModel;
import Model.LivroModel;
import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmprestimoDB {

    public void cadastrarEmprestimoDB(EmprestimoModel novoEmprestimo) {
        String sql = "insert into emprestimo (id_usuario, id_livro, datalocacao, datadevolucao, status) values (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        Connection connection = null;

        try {
            connection = new ConexaoDB().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, novoEmprestimo.getIdUser());
            stmt.setInt(2, novoEmprestimo.getIdBook());
            stmt.setString(3, novoEmprestimo.getDataLocacao());
            stmt.setString(4, novoEmprestimo.getDataDevolucao());
            stmt.setString(5, novoEmprestimo.getStatus());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexão!");
                e.printStackTrace();
            }
        }
    }

    public void alterarStatus(EmprestimoModel EmprestimoAjuste) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.emprestimo SET status=? where id=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(2, EmprestimoAjuste.getId());
            stmt.setString(1, EmprestimoAjuste.getStatus());
            stmt.execute();
            System.out.println("Alteração do status realizada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração do status");
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados");
                e.printStackTrace();
            }
        }
    }

    public int contarEmprestimosCadastrados() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int quantidadeEmprestimos = 0;

        String sql = "SELECT COUNT(*) as quantidade FROM ROOT.emprestimo";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                quantidadeEmprestimos = rs.getInt("quantidade");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao contar usuários cadastrados");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar statement");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexão com o banco de dados");
                e.printStackTrace();
            }
        }

        return quantidadeEmprestimos;
    }

    public void renovarEmprestimoDB(EmprestimoModel renovaremprestimo) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.emprestimo SET datadevolucao=? where id=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(2, renovaremprestimo.getId());
            stmt.setString(1, renovaremprestimo.getDataDevolucao());
            stmt.execute();
            System.out.println("Alteração do status realizada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração do status");
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados");
                e.printStackTrace();
            }
        }
    }

    public void finalizarEmprestimoBD(int id) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM ROOT.emprestimo where id=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            System.out.println("Exlusão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar a exclusão do usuário.");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment!");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }

    }

    public ArrayList<EmprestimoModel> buscarEmprestimoPorIdUser(int idUser) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        EmprestimoModel emprestimo = null;
        ArrayList<EmprestimoModel> listaemprestimos = null;

        String sql = "SELECT * FROM ROOT.emprestimo WHERE id_usuario = ? ORDER BY id_usuario";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idUser);
            rs = stmt.executeQuery();

                listaemprestimos = new ArrayList<>();
                while (rs.next()) {
                    emprestimo = new EmprestimoModel();
                    emprestimo.setId(rs.getInt("ID"));
                    emprestimo.setIdUser(rs.getInt("ID_USUARIO"));
                    emprestimo.setIdBook(rs.getInt("ID_LIVRO"));
                    emprestimo.setDataLocacao(rs.getString("DATALOCACAO"));
                    emprestimo.setDataDevolucao(rs.getString("DATADEVOLUCAO"));
                    emprestimo.setStatus(rs.getString("status"));
                    listaemprestimos.add(emprestimo);
                }
            

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar usuário por ID");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar statement");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados");
                e.printStackTrace();
            }
        }

        return listaemprestimos;
    }

    public ArrayList<EmprestimoModel> buscarEmprestimoPorIdBook(int idBook) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        EmprestimoModel emprestimo = null;
        ArrayList<EmprestimoModel> listaemprestimos = null;

        String sql = "SELECT * FROM ROOT.emprestimo WHERE id_livro = ? ORDER BY id_livro";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idBook);
            rs = stmt.executeQuery();

                listaemprestimos = new ArrayList<>();
                while (rs.next()) {
                    emprestimo = new EmprestimoModel();
                    emprestimo.setId(rs.getInt("ID"));
                    emprestimo.setIdUser(rs.getInt("ID_USUARIO"));
                    emprestimo.setIdBook(rs.getInt("ID_LIVRO"));
                    emprestimo.setDataLocacao(rs.getString("DATALOCACAO"));
                    emprestimo.setDataDevolucao(rs.getString("DATADEVOLUCAO"));
                    emprestimo.setStatus(rs.getString("status"));
                    listaemprestimos.add(emprestimo);
                }
            

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar usuário por ID");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar statement");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados");
                e.printStackTrace();
            }
        }

        return listaemprestimos;
    }

    public int contarEmprestimosAtrasados() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int quantidadeEmprestimosAtrasados = 0;

        String sql = "SELECT COUNT(*) as quantidade FROM ROOT.emprestimo WHERE status = 'Atrasado'";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                quantidadeEmprestimosAtrasados = rs.getInt("quantidade");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao contar emprestimos atrasados");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar statement");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexão com o banco de dados");
                e.printStackTrace();
            }
        }

        return quantidadeEmprestimosAtrasados;
    }

    public int contarEmprestimosAtivos() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int quantidadeEmprestimosAtivos = 0;

        String sql = "SELECT COUNT(*) as quantidade FROM ROOT.emprestimo WHERE status = 'Ativo'";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                quantidadeEmprestimosAtivos = rs.getInt("quantidade");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao contar emprestimos ativos");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar statement");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexão com o banco de dados");
                e.printStackTrace();
            }
        }

        return quantidadeEmprestimosAtivos;
    }

    public ArrayList<EmprestimoModel> listarTodosEmprestimos() throws SQLException, SQLException {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        EmprestimoModel Emprestimo = null;
        ArrayList<EmprestimoModel> listaemprestimos = null;

        String sql = "SELECT * FROM ROOT.emprestimo";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaemprestimos = new ArrayList<>();
                while (rs.next()) {
                    Emprestimo = new EmprestimoModel();
                    Emprestimo.setId(rs.getInt("ID"));
                    Emprestimo.setIdUser(rs.getInt("ID_USUARIO"));
                    Emprestimo.setIdBook(rs.getInt("ID_LIVRO"));
                    Emprestimo.setDataLocacao(rs.getString("DATALOCACAO"));
                    Emprestimo.setDataDevolucao(rs.getString("DATADEVOLUCAO"));
                    Emprestimo.setStatus(rs.getString("status"));
                    listaemprestimos.add(Emprestimo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar registro");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar steatment");
                e.printStackTrace();
            }

            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao finalizar conexao com o banco de dados");
                e.printStackTrace();
            }
        }
        return listaemprestimos;
    }
}
