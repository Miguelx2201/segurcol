package co.edu.uniquindio.poo.segurcol.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Optional<Personal> buscarPersonal(String id){
        return listaPersonal.stream().filter(p -> p.getDocumento().equals(id)).findFirst();
    }
    public void agregarPersonal(Personal personal) throws Exception {
        Optional<Personal> encontrado = buscarPersonal(personal.getDocumento());
        if(encontrado.isEmpty()) {
            listaPersonal.add(personal);
        } else {
            throw new Exception("El personal ya se encuentra registrado");
        }
    }
    public void eliminarPersonal(String documento) throws Exception {
        Optional<Personal> encontrado = buscarPersonal(documento);
        if(encontrado.isPresent()){
            listaPersonal.remove(encontrado.get());
        } else {
            throw new Exception("El personal no se encuentra registrado");
        }
    }
    public void asignarPersonalServicio(List<Personal> listaPersonal, Servicio servicio){
        for(Personal p: listaPersonal) {
            if(p == null) continue;
            servicio.getListaPersonalAsignado().add(p);
            p.setServicioAsignado(servicio);
        }
    }
    public String generarInformeDotacionPersonal(Personal personal) {
        StringBuilder resultado = new StringBuilder();
        for(Personal p: listaPersonal) {
            resultado.append("Equipo de ").append(p.getNombre()).append("\n");
            resultado.append(p.getListaEquipo()).append("\n");
            resultado.append("Valor total: ").append(String.valueOf(p.calcularValorEquipoAsignado())).append("\n");
        }
        return resultado.toString();
    }
    public double calcularTotalEmpresaNominaEquipo(){
        double total = 0;
        for(Equipo e:  listaEquipos){
            total += e.getValor();
        }
        for(Personal p: listaPersonal){
            total+=p.calcularSalarioTotal();
        }
    }
}
