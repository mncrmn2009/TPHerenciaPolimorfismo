package Ejercicio1;

public class VuelosCharter extends Vuelos implements Promocionable{
    private int precioTotal;

    public VuelosCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio(){
        return precioTotal;
    }
    @Override
    public void aplicarPromocion() {
        double descuento = 0.15; // 15% de descuento
        precioTotal -= precioTotal * descuento;
    }
}
