package org.example.repositories;


import org.example.configs.EntityManagerPostgres;
import org.example.models.Cuenta;

public class CuentaRepository extends AbstractRepository<Cuenta>{
    public CuentaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
