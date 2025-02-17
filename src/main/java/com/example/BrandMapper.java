package com.example;


import org.apache.ibatis.annotations.Param;
import org.example.pojo.Brand;

import java.util.List;
import java.util.Map;

/**
 * @author czq
 * @version 1.0
 */
public interface BrandMapper {

    List<Brand> selectBrand();

    Brand getBrandById(int id);

//    List<Brand> selectBrandCondition(@Param("status")int status,
//                                     @Param("brandName")String name,
//                                     @Param("companyName")String companyName);
//    List<Brand> selectBrandCondition(Brand brand);

//    List<Brand> selectBrandCondition(Map map);

    List<Brand> selectBrandCondition(Brand brand);

    void addBrand(Brand brand);

    int updateBrand(Brand brand);

    void deleteBrandById(int id);

    void deletesBrandById(@Param("ids") int[] ids);/*批量删除*/
}
