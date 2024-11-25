package Modelo;
import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private Integer ID;
    private Usuario autor;
    private String conteudo;
    private LocalDateTime dataPublicaçao;
    private List<Usuario> curtidas;
    private List<Comentario> comentarios;

    public Post(Integer ID, Usuario autor, String conteudo, LocalDateTime dataPublicaçao, List<Usuario> curtidas, List<Comentario> comentarios) {
        this.ID = ID;
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataPublicaçao = dataPublicaçao;
        this.curtidas = curtidas;
        this.comentarios = comentarios;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDateTime getDataPublicaçao() {
        return dataPublicaçao;
    }

    public void setDataPublicaçao(LocalDateTime dataPublicaçao) {
        this.dataPublicaçao = dataPublicaçao;
    }

    public List<Usuario> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(List<Usuario> curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Post{" +
                "ID=" + ID +
                ", autor=" + autor +
                ", conteudo='" + conteudo + '\'' +
                ", dataPublicaçao=" + dataPublicaçao +
                ", curtidas=" + curtidas +
                ", comentarios=" + comentarios +
                '}';
    }
    public void adicionaCurtida(Usuario usuario){curtidas.add(usuario);
    }
    public void removerCurtida(Usuario usuario){curtidas.add(usuario);
    }
    public void adicionarComentario(Comentario comentario){comentarios.add(comentario);}
    public void removerComentario(Comentario comentario){comentarios.remove(comentario);}
}

