package com.example;


import org.example.pojo.Brand;
import org.example.pojo.User;

import java.util.List;

/**
 * @author czq
 * @version 1.0
 */
public interface UserMapper {


    List<User> selectAll();

    User slectID(int id);



}
