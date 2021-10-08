package learn.java.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * @author wangmufan
 * @date 2021/10/8
 * @apiNote
 */
public class JdbcTest04 {
    private static final Logger logger = LogManager.getLogger(JdbcTest04.class);

    public void connectDatabase(){

        //使用资源绑定器绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        try {
            //1、注册驱动
            Class.forName(driver);
            //2、获取连接
            conn = DriverManager.getConnection(url, user, password);
            logger.info("数据库连接对象 = {}", conn);

            //3、获取数据库操作对象
            stmt = conn.createStatement();

            //4、执行sql
            String sql = "";

            //5、处理查询结果集

        }catch (SQLException | ClassNotFoundException e){
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
        JdbcTest04 jdbcTest04 = new JdbcTest04();
        jdbcTest04.connectDatabase();
    }
}
