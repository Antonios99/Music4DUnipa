package com.unipa.music4dunipa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.unipa.music4dunipa.model.Voto;
import com.unipa.music4dunipa.repository.VotoInterface;

@Service
public class VotoService {

    @Autowired
    private VotoInterface votoRepository;

    public Voto insertVoto(String id_utente, Integer piacevolezza, Integer energia) {
        Voto voto = new Voto(id_utente, piacevolezza, energia);
        return votoRepository.save(voto);
    }



}
