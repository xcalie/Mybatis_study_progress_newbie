package com.xc.mybatis_study_progress_newbie.mapper;

import com.xc.mybatis_study_progress_newbie.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // 标记这是一个 MyBatis 的 Mapper 类 会被 Spring 扫描到 并且创建代理对象 交给 Spring 管理
public interface UserMapper {

    @Select("select * from user")
    public List<User> selectAll();
}
