package co.edu.uniquindio.poo.segurcol.model;

public class PatrullajeMovil extends Servicio{
    private int cantidadRutas;
    private double kmRecorridos;

    public PatrullajeMovil(String codigo, String cliente, double tarifaMensual, EstadoServicio estado, int cantidadRutas, double kmRecorridos) {
        super(codigo, cliente, tarifaMensual, estado);
        this.cantidadRutas = cantidadRutas;
        this.kmRecorridos = kmRecorridos;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getCantidadRutas() {
        return cantidadRutas;
    }

    public void setCantidadRutas(int cantidadRutas) {
        this.cantidadRutas = cantidadRutas;
    }
}
