package fr.diginamic.enumerations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaisonTest {

    @Test
    void valueOfLibelle() {

        // Test valide
        Saison saison1 = Saison.valueOfLibelle("Automne");
        assertEquals(Saison.AUTOMNE, saison1);

        // Test valide deuxième essai
        Saison saison = Saison.valueOfLibelle("Hiver");
        assertEquals(Saison.HIVER, saison);
    }
}
