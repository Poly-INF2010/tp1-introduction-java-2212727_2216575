package Letter;

import Point.Point2d;
import Shape.*;

import java.util.ArrayList;
import java.util.Collection;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        BaseShape letterA = new Circle(20.0);
        System.out.println("Letter A Coords: " + letterA.getCoords());
        return letterA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape circle1 = new Circle(stripeThickness).remove(new Circle(halfStripeThickness));
        BaseShape circle2 = new Circle(stripeThickness).remove(new Circle(halfStripeThickness));
        BaseShape rectangle = new Rectangle(halfStripeThickness, halfMaxHeight);

        Point2d p2 = new Point2d(15.0, 71.0);
        Point2d p3 = new Point2d(15.0, 10.0);

        circle1.translate(circle1.getCoords(), p2);
        circle2.translate(circle2.getCoords(), p3);

        return ((rectangle.add(circle1)).add(circle2));
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipse1 = new Ellipse(maxWidth, maxHeight);
        Rectangle rectangle = new Rectangle(stripeThickness, halfMaxHeight+10.0);
        Ellipse ellipse2 = new Ellipse(halfMaxWidth+10.0, halfMaxHeight+40.0);

        Double[] translationRectangle = {22.0, 0.0};
        Double[] translationCircle = {0.0, 0.0};

        for (Point2d point : rectangle.getCoords()) {
            point.translate(translationRectangle);
        }

        for (Point2d point : ellipse2.getCoords()) {
            point.translate(translationCircle);
        }

        BaseShape letterC = ellipse1.remove(rectangle).remove(ellipse2);
        //BaseShape letterC = new Circle(20.0);
        System.out.println("Letter C Coords: " + letterC.getCoords());
        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new Circle(20.0);
        System.out.println("Letter E Coords: " + letterE.getCoords());
        return letterE;    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        Rectangle rectangleLeft = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangleRight = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangleMiddle = new Rectangle(stripeThickness+halfStripeThickness, halfStripeThickness);

        Double[] translationRectangleLeft = {-25.0, 0.0};
        Double[] translationRectangleRight = {25.0, 0.0};

        for (Point2d point : rectangleLeft.getCoords()) {
            point.translate(translationRectangleLeft);
        }
        for (Point2d point : rectangleRight.getCoords()) {
            point.translate(translationRectangleRight);
        }

        BaseShape letterH = rectangleLeft.add(rectangleRight).add(rectangleMiddle);
        //BaseShape letterH = new Circle(20.0);
        System.out.println("Letter H Coords: " + letterH.getCoords());
        return letterH;    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new Circle(20.0);
        System.out.println("Letter N Coords: " + letterN.getCoords());
        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new Circle(20.0);
        System.out.println("Letter O Coords: " + letterO.getCoords());
        return letterO;
    }
}
