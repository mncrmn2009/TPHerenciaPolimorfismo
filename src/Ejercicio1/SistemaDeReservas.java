package Ejercicio1;
import java.util.ArrayList;
public class SistemaDeReservas {
    public static void main(String[] args) {
        ArrayList<Vuelos> vuelos = new ArrayList<>();


        // Crear algunos vuelos
        VueloRegular vueloRegular1 = new VueloRegular(123, "Madrid", "Barcelona", "2024-12-01", 150, 120.0);
        VueloRegular vueloRegular2 = new VueloRegular(124, "Madrid", "Valencia", "2024-12-05", 100, 110.0);
        VuelosCharter vueloCharter1 = new VuelosCharter(125, "Madrid", "Islas Canarias", "2024-12-10", 5000);
        VuelosCharter vueloCharter2 = new VuelosCharter(126, "Barcelona", "Tenerife", "2024-12-15", 4500);

        // Agregar vuelos al sistema
        vuelos.add(vueloRegular1);
        vuelos.add(vueloRegular2);
        vuelos.add(vueloCharter1);
        vuelos.add(vueloCharter2);

        // Mostrar la información de todos los vuelos
        System.out.println("Información de los vuelos:");
        for (Vuelos vuelo : vuelos) {
            System.out.println(vuelo.toString());
        }

        // Calcular el precio total de las reservas antes de aplicar las promociones
        double precioTotalAntes = 0;
        for (Vuelos vuelo : vuelos) {
            precioTotalAntes += vuelo.calcularPrecio();
        }
        System.out.println("\nPrecio total antes de aplicar promociones: " + precioTotalAntes);

        // Aplicar las promociones a los vuelos
        for (Vuelos vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }

        // Mostrar la información de los vuelos después de aplicar las promociones
        System.out.println("\nInformación de los vuelos después de aplicar promociones:");
        for (Vuelos vuelo : vuelos) {
            System.out.println(vuelo.toString());
        }

        // Calcular el precio total de las reservas después de aplicar las promociones
        double precioTotalDespues = 0;
        for (Vuelos vuelo : vuelos) {
            precioTotalDespues += vuelo.calcularPrecio();
        }
        System.out.println("\nPrecio total después de aplicar promociones: " + precioTotalDespues);
    }}
