package org.example.repositories;


import org.example.configs.EntityManagerPostgres;
import org.example.models.Marca;

public class MarcaRepository extends AbstractRepository<Marca>{
    public MarcaRepository() {
        super(new EntityManagerPostgres<>());
    }
}
