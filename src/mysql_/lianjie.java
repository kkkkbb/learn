package mysql_;


import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author czq
 * @version 1.0
 */
public class lianjie {
    public static void main(String[] args) throws Exception {

//        Class.forName("com.mysql.cj.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url,username,password);


//        String sql = "update teacher set t_name = '张四' where t_id = 01";

            String sql = "select * from teacher ";
        Statement statement = null;

        ArrayList<Account> accounts = new ArrayList<>();

        try {

            conn.setAutoCommit(false);

            statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);



            while(resultSet.next()){
                accounts.add( new Account(resultSet.getString(1),resultSet.getString(2)));


                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }//获取第一个位置和第二个位置的内容
//            System.out.println(count);

            conn.commit();

            resultSet.close();
        } catch (Exception e) {

            conn.rollback();

            throw new RuntimeException(e);
        }


        statement.close();

        conn.close();


        Iterator iterator = accounts.iterator();

        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
class Account{
    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    private String id;
    private String name;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}