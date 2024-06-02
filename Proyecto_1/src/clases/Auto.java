package clases;

public class Auto {

    private String modelo;
    private String color;
    private int año;
    private Marca Marca;
    private String chasis;
    private Propietario Propietario;
    private float velMax;
    private float velAct;
    private int numPuertas;
    private boolean techoSolar;
    private int numMarchas;
    private boolean transAuto; //transmisión automática

    //CONSTRUCTOR
    public Auto(String modelo, String color, int año, Marca Marca, String chasis, Propietario Propietario, float velMax, int numPuertas, boolean techoSolar, int numMarchas, boolean transAuto) {
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.Marca = Marca;
        this.chasis = chasis;
        this.Propietario = Propietario;
        this.velMax = velMax;
        this.numPuertas = numPuertas;
        this.techoSolar = techoSolar;
        this.numMarchas = numMarchas;
        this.transAuto = transAuto;
    }
    

    //METODOS
    public void aumentoVelocidad() {

        if (this.velAct < this.velMax) {
            this.velAct++;
        } else {
            this.velAct = this.velMax;
        }
    }

    public void detieneAutomovil() {

        this.velAct = 0;
    }

    public void cambioMarcha(int marcha) {

        if (marcha < this.numMarchas) {
            marcha++;
        } else {
            marcha = this.numMarchas;
        }
        System.out.println("La marcha actual es: " + marcha);
    }

    public void reduceMarcha(int marcha) {

        if (this.velAct != 0 && marcha <= this.numMarchas) {
            marcha--;
        }
    }
    
    public void autonomiaViaje (float consumoMedio) {
        
    }
    
    public void volumenCombustible() {
        
    }

    //GETTERS y SETTERS
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Marca getMarca() {
        return Marca;
    }

    public void setMarca(Marca Marca) {
        this.Marca = Marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Propietario getPropietario() {
        return Propietario;
    }

    public void setPropietario(Propietario Propietario) {
        this.Propietario = Propietario;
    }

    public float getVelMax() {
        return velMax;
    }

    public void setVelMax(float velMax) {
        this.velMax = velMax;
    }

    public float getVelAct() {
        return velAct;
    }

    public void setVelAct(float velAct) {
        this.velAct = velAct;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public boolean isTransAuto() {
        return transAuto;
    }

    public void setTransAuto(boolean transAuto) {
        this.transAuto = transAuto;
    }
}
