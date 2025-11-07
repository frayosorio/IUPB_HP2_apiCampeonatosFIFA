package campeonatosfifa.api.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "encuentro")
public class Encuentro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_encuentro")
    @SequenceGenerator(name = "secuencia_encuentro", sequenceName = "secuencia_encuentro", allocationSize = 1)
    @Column(name = "id")
    private int id;

}
