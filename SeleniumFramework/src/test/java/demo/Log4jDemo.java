package demo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Properties can be defined by a properties file or by an XML file. Log4j looks for a file named log4j.xml and then for a file named log4j.properties. Both must be placed in the src folder.
//The property file is less verbose than an XML file. The XML requires the log4j.dtd to be placed in the source folder as well. The XML requires a dom4j.jar which might not be included in older Java versions.
//The properties file does not support some advanced configuration options like Filters, custom ErrorHandlers and a special type of appenders, 
//i.e. AsyncAppender. ErrorHandlers defines how errors in log4j itself are handled, for example badly configured appenders. Filters are more interesting. 
//From the available filters, I think that the level range filter is really missing for property files.
//This filter allows to define that a[n] appender should receive log messages from Level INFO to WARN. This allows to split log messages across different logfiles. One for DEBUGGING messages, another for warnings, ...
//The property appender only supports a minimum level. If you set it do INFO, you will receive WARN, ERROR and FATAL messages as well.

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {

		System.out.println("\n Hello world ...!   \n");
		
		logger.trace("This is the trace message");
		
		logger.info("This is information message");
		logger.warn("this is warning message ! ...");
        
		logger.error("This is an error message....");
        logger.fatal("this is fatal message");
        
        System.out.println("\n Completed");

	}
	
	
}

