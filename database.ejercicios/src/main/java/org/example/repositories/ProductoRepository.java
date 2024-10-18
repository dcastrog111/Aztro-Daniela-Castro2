package org.example.repositories;

import org.example.configs.EntityManagerPostgres;
import org.example.models.Producto;

public class ProductoRepository extends AbstractRepository<Producto> {

    public ProductoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
