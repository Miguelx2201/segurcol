package co.edu.uniquindio.poo.segurcol.model;

public class Vigilante extends Personal{
    private int numPuesto;
    private TipoArma tipoArma;
    private Supervisor supervisor;
    private CustodiaFija custodiaFija;

    public Vigilante(String nombre, String documento, double salarioBase, boolean turnoDia, int numPuesto, TipoArma tipoArma, Supervisor supervisor, CustodiaFija custodiaFija) {
        super(nombre, documento, salarioBase, turnoDia);
        this.numPuesto = numPuesto;
        this.tipoArma = tipoArma;
        this.supervisor = supervisor;
        this.custodiaFija = custodiaFija;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

    public TipoArma getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(TipoArma tipoArma) {
        this.tipoArma = tipoArma;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public CustodiaFija getCustodiaFija() {
        return custodiaFija;
    }

    public void setCustodiaFija(CustodiaFija custodiaFija) {
        this.custodiaFija = custodiaFija;
    }
}
