package com.bcopstein.ctrlcorredor_v7_CLEAN.adaptadores.repositorios;

import java.util.List;

import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Evento;

import org.springframework.data.repository.CrudRepository;

public interface EventoBD extends CrudRepository<Evento, Integer>{
    List<Evento> findAll();
}
