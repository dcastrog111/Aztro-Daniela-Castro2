package org.example.models.universidad;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Estudiante estudiante;
    @ManyToOne
    private DetalleCurso curso;
    private float nota1;
    private float nota2;
    private float nota3;
    private float nota4;
    private float nota5;
    private float nota6;
    private float nota7;



}
