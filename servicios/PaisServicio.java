package campeonatosfifa.api.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campeonatosfifa.api.dominio.Pais;
import campeonatosfifa.api.repositorios.PaisRepositorio;

@Service
public class PaisServicio {

    @Autowired
    private PaisRepositorio repositorio;

    public List<Pais> listar(){
        return repositorio.findAll();
    }

}
