// autorzy Adrian Witkowski
//         Filip Bianga
// data wykonania 8.05.2019
// cel: zad4

public class Square extends Rectangle
{
    public Square()
    {}

    public Square( double side )
    {
        super( side, side );
    }

    public Square( double side, String color, boolean filled )
    {
        super( side, side, color, filled );
    }

    public double getSide()
    {
        return getWidth();
    }
    public void setSide( double side )
    {
        setWidth(side);
    }

    @Override
    public void setWidth(double side )
    {
        setWidth(side);
    }

    @Override
    public void setLength(double side )
    {
        setLength(side);
    }

    public String toString()
    {
        return "Jestem kwadratem!";
    }

}
