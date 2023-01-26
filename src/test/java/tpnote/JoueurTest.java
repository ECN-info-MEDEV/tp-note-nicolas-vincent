/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tpnote;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vince
 */
public class JoueurTest {
    
    public JoueurTest() {
    }

    /**
     * Test de vérif input
     */
    @Test
    public void testVerifInput() {

        Joueur joueur = new Joueur("Vincent") {
            @Override
            public boolean verifInput(String input) {
                return super.verifInput(input);
            }
        };

        assertTrue(joueur.verifInput("jaune"));
        assertTrue(joueur.verifInput("rouge"));
        assertTrue(joueur.verifInput("vert"));

        assertFalse(joueur.verifInput("Cyan"));
    }
}
