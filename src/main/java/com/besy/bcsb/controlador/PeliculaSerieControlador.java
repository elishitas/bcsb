package com.besy.bcsb.controlador;

import com.besy.bcsb.dominio.Genero;
import com.besy.bcsb.dominio.PeliculaSerie;
import com.besy.bcsb.utilidades.DatosUtilidad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//capa mas externa de nuestra aplicacion
@RestController
@RequestMapping("/peliculas-series")
public class PeliculaSerieControlador {

    @GetMapping
    public List<PeliculaSerie> mostrarTodos(){
        List<Genero> generos = DatosUtilidad.creacionGeneros();
        return DatosUtilidad.creacionPeliculasSerie(generos);
    }

    @GetMapping("/titulo/{titulo}")
    public List<PeliculaSerie> buscarPorTitulo(@PathVariable String titulo){
        return DatosUtilidad.filtrarPeliculasSeriesPorTitulo(titulo);
    }

    @GetMapping("/genero/{nombre}")
    public List<PeliculaSerie> buscarPorNombreDeGenero(@PathVariable("nombre") String nombreGenero){
        return DatosUtilidad.filtrarPeliculasSeriesPorNombreDeGenero(nombreGenero);
    }


}

//d. GET /películas: se obtiene todas las películas.
// e. GET /películas/{titulo}: busca la película por el titulo ingresado.
// f. GET /películas/{genero}: busca las películas correspondientes a dicho género.