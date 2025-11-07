package campeonatosfifa.api.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_grupo")
    @SequenceGenerator(name = "secuencia_grupo", sequenceName = "secuencia_grupo", allocationSize = 1)
    @Column(name = "id")
    private int id;

}
