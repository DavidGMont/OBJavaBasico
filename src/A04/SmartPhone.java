package A04;

public class SmartPhone extends SmartDevice {
    // Atributos
    private String red;
    private int resolucionVertical;
    private int resolucionHorizontal;
    private int cantidadCamaras;

    // Constructor
    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String sistemaOperativo, double alto, double ancho, double profundidad, int pesoGramos, int bateria, String procesador, int memoria, boolean altavoz, String color, double precio, String red, int resolucionVertical, int resolucionHorizontal, int cantidadCamaras) {
        super(marca, modelo, sistemaOperativo, alto, ancho, profundidad, pesoGramos, bateria, procesador, memoria, altavoz, color, precio);
        this.red = red;
        this.resolucionVertical = resolucionVertical;
        this.resolucionHorizontal = resolucionHorizontal;
        this.cantidadCamaras = cantidadCamaras;
    }

    // Getters y Setters
    public String getRed() {
        return red;
    }

    public void setRed(String red) {
        this.red = red;
    }

    public int getResolucionVertical() {
        return resolucionVertical;
    }

    public void setResolucionVertical(int resolucionVertical) {
        this.resolucionVertical = resolucionVertical;
    }

    public int getResolucionHorizontal() {
        return resolucionHorizontal;
    }

    public void setResolucionHorizontal(int resolucionHorizontal) {
        this.resolucionHorizontal = resolucionHorizontal;
    }

    public int getCantidadCamaras() {
        return cantidadCamaras;
    }

    public void setCantidadCamaras(int cantidadCamaras) {
        this.cantidadCamaras = cantidadCamaras;
    }
    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + getMarca() +
                ", modelo='" + getModelo() +
                ", sistemaOperativo='" + getSistemaOperativo() +
                ", alto=" + getAlto() +
                ", ancho=" + getAncho() +
                ", profundidad=" + getProfundidad() +
                ", pesoGramos=" + getPesoGramos() +
                ", bateria=" + getBateria() +
                ", procesador='" + getProcesador() +
                ", memoria=" + getMemoria() +
                ", altavoz=" + isAltavoz() +
                ", color='" + getColor() +
                ", precio=" + getPrecio() +
                ", red='" + red +
                ", resolucionVertical=" + resolucionVertical +
                ", resolucionHorizontal=" + resolucionHorizontal +
                ", cantidadCamaras=" + cantidadCamaras +
                '}';
    }
}