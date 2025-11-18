package utils;

import entities.Vuelo;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroVuelos {

    public static List<Vuelo> filtrarVuelos(List<Vuelo> vuelos,
                                            LocalDate fechaInicio,
                                            LocalDate fechaFin) {

        return vuelos.stream()
                .filter(v -> {
                    LocalDate salida = v.getFechaSalida();

                    if (fechaInicio == null && fechaFin == null)
                        return true;

                    if (fechaInicio == null)
                        return !salida.isAfter(fechaFin);

                    if (fechaFin == null)
                        return !salida.isBefore(fechaInicio);

                    return !salida.isBefore(fechaInicio) && !salida.isAfter(fechaFin);
                })
                .sorted(Comparator.comparing(Vuelo::getFechaSalida))
                .collect(Collectors.toList());
    }
}
