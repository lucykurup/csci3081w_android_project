package com.example.affirmationapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class AffirmationDataTest {

    @Test
    public void testGetRandomAffirmationNotNull() {
        String affirmation = AffirmationData.getRandomAffirmation();
        assertNotNull("Affirmation should not be null", affirmation);
    }

    @Test
    public void testGetRandomAffirmationNotEmpty() {
        String affirmation = AffirmationData.getRandomAffirmation();
        assertFalse("Affirmation should not be empty", affirmation.isEmpty());
    }

    @Test
    public void testGetRandomAffirmationMultipleCalls() {
        // Verify that we can get multiple affirmations without issues
        for (int i = 0; i < 10; i++) {
            String affirmation = AffirmationData.getRandomAffirmation();
            assertNotNull("Affirmation " + i + " should not be null", affirmation);
            assertTrue("Affirmation " + i + " should have content", affirmation.length() > 0);
        }
    }
}
