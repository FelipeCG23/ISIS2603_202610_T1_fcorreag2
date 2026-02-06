package co.edu.uniandes.dse.TallerPersistencia.entities;

import lombok.Data;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    private String titulo;
    private int anioLanzamiento;
    @ManyToOne
    private DirectorEntity director;
    @ManyToMany
    private List<ActorEntity> actores;
}
