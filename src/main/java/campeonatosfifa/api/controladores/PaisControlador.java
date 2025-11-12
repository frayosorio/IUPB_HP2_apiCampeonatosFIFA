package campeonatosfifa.api.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import campeonatosfifa.api.dominio.Pais;
import campeonatosfifa.api.servicios.PaisServicio;

@RestController
@RequestMapping("/api/paises")
public class PaisControlador {

    @Autowired
    private PaisServicio servicio;

    @RequestMapping(value="/listar", method=RequestMethod.GET)
    public List<Pais> listar(){
        return servicio.listar();
    }

}
