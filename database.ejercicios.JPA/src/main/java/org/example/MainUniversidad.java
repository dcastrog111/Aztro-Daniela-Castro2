package org.example;

import org.example.repositories.supermercado.ProductoRepository;
import org.example.repositories.universidad.CursoRepository;
import org.example.repositories.universidad.DetalleCursoRepository;
import org.example.repositories.universidad.EstudianteRepository;
import org.example.repositories.universidad.NotaRepository;

public class MainUniversidad {

    public static void main(String[] args) {

        // Repositorios
        CursoRepository cursoRepository = new CursoRepository();
        DetalleCursoRepository detalleCursoRepository = new DetalleCursoRepository();
        EstudianteRepository estudianteRepository = new EstudianteRepository();
        ProductoRepository productoRepository = new ProductoRepository();
        NotaRepository notaRepository = new NotaRepository();


        //Metodos para cerrar
        cursoRepository.close();
        detalleCursoRepository.close();
        estudianteRepository.close();
        productoRepository.close();
        notaRepository.close();

    }
}
