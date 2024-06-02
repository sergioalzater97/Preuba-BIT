package clases;

public class Propietario {

    private String nombre;
    private String fechaNacimiento;
    private String barrio;
    private String ciudad;
    private Direccion Direccion;

    //CONSTRUCTOR
    public Propietario(String nombre, String fechaNacimiento, String barrio, String ciudad, Direccion Direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.Direccion = Direccion;
    }

    //GETTERS y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Direccion getDireccion() {
        return Direccion;
    }

    public void setDireccion(Direccion Direccion) {
        this.Direccion = Direccion;
    }
    
}
