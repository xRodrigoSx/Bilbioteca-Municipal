package Controller;

import Model.LivroModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.derby.iapi.types.ConcatableDataValue;

public class LivroController {

    public void cadastrarLivroController(String titulo, String telefone, String email) {

        //Verificar se as informações foram enviadas da maneira correta!
        if ((titulo != null && titulo.length() > 0)
                && (telefone != null && telefone.length() > 0)
                && (email != null && email.length() > 0)) {

            // Intanciar o objeto de acordo com o nosso modelo (Classe Livro)
            LivroModel novoLivro = new LivroModel(titulo, telefone, email);

            //Chamar o método disponivel na classe de livros que realiza a inserção do
            // registro no banco de dados.
            novoLivro.cadastrarLivroDAO(novoLivro);

        } else {
            JOptionPane.showMessageDialog(null, "Digite os dados corretamente!");
        }

    }

    public ArrayList<LivroModel> listarLivrosController() {
        LivroModel livro = new LivroModel();
        return livro.listarLivros();
    }

    public ArrayList<LivroModel> buscarLivrosController(String titulo) {
        LivroModel livro = new LivroModel();
        return livro.buscarLivros(titulo);
    }

    public void alterarLivro(int id, String titulo, String telefone, String email) {

        if ((titulo != null && titulo.length() > 0)
                && (telefone != null && telefone.length() > 0)
                && (email != null && email.length() > 0)) {

            LivroModel livroAjuste = new LivroModel(id, titulo, telefone, email);
            livroAjuste.alterarLivro(livroAjuste);
        }
    }
        
    public void excluirLivro(int id){
        LivroModel idLivro = new LivroModel();
        idLivro.excluirLivro(id);
    }
    
}
