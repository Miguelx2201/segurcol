package co.edu.uniquindio.poo.segurcol.model;

import java.util.ArrayList;

public class EmpresaSeguridad {
    private List<Equipo> listaEquipos;
    private List<Personal> listaPersonal;
    private List<Servicio> listaServicios;

    public EmpresaSeguridad() {
        listaEquipos = new ArrayList<>();
        listaPersonal = new ArrayList<>();
        listaServicios = new ArrayList<>();
    }

    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public List<Personal> getListaPersonal() {
        return listaPersonal;
    }

    public void setListaPersonal(List<Personal> listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    public List<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }
}
