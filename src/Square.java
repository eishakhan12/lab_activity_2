// Square.java

import java.text.DecimalFormat;

public class Square extends Quadrilateral {

    private double side;

    public Square(double x1, double y1, double x2, double y2, double x3, double y3,
                  double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        side = Math.sqrt(Math.pow((getP2().getX() - getP1().getX()), 2)
                + Math.pow((getP2().getY() - getP1().getY()), 2));
    }


    public double area() {

        return 4 * side;
    }

    @Override
    public String toString() {
        // DecimalFormat class is used to format the output
        DecimalFormat df = new DecimalFormat(".0");
        return "\nCoordinates of Square are:\n" + super.toString()
                + "\nSide is :" + df.format(side) + "\nArea is :" + df.format(area());
    }
}
