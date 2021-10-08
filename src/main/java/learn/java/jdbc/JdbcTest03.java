package learn.java.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

/**
 * @author wangmufan
 * @date 2021/10/8
 * @apiNote
 */
public class JdbcTest03 {
    private static final Logger logger = LogManager.getLogger(JdbcTest03.class);

    public void connectDatabase(){
        Connection conn = null;
        Statement stmt = null;
        try {
            //1、注册驱动
            //第一种方式：
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //第二种方式：常用，参数为字符串，可以写到常量类中，不需要接收返回值，只需要类加载的动作
            Class.forName("com.mysql.cj.jdbc.Driver");
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

        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
