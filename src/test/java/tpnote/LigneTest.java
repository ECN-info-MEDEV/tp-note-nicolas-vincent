/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tpnote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vince
 */
public class LigneTest {
    
    public LigneTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of placePion method, of class Ligne.
     */
    @Test
    public void testPlacePion() {
        List<String> listPion = new ArrayList<>(Arrays.asList("noir", "noir", "jaune", "bleu"));
        Ligne instance = new Ligne();
        instance.placePion(listPion);
        assertEquals("noir", instance.getLigne().get(0));
        assertEquals("jaune", instance.getLigne().get(2));
        assertEquals("bleu", instance.getLigne().get(3));
    }

    /**
     * Test of verifLigneComplete method, of class Ligne.
     */
    @Test
    public void testVerifLigneComplete() {
        Ligne instance = new Ligne();
        instance.setFicheN(4);
        assertTrue(instance.verifLigneComplete());

        instance.setFicheN(3);
        assertFalse(instance.verifLigneComplete());
    }


    /**
     * Test of placeFiche method, of class Ligne.
     */
    @Test
    public void testPlaceFiche() {
        Ligne instance = new Ligne();
        instance.placeFiche(3, 1);
        assertEquals(3, instance.getFicheN());
        assertEquals(1, instance.getFicheB());

        instance.placeFiche(0, 4);
        assertEquals(0, instance.getFicheN());
        assertEquals(4, instance.getFicheB());
    }
    
}
