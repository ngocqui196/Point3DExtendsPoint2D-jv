import java.util.Arrays;

public class Point3D extends Poinds2D{
    private float z = 0.0f;
    private float[] Array;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return Array;
    }

    public void setXYZ(float x,float y,float z) {
        this.Array[0] = x;
        this.Array[1] = y;
        this.Array[2] = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", Array=" + Arrays.toString(Array) +
                '}';
    }
}
