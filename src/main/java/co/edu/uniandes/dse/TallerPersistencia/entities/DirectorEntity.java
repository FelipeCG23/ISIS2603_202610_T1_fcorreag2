package co.edu.uniandes.dse.TallerPersistencia.entities;

import lombok.Data;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Data
@Entity
public class DirectorEntity extends BaseEntity {
    private String nombre;
    private String biografia;
    @OneToMany(mappedBy = "director", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<PeliculaEntity> peliculas;
}
