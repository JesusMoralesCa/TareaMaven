package com.tarea.app;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	Logger logger = LogManager.getLogger(AppTest.class);
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
    @Test
    public void logMessagesTest() {
    	
    	
    	logger.debug("Mensaje de debug");
        logger.info("Mensaje de información");
        logger.warn("Mensaje de advertencia");
        logger.error("Mensaje de error");
    
        assertTrue(true);
    }
    
}
