package org.example.repositories.universidad;


import org.example.configs.EntityManagerPostgres;
import org.example.models.universidad.Estudiante;
import org.example.repositories.AbstractRepository;

public class EstudianteRepository extends AbstractRepository<Estudiante> {
    public EstudianteRepository() {
        super(new EntityManagerPostgres<>());
    }
}
