package com.xc.mybatis_study_progress_newbie;

import com.xc.mybatis_study_progress_newbie.mapper.EmpMapper;
import com.xc.mybatis_study_progress_newbie.mapper.UserMapper;
import com.xc.mybatis_study_progress_newbie.pojo.Emp;
import com.xc.mybatis_study_progress_newbie.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.LocalDateTime.now;

@SpringBootTest
class MybatisStudyProgressNewbieApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private EmpMapper empMapper;


   public void testSelectAllForUserMapper() {
        List<User> userList = userMapper.selectAll();
        userList.stream().forEach(user -> {
            System.out.println(user.toString());
        });
   }

    public void testDeleteForEmpMapper() {
        List<Integer> ids = List.of(13, 14, 15);
        empMapper.delete(ids);
    }

    /*public void testInsertForEmpMapper() {
        Emp emp = new Emp();
        emp.setUsername("test");
        emp.setName("test");
        emp.setGender((short) 1);
        emp.setImage("test");
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDateTime.now());
        emp.setDeptId(1);
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);

        System.out.println(emp.getId());
    }*/

    public void testUpdateForEmpMapper() {
        Emp emp = new Emp();
        emp.setId(2);
        emp.setUsername("FXXXXK");
        emp.setName("test");
        emp.setGender((short) 1);
        emp.setImage("test");
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDateTime.now());
        emp.setDeptId(1);
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }

    /*public void testSelectAllForEmpMapper() {
        empMapper.SelectAll();
    }

    public void testSelectByIdForEmpMapper() {
        Emp emp = empMapper.selectById(2);
        System.out.println(emp.toString());
    }*/

    public void testListForEmpMapper() {
        List<Emp> empList = empMapper.list("张", (short) 1, null, null);
        empList.stream().forEach(emp -> {
            System.out.println(emp.toString());
        });
    }

}
