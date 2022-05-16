/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package esipka;

import static cz.pecinovsky.canvasmanager.IPaintable.CM;
import cz.pecinovsky.util.IO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RadoK
 */
public class SipkaTest {

public SipkaTest() {
}

@BeforeClass
public static void setUpClass() {
    CM.setStepAndSize(200, 5, 5);
}

@AfterClass
public static void tearDownClass() {
}

@Before
public void setUp() {
}

@After
public void tearDown() {
}

    /**
     * Test of vpred method, of class Sipka.
     */
    @Test
    public void testVpred() {
        System.out.println("vpred");
        Sipka instance = new Sipka();
        
        instance.vpred();
        instance.vpred();

        instance.vlavoBok();
        instance.vlavoBok();
        instance.vpred();
        instance.vlavoBok();

        instance.vpred();
        instance.vlavoBok();
        instance.vpred();
        instance.vlavoBok();
        instance.vpred();
        IO.inform("OK?");
    }

    /**
     * Test of vlavoBok method, of class Sipka.
     */
    @Test
    public void testVlavoBok() {
        System.out.println("vlavoBok");
        Sipka instance = new Sipka();
        instance.vlavoBok();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
