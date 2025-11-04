package co.edu.uniquindio.poo.segurcol.model;

import java.time.LocalDate;
import java.util.List;

public interface Auditable {
    void registrarNovedad(RegistroNovedad novedad);
    List<RegistroNovedad> obtenerNovedades(LocalDate desde, LocalDate hasta);
}

