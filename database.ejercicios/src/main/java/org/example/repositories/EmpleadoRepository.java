package org.example.repositories;

import org.example.configs.EntityManagerPostgres;
import org.example.models.Empleado;

public class EmpleadoRepository extends AbstractRepository <Empleado> {

    public EmpleadoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
