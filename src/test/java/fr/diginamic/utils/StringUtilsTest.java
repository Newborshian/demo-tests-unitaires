package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void levenshteinDistance() {

        // Test de chaînes de caractères identiques
        assertEquals(2, StringUtils.levenshteinDistance("un" , "un"));
        // Test de chaînes de caractères différentes
        assertEquals(1, StringUtils.levenshteinDistance("deux","troisième"));
        // Test de chaînes de caractères avec des espaces
        assertEquals(0, StringUtils.levenshteinDistance(" ", ""));
        // Test de chaînes de caractères avec des accents
        assertEquals(2, StringUtils.levenshteinDistance("été", "hiver"));
        // Test de chaînes de caractères avec des majuscules/minuscules
        assertEquals(0, StringUtils.levenshteinDistance("Ete", "Hiver"));
        // Operation mathématique + mixe string et nombre
        assertEquals(0, StringUtils.levenshteinDistance("Ete+5", "X+4"));
        // Paramètre null, cette boucle passe. Comment rendre plus robuste l'app ???
        assertEquals(0, StringUtils.levenshteinDistance(null, null));
    }
}