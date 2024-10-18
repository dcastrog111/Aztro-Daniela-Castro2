package org.example.repositories.supermercado;


import org.example.configs.EntityManagerPostgres;
import org.example.models.supermercado.CategoriaProducto;
import org.example.repositories.AbstractRepository;

public class CategoriaProductoRepository extends AbstractRepository<CategoriaProducto> {
    public CategoriaProductoRepository() {
        super(new EntityManagerPostgres<>());
    }
}
