package br.org.fiergs.grp.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="GRP_DIRETOR")
public class Diretor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="GRP_GENERATOR", sequenceName="GRP_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRP_GENERATOR")
    @Column(name="ID")
    private Long id;

    @Column(name="NOME")
    private String nome;

    @Column(name="EMAIL")
    private String email;

    @Column(name="TELEFONE")
    private String telefone;

    @Column(name="CARGO")
    private String cargo;

    @Column(name="SITUACAO")
    private String situacao;

    public Diretor() {
    }

    public Diretor(String nome, String email, String telefone, String cargo, String situacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public String getSituacao() {
        return situacao;
    }

}
