// autorzy Adrian Witkowski
//         Filip Bianga
// data wykonania 8.05.2019
// cel: zad2

public class Point3D extends Point2D
{
    private float z = 0.0f;

    public Point3D( float x, float y, float z)
    {
        super(x,y);
        this.z = z;
    }

    public Point3D()
    {
        super();
    }

    public float getZ()
    {
        return this.z;
    }

    public void setZ( float z )
    {
        this.z = z;
    }

    public void setXYZ( float x, float y, float z)
    {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ()
    {
        return new float[]{getX(),getY(),this.z};
    }

    public String toString()
    {
        return "(" + getX() + "," + getY() + "," + this.z + ')';
    }
}
