package br.com.ifpb.ya.eatsi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifpb.ya.eatsi.model.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

}
