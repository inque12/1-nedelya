public class Rectangle {


    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public boolean isSquare() {
        return width == height;
    }

    public static void main(String[] args) {

        Rectangle r = new Rectangle(4, 5);
        System.out.println(r.getPerimeter()); /* 18 */
        System.out.println(r.getArea()); /* 20 */
        System.out.println(r.getDiagonal()); /* 6.4 ... */
        System.out.println(r.isSquare()); /* false */

    }
}