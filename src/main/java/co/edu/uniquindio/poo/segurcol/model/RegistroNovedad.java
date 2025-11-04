package co.edu.uniquindio.poo.segurcol.model;

import java.time.LocalDate;

public record RegistroNovedad (LocalDate fecha, String descripcion, TipoNovedad tipoNovedad){
}
