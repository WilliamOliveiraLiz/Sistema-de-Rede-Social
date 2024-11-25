package Modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Usuario {
    private Integer Id;
    private String nome;
    private String username;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    public List<Usuario> amigos;
    public List<Post> posts;

    public Usuario(String nome, String username, String email, String senha, LocalDateTime dataCadastro, List<Usuario> amigos, List<Post> posts) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.amigos = amigos;
        this.posts = posts;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(java.lang.String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Usuario> getamigos() {
        return amigos;
    }

    public void setamigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @java.lang.Override
    public String toString() {
        return "Usuario{" +
                "Id=" + Id +
                ", nome=" + nome +
                ", username=" + username +
                ", email=" + email +
                ", senha=" + senha +
                ", dataCadastro=" + dataCadastro +
                ", amigos=" + amigos +
                ", posts=" + posts +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Usuario usuario = (Usuario) object;
        return Id == usuario.Id;
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), Id);
    }

    public void  adicionaAmigos(Usuario amigo){ amigos.add(amigo);
    }
    public void removerAmigos(Usuario amigo){amigos.remove(amigo);
    }
    public void adicionarPost(Post post){posts.add(post);
    }
    public void removerPost(Post post){posts.remove(post);}
}
