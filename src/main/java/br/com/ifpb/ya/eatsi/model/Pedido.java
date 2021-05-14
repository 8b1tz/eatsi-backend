package br.com.ifpb.ya.eatsi.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date datahora;
	private int entregador_id;
	private double preco_total;
	@OneToMany(mappedBy = "pedido")
	private List<Produto> produtos;
	@ManyToOne
	private Restaurante restaurante;
	private String status;
	@ManyToOne
	private Usuario usuario;

	public Pedido(Date datahora, int entregador_id, double preco_total, Restaurante restaurante,
			String status, Usuario usuario) {

		this.datahora = datahora;
		this.entregador_id = entregador_id;
		this.preco_total = preco_total;
		this.restaurante = restaurante;
		this.status = status;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public Date getDatahora() {
		return datahora;
	}

	public void setDatahora(Date datahora) {
		this.datahora = datahora;
	}

	public int getEntregador_id() {
		return entregador_id;
	}

	public void setEntregador_id(int entregador_id) {
		this.entregador_id = entregador_id;
	}

	public double getPreco_total() {
		return preco_total;
	}

	public void setPreco_total(double preco_total) {
		this.preco_total = preco_total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

}
