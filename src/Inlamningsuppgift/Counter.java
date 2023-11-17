package Inlamningsuppgift;

import java.util.Scanner;


public class Counter
{
    private int totalCharacters = 0;
    private int totalLines = 0;
    private String[] wordsArray;
    // Attribut - Skapar variablar för att räkna characters och lines.
    String stringInput = "";
    // Deklarerar en tom string utanför while-loopen

    public Counter() {}
    //Konstruktor, tom i detta fall.

    public void count(String input) // Metod för att räkna tecken och rader.
    {
        if (!input.equalsIgnoreCase("stop"))
        {
            totalCharacters += input.length();
            totalLines++;
        }
    }

    public int getTotalCharacters()
    {
        return totalCharacters;
    }

    public int getTotalLines()
    {
        return totalLines;

    }


    public void input(Scanner scan) //Metod för att hantera användarinmatningen.
    {
        while (true)
        {

            String input = scan.nextLine(); //Läser in användarens inmatning

            if (!input.equals("stop"))
            {
                stringInput = stringInput + " " + input;
                // om användaren inte skriver stop läggs inputen till i "stringInput"

            } else
            {
                setWordsArray(stringInput.trim());
                //Vid stop trimmas inmatningen och anväänder setWordsArray för att bearbeta inatningen

                break;
            }

            count(input); //Anropar countmetoden för att räkna tecken och rader

        }
    }

    public void setWordsArray(String input) // Metod för att behandla arrayet
    {
        wordsArray = input.split(" ");
    }
    public int getArrayLength()
    {
        return wordsArray.length;
    }

    public String getLongestWord() {
        String longestWord = "";
        for (String word : wordsArray) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    // går igenom inmatningen och hittar längsta ordet.
}

