package co.edu.uniquindio.poo.segurcol.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmpresaSeguridad {
    private List<Equipo> listaEquipos;
    private List<Personal> listaPersonal;
    private List<Servicio> listaServicios;
    private List<RegistroNovedad> novedades;

    public EmpresaSeguridad() {
        listaEquipos = new ArrayList<>();
        listaPersonal = new ArrayList<>();
        listaServicios = new ArrayList<>();
        novedades = new ArrayList<>();
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

    public List<RegistroNovedad> getNovedades() {
        return novedades;
    }

    public void setNovedades(List<RegistroNovedad> novedades) {
        this.novedades = novedades;
    }

    public void asignarEquipo(Equipo equipo, Personal personal) {
        equipo.asignarPersonal(personal);
        personal.agregarEquipo(equipo);
    }
    public void retirarEquipo(Equipo equipo, Personal personal){
        personal.retirarEquipo(equipo);
        equipo.retirarPersonal();
    }

    public double calcularValorTotalEquipos() {
        double total = 0;
        for (Equipo equipo : listaEquipos) {
            total += equipo.getValor();
        }
        return total;
    }


}
