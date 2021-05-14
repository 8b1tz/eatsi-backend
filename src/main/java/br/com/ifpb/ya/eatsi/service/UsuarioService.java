package br.com.ifpb.ya.eatsi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpb.ya.eatsi.model.Usuario;
import br.com.ifpb.ya.eatsi.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	 @Autowired
	   private UsuarioRepository usuarioRepository;

	   public List<Usuario> getUsuarios() {
	       return this.usuarioRepository.findAll();
	   }

	   public Usuario getUsuarioPorId(Long idUsuario) {
	       return this.usuarioRepository.findById(idUsuario).orElse(null);
	   }

	   @Transactional
	   public Usuario inserir(Usuario usuario) {
	       Usuario usuarioInserido = this.usuarioRepository.save(usuario);
	       return usuarioInserido;
	   }

	   public void apagar(Long id) {
	       this.usuarioRepository.deleteById(id);
	   }

}
