package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class TableauxTest {

    @org.junit.Test
    public void trierCroissantSSS() {
        int[] tab = {3,62,2136,7546,84,34,1,89,-4,65,-4635};
        int[] expectedTab = {-4635,-4,1,3,34,62,65,84,89,2136,7546};
        Tableaux.trierCroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void trierDecroissantSSS() {
        int[] tab = {3,62,2136,7546,84,34,1,89,-4,65,-4635};
        int[] expectedTab ={7546,2136,89,84,65,62,34,3,1,-4,-4635};
        Tableaux.trierDecroissantSSS(tab);
        assertArrayEquals(expectedTab, tab);
    }

    @org.junit.Test
    public void maximum() {
        //test avec tableau sans changement
        int[] tab1 = {3,62,2136,7546,84,34,1,89,-4,65,-4635};
        int expected = 7546;
        assertEquals(expected, Tableaux.maximum(tab1));

        //test avec maximum au début
        int[] tab2 = {7546,3,62,2136,84,34,1,89,-4,65,-4635};
        assertEquals(expected, Tableaux.maximum(tab2));

        //test avec maximum au milieu
        int[] tab4 = {3,62,2136,84,34,7546,1,89,-4,65,-4635};
        assertEquals(expected, Tableaux.maximum(tab4));

        //test avec maximum à la fin
        int[] tab3 = {3,62,2136,84,34,1,89,-4,65,-4635,7546};
        assertEquals(expected, Tableaux.maximum(tab3));

    }

    @org.junit.Test
    public void minimum() {
        //test avec tableau sans changement
        int[] tab1 = {3,62,2136,7546,84,34,1,89,-4,65,-4635};
        int expected = -4635;
        assertEquals(expected, Tableaux.minimum(tab1));

        //test avec minimum au début
        int[] tab2 = {-4635,3,62,2136,7546,84,34,1,89,-4,65};
        assertEquals(expected, Tableaux.minimum(tab2));

        //test avec minimum au milieu
        int[] tab3 = {3,62,2136,7546,-4635,84,34,1,89,-4,65};
        assertEquals(expected, Tableaux.minimum(tab3));

        //test avec minimum à la fin
        int[] tab4 = {3,62,2136,7546,84,34,1,89,-4,65,-4635};
        assertEquals(expected, Tableaux.minimum(tab4));
    }

    @org.junit.Test
    public void moyenne() {
        int[] tab = {3,62,2136,7546,84,34,1,89,-4,65,-4635};
        double expected = 489.1818181818182;
        assertEquals(expected, Tableaux.moyenne(tab),0);
    }

    @org.junit.Test
    public void fouilleSeq() {
        //test avec tableau sans changement
        int[] tab1 = {3,62,2136,7546,84,34,1,89,-4,65,-4635};
        int cherche = 65;
        int expected1 = 9;
        assertEquals(expected1, Tableaux.fouilleSeq(tab1, cherche));

        //test avec le "cherche" au début
        int[] tab2 = {65,3,62,2136,7546,84,34,1,89,-4,-4635};
        int expected2 = 0;
        assertEquals(expected2, Tableaux.fouilleSeq(tab2, cherche));

        //test avec le "cherche" au milieu
        int[] tab3 = {3,62,2136,7546,84,65,34,1,89,-4,-4635};
        int expected3 = 5;
        assertEquals(expected3, Tableaux.fouilleSeq(tab3, cherche));

        //test avec le "cherche" à la fin
        int[] tab4 = {3,62,2136,7546,84,34,1,89,-4,-4635,65};
        int expected4 = 10;
        assertEquals(expected4, Tableaux.fouilleSeq(tab4, cherche));

    }

}