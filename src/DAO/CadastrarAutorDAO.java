package DAO;

import Model.AutorModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

public class CadastrarAutorDAO {

    public void cadastrarAutorBD(AutorModel novoAutor) {
        String sql = "insert into autor (nome, nacionalidade, obras) values (?, ?, ?)";
        PreparedStatement stmt = null;
        Connection connection = null;

        try {
            connection = new ConexaoDB().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoAutor.getNome());
            stmt.setString(2, novoAutor.getNacionalidade());
            stmt.setString(3, novoAutor.getObras());
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

    public ArrayList<AutorModel> listarTodosAutor() throws SQLException, SQLException {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        AutorModel Autor = null;
        ArrayList<AutorModel> listaautor = null;

        String sql = "SELECT * FROM ROOT.autor";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaautor = new ArrayList<>();
                while (rs.next()) {
                    Autor = new AutorModel();
                    Autor.setIdAutor(rs.getInt("idAutor"));
                    Autor.setNome(rs.getString("nome"));
                    Autor.setNacionalidade(rs.getString("nacionalidade"));
                    Autor.setObras(rs.getString("obras"));
                    listaautor.add(Autor);
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
        return listaautor;
    }

    public ArrayList<AutorModel> buscarAutor(String nome) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        AutorModel Autor = null;
        ArrayList<AutorModel> listaautor = null;

        String sql = "SELECT * FROM ROOT.autor WHERE nome LIKE '%" + nome + "%' ORDER BY nome";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaautor = new ArrayList<>();
                while (rs.next()) {
                    Autor = new AutorModel();
                    Autor.setIdAutor(rs.getInt("idAutor"));
                    Autor.setNome(rs.getString("nome"));
                    Autor.setNacionalidade(rs.getString("nacionalidade"));
                    Autor.setObras(rs.getString("obras"));

                    listaautor.add(Autor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar nacionalidade");
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
        return listaautor;
    }

    public void alterarAutor(AutorModel AutorAjuste) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.autor SET nome=?, nacionalidade=?, obras=? where idAutor=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, AutorAjuste.getNome());
            stmt.setString(2, AutorAjuste.getNacionalidade());
            stmt.setString(3, AutorAjuste.getObras());
            stmt.setInt(4, AutorAjuste.getIdAutor());
            stmt.execute();
            System.out.println("Alteração do nacionalidade realizada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração no nacionalidade");
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

    public void alterarStatus(AutorModel AutorAjuste) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.autor SET status=? where idAutor=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(2, AutorAjuste.getIdAutor());
            stmt.execute();
            System.out.println("Alteração da nacionalidade realizada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração na nacionalidade");
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

    public void excluirAutorBD(int idAutor) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM ROOT.autor where idAutor=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idAutor);
            stmt.execute();
            System.out.println("Exlusão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar a exclusão do autor.");
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

    public void excluirAutorBD(AutorModel idAutor) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM ROOT.autor where idAutor=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            int id = 0;
            stmt.setInt(1, id);
            stmt.execute();
            System.out.println("Exlusão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar a exclusão do autor.");
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

    public int contarAutorCadastrado() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int quantidadeAutor = 0;

        String sql = "SELECT COUNT(*) as quantidade FROM ROOT.autor";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                quantidadeAutor = rs.getInt("quantidade");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao contar autores cadastrados");
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

        return quantidadeAutor;
    }

    public ArrayList<AutorModel> buscarAutorNome(String nome) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        AutorModel Autor = null;
        ArrayList<AutorModel> listaautor = null;

        String sql = "SELECT * FROM ROOT.autor WHERE nome LIKE '%" + nome + "%' ORDER BY nome";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaautor = new ArrayList<>();
                while (rs.next()) {
                    Autor = new AutorModel();
                    Autor.setIdAutor(rs.getInt("idAutor"));
                    Autor.setNome(rs.getString("nome"));
                    Autor.setNacionalidade(rs.getString("nacionalidade"));
                    Autor.setObras(rs.getString("obras"));

                    listaautor.add(Autor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar cadastro");
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
        return listaautor;
    }

    public AutorModel pesquisarAutorPorIdAutor(int idAutor) {
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        AutorModel autor = null;

        String sql = "SELECT * FROM ROOT.autor WHERE idAutor = ?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idAutor);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                autor.setIdAutor(rs.getInt("idAutor"));
                autor.setNome(rs.getString("nome"));
                autor.setNacionalidade(rs.getString("nacionalidade"));
                autor.setObras(rs.getString("obras"));

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar usuário por IDAutor");
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

        return autor;
    }

    public int contarAutorVerificado() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int quantidadeAutorBloqueados = 0;

        String sql = "SELECT COUNT(*) as quantidade FROM ROOT.autor WHERE status = 'Apto para Emprestimos'";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                quantidadeAutorBloqueados = rs.getInt("quantidade");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao contar autor bloqueados");
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

        return quantidadeAutorBloqueados;
    }

}
