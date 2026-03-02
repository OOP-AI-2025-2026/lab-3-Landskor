package task1;
public class Main {
    public static void main(String[] args) {
        try {
            Box box = new Box(5.0, 3.0, 2.0);

            System.out.println("Параметри коробки:");
            System.out.println("Довжина: " + box.getLength());
            System.out.println("Ширина: " + box.getWidth());
            System.out.println("Висота: " + box.getHeight());
            System.out.println();

            System.out.println("Площа поверхні: " + box.getSurfaceArea());
            System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea());
            System.out.println("Об'єм: " + box.getVolume());

        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}