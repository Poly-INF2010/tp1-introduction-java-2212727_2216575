package Point;

public class Point2d extends AbstractPoint {
    private final Integer X = 0;
    private final Integer Y = 1;

    /** TODO
     * 2D Point Constructor from coordinates
     * @param x X coordinate
     * @param y Y coordinate
     */

    public Point2d(Double x, Double y) {
        //super(new double[] {0.0, 0.0});
        super(new double[]{x, y});
    }

    /** TODO
     * 2D Point Constructor from vector
     * @param vector Vector containing X and Y coordinates
     */

    public Point2d(Double[] vector) {
        this(vector[0], vector[1]);
    }

    /**
     * @return X coordinate
     */
    public double X() {
        return vector[X];
    }

    /**
     * @return Y coordinate
     */
    public double Y() {
        return vector[Y];
    }

    /** TODO
     * Translate the point by the given vector
     * @param translateVector The vector by which to translate
     * @return Translated point
     */
    @Override
    public Point2d translate(Double[] translateVector) {
        vector[X] += translateVector[X];
        vector[Y] += translateVector[Y];
        return this;
    }

    /** TODO
     * Translate the point by the given 2D Point
     * @param translateVector The 2D Point by which to translate
     * @return Translated point
     */
    public Point2d translate(Point2d translateVector) {
        vector[X] += translateVector.X();
        vector[Y] += translateVector.Y();
        return this;
    }

    /** TODO
     * Rotate the point by the given rotation Matrix
     * @param rotationMatrix Matrix by which to rotate
     * @return Rotated point
     */
    @Override
    public Point2d rotate(Double[][] rotationMatrix) {
        Double[] temp = new Double[2];
        for (int i = 0; i < 2; i++)
            temp[i] = 0.0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                temp[i] += rotationMatrix[i][j] * vector[j];
        }

        for (int i = 0; i < 2; i++)
            vector[i] = temp[i];

        return this;
    }

    /** TODO
     * Rotate the point by the given angle
     * @param angle Angle in radians
     * @return Rotated point
     */
    public Point2d rotate(Double angle) {
        double cosTheta = Math.cos(angle);
        double sinTheta = Math.sin(angle);

        vector[X] = vector[X] * cosTheta - vector[Y] * sinTheta;
        vector[Y] = vector[X] * sinTheta + vector[Y] * cosTheta;

        return this;
    }

    /** TODO
     * Divide the X and Y coordinates of a 2D point by a scalar
     * @param divider Scalar used to divide
     * @return Divided point
     */
    @Override
    public Point2d divide(Double divider) {
        vector[X] /= divider;
        vector[Y] /= divider;
        return this;
    }

    /** TODO
     * Multiply the X and Y coordinates of a 2D point by a scalar
     * @param multiplier Scalar used to multiply
     * @return Multiplied point
     */
    @Override
    public Point2d multiply(Double multiplier) {
        vector[X] *= multiplier;
        vector[Y] *= multiplier;
        return this;
    }

    /** TODO
     * Add a scalar to the X and Y coordinates of a 2D point
     * @param adder Scalar to add
     * @return Added point
     */
    @Override
    public Point2d add(Double adder) {
        vector[X] += adder;
        vector[Y] += adder;
        return this;
    }

    /** TODO
     * @return Deep copy of the 2D point
     */
    @Override
    public Point2d clone() {
        //vector[X] = this.clone().X();
        //vector[Y] = this.clone().Y();
        //return this;
        return new Point2d(this.X(), this.Y());
    }
}
