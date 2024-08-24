package fr.diginamic.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistanceNominalCases() {
        assertEquals(1, StringUtils.levenshteinDistance("chat", "chats"));
        assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));
        assertEquals(1, StringUtils.levenshteinDistance("aviron", "avion"));
        assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));
        assertEquals(2, StringUtils.levenshteinDistance("Chien", "Chine"));
    }

    @Test
    public void testLevenshteinDistanceEdgeCases() {
        assertEquals(0, StringUtils.levenshteinDistance("", ""));
        assertEquals(5, StringUtils.levenshteinDistance("", "hello"));
        assertEquals(5, StringUtils.levenshteinDistance("hello", ""));
        assertEquals(0, StringUtils.levenshteinDistance("same", "same"));
    }

    @Test
    public void testLevenshteinDistanceNullCases() {
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance(null, "test");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance("test", null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance(null, null);
        });
    }
}