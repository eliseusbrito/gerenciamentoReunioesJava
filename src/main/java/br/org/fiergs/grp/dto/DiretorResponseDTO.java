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

    public DiretorResponseDTO(String nome, String email, String telefone, String cargo, String situacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
        this.situacao = situacao;
    }
}
