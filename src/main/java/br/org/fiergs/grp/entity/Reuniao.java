package br.org.fiergs.grp.entity;

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
    private String id;

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

    @ManyToMany
    @JoinColumn(name="id")
    @Column(name="LISTA_DIRETOR")
    private List<Diretor> diretorList;

    public Reuniao(String assunto, LocalDateTime fullDate, String local, String tipoReuniao, String status, List<Diretor> diretorList) {
        this.assunto = assunto;
        this.fullDate = fullDate;
        this.local = local;
        this.tipoReuniao = tipoReuniao;
        this.status = status;
        this.diretorList = diretorList;
    }

    public String getId() {
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
}
