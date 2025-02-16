package mysql_.brandTest;

import mysql_.brand;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author czq
 * @version 1.0
 */
public class brandtest {
    public void testchaxun() throws Exception {

        String url = "jdbc:mysql://127.0.0.1:3306/learn";
        String password = "123456";
        String user = "root";
        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "select * from tb_brand";


        PreparedStatement prepared = conn.prepareStatement(sql);

        ResultSet resultSet = prepared.executeQuery();

        ArrayList<brand> brands = new ArrayList<>();

        while (resultSet.next()) {
            brand brand = new brand();
            brand.setId((Integer) resultSet.getObject(1));
            brand.setBrand_name(resultSet.getString(2));
            brand.setCompany_name(resultSet.getString(3));
            brand.setOrdered((Integer) resultSet.getObject(4));
            brand.setDescription(resultSet.getString(5));
            brand.setStatus((Integer) resultSet.getObject(6));
            brands.add(brand);


            System.out.println(resultSet.getObject(1) + resultSet.getString(2) + resultSet.getString(3) +
                    resultSet.getObject(4) + resultSet.getString(5) + resultSet.getObject(6));
        }

        System.out.println(brands);
        resultSet.close();
        prepared.close();
        conn.close();
    }

    @Test
    public void testadd() throws Exception {
        //接收页面提供的参数
        String brandName = "香喷喷";
        String companyName = "香喷喷";
        int ordered = 1;
        String description = "绕地球一圈";
        int status = 1;


        String url = "jdbc:mysql://127.0.0.1:3306/learn";
        String password = "123456";
        String user = "root";
        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "insert into tb_brand (brand_name ,company_name ,ordered ,description ,status) values(?,?,?,?,?)";


        PreparedStatement prepared = conn.prepareStatement(sql);

        prepared.setString(1, brandName);
        prepared.setString(2, companyName);
        prepared.setInt(3, ordered);
        prepared.setString(4, description);
        prepared.setInt(5, status);


        int count = prepared.executeUpdate();

        System.out.println(count);


        prepared.close();
        conn.close();
    }

@Test
    public void testupdate() throws Exception {
        //接收页面提供的参数
        String brandName = "香喷喷";
        String companyName = "香喷喷";
        int ordered = 1;
        String description = "绕地球44444圈";
        int status = 1;
        int id  = 4;

        String url = "jdbc:mysql://127.0.0.1:3306/learn";
        String password = "123456";
        String user = "root";
        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "update tb_brand  set brand_name = ?,company_name = ?,ordered =?,description = ?,status = ? where id = ?;";


        PreparedStatement prepared = conn.prepareStatement(sql);

        prepared.setString(1, brandName);
        prepared.setString(2, companyName);
        prepared.setInt(3, ordered);
        prepared.setString(4, description);
        prepared.setInt(5, status);
        prepared.setInt(6, id);


        int count = prepared.executeUpdate();

        System.out.println(count > 0);


        prepared.close();
        conn.close();
    }


    @Test
    public void testDelete() throws Exception{


        int id  = 5;

        String url = "jdbc:mysql://127.0.0.1:3306/learn";
        String password = "123456";
        String user = "root";
        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "delete from tb_brand where id= ?";


        PreparedStatement prepared = conn.prepareStatement(sql);


        prepared.setInt(1, id);


        int count = prepared.executeUpdate();

        System.out.println(count > 0);


        prepared.close();
        conn.close();
    }
}