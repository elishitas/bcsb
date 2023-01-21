package com.besy.bcsb.controlador;

import com.besy.bcsb.dominio.Personaje;
import com.besy.bcsb.utilidades.DatosUtilidad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/personajes")
public class PersonajeControlador {

    @GetMapping
    public List<Personaje> mostrarTodos(){
        return DatosUtilidad.creacionPersonajes();
    }

    @GetMapping("/nombre/{nombre}")
    public List<Personaje> filtrarPorNombre(@PathVariable String nombre){
        return DatosUtilidad.filtrarPersonajesPorNombre(nombre);
    }

    @GetMapping("/edad/{edad}")
    public List<Personaje> filtrarPorEdad(@PathVariable int edad){
        return DatosUtilidad.filtrarPersonajesPorEdad(edad);
    }

}

//a. GET /personajes/{nombre}: busca el personaje por el nombre ingresado.
//b. GET /personajes: se obtiene todos los personajes y sus correspondientes datos.
//c. GET /personajes/{edad}: busca los personajes de cierta edad