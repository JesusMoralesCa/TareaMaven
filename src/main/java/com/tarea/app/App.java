package com.tarea.app;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App {
	
	
    Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.logMessages();
    }

    public void logMessages(){
        logger.debug("Mensaje de debug");
        logger.info("Mensaje de información");
        logger.warn("Mensaje de advertencia");
        logger.error("Mensaje de error");
    }

}
