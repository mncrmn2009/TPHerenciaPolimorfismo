package Ejercicio1;

public class VueloRegular extends Vuelos implements Promocionable{
   private int numeroAsientos;
   private double precioBasePorAsiento;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioBasePorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getPrecioBasePorAsiento() {
        return precioBasePorAsiento;
    }

    public void setPrecioBasePorAsiento(double precioBasePorAsiento) {
        this.precioBasePorAsiento = precioBasePorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioBasePorAsiento;
    }

    @Override
    public void aplicarPromocion() {
        double descuento = 0.10; // 10% de descuento
        precioBasePorAsiento -= precioBasePorAsiento * descuento;
    }
}
