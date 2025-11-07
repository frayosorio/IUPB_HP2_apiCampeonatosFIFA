package campeonatosfifa.api.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "fase")
public class Fase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_fase")
    @SequenceGenerator(name = "secuencia_fase", sequenceName = "secuencia_fase", allocationSize = 1)
    @Column(name = "id")
    private int id;
}
