/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tpnote;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vince
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of placer method, of class Joueur.
     */
    @Test
    public void testPlacer() {
        System.out.println("placer");
        Ligne ligne = null;
        Joueur instance = null;
        instance.placer(ligne);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Joueur instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Joueur.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Joueur instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class Joueur.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Joueur instance = null;
        int expResult = 0;
        int result = instance.getPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPoints method, of class Joueur.
     */
    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        int points = 0;
        Joueur instance = null;
        instance.setPoints(points);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class JoueurImpl extends Joueur {

        public JoueurImpl() {
            super("");
        }
    }
    
}
