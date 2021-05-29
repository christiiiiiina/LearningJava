package learn.java;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Administrator
 */
public class Slf4jTest {
    /**
     * 为了保证使用时，不需要每次都去创建logger 对象，我们声明静态常量
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(Slf4jTest.class);

    @Test
    public void testQuick(){
        // 日志输出
        LOGGER.error("error");
        LOGGER.warn("warning");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }

}
