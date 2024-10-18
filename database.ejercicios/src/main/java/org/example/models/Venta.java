package org.example.models;

import jakarta.persistence.*;

import java.time.LocalTime;

public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private LocalTime fecha;
    @Column(nullable = false)
    private float valorBruto;
    private float descuento;
    @Column(nullable = false)
    private float valorNeto;
}
