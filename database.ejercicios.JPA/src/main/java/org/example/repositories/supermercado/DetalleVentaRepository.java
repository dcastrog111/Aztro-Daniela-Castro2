package org.example.repositories.supermercado;

import org.example.configs.EntityManagerPostgres;
import org.example.models.supermercado.DetalleVenta;
import org.example.repositories.AbstractRepository;

public class DetalleVentaRepository extends AbstractRepository<DetalleVenta> {
    public DetalleVentaRepository() {
        super(new EntityManagerPostgres<>());
    }
}

