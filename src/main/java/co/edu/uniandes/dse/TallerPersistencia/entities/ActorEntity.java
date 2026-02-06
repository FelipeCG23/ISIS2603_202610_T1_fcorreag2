package co.edu.uniandes.dse.TallerPersistencia.entities;

import lombok.Data;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Data
@Entity
public class ActorEntity extends BaseEntity {
    private String nombre;
    private String nacionalidad;
    @ManyToMany
    private List<PeliculaEntity> peliculas;
}