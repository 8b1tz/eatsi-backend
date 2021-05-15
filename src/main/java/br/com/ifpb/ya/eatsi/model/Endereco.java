
package br.com.ifpb.ya.eatsi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String cep;
    private int numero_do_local;
    @ManyToMany
    private List<Usuario> usuarios;
 
    public Endereco( String cep, int numero_do_local) {

        this.cep = cep;
        this.numero_do_local = numero_do_local;

    }
    
    public Endereco() {}

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getNumero_do_local() {
        return numero_do_local;
    }
    public void setNumero_do_local(int numero_do_local) {
        this.numero_do_local = numero_do_local;
    }
    
    
}
