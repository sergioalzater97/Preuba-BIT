package clases;

public class Direccion {

    private String calle;
    private String carrera;
    private int numCasa;

    //CONSTRUCTOR
    public Direccion(String calle, String carrera, int numCasa) {
        this.calle = calle;
        this.carrera = carrera;
        this.numCasa = numCasa;
    }

    //GETTERS y SETTERS
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }
}
