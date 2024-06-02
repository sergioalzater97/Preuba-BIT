package clases;

public class Main {

    public static void main(String[] args) {
        Direccion direccion = new Direccion("61", "24a", 27);
        Propietario dueño = new Propietario("Sergio", "10/02/97", "LaEstrella", "Armenia", direccion);
        Marca marca = new Marca("Aston Martin", 200, 2020, 303030);
        Auto auto = new Auto("Savage", "Verde", 2020, marca, "Acero", dueño, 300, 5, false, 7, true);
    }
}