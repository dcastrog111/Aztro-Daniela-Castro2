package org.example.models.universidad;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.models.supermercado.Cliente;
import org.example.models.supermercado.Producto;
import org.example.models.supermercado.Venta;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DetalleCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Profesor profesor;

    private String semestre;
    private String horario;

}
