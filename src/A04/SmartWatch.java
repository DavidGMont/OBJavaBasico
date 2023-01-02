package A04;

public class SmartWatch extends SmartDevice {
    // Atributos
    private int anchoCorrea;
    private boolean nfc;
    private boolean lte;
    private boolean resistenciaAgua;

    // Constructor
    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String sistemaOperativo, double alto, double ancho, double profundidad, int pesoGramos, int bateria, String procesador, int memoria, boolean altavoz, String color, double precio, int anchoCorrea, boolean nfc, boolean lte, boolean resistenciaAgua) {
        super(marca, modelo, sistemaOperativo, alto, ancho, profundidad, pesoGramos, bateria, procesador, memoria, altavoz, color, precio);
        this.anchoCorrea = anchoCorrea;
        this.nfc = nfc;
        this.lte = lte;
        this.resistenciaAgua = resistenciaAgua;
    }

    // Getters y Setters
    public int getAnchoCorrea() {
        return anchoCorrea;
    }

    public void setAnchoCorrea(int anchoCorrea) {
        this.anchoCorrea = anchoCorrea;
    }

    public boolean isNfc() {
        return nfc;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    public boolean isLte() {
        return lte;
    }

    public void setLte(boolean lte) {
        this.lte = lte;
    }

    public boolean isResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(boolean resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
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
                ", anchoCorrea=" + anchoCorrea +
                ", nfc=" + nfc +
                ", lte=" + lte +
                ", resistenciaAgua=" + resistenciaAgua +
                '}';
    }
}