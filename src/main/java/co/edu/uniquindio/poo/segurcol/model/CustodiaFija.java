package co.edu.uniquindio.poo.segurcol.model;

import java.util.List;

public class CustodiaFija extends Servicio{
    private String puesto;
    private List<Vigilante> vigilantes;

    public CustodiaFija(String codigo, String cliente, double tarifaMensual, EstadoServicio estado, String puesto, List<Vigilante> vigilantes) {
        super(codigo, cliente, tarifaMensual, estado);
        this.puesto = puesto;
        this.vigilantes = vigilantes;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public List<Vigilante> getVigilantes() {
        return vigilantes;
    }

    public void setVigilantes(List<Vigilante> vigilantes) {
        this.vigilantes = vigilantes;
    }

    @Override
    public double calcularCosto() {
        double costo = 0;
        for(Vigilante v: vigilantes) {
            costo += v.getSalarioBase();
        }
        return costo;
    }
}
