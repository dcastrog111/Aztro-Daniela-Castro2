package org.example.repositories.empresa;

import org.example.configs.EntityManagerPostgres;
import org.example.models.empresa.Proyecto;
import org.example.repositories.AbstractRepository;

public class ProyectoRepository extends AbstractRepository<Proyecto> {

    public ProyectoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
