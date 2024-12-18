package com.xc.mybatis_study_progress_newbie.mapper;

import com.xc.mybatis_study_progress_newbie.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface EmpMapper {
    //根据ID删除数据 使用#{}方式 即为预编译 性能更好 可以防止SQL注入
    /*@Delete("delete from emp where id = #{id}")*/
    void delete(List<Integer> ids);

    //新增
    /*@Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time) values (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void insert(Emp emp);*/


    //更新
    /*@Update("UPDATE emp SET username=#{username}, name=#{name}, gender = #{gender}, image = #{image}, job = #{job}, entrydate = #{entrydate}, dept_id = #{deptId}, create_time = #{createTime}, update_time = #{updateTime} WHERE id = #{id}")*/
    void update(Emp emp);

    /*@Select("select * from emp")
    public void SelectAll();*/

    //根据ID查询数据
    /*@Select("select * from emp where id = #{id}")
    public Emp selectById(Integer id);*/

    /*@Select("select id, username, password, name, gender, image, job, entrydate, " + " dept_id deptId, create_time createTime, update_time updateTime from emp where id = #{id}")
    public Emp selectById(Integer id);*/

    /*@Results({
            @Result(column = "dept_id", property = "deptId"),
            @Result(column = "create_time", property = "createTime"),
            @Result(column = "update_time", property = "updateTime")
    })
    @Select("select * from emp where id = #{id}")
    public Emp selectById(Integer id);*/

    /*@Select("select * from emp where name like concat('%', #{name}, '%') and gender = #{gender} and " + "entrydate between #{start} and #{end} order by update_time desc")
    public List<Emp> list(String name, Short gender, LocalDateTime start, LocalDateTime end);*/

    //条件查询
    /*@Select("select * from emp where name like '%${name}%' and gender = #{gender} and " + "entrydate between #{start} and #{end} order by update_time desc")*/

    List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);


}
