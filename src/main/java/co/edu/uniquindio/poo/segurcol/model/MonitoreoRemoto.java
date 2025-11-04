package co.edu.uniquindio.poo.segurcol.model;

public class MonitoreoRemoto extends Servicio{
    private int dispositivosVigilados;
    private final double precioPorDispositivo = 7500;

    public MonitoreoRemoto(String codigo, String cliente, double tarifaMensual, EstadoServicio estado, int dispositivosVigilados) {
        super(codigo, cliente, tarifaMensual, estado);
        this.dispositivosVigilados = dispositivosVigilados;
    }

    public int getDispositivosVigilados() {
        return dispositivosVigilados;
    }

    public void setDispositivosVigilados(int dispositivosVigilados) {
        this.dispositivosVigilados = dispositivosVigilados;
    }

    @Override
    public double calcularCosto() {
        return precioPorDispositivo*dispositivosVigilados;
    }
}
