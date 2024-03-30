package org.example;

import domain.Alumno;
import domain.Inscripcion;
import domain.Materia;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Materia pdep = new Materia();
        Materia ads = new Materia();
        Materia dds = new Materia();
        ArrayList<Materia> correlativasDeDDS = new ArrayList<>();
        correlativasDeDDS.add(pdep);
        correlativasDeDDS.add(ads);
        dds.setCorrelativas(correlativasDeDDS);

        ArrayList<Materia> aprobadasDeGus = new ArrayList<>(correlativasDeDDS);

        /*
        ArrayList<Materia> materiasAanotar = new ArrayList<>();
        materiasAanotar.add(dds);
        Inscripcion inscripcion = new Inscripcion(materiasAanotar, gus);
        */

        Alumno gus = new Alumno(aprobadasDeGus);
        Inscripcion inscripcion = new Inscripcion(dds, gus);
        System.out.println(inscripcion.aprobada());

    }
}