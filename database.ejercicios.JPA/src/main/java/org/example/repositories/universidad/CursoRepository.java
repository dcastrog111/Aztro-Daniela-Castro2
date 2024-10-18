package org.example.repositories.universidad;

import org.example.configs.EntityManagerPostgres;
import org.example.models.universidad.Curso;
import org.example.repositories.AbstractRepository;

public class CursoRepository extends AbstractRepository<Curso> {
    public CursoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
