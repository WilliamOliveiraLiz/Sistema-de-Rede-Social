package Gerenciadores;

import Modelo.Usuario;

import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorUsuarios {
    private List<Usuario> usuarios;
    private Integer proximoID;
    public void Cadastrar(Usuario usuario){
        usuario.setId(proximoID++);
        usuarios.add(usuario);
    }
    public Usuario buscarPorID(){
        return usuarios.stream()
                .filter(usuario -> buscarPorID() == usuario.getId())
                .findFirst()
                .orElse(null);
    }
    public List<Usuario> buscarPorUsername(String username){
        return usuarios.stream()
                .filter(usuario -> usuario.getNome().toLowerCase().contains(username.toLowerCase()))
                .collect(Collectors.toList());
    }
    public boolean atualizar(Usuario usuario){
        for (Integer i=0;i< usuarios.size();i++){
            if(usuarios.get(i).getId().equals(usuario.getId())){
                usuarios.set(i,usuario);
                return true;
            }
        }
        return false;
    }
    public boolean deletar(List<Usuario> id){
        if (usuarios.get(id).equals(usuarios.get(id))){
            deletar(usuarios);
        }
        return false;
    }
    public void adicionarAmizade(int idUsuario, int idUsuario1){
        if ((usuarios.get(idUsuario).equals(idUsuario1))){
            adicionarAmizade(idUsuario,idUsuario1);
        }
    }
    public void removerAmizade(){
        if (usuarios.get(buscarPorID().equals(usuarios))) {
            removerAmizade();
        }
    }
}
