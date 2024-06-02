package clases;

public class FacturaTest {
    public static void main(String[] args) {
        Factura factura = new Factura("1265", "Samsung Galaxy S24 Ultra", 2, 5999000.0);
        System.out.println(factura.getPrecioArticulo());
        System.out.println("El total de la factura es: " + factura.getTotalFatura());
    }
}
