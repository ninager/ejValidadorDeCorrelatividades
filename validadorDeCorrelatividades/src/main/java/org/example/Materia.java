package org.example;

import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(Set<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public Boolean cumpleCondicionCorrelatividades(Alumno alumno) {
        return this.correlativas.stream().allMatch(materia -> alumno.aprobo(materia));
    }
}