package org.example.repositories.universidad;

import org.example.configs.EntityManagerPostgres;
import org.example.models.universidad.DetalleCurso;
import org.example.repositories.AbstractRepository;

public class DetalleCursoRepository extends AbstractRepository<DetalleCurso> {
    public DetalleCursoRepository() {
        super(new EntityManagerPostgres<>());
    }
}

