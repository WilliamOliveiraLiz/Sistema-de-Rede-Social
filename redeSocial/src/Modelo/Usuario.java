package Modelo;

public class Usuario {
    private int Id;
    private String nome;
    private String username;
    private String email;
    private String senha;
    private LocalDateTime dataCadastro;
    public list<Usuario> amogos;
    public list<Post> posts;

    public Usuario(java.lang.String nome, java.lang.String username, java.lang.String email, java.lang.String senha, LocalDateTime dataCadastro, list<Usuario> amogos, list<Post> posts) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.amogos = amogos;
        this.posts = posts;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getSenha() {
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

    public list<Usuario> getAmogos() {
        return amogos;
    }

    public void setAmogos(list<Usuario> amogos) {
        this.amogos = amogos;
    }

    public list<Post> getPosts() {
        return posts;
    }

    public void setPosts(list<Post> posts) {
        this.posts = posts;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Usuario{" +
                "Id=" + Id +
                ", nome=" + nome +
                ", username=" + username +
                ", email=" + email +
                ", senha=" + senha +
                ", dataCadastro=" + dataCadastro +
                ", amogos=" + amogos +
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

}
