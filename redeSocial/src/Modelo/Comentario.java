package Modelo;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comentario {
    private Integer ID;
    private String autor;
    private  String conteudo;
    private LocalDateTime dataComentario;
    private Post post;

    public Comentario(Integer ID, String autor, String conteudo, LocalDateTime dataComentario, Post post) {
        this.ID = ID;
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataComentario = dataComentario;
        this.post = post;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(LocalDateTime dataComentario) {
        this.dataComentario = dataComentario;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comentario that = (Comentario) o;

        if (ID != that.ID) return false;
        if (!Objects.equals(autor, that.autor)) return false;
        if (!Objects.equals(conteudo, that.conteudo)) return false;
        if (!Objects.equals(dataComentario, that.dataComentario))
            return false;
        return Objects.equals(post, that.post);
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (autor != null ? autor.hashCode() : 0);
        result = 31 * result + (conteudo != null ? conteudo.hashCode() : 0);
        result = 31 * result + (dataComentario != null ? dataComentario.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "ID=" + ID +
                ", autor='" + autor + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", dataComentario=" + dataComentario +
                ", post=" + post +
                '}';
    }
}
