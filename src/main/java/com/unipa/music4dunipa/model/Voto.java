package com.unipa.music4dunipa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "voti")
public class Voto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false)
    private String utente_id;

    @Column(nullable=false)
    private Integer piacevolezza;

    @Column(nullable=false)
    private Integer energia;

    public Voto(){}


    public Voto( String utente_id, Integer energia, Integer piacevolezza) {
        //this.id = id;
        this.utente_id = utente_id;
        this.piacevolezza = piacevolezza;
        this.energia = energia;
    }

    public Integer getId() {
        return id;
    }

    public String getUtente_id(){
        return utente_id;
    }

    public void setUtente_id(String utente_id) {
        this.utente_id = utente_id;
    }

    public Integer getPiacevolezza() {
        return piacevolezza;
    }

    public void setPiacevolezza(Integer piacevolezza) {
        this.piacevolezza = piacevolezza;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
}
