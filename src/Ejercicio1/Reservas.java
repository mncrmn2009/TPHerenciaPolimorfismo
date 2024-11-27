package Ejercicio1;

import java.util.ArrayList;

public class Reservas {
    ArrayList<Vuelos> vuelos;

    public Reservas() {
        vuelos = new ArrayList<>();
    }

    public void agregarVuelos(Vuelos vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Vuelos vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones() {
        for (Vuelos vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion();
            }
        }

    }

    public void mostrarInformacionVuelos() {
        for (Vuelos vuelo : vuelos) {
            System.out.println(vuelo.toString());

    }
}}