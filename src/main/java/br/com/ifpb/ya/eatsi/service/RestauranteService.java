package br.com.ifpb.ya.eatsi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpb.ya.eatsi.model.Restaurante;
import br.com.ifpb.ya.eatsi.repositories.RestauranteRepository;

@Service
public class RestauranteService {
	@Autowired
	   private RestauranteRepository restauranteRepository;

	   public List<Restaurante> getRestaurantes() {
	       return this.restauranteRepository.findAll();
	   }

	   public Restaurante getRestaurantePorId(Long idRestaurante) {
	       return this.restauranteRepository.findById(idRestaurante).orElse(null);
	   }

	   @Transactional
	   public Restaurante inserir(Restaurante restaurante) {
	       Restaurante restauranteInserido = this.restauranteRepository.save(restaurante);
	       return restauranteInserido;
	   }

	   public void apagar(Long id) {
	       this.restauranteRepository.deleteById(id);
	   }
}
