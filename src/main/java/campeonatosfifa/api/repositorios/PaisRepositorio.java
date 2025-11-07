package campeonatosfifa.api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import campeonatosfifa.api.dominio.Pais;

public interface PaisRepositorio extends JpaRepository<Pais, Integer> {

}