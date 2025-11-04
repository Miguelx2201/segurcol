package co.edu.uniquindio.poo.segurcol.model;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Personal{
    private double bono;
    private List<Vigilante> vigilantesEncargados;

    public Supervisor(String nombre, String documento, double salarioBase, boolean turnoDia, double bono) {
        super(nombre, documento, salarioBase, turnoDia);
        this.bono = bono;
        this.vigilantesEncargados = new ArrayList<>();
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public List<Vigilante> getVigilantesEncargados() {
        return vigilantesEncargados;
    }

    public void setVigilantesEncargados(List<Vigilante> vigilantesEncargados) {
        this.vigilantesEncargados = vigilantesEncargados;
    }
}
