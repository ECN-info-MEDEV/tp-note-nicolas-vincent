/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sample.medevdames;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vince
 */
public class JeuTest {
    
    public JeuTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of runJeu method, of class Jeu.
     */
    @Test
    public void testRunJeu() {
        System.out.println("runJeu");
        Jeu instance = new Jeu();
        instance.runJeu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of affiche method, of class Jeu.
     */
    @Test
    public void testAffiche() {
        System.out.println("affiche");
        Jeu instance = new Jeu();
        instance.affiche();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resteDeuxCouleurs method, of class Jeu.
     */
    @Test
    public void testResteDeuxCouleurs() {
        System.out.println("resteDeuxCouleurs");
        Jeu instance = new Jeu();
        boolean expResult = false;
        boolean result = instance.resteDeuxCouleurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
