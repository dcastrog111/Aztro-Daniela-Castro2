package org.example.repositories;


import org.example.configs.EntityManagerPostgres;
import org.example.models.Marca;

public class VentaRepository extends AbstractRepository<Marca>{
    public VentaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
