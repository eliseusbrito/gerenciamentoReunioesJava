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

    public Diretor transformaParaObjeto(){
        return new Diretor(nome, email, telefone, cargo, situacao);
    }

}
