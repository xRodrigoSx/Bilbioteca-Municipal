
package Controller;

import Model.LivroModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class LivroController {

    public void cadastrarLivroController(String titulo, String genero, String numPaginas, String resumo, String status, int idAutor) {

        //Verificar se as informações foram enviadas da maneira correta!
        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (numPaginas != null && numPaginas.length() > 0)
                && (idAutor != 0 && idAutor >= 0)) {

            // Intanciar o objeto de acordo com o nosso modelo (Classe Livro)
            LivroModel novoLivro = new LivroModel(titulo, genero, numPaginas, resumo, status, idAutor);

            //Chamar o método disponivel na classe de livros que realiza a inserção do
            // registro no banco de dados.
            novoLivro.cadastrarLivroDAO(novoLivro);

        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }

    }

    public ArrayList<LivroModel> listarLivrosController() throws SQLException {
        LivroModel livro = new LivroModel();
        return livro.listarLivros();
    }

    public ArrayList<LivroModel> buscarLivrosController(String titulo) throws SQLException {
        LivroModel livro = new LivroModel();
        return livro.buscarLivros(titulo);
    }

    public void alterarLivro(int id, String titulo, String genero, String numPaginas, String resumo, String status, int idAutor) {

        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (numPaginas != null && numPaginas.length() > 0)) {

            LivroModel livroAjuste = new LivroModel(id, titulo, genero, numPaginas, resumo, status, idAutor);
            livroAjuste.alterarLivro(livroAjuste);
        }
    }
        
    public void excluirLivro(int id){
        LivroModel idLivro = new LivroModel();
        idLivro.excluirLivro(id);
    }
    
        public static LivroModel puxarDadosLivro(int id) throws SQLException {
        LivroModel Livro = new LivroModel();
        return Livro.buscarLivrosPorId(id);
    }
    
        public static int getBooks() throws SQLException {
        LivroModel Livro = new LivroModel();
        return Livro.getLivrosCadastrados();
    }
    
    public static int getBorrowed() throws SQLException {
        LivroModel Livro = new LivroModel();
        return Livro.getLivrosEmprestados();
    }
    
    public static int getAvailable() throws SQLException {
        LivroModel Livro = new LivroModel();
        return Livro.getLivrosDisponiveis();
    }
    
        public void alterarStatus(int id, String status) {

        if ((status != null && status.length() > 0)) {

            LivroModel StatusAjuste = new LivroModel(id, status);
            StatusAjuste.alterarStatus(StatusAjuste);
 
        }

    }
    
}

