
package Controller;

import Model.LivroModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class LivroController {

    public void cadastrarLivroController(String titulo, String genero, String numPaginas, String resumo) {

        //Verificar se as informações foram enviadas da maneira correta!
        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (numPaginas != null && numPaginas.length() > 0)) {

            // Intanciar o objeto de acordo com o nosso modelo (Classe Livro)
            LivroModel novoLivro = new LivroModel(titulo, genero, numPaginas, resumo);

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

    public ArrayList<LivroModel> buscarLivrosController(String titulo) {
        LivroModel livro = new LivroModel();
        return livro.buscarLivros(titulo);
    }

    public void alterarLivro(int id, String titulo, String genero, String numPaginas, String resumo) {

        if ((titulo != null && titulo.length() > 0)
                && (genero != null && genero.length() > 0)
                && (numPaginas != null && numPaginas.length() > 0)) {

            LivroModel livroAjuste = new LivroModel(id, titulo, genero, numPaginas,  resumo);
            livroAjuste.alterarLivro(livroAjuste);
        }
    }
        
    public void excluirLivro(int id){
        LivroModel idLivro = new LivroModel();
        idLivro.excluirLivro(id);
    }
    
}
