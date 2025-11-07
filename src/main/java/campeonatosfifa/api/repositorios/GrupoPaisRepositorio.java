package campeonatosfifa.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import campeonatosfifa.api.dominio.GrupoPais;
import campeonatosfifa.api.dominio.GrupoPaisId;

public interface GrupoPaisRepositorio extends JpaRepository<GrupoPais, GrupoPaisId>{

    
}