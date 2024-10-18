package org.example.models.empresa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.models.supermercado.Marca;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Empleado {

    @Id
    @Column(nullable = false)
    private Long cedula;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    private String telefonoFijo;
    private String celular;
    private String ciudad;
    private String barrio;
    private float salario;

    @OneToOne
    private Cuenta cuenta;

    @ManyToOne
    private Departamento departamento;



}
