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

import br.com.ifpb.ya.eatsi.model.Restaurante;
import br.com.ifpb.ya.eatsi.service.RestauranteService;

@RestController
@RequestMapping("/")
public class RestauranteController {
	@Autowired
	   private RestauranteService restauranteService;

	   @GetMapping("/restaurantes")
	   public List<Restaurante> getRestaurantes() {
	       return this.restauranteService.getRestaurantes();
	   }


	   @GetMapping("/restaurantes/{id}")
	   public Restaurante getRestaurantePorId(@PathVariable("id") Long idRestaurante) {
	       return this.restauranteService.getRestaurantePorId(idRestaurante);
	   }

	   @PostMapping("/restaurantes")
	   public Restaurante inserirRestaurante(@RequestBody Restaurante restaurante){
	       return this.restauranteService.inserir(restaurante);
	   }

	   @PutMapping("/restaurantes/{id}")
	   public Restaurante atualizarRestaurante(@RequestBody Restaurante restaurante){
	       return this.restauranteService.inserir(restaurante);
	   }

	   @DeleteMapping("/restaurantes/{id}")
	   public void apagarRestaurante(@PathVariable("id") Long id) {
	       this.restauranteService.apagar(id);
	   }
}
