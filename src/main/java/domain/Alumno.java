package domain;

import java.util.ArrayList;

public class Alumno {
    private ArrayList<Materia> materiasAprobadas;

    public Alumno(ArrayList<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Boolean cumpleCorrelativas(Materia materia){
        return materiasAprobadas.containsAll(materia.getCorrelativas());
    }
}
