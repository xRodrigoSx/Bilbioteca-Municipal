package Model;

import DAO.CadastrarUsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioModel {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String datanascimento;
    private String status;

    public UsuarioModel() {
    }

    public UsuarioModel(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public UsuarioModel(String nome, String cpf, String email, String endereco, String datanascimento, String status) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.datanascimento = datanascimento;
        this.status = status;
    }

    public UsuarioModel(int id, String nome, String cpf, String email, String endereco, String datanascimento, String status) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.datanascimento = datanascimento;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void cadastrarUsuarioDAO(UsuarioModel novoUsuario) {
        CadastrarUsuarioDAO novoRegistro = new CadastrarUsuarioDAO();
        novoRegistro.cadastrarUsuarioDB(novoUsuario);
    }

    public ArrayList<UsuarioModel> listarUsuarios() throws SQLException {
        return new CadastrarUsuarioDAO().listarTodosUsuarios();
    }

    public ArrayList<UsuarioModel> buscarUsuarios(String nome) throws SQLException {
        return new CadastrarUsuarioDAO().buscarUsuarioNome(nome);
    }

    public UsuarioModel buscarUsuariosPorId(int id) throws SQLException {
        return new CadastrarUsuarioDAO().buscarUsuarioPorId(id);
    }

    public void alterarUsuario(UsuarioModel UsuarioAjuste) {
        new CadastrarUsuarioDAO().alterarUsuario(UsuarioAjuste);
    }
    
    public int getUsuariosCadastrados() {
        return new CadastrarUsuarioDAO().contarUsuariosCadastrados();
    }
    
    public int getUsuariosBloqueados() {
        return new CadastrarUsuarioDAO().contarUsuariosBloqueados();
    }
    
    public int getUsuariosVerificados() {
        return new CadastrarUsuarioDAO().contarUsuariosVerificados();
    }
    
    public void alterarStatus(UsuarioModel UsuarioAjuste) {
        new CadastrarUsuarioDAO().alterarStatus(UsuarioAjuste);
    }

    public void excluirUsuario(int id) {
        new CadastrarUsuarioDAO().excluirUsuarioBD(id);
    }

}
