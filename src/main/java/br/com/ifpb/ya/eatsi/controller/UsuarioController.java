package br.com.ifpb.ya.eatsi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpb.ya.eatsi.model.Usuario;
import br.com.ifpb.ya.eatsi.service.UsuarioService;

@RestController
@RequestMapping("/")
public class UsuarioController {
	@Autowired
	   private UsuarioService usuarioService;

	   @GetMapping("/usuarios")
	   public List<Usuario> getUsuarios() {
	       return this.usuarioService.getUsuarios();
	   }

	   @GetMapping("/usuarios/{id}")
	   public Usuario getUsuarioPorId(@PathVariable("id") Long idUsuario) {
	       return this.usuarioService.getUsuarioPorId(idUsuario);
	   }

	   @PostMapping("/usuarios")
	   public Usuario inserirUsuario(@RequestBody Usuario usuario){
	       return this.usuarioService.inserir(usuario);
	   }

	   @PutMapping("/usuarios/{id}")
	   public Usuario atualizarUsuario(@RequestBody Usuario usuario){
	       return this.usuarioService.inserir(usuario);
	   }

	   @DeleteMapping("/usuarios/{id}")
	   public void apagarUsuario(@PathVariable("id") Long id) {
	       this.usuarioService.apagar(id);
	   }

}
