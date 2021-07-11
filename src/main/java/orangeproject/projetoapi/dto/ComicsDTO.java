package orangeproject.projetoapi.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity ( name = "comics")
public class ComicsDTO {

    @Id
    private String comicID;

    @Column(nullable = false, length = 100)
    private String titulo;

    @Column(nullable = false, length = 100)
    private String preco;

    @Column(nullable = false, length = 100)
    private String autores;

    @Column(nullable = false, length = 100)
    private String isbn;

    @Column(nullable = false, length = 500)
    private String descricao;


    public String getComicID() { return comicID; }

    public void setComicID(String comicID) { this.comicID = comicID; }

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getPreco() { return preco; }

    public void setPreco(String preco) { this.preco = preco; }

    public String getAutores() { return autores; }

    public void setAutores(String autores) { this.autores = autores; }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }

}
