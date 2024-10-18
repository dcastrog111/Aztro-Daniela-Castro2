package org.example.repositories.empresa;

import org.example.configs.EntityManagerPostgres;
import org.example.models.empresa.Empleado;
import org.example.repositories.AbstractRepository;

public class EmpleadoRepository extends AbstractRepository<Empleado> {

    public EmpleadoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
