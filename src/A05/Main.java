package A05;

public class Main {
    public static void main(String[] args) {
        System.out.println("He aquí la implementación de la Interface y sus métodos:\n");
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}