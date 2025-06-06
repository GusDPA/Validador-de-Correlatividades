package domain;

import java.util.ArrayList;

public class Materia {
    private ArrayList<Materia> correlativas = new ArrayList<>();
    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }
    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}
