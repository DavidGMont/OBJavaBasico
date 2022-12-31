package A03;

public class Bucle {
    public static void main(String[] args) {
        String[] nombres = {"Andrea", "Julieta", "Cristina", "Adrián", "Dionisio", "Alba", "Olga", "Lorenzo", "Patricio", "Zayd", "Cristos", "Augusto", "Milena", "Diomedes", "José", "Arcangel", "Kimby"};
        StringBuilder concatenado = new StringBuilder();
        for (int i = 0; i < nombres.length; i++) {
            if (i == nombres.length - 1) concatenado.append("y ").append(nombres[i]).append(".");
            if (i == nombres.length - 2) concatenado.append(nombres[i]).append(" ");
            if (i < nombres.length - 2) concatenado.append(nombres[i]).append(", ");
        }
        System.out.println("Los " + nombres.length + " asistentes al evento de esta noche son: " + concatenado);
    }
}
