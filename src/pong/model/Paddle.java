package pong.model;

/**
 * A Paddle for the Pong game
 *
 * A model class
 *
 */
public class Paddle {

    public enum Direction {
        STOP,
        UP,
        DOWN;
    }

    private final double width;
    private final double height;
    private double x;          // Upper left corner in enclosing square
    private double y;
    private double dy;         // Speed

    public Paddle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // TODO methods


    // Utilities
    public double getMinX() {
        return x;
    }

    public double getMaxX() {
        return x + width;
    }

    public double getMinY() {
        return y;
    }

    public double getMaxY() {
        return y + height;
    }

}
