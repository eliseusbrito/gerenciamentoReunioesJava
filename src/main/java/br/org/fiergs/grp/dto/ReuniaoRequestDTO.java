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

    public ReuniaoRequestDTO(String assunto, LocalDateTime fullDate, String local, String tipoReuniao, String status, List<Diretor> diretorList) {
        this.assunto = assunto;
        this.fullDate = fullDate;
        this.local = local;
        this.tipoReuniao = tipoReuniao;
        this.status = status;
        this.diretorList = diretorList;
    }

    public Reuniao transformaParaObjeto(){
        return new Reuniao(assunto, fullDate, local, tipoReuniao, status, diretorList);
    }

    public String getAssunto() {
        return assunto;
    }

    public LocalDateTime getFullDate() {
        return fullDate;
    }

    public String getLocal() {
        return local;
    }

    public String getTipoReuniao() {
        return tipoReuniao;
    }

    public String getStatus() {
        return status;
    }

    public List<Diretor> getDiretorList() {
        return diretorList;
    }
}
