// autorzy Adrian Witkowski
//         Filip Bianga
// data wykonania 8.05.2019
// cel: zad6i7

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class DifferentWords
{
    private String tekst;

    public DifferentWords()
    {
        tekst = "default";
    }

    public void setTekst( String tekst )
    {
        this.tekst = tekst;
    }

    public void readFromFile()
    {
        try
        {
            FileReader fr = new FileReader("paper.txt");
            BufferedReader br = new BufferedReader(fr);

            String str, full = "";
            while((str = br.readLine()) != null )
            {
                full += str.toLowerCase().replace(",","").replace(".","");
                full += " ";
            }
            String[] splitFull = full.split(" ", 50);


            Wyrazik words = new Wyrazik();
            List<Wyrazik> map = new ArrayList<Wyrazik>();

            //System.out.println(map.size());
            for( int a = 0; a < splitFull.length ; a++ )
            {
                if( splitFull[a].equals("") )
                {
                    continue;
                }

                if( map.size() > 0 )
                {
                    boolean addit = true;
                    for( int b = 0; b < map.size() ; b++ )
                    {

                        if( map.get(b).isEqual(splitFull[a]) )
                        {
                            System.out.println("JESTEM");
                            //System.out.println(map.get(a).slowo + " = " + splitFull[a]);
                            map.get(b).addNum();
                            addit = false;
                            break;
                        }
                    }
                    if( addit == true )
                    {
                        words.setWord( splitFull[a], 0);
                        map.add( words );
                        System.out.println(map.get(map.size()-1).slowo);
                    }
                }
                else
                {
                    words.setWord( splitFull[0], 0);
                    map.add( words );
                }
            }

            //Collections.sort(map);

            for( int b = 0; b < map.size() ; b++ )
            {
                System.out.print(map.get(b).slowo + " ");
            }
            System.out.println( "\nRóżne wyrazy: " + map.size());

        }
        catch( IOException e )
        {
            System.out.println("File not found");
        }
    }
}
