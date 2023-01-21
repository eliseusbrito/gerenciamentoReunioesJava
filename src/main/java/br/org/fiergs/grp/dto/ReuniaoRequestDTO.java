package br.org.fiergs.grp.dto;

import br.org.fiergs.grp.entity.Diretor;
import br.org.fiergs.grp.entity.Reuniao;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

public class ReuniaoRequestDTO {

    @NotBlank(message = "diretor.name.required")
    private String assunto;

    private LocalDateTime fullDate;

    private String local;

    private String tipoReuniao;

    private String status;

    private List<Diretor> diretorList;

    public ReuniaoRequestDTO() {
    }

    public Reuniao transformaParaObjeto(){
        return new Reuniao(assunto, fullDate, local, tipoReuniao, status, diretorList);
    }

}
