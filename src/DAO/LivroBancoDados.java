package DAO;

import Model.LivroModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import javax.management.remote.JMXConnectorFactory;

public class LivroBancoDados {

    // Manipulação da tabela do BD - Livros
    // CRUD - Criar, excluir, listar, modificação
    // Recebe o objeto (tipo LivroModel) e realiza a conexão com o banco de daods
    // Insere as infromações na tabela do banco de dados
    
//    private int id;
//    private String titulo;
//    private String genero;
//    private String paginas;
//    private String resumo;

    
    public void inserirLivroBD(LivroModel novoLivro) {
        String sql = "INSERT INTO livro (titulo, genero, paginas, resumo, status, idautor) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        Connection connection = null;

        try {
            connection = new ConexaoDB().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoLivro.getTitulo());
            stmt.setString(2, novoLivro.getGenero());
            stmt.setString(3, novoLivro.getNumeroPaginas());
            stmt.setString(4, novoLivro.getResumo());
            stmt.setString(5, novoLivro.getStatus());
            stmt.setInt(6, novoLivro.getIdAutor());


            stmt.execute();
            System.out.println("Registro realizado com sucesso!");
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
                System.out.println("Erro ao finalizar conexao com o banco de dados!");
                e.printStackTrace();
            }
        }
    }

    
    public ArrayList<LivroModel> listarTodosLivros(){
    
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        
        LivroModel livro = null;
        ArrayList<LivroModel> listaLivros = null;
        
        String sql = "SELECT * FROM ROOT.LIVRO";
        
        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaLivros = new ArrayList<>();
                while (rs.next()) {
                    livro = new LivroModel();
                    livro.setId(rs.getInt("id"));
                    livro.setTitulo(rs.getString("titulo"));
                    livro.setGenero(rs.getString("genero"));
                    livro.setNumeroPaginas(rs.getString("paginas"));
                    livro.setResumo(rs.getString("resumo"));
                    livro.setStatus(rs.getString("status"));
                    livro.setIdAutor(rs.getInt("idAutor"));
                    
                    

                    listaLivros.add(livro);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar regitro!");
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
        return listaLivros;
    }
    
    // Novo Método DAO - Buscar livros que contenham
    // a string digitada no campo txtPesquisar
    public ArrayList<LivroModel> buscarLivros(String titulo){
    
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        
        LivroModel livro = null;
        ArrayList<LivroModel> listaLivros = null;
        
        String sql = "SELECT * FROM ROOT.LIVRO WHERE titulo LIKE '%" + 
                titulo + "%' ORDER BY titulo";
        
        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listaLivros = new ArrayList<>();
                while (rs.next()) {
                    livro = new LivroModel();
                    livro.setId(rs.getInt("id"));
                    livro.setTitulo(rs.getString("titulo"));
                    livro.setGenero(rs.getString("genero"));
                    livro.setNumeroPaginas(rs.getString("paginas"));
                    livro.setResumo(rs.getString("resumo"));
                    livro.setStatus(rs.getString("status"));

                    listaLivros.add(livro);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao selecionar livros!");
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
        return listaLivros;
    }
    
    
    public void alterarLivroBD(LivroModel livroAjuste){

        Connection conn = null;
        PreparedStatement stmt = null;
        
    String sql = "UPDATE ROOT.LIVRO SET titulo=?, genero=?, paginas=?, resumo=?, status=?, idautor=? WHERE id=?";
        
        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, livroAjuste.getTitulo());
            stmt.setString(2, livroAjuste.getGenero());
            stmt.setString(3, livroAjuste.getNumeroPaginas());
            stmt.setString(4, livroAjuste.getResumo());
            stmt.setString(5, livroAjuste.getStatus());
            stmt.setInt(6, livroAjuste.getIdAutor());
            stmt.setInt(7, livroAjuste.getId());
            stmt.execute();
            System.out.println("Alteração do registro realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração no registro!");
            e.printStackTrace();
        }finally {
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
    
    public void excluirLivroBD(int id){
    
        Connection conn = null;
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM ROOT.LIVRO where id=?";
        
        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            System.out.println("Exlusão realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao realizar a exclusão do registro.");
        }finally {
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
    
    public int contarLivrosCadastrados() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int quantidadeLivros = 0;

        String sql = "SELECT COUNT(*) as quantidade FROM ROOT.livro";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                quantidadeLivros = rs.getInt("quantidade");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao contar livros cadastrados");
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

        return quantidadeLivros;
    }
    
        public int contarLivrosEmprestados() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int quantidadeLivrosBloqueados = 0;

    String sql = "SELECT COUNT(*) as quantidade FROM ROOT.livro WHERE status = 'Emprestado'";

    try {
        conn = new ConexaoDB().getConnection();
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        if (rs != null && rs.next()) {
            quantidadeLivrosBloqueados = rs.getInt("quantidade");
        }

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Erro ao contar livros emprestados");
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

    return quantidadeLivrosBloqueados;
}
    
    public int contarLivrosDisponiveis() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int quantidadeLivrosBloqueados = 0;

    String sql = "SELECT COUNT(*) as quantidade FROM ROOT.livro WHERE status = 'Disponivel'";

    try {
        conn = new ConexaoDB().getConnection();
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        if (rs != null && rs.next()) {
            quantidadeLivrosBloqueados = rs.getInt("quantidade");
        }

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Erro ao contar livros disponiveis");
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

    return quantidadeLivrosBloqueados;
}
    
    public void alterarStatus(LivroModel LivroAjuste) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.livro SET status=? where id=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(2, LivroAjuste.getId());
            stmt.setString(1, LivroAjuste.getStatus());
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
    
        public LivroModel buscarLivroPorId(int id) {

    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement stmt = null;

    LivroModel livro = null;

    String sql = "SELECT * FROM ROOT.livro WHERE id = ?";

    try {
        conn = new ConexaoDB().getConnection();
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        
        if (rs != null && rs.next()) {
            livro = new LivroModel();
            livro.setId(rs.getInt("id"));
            livro.setTitulo(rs.getString("titulo"));
            livro.setGenero(rs.getString("genero"));
            livro.setNumeroPaginas(rs.getString("paginas"));
            livro.setResumo(rs.getString("resumo"));
            livro.setStatus(rs.getString("status"));
            
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

    return livro;
}
    
}