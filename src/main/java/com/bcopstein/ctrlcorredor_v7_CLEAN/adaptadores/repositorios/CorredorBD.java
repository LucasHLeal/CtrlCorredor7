package com.bcopstein.ctrlcorredor_v7_CLEAN.adaptadores.repositorios;
import java.util.List;
import java.util.Optional;

import javax.persistence.*;

import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Corredor;

import org.springframework.data.repository.CrudRepository;


public interface CorredorBD  extends CrudRepository<Corredor, String> {
    List<Corredor> findAll();
}
