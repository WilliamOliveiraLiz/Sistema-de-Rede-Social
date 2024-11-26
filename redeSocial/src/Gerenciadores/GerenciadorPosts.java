package Gerenciadores;

import Modelo.Comentario;
import Modelo.Post;
import Modelo.Usuario;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorPosts {
    private List<Post> Posts;
    private Integer proximoID;
    public void criar(Post post){

    }
     public Post buscarPorId(int id){
        return Posts.stream()
                .filter(post -> post.getID()==post.getID())
                .findFirst()
                .orElse(null);

    }
    public List<Post> listarPorUsuario(int idUsuario){
        return Posts.stream()
                .filter(post -> post.getAutor()==idUsuario)
                .collect(Collectors.toList());

    }
    public void curtir(int idPost, int idUsuario){
        for (Post post:Posts) {
            if (post.getCurtidas().contains(idUsuario)) {
                System.out.println("Usuário já curtiu este post.");
            } else {
                post.getCurtidas().add(idUsuario);
                System.out.println("Post curtido com sucesso!");
            }
        }
    }
    public void descurtir(int idPost, int idUsuario){
        for (Post post:Posts){
            if (post.getCurtidas().contains(idUsuario)){
                post.getCurtidas().remove(idUsuario);
            }
            else {
                System.out.println("Usuário não curtiu este post ainda!");
            }
        }

    }
    public void comentar(Comentario comentario){
        if (Post.getID()==comentario.getID()){
            Post.adicionarComentario(comentario);
            return;
        }

    }
    public boolean deletar(int id){
        if (Posts.get(id)==Comentario.getID()){
            Post.removerComentario();
        }
        else {
            System.out.println("Não há post para deletar");
        }
        return false;
    }
    private void validarPost(Post post){

    }
}
