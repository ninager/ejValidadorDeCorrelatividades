package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

class InscripcionTest {

    @Test
    @DisplayName("Juan Perez logra inscribirse a la asignatura Sintaxis y Semantica de los Lenguajes")
    public void Aprobada() {

        Materia ayed = new Materia();
        ayed.setNombre("Algoritmos y Estructura de Datos");
        ayed.setCorrelativas(Set.of());

        Materia lyed = new Materia();
        lyed.setNombre("Logica y Estructuras Discretas");
        lyed.setCorrelativas(Set.of());

        Materia ssl = new Materia();
        ssl.setNombre("Sintaxis y Semantica de los Lenguajes");
        ssl.setCorrelativas(Set.of(ayed, lyed));

        Alumno alumnoPrueba = new Alumno();
        alumnoPrueba.setNombre("Juan");
        alumnoPrueba.setApellido("Perez");
        alumnoPrueba.setLegajo(110452);
        alumnoPrueba.setMateriasAprobadas(Set.of(ayed, lyed));

        Inscripcion inscripcionPrueba = new Inscripcion();
        inscripcionPrueba.setAlumno(alumnoPrueba);
        inscripcionPrueba.setAsignaturas(Set.of(ssl));

        Assertions.assertTrue(inscripcionPrueba.aprobada());
    }

    @Test
    @DisplayName("La inscripción de Juan Perez a las asignaturas DDSI y Desarrollo de Software es rechazada, aunque puede inscribirse a Desarrollo de Software solo")
    public void NoAprobada() {

        Materia ayed = new Materia();
        ayed.setNombre("Algoritmos y Estructura de Datos");
        ayed.setCorrelativas(Set.of());

        Materia lyed = new Materia();
        lyed.setNombre("Logica y Estructuras Discretas");
        lyed.setCorrelativas(Set.of());

        Materia it1 = new Materia();
        it1.setNombre("Ingles Tecnico Nivel 1");
        it1.setCorrelativas(Set.of());

        Materia sypn = new Materia();
        sypn.setNombre("Sistemas y Procesos de Negocio");
        sypn.setCorrelativas(Set.of());

        Materia adsi = new Materia();
        adsi.setNombre("Analisis de Sistemas de Informacion");
        adsi.setCorrelativas(Set.of(ayed, sypn));

        Materia ssl = new Materia();
        ssl.setNombre("Sintaxis y Semantica de los Lenguajes");
        ssl.setCorrelativas(Set.of(ayed, lyed));

        Materia pdep = new Materia();
        pdep.setNombre("Paradigmas de Programacion");
        pdep.setCorrelativas(Set.of(ayed, lyed));

        Materia ddsi = new Materia();
        ddsi.setNombre("Diseño de Sistemas de Informacion");
        ddsi.setCorrelativas(Set.of(ayed, sypn, it1, pdep, adsi));

        Materia dds = new Materia();
        dds.setNombre("Desarrollo de Software");
        dds.setCorrelativas(Set.of(ayed, lyed, pdep, adsi));

        Alumno alumnoPrueba = new Alumno();
        alumnoPrueba.setNombre("Juan");
        alumnoPrueba.setApellido("Perez");
        alumnoPrueba.setLegajo(110452);
        alumnoPrueba.setMateriasAprobadas(Set.of(ayed, lyed, sypn, pdep, adsi));

        Inscripcion inscripcionPrueba = new Inscripcion();
        inscripcionPrueba.setAlumno(alumnoPrueba);
        inscripcionPrueba.setAsignaturas(Set.of(ddsi, dds));

        Assertions.assertFalse(inscripcionPrueba.aprobada());
    }
}