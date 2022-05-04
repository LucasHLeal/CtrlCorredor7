package com.bcopstein.ctrlcorredor_v7_CLEAN.adaptadores.repositorios;
import java.util.List;
import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.entidades.Corredor;
import com.bcopstein.ctrlcorredor_v7_CLEAN.negocio.repositorios.ICorredorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorredorRepository implements ICorredorRepository {
    private CorredorBD corredorBD;

    @Autowired
    public CorredorRepository(CorredorBD corredorBD ) {
        this.corredorBD = corredorBD;
        cadastra(new Corredor("10001287","Luiz",22,5,1987,"masculino"));    }
    
    public List<Corredor> todos() {
        return corredorBD.findAll();
    }

    public void removeTodos(){
        corredorBD.deleteAll();
    }

    public boolean cadastra(Corredor corredor){
        Corredor bdCorredor = corredorBD.save(corredor);
        return bdCorredor != null ? true : false;
    }
}
