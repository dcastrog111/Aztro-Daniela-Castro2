package org.example.models.supermercado;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {

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

//    @OneToMany
//    @JoinTable(name = "detalle_venta",
//            joinColumns = @JoinColumn(name = "idCliente"),
//            inverseJoinColumns = {
//                    @JoinColumn(name = "idVenta")
//            }
//
//    )
//    private List <Venta> ventas = new ArrayList<>();
}
