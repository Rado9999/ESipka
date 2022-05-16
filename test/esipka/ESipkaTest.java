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
public class ESipkaTest {

public ESipkaTest() {
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
    
//    ESipka inst = new ESipka();
//    CM.add (inst);
    IO.inform("Pripravené");
}

@After
public void tearDown() {
    
}

        /**
     * Test of vpred method, of class ESipka.
     */
    @Test
    public void testVpred() {
        System.out.println("vpred");
        ESipka instance = new ESipka();
        CM.add(instance);
        instance.vpred();
        IO.inform("OK?");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of vlavoBok method, of class ESipka.
     */
    @Test
    public void testVlavoBok() {
        System.out.println("vlavoBok");
        ESipka instance = new ESipka();
        CM.add(instance);
        IO.inform("Pripravené");
        instance.vlavoBok();
        IO.inform("OK?");
    }

    /**
     * Test of getModule method, of class ESipka.
     */
    @Test
    public void testGetModule() {
        System.out.println("getModule");
        ESipka instance = new ESipka();
        int expResult = 0;
        int result = instance.getModule();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModule method, of class ESipka.
     */
    @Test
    public void testSetModule() {
        System.out.println("setModule");
        int module = 0;
        ESipka instance = new ESipka();
        instance.setModule(module);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPosition method, of class ESipka.
     */
    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        ESipka instance = new ESipka();
        Position expResult = null;
        Position result = instance.getPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPosition method, of class ESipka.
     */
    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        int x = 0;
        int y = 0;
        ESipka instance = new ESipka();
        instance.setPosition(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class ESipka.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Painter painter = null;
        ESipka instance = new ESipka();
        instance.paint(painter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



}
