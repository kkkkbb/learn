package mysql_;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author czq
 * @version 1.0
 */
public class JDBC_denglu {
    public static void main(String[] args) throws Exception {

//        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, username, password);

        String user = "01";
        String pas = " ' or ' 1 ' = '1";

        String sql = "select * from teacher where t_id = ? and t_name = ?";

//        Statement statement = conn.createStatement();

        PreparedStatement preparedStatement = conn.prepareStatement(sql);


        preparedStatement.setString(1,user);
        preparedStatement.setString(2,pas);

        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            System.out.println("登陆成功");
        }
        else{
            System.out.println("登录失败");
        }

        resultSet.close();
        preparedStatement.close();
        conn.close();

    }
}
