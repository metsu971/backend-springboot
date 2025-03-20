package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User findById(Long id);

    List<User> findAll();

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
