package br.org.fiergs.grp.dto;

import br.org.fiergs.grp.entity.Diretor;
import br.org.fiergs.grp.entity.Reuniao;

import java.time.LocalDateTime;
import java.util.List;

public class ReuniaoResponseDTO {

    private String assunto;

    private LocalDateTime fullDate;

    private String local;

    private String tipoReuniao;

    private String status;

    private List<Diretor> diretorList;

    public ReuniaoResponseDTO() {
    }

    public static ReuniaoResponseDTO transformaEmDTO(Reuniao reuniao) {
        return new ReuniaoResponseDTO(reuniao.getAssunto(), reuniao.getFullDate(), reuniao.getLocal(), reuniao.getTipoReuniao(), reuniao.getStatus(), reuniao.getDiretorList());
    }

    public ReuniaoResponseDTO(String assunto, LocalDateTime fullDate, String local, String tipoReuniao, String status, List<Diretor> diretorList) {
        this.assunto = assunto;
        this.fullDate = fullDate;
        this.local = local;
        this.tipoReuniao = tipoReuniao;
        this.status = status;
        this.diretorList = diretorList;
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
