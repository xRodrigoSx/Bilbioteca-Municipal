package Controller;

import Model.UsuarioModel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioController {

    public void cadastrarUsuario(String nome, String cpf, String email, String endereco, String datanascimento, String status) {
        if ((nome != null && nome.length() > 0)
                && (cpf != null && cpf.length() > 0)
                && (email != null && email.length() > 0)
                && (endereco != null && endereco.length() > 0)
                && (datanascimento != null && datanascimento.length() > 0)
                && (status != null && status.length() > 0)) {

            UsuarioModel novoUsuario = new UsuarioModel(nome, cpf, email, endereco, datanascimento, status);
            novoUsuario.cadastrarUsuarioDAO(novoUsuario);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha os campos corretamente");
        }

    }

    public ArrayList<UsuarioModel> listarUsuariosController() throws SQLException {
        UsuarioModel Usuario = new UsuarioModel();
        return Usuario.listarUsuarios();
    }

    public ArrayList<UsuarioModel> listarUsuariosController(String nome) throws SQLException {
        UsuarioModel Usuario = new UsuarioModel();
        return Usuario.listarUsuarios();
    }

    public void alterarUsuario(int id, String nome, String cpf, String email, String endereco, String datanascimento, String status) {

        if ((nome != null && nome.length() > 0)
                && (cpf != null && cpf.length() > 0)
                && (email != null && email.length() > 0)
                && (endereco != null && endereco.length() > 0)
                && (datanascimento != null && datanascimento.length() > 0)
                && (status != null && status.length() > 0)) {

            UsuarioModel UsuarioAjuste = new UsuarioModel(id, nome, cpf, email, endereco, datanascimento, status);
            UsuarioAjuste.alterarUsuario(UsuarioAjuste);

        }

    }
    
    public void alterarStatus(int id, String status) {

        if ((status != null && status.length() > 0)) {

            UsuarioModel StatusAjuste = new UsuarioModel(id, status);
            StatusAjuste.alterarStatus(StatusAjuste);

        }

    }

    public void excluirUsuario(int id) {
        UsuarioModel idUsuario = new UsuarioModel();
        idUsuario.excluirUsuario(id);
    }
}
