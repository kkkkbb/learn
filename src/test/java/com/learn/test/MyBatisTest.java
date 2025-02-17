package com.learn.test;


import com.example.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.pojo.Brand;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author czq
 * @version 1.0
 */
public class MyBatisTest {

    @Test
    public void testSelectAll() throws Exception {
        //1.获取salselectFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        List<Brand> brand = brandMapper.selectBrand();
        System.out.println(brand);

        sqlSession.close();
    }

    @Test
    public void testSelectId() throws Exception {
        //1.获取salselectFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        Brand brand = brandMapper.getBrandById(2);
        System.out.println(brand);

        sqlSession.close();
    }


    @Test
    public void testmohuselect() throws Exception {
        int status = 1;
        String brandName = "";
        String componyName = "";

        Brand brand1 = new Brand();
//        brand1.setStatus(status);

        //1.获取salselectFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        List<Brand> brand = brandMapper.selectBrandCondition(brand1);
        System.out.println(brand);

        sqlSession.close();
    }

    @Test
    public void testadd() throws Exception {
        int status = 1;
        String brandName = "博导手机";
        String componyName = "博导公司";
        int ordered = 50;
        String description = "手机中的战斗机";
        Brand brand1 = new Brand();
        brand1.setStatus(status);
        brand1.setBrandName(brandName);
        brand1.setCompanyName(componyName);
        brand1.setOrdered(ordered);
        brand1.setDescription(description);
        //1.获取salselectFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        brandMapper.addBrand(brand1);
        System.out.println(brand1.getId());
        sqlSession.commit();//手动提交事务
        List<Brand> brand = brandMapper.selectBrand();
        System.out.println(brand);

        sqlSession.close();
    }
@Test
    public void testupdate() throws Exception {
        int status = 1;
        String brandName = "博导手机";
        String componyName = "博导公司666666666";
        int ordered = 50;
        String description = "手机中的战斗机asdasasd";
        int id = 7;
        Brand brand1 = new Brand();
        brand1.setId(id);
        brand1.setStatus(status);
        brand1.setBrandName(brandName);
        brand1.setCompanyName(componyName);
        brand1.setOrdered(ordered);
        brand1.setDescription(description);
        //1.获取salselectFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        int i = brandMapper.updateBrand(brand1);
        System.out.println(brand1.getId());
        sqlSession.commit();//手动提交事务
//        List<Brand> brand = brandMapper.selectBrand();
        System.out.println(i);

        sqlSession.close();
    }
@Test
    public void testdelete() throws Exception {

        int [] ids = {6};


        //1.获取salselectFactory对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        //2.获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //3.获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        //4.执行方法
        brandMapper.deletesBrandById(ids);

        sqlSession.commit();//手动提交事务
//        List<Brand> brand = brandMapper.selectBrand();


        sqlSession.close();
    }
}

