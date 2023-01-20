package com.besy.bcsb.dominio;
import java.time.LocalDate;

public class PeliculaSerie {
    private String titulo;
    private LocalDate fechaDeCreacion;
    private int calificacion;
    private Genero genero;

     public PeliculaSerie(String titulo, LocalDate fechaDeCreacion, int calificacion, Genero genero) {
        this.titulo = titulo;
        this.fechaDeCreacion = fechaDeCreacion;
        this.calificacion = calificacion;
        this.genero = genero;
    }

    public String getTitulo() {
         return titulo;
    }

    public void setTitulo(String titulo) {
         this.titulo = titulo;
    }

    public LocalDate getFechaDeCreacion() {
         return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
         this.fechaDeCreacion = fechaDeCreacion;
    }

    public int getCalificacion() {
         return calificacion;
    }

    public void setCalificacion(int calificacion) {
         this.calificacion = calificacion;
    }

    public Genero getGenero() {
         return genero;
    }

    public void setGenero(Genero genero) {
         this.genero = genero;
    }
}
