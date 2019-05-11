// autorzy Adrian Witkowski
//         Filip Bianga
// data wykonania 8.05.2019
// cel: zad4

public class Rectangle extends Shape
{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle()
    {}

    public Rectangle( double width, double length )
    {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle( double width, double length, String color, boolean filled )
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public void setWidth( double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return this.length;
    }

    public void setLength( double length )
    {
        this.length = length;
    }

    public double getArea()
    {
        return width*length;
    }

    public double getPerimeter()
    {
        return this.width*2+this.length*2;
    }

    public String toString()
    {
        return "Jestem prostokatem!";
    }


}
