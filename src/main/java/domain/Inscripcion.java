package domain;

import java.util.ArrayList;

public class Inscripcion {
    private ArrayList<Materia> asignaturas = new ArrayList<>();
    private Alumno alumno;

    public Inscripcion(ArrayList<Materia> asignaturas, Alumno alumno) {
        this.asignaturas = asignaturas;
        this.alumno=alumno;
    }

    //// Constructor cuando la inscripción es a una sola materia //////
    public Inscripcion(Materia materia, Alumno alumno) {
        this.asignaturas.add(materia);
        this.alumno=alumno;
    }
    public boolean aprobada() {
        return asignaturas.stream().allMatch(asignatura->alumno.cumpleCorrelativas(asignatura));
    }
}
