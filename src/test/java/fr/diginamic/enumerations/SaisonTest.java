package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SaisonTest {

    @Test
    public void testValueOfLibelleNominalCases() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
    }

    @Test
    public void testValueOfLibelleEdgeCases() {
        assertNull(Saison.valueOfLibelle(null));
        assertNull(Saison.valueOfLibelle(""));
        assertNull(Saison.valueOfLibelle("NonExistentSeason"));
    }
}