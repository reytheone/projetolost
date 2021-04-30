package br.itau.projeto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itmn_equipamento")
public class Equipamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equip") //nome da coluna no BD
    private int id;

    @Column(name = "hostname", length = 100, nullable = false)
    private String hostname;

    @Column(name = "ipaddr", length = 100, nullable = false)
    private String ipaddr;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getHostname() {
        return hostname;
    }
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDescricao() {
        return ipaddr;
    }
    public void setDescricao(String ipaddr) {
        this.ipaddr = ipaddr;
    }
    public Alarme orElse(Object object) {
        return null;
    }
    
}
