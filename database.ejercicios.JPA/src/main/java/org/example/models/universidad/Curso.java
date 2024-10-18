package org.example.models.universidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Curso {
    @Id
    @Column(nullable = false)
    private String id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int creditos;
    private String descripcion;


    @OneToMany
    private List<Estudiante> estudiantes;
}
