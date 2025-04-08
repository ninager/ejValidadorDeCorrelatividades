package org.example;

import java.util.Set;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Set<Materia> materiasAprobadas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Boolean aprobo(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }
}