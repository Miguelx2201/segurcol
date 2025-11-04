package co.edu.uniquindio.poo.segurcol.model;

public class MonitoreoRemoto extends Servicio{
    private int dispositivosVigilados;

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
}
