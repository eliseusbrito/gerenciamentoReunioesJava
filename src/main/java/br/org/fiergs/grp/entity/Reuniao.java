package br.org.fiergs.grp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="GRP_REUNIAO")
public class Reuniao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name="GRP_GENERATOR", sequenceName="GRP_SEQ", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GRP_GENERATOR")
    @Column(name="ID")
    private Long id;

    @Column(name="ASSUNTO")
    private String assunto;

    @Column(name="DATA")
    private LocalDateTime fullDate;

    @Column(name="LOCAL")
    private String local;

    @Column(name="TIPO_REUNIAO")
    private String tipoReuniao;

    @Column(name="STATUS")
    private String status;

    @JsonIgnore
    @ManyToMany
    @JoinColumn(name="id")
    @Column(name="LISTA_DIRETOR")
    private List<Diretor> diretorList;

    public Reuniao() {
    }

    public Reuniao(String assunto, LocalDateTime fullDate, String local, String tipoReuniao, String status, List<Diretor> diretorList) {
        this.assunto = assunto;
        this.fullDate = fullDate;
        this.local = local;
        this.tipoReuniao = tipoReuniao;
        this.status = status;
        this.diretorList = diretorList;
    }

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setFullDate(LocalDateTime fullDate) {
        this.fullDate = fullDate;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setTipoReuniao(String tipoReuniao) {
        this.tipoReuniao = tipoReuniao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDiretorList(List<Diretor> diretorList) {
        this.diretorList = diretorList;
    }
}
