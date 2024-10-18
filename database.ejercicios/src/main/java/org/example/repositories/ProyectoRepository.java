package org.example.repositories;

import org.example.configs.EntityManagerPostgres;
import org.example.models.Proyecto;

public class ProyectoRepository extends AbstractRepository <Proyecto> {

    public ProyectoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
