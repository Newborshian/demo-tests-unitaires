package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {

    Maison maison = new Maison();
    SalleDeBain salleDeBain = new SalleDeBain(2, 15);
    WC wcBas = new WC(0, 5);
    WC wcHaut = new WC(1, 5);
    Cuisine cuisine = new Cuisine(0,30);
    Salon salon = new Salon(0, 0);
    Chambre chambre = new Chambre(1, 25);
    Chambre chambre2 = new Chambre(1,-100);

    @Test
    void ajouterPiece() {
    maison.ajouterPiece(salon);
    maison.ajouterPiece(chambre);
    maison.ajouterPiece(chambre2);
    }

    @Test
    void nbPieces() {
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(wcBas);
        maison.ajouterPiece(wcHaut);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salon);
        assertEquals(5, maison.nbPieces());
    }

    @Test
    void superficieEtage() {
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(wcBas);
        maison.ajouterPiece(wcHaut);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(salon);
        assertEquals(85, maison.superficieEtage(0));
    }

    @Test
    void superficieTypePiece() {
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(chambre2);
        assertEquals(25, maison.superficieTypePiece("Chambre"));
    }

    @Test
    void calculerSurface() {

        maison.ajouterPiece(chambre);
        maison.ajouterPiece(chambre2);
        assertEquals(25, maison.calculerSurface());
    }

}