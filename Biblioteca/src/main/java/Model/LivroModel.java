
package Model;

public class LivroModel {
   
    // Atributos do livro
   
    private int id;
    private String titulo;
    private String genero;
    private String numeroPaginas;
    private String resumo;

    public LivroModel() {
    }

    public LivroModel(int id, String titulo, String genero, String numeroPaginas, String resumo) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
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
    
    
    
    
    
    
    
}


