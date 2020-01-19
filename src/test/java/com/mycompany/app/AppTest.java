package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	private static App app;
	
	@BeforeClass
	public static void initialize() {
		System.out.println("Before Class");
		app = new App();
	}
	
	
    @Test
    public void addTest() {
        assertEquals(4,app.addNumbers(2, 2));
    }
    
    @Test
    public void addSubtract() {
    	assertEquals(3,app.subtractNumber(5, 2));
    }
    
    @AfterClass
    public static void finish() {
    	System.out.println("Test finish");
    }
}
 