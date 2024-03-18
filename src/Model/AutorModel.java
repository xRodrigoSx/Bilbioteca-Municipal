
package Model;

import DAO.CadastrarAutorDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class AutorModel {
//atributos
    private int idAutor;
    private String nome;
    private String nacionalidade;
    private String obras;

    public AutorModel() {
    }

    public AutorModel(String nome, String nacionalidade, String obras) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.obras = obras;
    }

    public AutorModel(int idAutor, String nome, String nacionalidade, String obras) {
        this.idAutor = idAutor;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.obras = obras;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
       
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getObras() {
        return obras;
    }

    public void setObras(String obras) {
        this.obras = obras;
    }

    


    
    
    public void cadastroAutorDAO(AutorModel novoAutor) {
        CadastrarAutorDAO novoRegistro = new CadastrarAutorDAO();
        novoRegistro.cadastrarAutorBD(novoAutor);
    }

     public ArrayList<AutorModel> listarAutor() throws SQLException {
        return new CadastrarAutorDAO().listarTodosAutor();
    }

    public ArrayList<AutorModel> buscarAutor(String nome) throws SQLException {
        return new CadastrarAutorDAO().buscarAutorNome(nome);
    }

    public AutorModel pesquisarAutorPorIdAutor(int idAutor) throws SQLException {
        return new CadastrarAutorDAO().pesquisarAutorPorIdAutor(idAutor);
    }

    public void alterarAutor(AutorModel AutorAjuste) {
        new CadastrarAutorDAO().alterarAutor(AutorAjuste);
    }
    
    public int getAutorCadastrado() {
        return new CadastrarAutorDAO().contarAutorCadastrado();
    }
    
    
    public int getAutorVerificado() {
        return new CadastrarAutorDAO().contarAutorVerificado();
    }
    


    public void excluirAutor(int idAutor) {
        new CadastrarAutorDAO().excluirAutorBD(idAutor);
    }

    public void cadastrarAutorDAO(AutorModel novoAutor) {
        CadastrarAutorDAO novoRegistro = new CadastrarAutorDAO();
        novoRegistro.cadastrarAutorBD(novoAutor);
    }



}