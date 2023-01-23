package br.org.fiergs.grp.dto;

import br.org.fiergs.grp.entity.Diretor;

public class DiretorResponseDTO {

    private String nome;

    private String email;

    private String telefone;

    private String cargo;

    private String situacao;

    public static DiretorResponseDTO transformaEmDTO(Diretor diretor) {
        return new DiretorResponseDTO(diretor.getNome(), diretor.getEmail(), diretor.getTelefone(), diretor.getCargo(), diretor.getSituacao());
    }

    public DiretorResponseDTO() {
    }

    public DiretorResponseDTO(String nome, String email, String telefone, String cargo, String situacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
        this.situacao = situacao;
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
