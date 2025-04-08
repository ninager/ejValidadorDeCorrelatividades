package org.example;

import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> asignaturas;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Set<Materia> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Set<Materia> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Boolean aprobada() {
        return this.asignaturas.stream().allMatch(materia -> materia.cumpleCondicionCorrelatividades(this.alumno));
    }
}