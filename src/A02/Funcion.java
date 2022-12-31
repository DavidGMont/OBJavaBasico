package A02;

public class Funcion {
    public static void main(String[] args) {
        double valor = 1000d;
        double respuesta = aniadirIva(valor);
        System.out.println("Tu precio con IVA es $ " + respuesta);
    }

    static double aniadirIva(double valor) {
        return valor * 1.19;
    }
}
