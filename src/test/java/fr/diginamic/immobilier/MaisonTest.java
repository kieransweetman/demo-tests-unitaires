package fr.diginamic.immobilier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import fr.diginamic.immobilier.entites.Chambre;
import fr.diginamic.immobilier.entites.Maison;
import fr.diginamic.immobilier.entites.Piece;
import fr.diginamic.immobilier.entites.Salon;

public class MaisonTest {

    @Test
    public void testAddPieceNominalCases() {
        Maison maison = new Maison();
        Piece piece = new Salon(1, 20);
        maison.ajouterPiece(piece);
        assertEquals(1, maison.getPieces().length);
        assertEquals(piece, maison.getPieces()[0]);
    }

    @Test
    public void testAddPieceNullCase() {
        Maison maison = new Maison();
        maison.ajouterPiece(null);
        assertEquals(0, maison.getPieces().length);
    }

    @Test
    public void testSurfaceTotale() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Salon(1, 20));
        maison.ajouterPiece(new Chambre(1, 15));
        assertEquals(35, maison.superficieTotale());
    }

    @Test
    public void testSurfaceTotaleWithNullPiece() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Salon(1, 10));
        maison.ajouterPiece(null);
        assertEquals(10, maison.superficieTotale());
    }
}