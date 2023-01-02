package A04;

public abstract class SmartDevice {
    // Atributos
    private String marca;
    private String modelo;
    private String sistemaOperativo;
    private double alto;
    private double ancho;
    private double profundidad;
    private int pesoGramos;
    private int bateria;
    private String procesador;
    private int memoria;
    private boolean altavoz;
    private String color;
    private double precio;

    // Constructores
    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
    }

    public SmartDevice(String marca, String modelo, String sistemaOperativo, double alto, double ancho, double profundidad, int pesoGramos) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.pesoGramos = pesoGramos;
    }

    public SmartDevice(String marca, String modelo, String sistemaOperativo, double alto, double ancho, double profundidad, int pesoGramos, int bateria, String procesador, int memoria, boolean altavoz) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.pesoGramos = pesoGramos;
        this.bateria = bateria;
        this.procesador = procesador;
        this.memoria = memoria;
        this.altavoz = altavoz;
    }

    public SmartDevice(String marca, String modelo, String sistemaOperativo, double alto, double ancho, double profundidad, int pesoGramos, int bateria, String procesador, int memoria, boolean altavoz, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.pesoGramos = pesoGramos;
        this.bateria = bateria;
        this.procesador = procesador;
        this.memoria = memoria;
        this.altavoz = altavoz;
        this.color = color;
        this.precio = precio;
    }

    // Setters y Getters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public int getPesoGramos() {
        return pesoGramos;
    }

    public void setPesoGramos(int pesoGramos) {
        this.pesoGramos = pesoGramos;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public boolean isAltavoz() {
        return altavoz;
    }

    public void setAltavoz(boolean altavoz) {
        this.altavoz = altavoz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                ", pesoGramos=" + pesoGramos +
                ", bateria=" + bateria +
                ", procesador='" + procesador + '\'' +
                ", memoria=" + memoria +
                ", altavoz=" + altavoz +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}