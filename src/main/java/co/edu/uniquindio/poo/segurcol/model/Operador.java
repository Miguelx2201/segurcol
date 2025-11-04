package co.edu.uniquindio.poo.segurcol.model;

import java.util.List;

public class Operador extends Personal{
    private List<String> zonas;

    public Operador(String nombre, String documento, double salarioBase, boolean turnoDia, List<String> zonas) {
        super(nombre, documento, salarioBase, turnoDia);
        this.zonas = zonas;
    }

    public List<String> getZonas() {
        return zonas;
    }

    public void setZonas(List<String> zonas) {
        this.zonas = zonas;
    }
}
