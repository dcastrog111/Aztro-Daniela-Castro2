package org.example.repositories.universidad;

import org.example.configs.EntityManagerPostgres;
import org.example.models.universidad.Nota;
import org.example.repositories.AbstractRepository;

public class NotaRepository extends AbstractRepository<Nota> {
    public NotaRepository() {
        super(new EntityManagerPostgres<>());
    }
}

