package co.edu.uniquindio.poo.segurcol.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Personal {
    private String nombre;
    private String documento;
    private double salarioBase;
    private boolean turnoDia;
    private List<Equipo> listaEquipo;

    public Personal(String nombre, String documento, double salarioBase, boolean turnoDia) {
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
        this.turnoDia = turnoDia;
        this.listaEquipo = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public boolean isTurnoDia() {
        return turnoDia;
    }

    public void setTurnoDia(boolean turnoDia) {
        this.turnoDia = turnoDia;
    }

    public List<Equipo> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(List<Equipo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public void agregarEquipo(Equipo equipo) {
        listaEquipo.add(equipo);
    }

    public abstract double calcularSalarioTotal();

    public void retirarEquipo(Equipo equipo) {
        try {
            listaEquipo.remove(equipo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
