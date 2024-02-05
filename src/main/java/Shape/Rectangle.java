package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.BaseStream;

public class Rectangle extends BaseShape {
    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        double halfwidth = width/2;
        double halfHeight = height/2;
        //incrementation by 0.5 pixel
        for(double i = -halfwidth; i <= halfwidth;  i += 0.5){
            for(double j = -halfHeight; j <= halfHeight; j += 0.5){
                add(new Point2d(i,j));
            }
        }
    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(cloneCoords());
    }
}
