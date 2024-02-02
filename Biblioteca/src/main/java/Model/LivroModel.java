
package Model;

public class LivroModel {
   
    // Atributos do livro
   
    private String codigo;
    private String titulo;
    private String genero;
    private String numeroPaginas;
    private String resumo;

    public LivroModel() {
    }

    public LivroModel(String codigo, String titulo, String genero, String numeroPaginas, String resumo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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


