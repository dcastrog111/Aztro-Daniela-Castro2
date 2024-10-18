package org.example.repositories;


import org.example.configs.EntityManagerPostgres;
import org.example.models.CategoriaProducto;

public class CategoriaProductoRepository extends AbstractRepository<CategoriaProducto>{
    public CategoriaProductoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
