package br.com.ifpb.ya.eatsi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpb.ya.eatsi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

   public List<Usuario> findByEmail(String email);

}
