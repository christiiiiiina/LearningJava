package learn.java.jdbc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * @author wangmufan
 * @date 2021/10/8
 * @apiNote
 */
public class JdbcTest05Test {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testConnectDatabase() {
        JdbcTest05 jdbcTest05 = new JdbcTest05();
        jdbcTest05.connectDatabase();
    }
}