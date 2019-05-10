/*Zadanie 5: Liczba Amstronga
* Wykonali:
* Filip Bianga
* Adrian Witkowski*/

import java.util.Scanner;

import static java.lang.Math.pow;

public class AmstrongNumber {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");

        int liczba = scan.nextInt();
        int suma=0, reszta, x;

        x=liczba;
        if(liczba>=100 && liczba<=999){                 //Sprawdzamy dla liczb 3 cyfrowych w kolejnych podobnych instrukcjach al liczb o jedna wiecej cyfre az do 7
            while (x>0){
                reszta = x%10;
                x = x/10;
                suma = (int) (suma + (pow(reszta, 3)));
            }
        }
        else if (liczba>=1000 && liczba<=9999)
        {
            while (x>0){
                reszta = x%10;
                x = x/10;
                suma = (int) (suma + (pow(reszta, 4)));
            }
        }
        else if (liczba>=10000 && liczba<=99999)
        {
            while (x>0){
                reszta = x%10;
                x = x/10;
                suma = (int) (suma + (pow(reszta, 5)));
            }
        }
        else if (liczba>=100000 && liczba<=999999)
        {
            while (x>0){
                reszta = x%10;
                x = x/10;
                suma = (int) (suma + (pow(reszta, 6)));
            }
        }
        else if (liczba>=1000000 && liczba<=9999999)
        {
            while (x>0){
                reszta = x%10;
                x = x/10;
                suma = (int) (suma + (pow(reszta, 7)));
            }
        }

        if(liczba==suma){
            System.out.println("Jest to liczba Amstronga!");
        }
        else{
            System.out.println("Nie jest to liczba Amstronga!");
        }
    }
}
