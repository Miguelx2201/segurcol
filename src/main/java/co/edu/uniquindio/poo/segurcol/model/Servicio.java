package co.edu.uniquindio.poo.segurcol.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Servicio {
    private String codigo;
    private String cliente;
    private double tarifaMensual;
    private EstadoServicio estado;
    private List<Personal> listaPersonalAsignado;

    public Servicio(String codigo, String cliente, double tarifaMensual, EstadoServicio estado) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.tarifaMensual = tarifaMensual;
        this.estado = estado;
        this.listaPersonalAsignado = new ArrayList<>();
    }

    public List<Personal> getListaPersonalAsignado() {
        return listaPersonalAsignado;
    }

    public void setListaPersonalAsignado(List<Personal> listaPersonalAsignado) {
        this.listaPersonalAsignado = listaPersonalAsignado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTarifaMensual() {
        return tarifaMensual;
    }

    public void setTarifaMensual(double tarifaMensual) {
        this.tarifaMensual = tarifaMensual;
    }

    public EstadoServicio getEstado() {
        return estado;
    }

    public void setEstado(EstadoServicio estado) {
        this.estado = estado;
    }
    public abstract double calcularCosto();
}
