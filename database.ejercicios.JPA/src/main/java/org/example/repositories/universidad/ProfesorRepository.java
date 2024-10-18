package org.example.repositories.universidad;

import org.example.configs.EntityManagerPostgres;
import org.example.models.universidad.Profesor;
import org.example.repositories.AbstractRepository;

public class ProfesorRepository extends AbstractRepository<Profesor> {
    public ProfesorRepository() {
        super(new EntityManagerPostgres<>());
    }
}
