import java.util.Arrays;

public class Poinds2D {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] Array = new float[2];

    public Poinds2D() {
    }

    public Poinds2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        Array[0] = this.x;
        Array[1] = this.y;
        return Array;
    }

    public void setXY(float x,float y) {
        this.Array[0] = x;
        this.Array[1] = y;
    }

    @Override
    public String toString() {
        return "Poinds2D{" +
                "x=" + x +
                ", y=" + y +
                ", Array=" + Arrays.toString(Array) +
                '}';
    }
}
