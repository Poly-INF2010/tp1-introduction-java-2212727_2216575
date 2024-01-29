package Shape;

import Point.Point2d;

import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        Collection<Point2d> ellipseCoords = new ArrayList<>();
        for (int i = 0; i <= widthDiameter; i++) {
            for (int j = 0; j <= heightDiameter; j++) {
                ellipseCoords.add(new Point2d(widthDiameter,heightDiameter));
            }
        }
        BaseShape updatedShape = addAll(ellipseCoords);
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(cloneCoords());
    }
}
