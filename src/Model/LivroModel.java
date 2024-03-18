package Model;

import DAO.LivroBancoDados;
import java.sql.SQLException;
import java.util.ArrayList;

public class LivroModel {

    // Atributos do livro
    private int id;
    private int idAutor;
    private String titulo;
    private String genero;
    private String numeroPaginas;
    private String resumo;
    private String status;

    public LivroModel() {
    }

    public LivroModel(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public LivroModel(int id, String titulo, String genero, String numeroPaginas, String resumo, String status, int idAutor) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.status = status;
        this.idAutor = idAutor;
    }

    public LivroModel(String titulo, String genero, String numeroPaginas, String resumo, String status, int idAutor) {
        this.titulo = titulo;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.status = status;
        this.idAutor = idAutor;
        
    }

    public String getStatus() {
        return status;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getLivrosCadastrados() {
        return new LivroBancoDados().contarLivrosCadastrados();
    }

    public int getLivrosEmprestados() {
        return new LivroBancoDados().contarLivrosEmprestados();
    }

    public int getLivrosDisponiveis() {
        return new LivroBancoDados().contarLivrosDisponiveis();
    }

    public LivroModel buscarLivrosPorId(int id) throws SQLException {
        return new LivroBancoDados().buscarLivroPorId(id);
    }

    //Metodo é utilizado para passsar os dados para o DAO realizar a conexão com o banco de dados.
    public void cadastrarLivroDAO(LivroModel novoLivro) {
        LivroBancoDados novoRegistro = new LivroBancoDados();
        novoRegistro.inserirLivroBD(novoLivro);
    }

    public ArrayList<LivroModel> listarLivros() throws SQLException {
        return new LivroBancoDados().listarTodosLivros();
    }

    public ArrayList<LivroModel> buscarLivros(String titulo) throws SQLException {
        return new LivroBancoDados().buscarLivros(titulo);
    }

    public void alterarLivro(LivroModel livroAjuste) {
        new LivroBancoDados().alterarLivroBD(livroAjuste);
    }

    public void excluirLivro(int id) {
        new LivroBancoDados().excluirLivroBD(id);
    }

    public void alterarStatus(LivroModel LivroAjuste) {
        new LivroBancoDados().alterarStatus(LivroAjuste);
    }

}
