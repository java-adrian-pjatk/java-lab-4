/*Zadanie 1: Person, Student and Staff
 * Wykonali:
 * Filip Bianga
 * Adrian Witkowski*/

public class TestPerson {
    public static void main (String [] args){
        Person osoba = new Person("Szymon", "ul.Paska");
        System.out.println(osoba);

        Student student = new Student("Karol", "ul.Polna", "Informatyka", 2017, 650);
        System.out.println(student);

        Staff staf = new Staff("Mateusz", "ul.Podgorna", "Politechnika Gdanska", 2100);
        System.out.println(staf);


    }
}
