package org.example;

import org.example.repositories.empresa.CuentaRepository;
import org.example.repositories.empresa.DepartamentoRepository;
import org.example.repositories.empresa.EmpleadoRepository;
import org.example.repositories.supermercado.ProductoRepository;

public class MainEmpresa {
    public static void main(String[] args) {

        //repositorios
        EmpleadoRepository empleadoRepository = new EmpleadoRepository();
        CuentaRepository cuentaRepository = new CuentaRepository();
        DepartamentoRepository departamentoRepository = new DepartamentoRepository();
        ProductoRepository productoRepository = new ProductoRepository();

        //Metodos para cerrar
        empleadoRepository.close();
        cuentaRepository.close();
        departamentoRepository.close();
        productoRepository.close();

    }
}
