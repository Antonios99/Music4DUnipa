package com.unipa.music4dunipa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "voti")
public class Voto{

    @Id
    private String utente_id;

    @Column(nullable=false)
    private String emozione;

    public Voto(String utente_id, String emozione) {
        this.utente_id = utente_id;
        this.emozione = emozione;
    }

    public String getUtente_id(){
        return utente_id;
    }

    public void setUtente_id(String utente_id) {
        this.utente_id = utente_id;
    }

    public String getEmozione() {
        return emozione;
    }

    public void setEmozione(String emozione) {
        this.emozione = emozione;
    }
}
