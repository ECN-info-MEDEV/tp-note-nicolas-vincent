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
public class HelloMainTest {
    
    public HelloMainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test bison pour mise en place des outils
     */
    @Test
    public void testMain() {
        String[] args = null;
        HelloMain.main(args);
        String expResult = "Hello";
        String result = "Hello";
        assertEquals(expResult, result);
    }
    
}
