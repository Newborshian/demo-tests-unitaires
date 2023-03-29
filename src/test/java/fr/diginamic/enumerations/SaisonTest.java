package fr.diginamic.enumerations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaisonTest {

    @Test
    void valueOfLibelle() {

        //Test printemps
        Saison printemps = Saison.valueOfLibelle("Printemps");
        assertEquals(Saison.PRINTEMPS, printemps);

        // Test Ete
        Saison été = Saison.valueOfLibelle("Eté");
        assertEquals(Saison.ETE, été);

        // Test Automne
        Saison automne = Saison.valueOfLibelle("Automne");
        assertEquals(Saison.AUTOMNE, automne);

        // Test Hiver
        Saison hiver = Saison.valueOfLibelle("Hiver");
        assertEquals(Saison.HIVER, hiver);
    }
}
