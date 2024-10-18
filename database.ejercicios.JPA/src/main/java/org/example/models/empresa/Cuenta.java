package org.example.models.empresa;

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
public class Cuenta {

    @Id
    @Column(nullable = false)
    private String numeroCuenta;
    @Column(nullable = false)
    private String tipo;
    @Column(nullable = false)
    private String banco;


}
