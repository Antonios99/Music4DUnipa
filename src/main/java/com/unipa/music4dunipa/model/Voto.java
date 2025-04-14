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

    @Column(nullable=false)
    private String genere;

    @Column(nullable=false)
    private String tipo_strumento;

    @Column(nullable=false)
    private Integer age;

    public Voto(){}


    public Voto( String utente_id, Integer energia, Integer piacevolezza, String genere, String tipo_strumento, Integer age) {
        //this.id = id;
        this.utente_id = utente_id;
        this.piacevolezza = piacevolezza;
        this.energia = energia;
        this.genere = genere;
        this.tipo_strumento = tipo_strumento;
        this.age = age;
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

    public String getGenere(){

        return genere;
    }
    public void setGenere(String genere) {

        this.genere = genere;
    }

    public String getTipo_strumento(){

        return tipo_strumento;
    }

    public void setTipo_strumento(String tipo_strumento) {

        this.tipo_strumento = tipo_strumento;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
