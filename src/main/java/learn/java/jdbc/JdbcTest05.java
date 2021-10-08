package learn.java.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author wangmufan
 * @date 2021/10/8
 * @apiNote
 */
public class JdbcTest05 {
    private static final Logger logger = LogManager.getLogger(JdbcTest05.class);

    public void connectDatabase(){

        //使用资源绑定器绑定属性配置文件
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1、注册驱动
            Class.forName(driver);
            //2、获取连接
            conn = DriverManager.getConnection(url, user, password);
            logger.info("数据库连接对象 = {}", conn);

            //3、获取数据库操作对象
            stmt = conn.createStatement();

            //4、执行sql
            String sql = "select empno,ename,sal from emp";
            rs = stmt.executeQuery(sql);

            //5、处理查询结果集
            while (rs.next()){
                //JDBC中所有下标都从1开始，不是从0开始
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                logger.info("{}, {}, {}", empno, ename, sal);
            }

        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            //6、释放资源
            try {
                if (rs != null){
                    rs.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
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
}
