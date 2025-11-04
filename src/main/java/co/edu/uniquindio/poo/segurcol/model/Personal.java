package co.edu.uniquindio.poo.segurcol.model;

public abstract class Personal {
    private String nombre;
    private String documento;
    private double salarioBase;
    private boolean turnoDia;

    public Personal(String nombre, String documento, double salarioBase, boolean turnoDia) {
        this.nombre = nombre;
        this.documento = documento;
        this.salarioBase = salarioBase;
        this.turnoDia = turnoDia;
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
    public abstract double calcularSalarioTotal();
}
