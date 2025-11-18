package app;

import entities.Vuelo;
import utils.FiltroVuelos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Constantes de fecha (pueden ser null)
    private static final LocalDate fechaInicio = LocalDate.of(2020, 5, 16);
    private static final LocalDate fechaFin = LocalDate.of(2021, 5, 16);

    public static void main(String[] args) {

        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "Buenos Aires",
                LocalDate.of(2022, 5, 10), LocalDate.of(2022, 5, 11)));

        vuelos.add(new Vuelo(2, "H002-V", "Turkish", "Barcelona", "Estambul",
                LocalDate.of(2023, 5, 15), LocalDate.of(2023, 5, 16)));

        vuelos.add(new Vuelo(3, "H003-V", "KLM", "Amsterdam", "New York",
                LocalDate.of(2024, 5, 20), LocalDate.of(2024, 5, 21)));

        vuelos.add(new Vuelo(4, "H004-V", "Delta", "New York", "Madrid",
                LocalDate.of(2025, 1, 12), LocalDate.of(2025, 1, 13)));

        vuelos.add(new Vuelo(5, "H005-V", "Iberia", "Madrid", "Roma",
                LocalDate.of(2025, 2, 1), LocalDate.of(2025, 2, 1)));

        vuelos.add(new Vuelo(6, "H006-V", "LATAM", "Buenos Aires", "Santiago",
                LocalDate.of(2025, 3, 28), LocalDate.of(2025, 3, 28)));

        vuelos.add(new Vuelo(7, "H007-V", "Qatar Airways", "Doha", "Madrid",
                LocalDate.of(2025, 4, 30), LocalDate.of(2025, 4, 10)));

        vuelos.add(new Vuelo(8, "H008-V", "American Airlines", "Miami", "Chicago",
                LocalDate.of(2025, 5, 16), LocalDate.of(2025, 5, 16)));

        vuelos.add(new Vuelo(9, "H009-V", "Iberia", "Madrid", "Lisboa",
                LocalDate.of(2025, 6, 25), LocalDate.of(2025, 6, 25)));

        vuelos.add(new Vuelo(10, "H010-V", "Ryanair", "Dublín", "Madrid",
                LocalDate.of(2025, 8, 5), LocalDate.of(2025, 8, 5)));

        // Aplicar filtro
        List<Vuelo> vuelosFiltrados = FiltroVuelos.filtrarVuelos(vuelos, fechaInicio, fechaFin);

        // Mostrar resultados por consola
        System.out.println("======= VUELOS FILTRADOS =======");
        vuelosFiltrados.forEach(System.out::println);
    }
}

