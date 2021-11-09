// Rectangle.java

import java.text.DecimalFormat;

public class Rectangle extends Quadrilateral {
    private double width;
    private double height;

    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3,
                     double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        width = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2)
                + Math.pow((getP2().getY() - getP1().getY()), 2));
        height = Math.sqrt(Math.pow((getP4().getX() - getP1().getX()), 2)
                + Math.pow((getP4().getY() - getP1().getY()), 2));
    }


    public double area() {

        return width*height;
    }
    @Override
    public String toString() {
        // DecimalFormat class is used to format the output
        DecimalFormat df = new DecimalFormat(".0");

        return "\nCoordinates of Rectangle are:\n" + super.toString()
                + "\nWidth is :" + df.format(width) + "\nHeight is :" + df.format(height)
                + "\nArea is :" + df.format(area());
    }


}