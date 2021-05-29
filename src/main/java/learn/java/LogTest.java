package learn.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

/**
 * @author Administrator
 */
public class LogTest {
    private static final Logger LOGGER = LogManager.getLogger(LogTest.class);

    @Test
    public void testQuick(){
        //日志输出
        LOGGER.fatal("fatal");
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}
