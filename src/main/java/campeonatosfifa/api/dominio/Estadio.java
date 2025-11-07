package campeonatosfifa.api.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_estadio")
    @SequenceGenerator(name = "secuencia_estadio", sequenceName = "secuencia_estadio", allocationSize = 1)
    @Column(name = "id")
    private int id;

}
