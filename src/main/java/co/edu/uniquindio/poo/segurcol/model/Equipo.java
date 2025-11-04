package co.edu.uniquindio.poo.segurcol.model;

public class Equipo {
    private Personal personal;
    private String codigo;
    private double valor;
    private TipoEquipo tipo;
    private EstadoEquipo estado;

    public Equipo(Personal personal, String codigo, double valor, TipoEquipo tipo, EstadoEquipo estado) {
        this.personal = personal;
        this.codigo = codigo;
        this.valor = valor;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoEquipo getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipo tipo) {
        this.tipo = tipo;
    }

    public EstadoEquipo getEstado() {
        return estado;
    }

    public void setEstado(EstadoEquipo estado) {
        this.estado = estado;
    }

    public void asignarPersonal(Personal personal) {
        setPersonal(personal);
    }

    public void retirarPersonal() {
        setPersonal(null);
    }
}
