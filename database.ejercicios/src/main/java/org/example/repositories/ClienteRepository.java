package org.example.repositories;

import org.example.configs.EntityManagerPostgres;
import org.example.models.Cliente;

public class ClienteRepository extends AbstractRepository <Cliente> {

    public ClienteRepository() {
        super(new EntityManagerPostgres<>());
    }
}
