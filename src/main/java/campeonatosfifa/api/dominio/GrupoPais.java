package campeonatosfifa.api.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@IdClass(GrupoPaisId.class)
@Table(name = "grupopais")
public class GrupoPais {

    @Id
    @ManyToOne
    @JoinColumn(name = "idgrupo", referencedColumnName = "id", nullable = false)
    private Grupo grupo;

    @Id
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id", nullable = false)
    private Pais pais;

    public GrupoPais() {
    }

    public GrupoPais(Grupo grupo, Pais pais) {
        this.grupo = grupo;
        this.pais = pais;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
