package task1;
public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Довжина має бути більше нуля");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина має бути більше нуля");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Висота має бути більше нуля");
        }
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}