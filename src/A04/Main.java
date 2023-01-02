package A04;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung", "Galaxy S22 Ultra", "Android 13", 163.3, 77.9, 8.9, 228, 5000, "Qualcomm SM8450 Snapdragon 8 Gen 1 (4 nm) - ROW", 256, true, "Burgundy", 926.0, "5G", 3088, 1440, 5);

        SmartWatch smartWatch = new SmartWatch("Samsung", "Galaxy Watch5", "Android Wear OS 3.5", 44.4, 43.3, 9.8, 34, 410, "Exynos W920", 16, true, "Silver", 225, 44, true, true, true);

        System.out.println("\n" + smartPhone);
        System.out.println("\n" + smartWatch);
    }
}
