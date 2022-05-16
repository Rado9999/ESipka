/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package esipka;

import static cz.pecinovsky.canvasmanager.IPaintable.CM;
import cz.pecinovsky.canvasmanager.Painter;
import cz.pecinovsky.util.IO;
import cz.pecinovsky.util.Position;
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
public class NSipkaTest {

public NSipkaTest() {
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
     * Test of vpred method, of class NSipka.
     */
    @Test
    public void testVpred() {
        
        System.out.println("vpred");
        NSipka instance = new NSipka();
        CM.add(instance);
        instance.vpred();
        IO.inform("OK?");
    }

    /**
     * Test of vlavoBok method, of class NSipka.
     */
    @Test
    public void testVlavoBok() {
        System.out.println("vlavoBok");
        NSipka instance = new NSipka();
        instance.vlavoBok();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModule method, of class NSipka.
     */
    @Test
    public void testGetModule() {
        System.out.println("getModule");
        NSipka instance = new NSipka();
        int expResult = 0;
        int result = instance.getModule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModule method, of class NSipka.
     */
    @Test
    public void testSetModule() {
        System.out.println("setModule");
        int module = 0;
        NSipka instance = new NSipka();
        instance.setModule(module);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class NSipka.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        NSipka instance = new NSipka();
        Position expResult = null;
        Position result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class NSipka.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int x = 0;
        int y = 0;
        NSipka instance = new NSipka();
        instance.setPosition(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class NSipka.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Painter painter = null;
        NSipka instance = new NSipka();
        instance.paint(painter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
