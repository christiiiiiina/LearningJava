package learn.java.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

/**
 * @author wangmufan
 * @date 2021/8/24
 * @apiNote
 */
public class JdbcTest01 {
    private static final Logger logger = LogManager.getLogger(JdbcTest01.class);

    public void connectDatabase(){
        Connection conn = null;
        Statement stmt = null;
        try {
            //1、注册驱动
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            //2、获取连接
            String url = "jdbc:mysql://127.0.0.1:3306/learnsql";
            String user = "root";
            String password = "admin";
            conn = DriverManager.getConnection(url, user, password);
            logger.info("数据库连接对象 = {}", conn);

            //3、获取数据库操作对象
            stmt = conn.createStatement();

            //4、执行sql
            String sql = "";

            //5、处理查询结果集

        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //6、释放资源
            try {
                if (stmt != null){
                    stmt.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
            try {
                if (conn != null){
                    conn.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JdbcTest01 jdbcTest01 = new JdbcTest01();
        jdbcTest01.connectDatabase();
    }
}
