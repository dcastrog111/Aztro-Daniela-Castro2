package org.example.models.universidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Estudiante {
    @Id
    @Column(nullable = false)
    private String carnet;
    @Column(nullable = false)
    private long documento;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    private String telefonoFijo;
    private String celular;
    private int estrato;
    private String barrio;


}
