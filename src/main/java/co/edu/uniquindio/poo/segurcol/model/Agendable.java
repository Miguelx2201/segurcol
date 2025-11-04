package co.edu.uniquindio.poo.segurcol.model;

import java.time.LocalDate;

public interface Agendable {
    void programar(LocalDate fecha, String descripcion);
    List<AgendaItem> obtenerAgenda(LocalDate desde, LocalDate hasta);
}
