package br.org.fiergs.grp.dto;

import br.org.fiergs.grp.entity.Diretor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class DiretorRequestDTO {

    @NotBlank(message = "diretor.name.required")
    private String nome;

    @Email(message = "diretor.email.required")
    private String email;

    private String telefone;

    private String cargo;

    private String situacao;

    public DiretorRequestDTO() {
    }

    public DiretorRequestDTO(String nome, String email, String telefone, String cargo, String situacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public Diretor transformaParaObjeto(){
        return new Diretor(nome, email, telefone, cargo, situacao);
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
