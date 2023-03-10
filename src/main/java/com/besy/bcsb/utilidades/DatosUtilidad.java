package com.besy.bcsb.utilidades;

import com.besy.bcsb.dominio.Genero;
import com.besy.bcsb.dominio.PeliculaSerie;
import com.besy.bcsb.dominio.Personaje;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class DatosUtilidad {

    public static List<Genero> creacionGeneros() {

        List<Genero> generos = new ArrayList<>();

        Genero genero1 = new Genero("Aventura");
        Genero genero2 = new Genero("Comedia");
        Genero genero3 = new Genero("Documental");
        Genero genero4 = new Genero("Musical");
        Genero genero5 = new Genero("Infantil");

        generos.add(genero1);
        generos.add(genero2);
        generos.add(genero3);
        generos.add(genero4);
        generos.add(genero5);

        return generos;
    }

    public static List<PeliculaSerie> creacionPeliculasSerie(List<Genero> generos) {

        List<PeliculaSerie> peliculasSeries = new ArrayList<>();

        PeliculaSerie peliculaSerie1 = new PeliculaSerie
                ("La Noche de los Museos", LocalDate.of(2006, 03, 31), (int) 5, generos.get(0));
        PeliculaSerie peliculaSerie2 = new PeliculaSerie
                ("La vida secreta de Walter Mitty", LocalDate.of(2013, 03, 31), (int) 5, generos.get(0));
        PeliculaSerie peliculaSerie3 = new PeliculaSerie
                ("Zoolander", LocalDate.of(2001, 03, 31), (int) 1, generos.get(1));
        PeliculaSerie peliculaSerie4 = new PeliculaSerie
                ("Algo pasa con Mary", LocalDate.of(1998, 03, 31), (int) 1, generos.get(1));
        PeliculaSerie peliculaSerie5 = new PeliculaSerie
                ("Halftime", LocalDate.of(2022, 03, 31), (int) 2, generos.get(2));
        PeliculaSerie peliculaSerie6 = new PeliculaSerie
                ("Britney vs Spears", LocalDate.of(2021, 03, 31), (int) 2, generos.get(2));
        PeliculaSerie peliculaSerie7 = new PeliculaSerie
                ("La La Land", LocalDate.of(2016, 03, 31), (int) 3, generos.get(3));
        PeliculaSerie peliculaSerie8 = new PeliculaSerie
                ("Whiplash", LocalDate.of(2014, 03, 31), (int) 3, generos.get(3));
        PeliculaSerie peliculaSerie9 = new PeliculaSerie
                ("Red", LocalDate.of(2022, 03, 31), (int) 4, generos.get(4));
        PeliculaSerie peliculaSerie10 = new PeliculaSerie
                ("Luca", LocalDate.of(2021, 03, 31), (int) 4, generos.get(4));

        peliculasSeries.add(peliculaSerie1);
        peliculasSeries.add(peliculaSerie2);
        peliculasSeries.add(peliculaSerie3);
        peliculasSeries.add(peliculaSerie4);
        peliculasSeries.add(peliculaSerie5);
        peliculasSeries.add(peliculaSerie6);
        peliculasSeries.add(peliculaSerie7);
        peliculasSeries.add(peliculaSerie8);
        peliculasSeries.add(peliculaSerie9);
        peliculasSeries.add(peliculaSerie10);

        return peliculasSeries;
    }


    public static List<Personaje> creacionPersonajes() {

        List<Personaje> personajes = new ArrayList<>();

        Personaje personaje1 = new Personaje
                ("Larry", 31, 51.1f, "Las elevadas aspiraciones de Larry (Ben Stiller) caen en saco roto cuando debe aceptar un humilde trabajo de vigilante nocturno en el Museo de Historia Natural de Nueva York.");
        Personaje personaje2 = new Personaje
                ("Walter Mitty", 42, 52.2f, "Walter Mitty (Stiller) es un hombre so??ador que trabaja como editor gr??fico en la revista LIFE y que escapa de su aburrida vida gracias a su imaginaci??n, inventando mundos de fantas??a en los que se convierte en un verdadero h??roe.");
        Personaje personaje3 = new Personaje
                ("Derek Zoolander", 33, 53.3f, "Derek Zoolander (Ben Stiller) ha sido por tres temporadas consecutivas el Top Model n??mero uno. Pero la cresta de la fama es inestable");
        Personaje personaje4 = new Personaje
                ("Ted Stehman", 20, 54.4f, "Trece a??os despu??s sigue suspirando por la misma chica");
        Personaje personaje5 = new Personaje
                ("Jennifer Lopez", 53, 55.5f, "La superestrella mundial reflexiona sobre su polifac??tica carrera y la presi??n que supone vivir bajo los focos");
        Personaje personaje6 = new Personaje
                ("Britney Spears", 53, 56.6f, " La lucha de Britney Spears para recuperar su propia tutela en los tribunales se juega en paralelo a la carrera por tratar de contar su calvario personal");
        Personaje personaje7 = new Personaje
                ("Emma Stone", 33, 57.7f, "La historia de La La Land:Un estado mental enso??ador y euf??rico alejado de las m??s duras realidades de la vida");
        Personaje personaje8 = new Personaje
                ("Miles Teller", 28, 58.8f, "El protagonista aprende de memoria durante una larga noche de pr??ctica compulsiva y lacerante");
        Personaje personaje9 = new Personaje
                ("Mei Lee", 16, 59.9f, "Una ni??a se debate entre seguir siendo la hija obediente que su madre quiere que sea y el caos de la adolescencia");
        Personaje personaje10 = new Personaje
                ("Luca", 7, 50.10f, "Dos ni??os emprenden una aventura entre humanos que odian a los monstruos.");

        personajes.add(personaje1);
        personajes.add(personaje2);
        personajes.add(personaje3);
        personajes.add(personaje4);
        personajes.add(personaje5);
        personajes.add(personaje6);
        personajes.add(personaje7);
        personajes.add(personaje8);
        personajes.add(personaje9);
        personajes.add(personaje10);

        return personajes;
    }

    public static List<Personaje> filtrarPersonajesPorNombre(String nombre){

        List<Personaje> personajes = creacionPersonajes();

        return personajes.stream()
                .filter(personaje -> personaje.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    public static List<Personaje> filtrarPersonajesPorEdad(int edad){

        List<Personaje> personajes = creacionPersonajes();

        return personajes.stream()
                .filter(p->p.getEdad()==edad)
                .collect(Collectors.toList());
    }

    public static List<PeliculaSerie> filtrarPeliculasSeriesPorTitulo(String titulo){

        List<Genero> generos = creacionGeneros();
        List<PeliculaSerie> peliculasSeries = creacionPeliculasSerie(generos);

        return peliculasSeries.stream()
                .filter(peliculaSerie -> peliculaSerie.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
    }

    public static List<PeliculaSerie> filtrarPeliculasSeriesPorNombreDeGenero(String nombreGenero){

        List<Genero> generos = creacionGeneros();
        List<PeliculaSerie> peliculasSeries = creacionPeliculasSerie(generos);

        return peliculasSeries.stream()
                .filter(peliculaSerie -> peliculaSerie.getGenero().getNombre().equalsIgnoreCase(nombreGenero))
                .collect(Collectors.toList());
    }

}