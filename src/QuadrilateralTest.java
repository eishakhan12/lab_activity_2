

public class QuadrilateralTest {
    public static void main(String[] args) {
// NOTE: All coordinates are assumed to form the proper shapes
// A quadrilateral is a four-sided polygon
        Quadrilateral quadrilateral =
                new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);

// A parallelogram is a quadrilateral with opposite sides parallel
        Parallelogram parallelogram =
                new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);

// A rectangle is an equiangular parallelogram
        Rectangle rectangle =
                new Rectangle(17.0, 14.0, 30.0, 14.0, 30.0, 28.0, 17.0, 28.0);

// A square is an equiangular and equilateral parallelogram
        Square square =
                new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);

        System.out.printf(
                "%s %s %s %s\n", quadrilateral, parallelogram,
                rectangle, square);
    }
}