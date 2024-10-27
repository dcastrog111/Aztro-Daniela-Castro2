package org.example;

import org.example.models.supermercado.CategoriaProducto;
import org.example.models.supermercado.Cliente;
import org.example.models.supermercado.Marca;
import org.example.models.supermercado.Producto;
import org.example.models.supermercado.Venta;
import org.example.repositories.supermercado.*;

import java.util.ArrayList;
import java.util.List;

public class MainSupermercado {
    public static void main(String[] args) {

        // Repositorios

        ClienteRepository clienteRepository = new ClienteRepository();
        ProductoRepository productoRepository = new ProductoRepository();
        MarcaRepository marcaRepository = new MarcaRepository();
        CategoriaProductoRepository categoriaProductoRepository = new CategoriaProductoRepository();
        VentaRepository ventaRepository = new VentaRepository();
        DetalleVentaRepository detalleVentaRepository = new DetalleVentaRepository();


        // Dominios (registros)

        Cliente c1 = Cliente.builder()
                .cedula(123456789L)
                .nombre("Daniela")
                .apellido("Castro")
                .telefonoFijo("1234567")
                .build();

        Cliente c2 = Cliente.builder()
                .cedula(123456786L)
                .nombre("Maria")
                .apellido("Lopez")
                .celular("3234568")
                .build();


        CategoriaProducto cp1 = CategoriaProducto.builder()
                .nombre("Deportes")
                .descripcion("Ropa y calzado deportivo")
                .build();

        Producto p1 = Producto.builder()
                .nombre("AirJordan4")
                .precioCompra(200.0f)
                .build();

        Producto p2 = Producto.builder()
                .nombre("AirMax")
                .precioCompra(150.0f)
                .build();

        Producto p3 = Producto.builder()
                .nombre("AdPro")
                .precioCompra(150.0f)
                .build();

        Producto p4 = Producto.builder()
                .nombre("AdStar")
                .precioCompra(250.0f)
                .build();

        List<Producto> listaProductos1 = new ArrayList();
        listaProductos1.add(p1);
        listaProductos1.add(p2);

        List<Producto> listaProductos2 = new ArrayList();
        listaProductos2.add(p3);
        listaProductos2.add(p4);

        Marca m1 = Marca.builder()
                .nombre("Adidas")
                .Pais("Alemania")
                .descripcion("Marca de ropa y calzado deportivo")
                .productos(listaProductos2)
                .build();

        Marca m2 = Marca.builder()
                .nombre("Nike")
                .Pais("Estados Unidos")
                .descripcion("Marca de ropa y calzado deportivo")
                .productos(listaProductos1)
                .build();

        Venta v1 = Venta.builder()
                .valorBruto(200.0f)
                .valorDto(0.0f)
                .valorNeto(200.0f)
                .build();

        Venta v2 = Venta.builder()
                .valorBruto(150.0f)
                .valorDto(0.0f)
                .valorNeto(150.0f)
                .build();


        clienteRepository.create(c1);
        clienteRepository.create(c2);
        productoRepository.create(p1);
        productoRepository.create(p2);
        productoRepository.create(p3);
        productoRepository.create(p4);
        marcaRepository.create(m1);
        marcaRepository.create(m2);
        categoriaProductoRepository.create(cp1);
        ventaRepository.create(v1);
        ventaRepository.create(v2);


        clienteRepository.findAll()
                .forEach(System.out::println);
        marcaRepository.findAll()
                .forEach(System.out::println);
        productoRepository.findAll()
                .forEach(System.out::println);
        ventaRepository.findAll()
                .forEach(System.out::println);


        // Metodos para cerrar conexiones
        clienteRepository.close();
        marcaRepository.close();
        productoRepository.close();
        categoriaProductoRepository.close();
        ventaRepository.close();
        detalleVentaRepository.close();

    }
}