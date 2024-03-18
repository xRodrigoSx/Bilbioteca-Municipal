package DAO;

import Model.UsuarioModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.management.remote.JMXConnectorFactory;

public class CadastrarUsuarioDAO {

    public void cadastrarUsuarioDB(UsuarioModel novoUsuario) {
        String sql = "insert into usuarios (nome, cpf, email, endereco, datanascimento, status) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        Connection connection = null;

        try {
            connection = new ConexaoDB().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, novoUsuario.getNome());
            stmt.setString(2, novoUsuario.getCpf());
            stmt.setString(3, novoUsuario.getEmail());
            stmt.setString(4, novoUsuario.getEndereco());
            stmt.setString(5, novoUsuario.getDatanascimento());
            stmt.setString(6, novoUsuario.getStatus());
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

    public ArrayList<UsuarioModel> listarTodosUsuarios() throws SQLException, SQLException {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        UsuarioModel Usuario = null;
        ArrayList<UsuarioModel> listausuarios = null;

        String sql = "SELECT * FROM ROOT.usuarios";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listausuarios = new ArrayList<>();
                while (rs.next()) {
                    Usuario = new UsuarioModel();
                    Usuario.setId(rs.getInt("id"));
                    Usuario.setNome(rs.getString("nome"));
                    Usuario.setCpf(rs.getString("cpf"));
                    Usuario.setEmail(rs.getString("email"));
                    Usuario.setEndereco(rs.getString("Endereco"));
                    Usuario.setDatanascimento(rs.getString("datanascimento"));
                    Usuario.setStatus(rs.getString("status"));
                    listausuarios.add(Usuario);
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
        return listausuarios;
    }

    public ArrayList<UsuarioModel> buscarUsuarioNome(String nome) {

        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement stmt = null;

        UsuarioModel Usuario = null;
        ArrayList<UsuarioModel> listausuarios = null;

        String sql = "SELECT * FROM ROOT.usuarios WHERE nome LIKE '%" + nome + "%' ORDER BY nome";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            if (rs != null) {
                listausuarios = new ArrayList<>();
                while (rs.next()) {
                    Usuario = new UsuarioModel();
                    Usuario.setId(rs.getInt("id"));
                    Usuario.setNome(rs.getString("nome"));
                    Usuario.setCpf(rs.getString("cpf"));
                    Usuario.setEmail(rs.getString("email"));
                    Usuario.setEndereco(rs.getString("Endereco"));
                    Usuario.setDatanascimento(rs.getString("datanascimento"));
                    Usuario.setStatus(rs.getString("status"));
                    listausuarios.add(Usuario);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao buscar usuario");
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
        return listausuarios;
    }

    public void alterarUsuario(UsuarioModel UsuarioAjuste) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.usuarios SET nome=?, cpf=?, email=?, endereco=?, datanascimento=?, status=? where id=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, UsuarioAjuste.getNome());
            stmt.setString(2, UsuarioAjuste.getCpf());
            stmt.setString(3, UsuarioAjuste.getEmail());
            stmt.setString(4, UsuarioAjuste.getEndereco());
            stmt.setString(5, UsuarioAjuste.getDatanascimento());
            stmt.setString(6, UsuarioAjuste.getStatus());
            stmt.setInt(7, UsuarioAjuste.getId());
            stmt.execute();
            System.out.println("Alteração do nascimento realizada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao realizar a alteração no nascimento");
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
    
public int contarUsuariosCadastrados() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int quantidadeUsuarios = 0;

        String sql = "SELECT COUNT(*) as quantidade FROM ROOT.usuarios";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            if (rs != null && rs.next()) {
                quantidadeUsuarios = rs.getInt("quantidade");
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

        return quantidadeUsuarios;
    }
    
    public void alterarStatus(UsuarioModel UsuarioAjuste) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE ROOT.usuarios SET status=? where id=?";

        try {
            conn = new ConexaoDB().getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(2, UsuarioAjuste.getId());
            stmt.setString(1, UsuarioAjuste.getStatus());
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

    public void excluirUsuarioBD(int id) {

        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM ROOT.usuarios where id=?";

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
    public UsuarioModel buscarUsuarioPorId(int id) {

    ResultSet rs = null;
    Connection conn = null;
    PreparedStatement stmt = null;

    UsuarioModel usuario = null;

    String sql = "SELECT * FROM ROOT.usuarios WHERE id = ?";

    try {
        conn = new ConexaoDB().getConnection();
        stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();
        
        if (rs != null && rs.next()) {
            usuario = new UsuarioModel();
            usuario.setId(rs.getInt("id"));
            usuario.setNome(rs.getString("nome"));
            usuario.setCpf(rs.getString("cpf"));
            usuario.setEmail(rs.getString("email"));
            usuario.setEndereco(rs.getString("Endereco"));
            usuario.setDatanascimento(rs.getString("datanascimento"));
            usuario.setStatus(rs.getString("status"));
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

    return usuario;
}
    
    public int contarUsuariosBloqueados() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int quantidadeUsuariosBloqueados = 0;

    String sql = "SELECT COUNT(*) as quantidade FROM ROOT.usuarios WHERE status = 'Bloqueado'";

    try {
        conn = new ConexaoDB().getConnection();
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        if (rs != null && rs.next()) {
            quantidadeUsuariosBloqueados = rs.getInt("quantidade");
        }

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Erro ao contar usuários bloqueados");
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

    return quantidadeUsuariosBloqueados;
}
    
    public int contarUsuariosVerificados() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int quantidadeUsuariosBloqueados = 0;

    String sql = "SELECT COUNT(*) as quantidade FROM ROOT.usuarios WHERE status = 'Apto para Emprestimos'";

    try {
        conn = new ConexaoDB().getConnection();
        stmt = conn.prepareStatement(sql);
        rs = stmt.executeQuery();

        if (rs != null && rs.next()) {
            quantidadeUsuariosBloqueados = rs.getInt("quantidade");
        }

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Erro ao contar usuários bloqueados");
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

    return quantidadeUsuariosBloqueados;
}
    
}
