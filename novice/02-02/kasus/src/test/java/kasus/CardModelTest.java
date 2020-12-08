package kasus;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.Assert.*;
import kasus.ClassesAndObject.card.*;

public class CardModelTest {

    private static CardModel testingClass = new CardModel(1, 1);

    /*
        Mengetes apakah fungsi getRank dan getSuit berfungsi atau tidak
    */

    @Test
    public void test1(){

        assertEquals(1, testingClass.getRank());
        assertEquals(1, testingClass.getSuit());
    }

    /*
        Mengetes apakah fungsi konversi rank dan suit ke string berfungsi atau tidak
    */

    @Test
    public void test2() {
        
        assertEquals("Ace", testingClass.rankToString(testingClass.getRank()));
        assertEquals("Diamonds", testingClass.suitToString(testingClass.getSuit()));

    }

    /*
        Mengetes apakang fungsi validasi berjalan atau tidak
    */
    @Test
    public void test3() {

        assertTrue(testingClass.isValidRank(testingClass.getRank()));
        assertTrue(testingClass.isValidSuit(testingClass.getSuit()));
    }

}