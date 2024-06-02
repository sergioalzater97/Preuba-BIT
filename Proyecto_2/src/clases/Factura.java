package clases;

public class Factura {

    private String numero;
    private String descripcion;
    private int cantidadCompradaArticulo;
    private double precioArticulo;

    //CONSTRUCTOR
    public Factura(String numero, String descripcion, int cantidadCompradaArticulo, double precioArticulo) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidadCompradaArticulo = cantidadCompradaArticulo;
        this.precioArticulo = precioArticulo;
    }

    //METODOS
    public double getTotalFatura() {
        double total;

        if (this.cantidadCompradaArticulo < 0) {
            this.cantidadCompradaArticulo = 0;
        }

        if (this.precioArticulo < 0.0) {
            this.precioArticulo = 0.0;
        }

        total = this.cantidadCompradaArticulo * this.precioArticulo;
        return total;
    }

    //GETTERS Y SETTERS
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadCompradaArticulo() {
        return cantidadCompradaArticulo;
    }

    public void setCantidadCompradaArticulo(int cantidadCompradaArticulo) {
        this.cantidadCompradaArticulo = cantidadCompradaArticulo;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

}
