package Inlamningsuppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Testrunner {

    @Test
    public void testGetTotalCharacter(){
        //Arrange
        Counter myCounter = new Counter();
        int expected = 6;

        //Act
        myCounter.count ("Hejsan");
        int actual = myCounter.getTotalCharacters();

        //Assert
        assertEquals(expected,actual);
    }


    @Test
    public void testGetTotalLines(){
        //Arrange
        Counter myCounter = new Counter();
        int expected = 2;

        //Act
        myCounter.count ("Första raden");
        myCounter.count("Andra raden");
        int actual = myCounter.getTotalLines();

        //Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testGetLongestWord() {
        // Arrange
        Counter myCounter = new Counter();
        String expected = "longest";

        // Act
        myCounter.setWordsArray("Short Shorts long longest");
        String actual = myCounter.getLongestWord();

        // Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testGetArrayLengt() {
        // Arrange
        Counter myCounter = new Counter();
        int expected = 5;

        //Act
        myCounter.setWordsArray("ett två tre fyra fem");
        int actual = myCounter.getArrayLength();

        // Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testBreak (){
        //Arrange
        Counter myCounter = new Counter();
        int expected = 0;

        //Act
        myCounter.count("stop");
        int actualCharacters = myCounter.getTotalCharacters();
        int actualLines = myCounter.getTotalLines();

        //Assert
        assertEquals(expected, actualCharacters);
        assertEquals(expected, actualLines);
    }

}
