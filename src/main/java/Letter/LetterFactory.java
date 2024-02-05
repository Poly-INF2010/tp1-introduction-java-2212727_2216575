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
        BaseShape leftRectangle = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape rightRectangle = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape middleRectangle = new Rectangle(stripeThickness, halfStripeThickness);

        //creating points for the three rectangle
        Point2d leftRectanglePoint = new Point2d(-14.0, 0.0);
        Point2d rightRectanglePoint = new Point2d(14.0, 0.0);
        Point2d middleRectanglePoint = new Point2d(0.0, 0.0);
        //rotating and translating the left and right rectangle to make the outside of the A
        for (Point2d pointDD : leftRectangle.getCoords()) {
            pointDD.rotate(Math.toRadians(9)).translate(leftRectanglePoint);
        }
        for (Point2d pointDD : rightRectangle.getCoords()) {
            pointDD.rotate(-Math.toRadians(9)).translate(rightRectanglePoint);
        }
        //putting the rectangle in the middle of the shape to create the final shape A
        for (Point2d pointDD : middleRectangle.getCoords()) {
            pointDD.translate(middleRectanglePoint);
        }
        //adding everything together
        return rightRectangle.add(leftRectangle).add(middleRectangle);
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape topCircle = new Circle(halfMaxHeight).remove(new Circle(maxWidth-5.0));
        BaseShape bottomCircle = new Circle(halfMaxHeight).remove(new Circle(maxWidth-5.0));
        BaseShape rectangle = new Rectangle(stripeThickness, maxHeight);
        //creating points for the two circles
        Point2d topCirclePoint = new Point2d(28.0, -38.0);
        Point2d bottomCirclePoint = new Point2d(28.0, 38.0);
        //placing the two circles
        topCircle.translate(topCircle.getCoords(), topCirclePoint);
        bottomCircle.translate(bottomCircle.getCoords(), bottomCirclePoint);

        //adding everything together
        return rectangle.add(topCircle).add(bottomCircle);
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipse1 = new Ellipse(maxWidth, maxHeight);
        Rectangle rectangle = new Rectangle(stripeThickness, halfMaxHeight+10.0);
        Ellipse ellipse2 = new Ellipse(halfMaxWidth+10.0, halfMaxHeight+40.0);

        //creating points for the rectangle and ellipse
        Point2d translationRectangle = new Point2d(22.0, 0.0);
        Point2d translationCircle = new Point2d(0.0, 0.0);

        //placing the rectangle and ellipse
        for (Point2d point : rectangle.getCoords()) {
            point.translate(translationRectangle);
        }

        for (Point2d point : ellipse2.getCoords()) {
            point.translate(translationCircle);
        }

        //adding everything together
        return ellipse1.remove(rectangle).remove(ellipse2);
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape verticalRectangle = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape horizontalTopRectangle = new Rectangle(maxWidth, halfStripeThickness);
        BaseShape horizontalMiddleRectangle = new Rectangle(maxWidth, halfStripeThickness);
        BaseShape horizontalBottomRectangle = new Rectangle(maxWidth, halfStripeThickness);

        //creating point to place the three rectangles: top, middle and bottom
        Point2d topRectanglePoint = new Point2d(27.0, -70.0);
        Point2d middleRectanglePoint = new Point2d(27.0, 0.0);
        Point2d bottomRectanglePoint = new Point2d(27.0, 71.0);

        //placing the three rectangles on the points
        horizontalTopRectangle.translate(horizontalTopRectangle.getCoords(), topRectanglePoint);
        horizontalMiddleRectangle.translate(horizontalMiddleRectangle.getCoords(), middleRectanglePoint);
        horizontalBottomRectangle.translate(horizontalBottomRectangle.getCoords(), bottomRectanglePoint);

        //adding everything together
        return ((verticalRectangle.add(horizontalTopRectangle)).add(horizontalMiddleRectangle)).add(horizontalBottomRectangle);
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape rectangleLeft = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape rectangleRight = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape rectangleMiddle = new Rectangle(stripeThickness+halfStripeThickness, halfStripeThickness);

        //creating points for the two rectangles
        Point2d translationRectangleLeft = new Point2d(-25.0, 0.0);
        Point2d translationRectangleRight = new Point2d(25.0, 0.0);
        //Placing the left and right rectangles horizontally
        for (Point2d point : rectangleLeft.getCoords()) {
            point.translate(translationRectangleLeft);
        }
        for (Point2d point : rectangleRight.getCoords()) {
            point.translate(translationRectangleRight);
        }

        //adding everything together
        return rectangleLeft.add(rectangleRight).add(rectangleMiddle);
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape rectangleLeft = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape rectangleRight = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape rectangleMiddle = new Rectangle(halfStripeThickness, maxHeight);

        //creating point for the two rectangles
        Point2d translationRectangleLeft = new Point2d(-27.0, 0.0);
        Point2d translationRectangleRight = new Point2d(27.0, 0.0);
        //Placing the left and right rectangles horizontally
        for (Point2d point : rectangleLeft.getCoords()) {
            point.translate(translationRectangleLeft);
        }
        for (Point2d point : rectangleRight.getCoords()) {
            point.translate(translationRectangleRight);
        }
        //Placing the middle rectangles diagonally to finish the N shape
        for (Point2d pointDD : rectangleMiddle.getCoords()) {
            pointDD.rotate(Math.toRadians(-20));
        }
        //adding everything together
        return rectangleLeft.add(rectangleRight).add(rectangleMiddle);
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        //creating an ellipse and removing a smaller ellipse inside
        return new Ellipse(maxWidth, maxHeight).remove(new Ellipse(halfMaxWidth+15.0, maxHeight-30.0));
    }
}
