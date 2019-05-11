// autorzy Adrian Witkowski
//         Filip Bianga
// data wykonania 8.05.2019
// cel: zad2

public class Point2D
{
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D( float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public Point2D()
    {
    }

    public float getX()
    {
        return this.x;
    }

    public void setX( float x )
    {
        this.x = x;
    }

    public float getY()
    {
        return this.y;
    }

    public void setY( float y )
    {
        this.y = y;
    }

    public void setXY( float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float[] getXY()
    {
        return new float[]{this.x,this.y};
    }

    public String toString()
    {
        return "(" + this.x + "," + this.y + ')';
    }
}
