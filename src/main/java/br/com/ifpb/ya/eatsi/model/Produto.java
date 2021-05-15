package br.com.ifpb.ya.eatsi.model;

import java.net.URL;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private Long id;
    private String nome;
    private URL imagem;
    private String descricao;
    @ManyToOne()
    private Restaurante restaurante;
    @ManyToMany
    private List<Pedido> pedidos;

    private int preco;
    
    public Produto() {
        
    }
    public Produto(String nome, URL imagem, String descricao, Restaurante restaurante, int preco) {
        this.nome = nome;
        this.imagem = imagem;
        this.descricao = descricao;
        this.restaurante = restaurante;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public URL getImagem() {
        return imagem;
    }

    public void setImagem(URL imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

}