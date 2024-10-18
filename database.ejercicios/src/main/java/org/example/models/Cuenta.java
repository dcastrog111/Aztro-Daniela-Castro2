package org.example.models;

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
public class Cuenta {

    @Id
    @Column(nullable = false)
    private String numeroCuenta;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private String banco;


}
