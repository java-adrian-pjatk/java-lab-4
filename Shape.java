// autorzy Adrian Witkowski
//         Filip Bianga
// data wykonania 8.05.2019
// cel: zad4

public class Shape
{
    private String color = "red";
    private boolean filled = true;

    public Shape()
    {}

    public Shape( String color, boolean filled )
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor( String color )
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return this.filled;
    }

    public String toString()
    {
        return "Jestem jakims ksztaltem!";
    }




}
