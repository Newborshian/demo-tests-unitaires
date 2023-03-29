package fr.diginamic.enumerations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaisonTest {

    @Test
    void valueOfLibelle() {
        // Test valide

        Saison saison1 = Saison.valueOfLibelle("Printemps");
        saison1 = Saison.valueOfLibelle("Printemps");
        assertEquals("1. Printemps", saison1 );

    }


    @Test
    void testToString() {

        // Test avec une saison valide
        Saison saison = Saison.HIVER;
        assertEquals("4. Hiver" , Saison.HIVER.toString());

        // Test avec une autre saison valide
        saison = Saison.PRINTEMPS;
        assertEquals("1. Printemps" , Saison.PRINTEMPS.toString());
        // Test avec une saison avec des caractères spéciaux
        saison = Saison.ETE;
        assertEquals("2. Eté" , Saison.ETE.toString());
    }


    @Test
    void getLibelle() {
        // Test valide
        Saison saison = Saison.HIVER;
        assertEquals("Hiver" , saison.getLibelle());

        //Autre exemple de test valide
        Saison saison1 = Saison.ETE;
        assertEquals("Eté", saison1.getLibelle());
    }

    @Test
    //Test Valide
    void getOrdre() {
        Saison saison = Saison.HIVER;
        assertEquals(4, saison.getOrdre());

        //Autre test Valide
        Saison saison1 = Saison.AUTOMNE;
        assertEquals(3, saison1.getOrdre());

        //test valide troisième essai
        Saison saison2 = Saison.ETE;
        assertEquals(2, saison2.getOrdre());
    }
}