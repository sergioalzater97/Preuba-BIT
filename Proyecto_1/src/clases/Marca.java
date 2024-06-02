package clases;

public class Marca {
    private String nombre;
    private int nrDeModelos;
    private int añoLanzamiento;
    private int códigoIdentificador;

    //CONSTRUCTOR
    public Marca(String nombre, int nrDeModelos, int añoLanzamiento, int códigoIdentificador) {
        this.nombre = nombre;
        this.nrDeModelos = nrDeModelos;
        this.añoLanzamiento = añoLanzamiento;
        this.códigoIdentificador = códigoIdentificador;
    }

    //GETTERS y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrDeModelos() {
        return nrDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.nrDeModelos = nrDeModelos;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public int getCódigoIdentificador() {
        return códigoIdentificador;
    }

    public void setCódigoIdentificador(int códigoIdentificador) {
        this.códigoIdentificador = códigoIdentificador;
    }
    
    
}
