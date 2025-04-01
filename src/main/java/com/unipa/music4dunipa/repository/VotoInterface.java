package com.unipa.music4dunipa.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.unipa.music4dunipa.model.Voto;

@Repository
public interface VotoInterface extends CrudRepository<Voto, Integer> {
}
