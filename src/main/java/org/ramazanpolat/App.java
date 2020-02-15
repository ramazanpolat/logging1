package org.ramazanpolat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Log4J V1
        Logger logger1 = Logger.getLogger(App.class);
        logger1.info("This is an info from Log4j v1.");

        // Log4J V2
        org.apache.logging.log4j.Logger logger2 = LogManager.getLogger(App.class);
        logger2.info("I'm superior to Log4J v1 because I'm v2!");

        // Java Util Logging
        java.util.logging.Logger logger3 = java.util.logging.Logger.getLogger(App.class.getName());
        logger3.info("I'm the good old JUL!");

        // Apache Commons
        Log logger4 = LogFactory.getLog(App.class);
        logger4.info("apache-commons logging here!");

        // Slf4j + Slf4j-Simple Binding
        org.slf4j.Logger logger5 = LoggerFactory.getLogger(App.class);
        logger5.info("Slf4j rules them all!");


    }
}
