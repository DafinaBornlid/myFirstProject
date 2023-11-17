package Inlamningsuppgift;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Counter counter = new Counter();
        //Skapar en ny insats av Counter-klassen så att jag kan använda mig av objekt från den i main klassen.

        System.out.println("Om du önskar avsluta, vänligen skriv in ordet 'stop' på en seperat rad!");
        System.out.println("Skriv in din text med valfritt antal tecken och rader:");

        counter.input(scan);
        //hämtar inmatningn från input metoden i counter-klassen tills användaren skriver stop.

        System.out.println("Totalt antal inmatade tecken:" + counter.getTotalCharacters());
        System.out.println("Totalt antal inmatade rader: " + counter.getTotalLines());
        System.out.println("Totalt antal inmatade ord: " + counter.getArrayLength());
        System.out.println("Längsta inmatade ordet är: " + counter.getLongestWord());

    }
}
