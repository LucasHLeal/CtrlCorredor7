package com.bcopstein.ctrlcorredor_v7_CLEAN.adaptadores.repositorios;
import java.util.List;

import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Data;
import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Evento;
import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Tempo;
import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.repositorios.IEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventoRepository implements IEventoRepository{
    private EventoBD eventoBD;

    @Autowired
    public EventoRepository(EventoBD eventoBD) {
        this.eventoBD = eventoBD;
        cadastra(new Evento(1,"Poa Day Run",5,new Data(22,5,2019),new Tempo(0,35,32)));
        cadastra(new Evento(2,"Poa Night Run",5,new Data(12,6,2019),new Tempo(0,31,10)));
        cadastra(new Evento(3,"Winter Day Run",5, new Data(9,7,2019),new Tempo(0,29,17)));
        cadastra(new Evento(4,"Summer Night Run",5,new Data(18,12,2019), new Tempo(0,32,25)));
    }  

    public List<Evento> todos() {
        return eventoBD.findAll();
    }

    public boolean cadastra(Evento evento){
        Evento bdEvento = eventoBD.save(evento);
        return bdEvento != null ? true : false;
    }
}
